package com.test.qolami.view.latihan

import android.content.Context
import android.content.SharedPreferences
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.google.android.exoplayer2.ExoPlayer
import com.google.android.exoplayer2.MediaItem
import com.google.android.exoplayer2.Player
import com.test.qolami.R
import com.test.qolami.databinding.FragmentSoalLatihanAudioBinding
import com.test.qolami.viewnodel.LatihanHurufViewModel
import dagger.hilt.android.AndroidEntryPoint


@Suppress("DEPRECATION")
@AndroidEntryPoint
class FragmentSoalLatihanAudio : Fragment() {
    private lateinit var binding : FragmentSoalLatihanAudioBinding
    private lateinit var latihanHurufViewModel: LatihanHurufViewModel
    private lateinit var sharedPreferences: SharedPreferences
    var indexYangDipilih: Int = 0
    var indexTerkini: Int = 1
    var jumlahBenar = 0
    var jumlahSalah = 0
    var subtitle = ""
    var title = ""
    var url = ""
    private var audioEnded = false
    private var player: ExoPlayer? = null
    private var isPlaying = false

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSoalLatihanAudioBinding.inflate(layoutInflater, container, false)
        // Inflate the layout for this fragment
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.backImg.setOnClickListener {
            findNavController().navigateUp()
        }
        Log.i("Index yang di pilih", "$indexYangDipilih")
        sharedPreferences = requireContext().getSharedPreferences("judul", Context.MODE_PRIVATE)
        val textJudul = sharedPreferences.getString("latihanAudio", "")
        latihanHurufViewModel = ViewModelProvider(this).get(LatihanHurufViewModel::class.java)
        Log.i("info", "$textJudul")
        binding.textPelajaran.text = textJudul
        setSoal1()
        binding.option1.setOnClickListener {
            selectedOption(binding.txtJawaban1, binding.option1, 1)
        }
        binding.option2.setOnClickListener {
            selectedOption(binding.txtJawaban2, binding.option2, 2)

        }
        binding.option3.setOnClickListener {
            selectedOption(binding.txtJawaban3, binding.option3,3)

        }
        binding.option4.setOnClickListener {
            selectedOption(binding.txtJawaban4, binding.option4,4)

        }
        binding.buttonCheckSoal.setOnClickListener {
            if (checkJawaban() == true){
                jumlahBenar++
                Log.e("info", "$jumlahBenar")
            }else{
                jumlahSalah++
                Log.e("info", "$jumlahSalah")
            }
            Log.i("Index yang di pilih", "$indexYangDipilih")
            showBottomSheetDialog()
        }
    }
    private fun setSoal1(){
        latihanHurufViewModel.getSoalAudiHijaiyah()
        latihanHurufViewModel.dataSoalAudioHijaiyah.observe(viewLifecycleOwner){
            subtitle = it.latihanHijaiyahAudio[indexTerkini - 1].subtitle
            title = it.latihanHijaiyahAudio[indexTerkini  - 1].title
            binding.textJudul.text = it.latihanHijaiyahAudio[indexTerkini - 1].subtitle
            binding.txtPenjelasan.text = it.latihanHijaiyahAudio[indexTerkini - 1].question
            url = it.latihanHijaiyahAudio[indexTerkini - 1].audio
            player = ExoPlayer.Builder(requireContext()).build().also {
                // We still bind the player to the PlayerView but the view is gone
                binding.exoPlayer.player = it
                // URL dari API atau sumber audio lainnya
                val mediaItem = MediaItem.fromUri(Uri.parse(url))
                it.setMediaItem(mediaItem)
                it.prepare()
                it.addListener(object : Player.Listener {
                    override fun onPlaybackStateChanged(state: Int) {
                        if (state == Player.STATE_ENDED) {
                            isPlaying = false

                            audioEnded = true
                            Toast.makeText(requireContext(), "Audio Ended", Toast.LENGTH_SHORT).show()
                        }
                    }
                })
            }
            binding.imgPlay.setOnClickListener {
                if (isPlaying) {
                    player?.pause()
                    isPlaying = false
                    Toast.makeText(requireContext(), "Audio Paused", Toast.LENGTH_SHORT).show()
                } else {
                    if (audioEnded) {
                        player?.seekTo(0)
                        audioEnded = false
                    }
                    player?.play()
                    isPlaying = true
                    Toast.makeText(requireContext(), "Audio Playing", Toast.LENGTH_SHORT).show()
                }
            }
            binding.txtJawaban1.text = it.latihanHijaiyahAudio[indexTerkini - 1].options[0]
            binding.txtJawaban2.text = it.latihanHijaiyahAudio[indexTerkini - 1].options[1]
            binding.txtJawaban3.text = it.latihanHijaiyahAudio[indexTerkini - 1].options[2]
            binding.txtJawaban4.text = it.latihanHijaiyahAudio[indexTerkini - 1].options[3]
        }
    }
    fun checkJawaban():Boolean {
        var indikator = false
        if (binding.textPelajaran.text == "Latihan 1") {
            latihanHurufViewModel = ViewModelProvider(this).get(LatihanHurufViewModel::class.java)
            latihanHurufViewModel.dataSoalAudioHijaiyah.observe(viewLifecycleOwner) {
                if (indexYangDipilih - 1 == it.latihanHijaiyahAudio[indexTerkini.minus(1)].correctIndex) {
                    indikator = true
                } else {
                    indikator = false
                }
            }
        }
        return indikator
    }
    private fun checkSoalSelesai():Boolean {
        var indikatorSoal = false
        val bundle = Bundle()
        bundle.putInt("jumlahBenarAudio", jumlahBenar)
        bundle.putInt("jumlahSalahAudio", jumlahSalah)
        bundle.putString("subtitleAudio", subtitle)
        bundle.putString("titleAudio", title)
        if (binding.textPelajaran.text == "Latihan 1") {
            latihanHurufViewModel.dataSoalAudioHijaiyah.observe(viewLifecycleOwner) {
//                bundle.putString("subJudul", it.latihanHijaiyah[indexTerkini - 1].subtitle)
                if (indexTerkini > it.latihanHijaiyahAudio.size) {
                    indikatorSoal = false
                    Toast.makeText(requireContext(),"latihan selesai", Toast.LENGTH_SHORT).show()
//                    findNavController().navigate(
//                        R.id.action_fragmentSoalLatihanImage_to_fragmentHasilLatihan,
//                        bundle
//                    )
                } else {
                    indikatorSoal = true
                }
            }
        }
        return indikatorSoal
    }
    fun lanjutkanSoal() {
        indexTerkini++
        indexYangDipilih = 0
        latihanHurufViewModel.dataSoalAudioHijaiyah.observe(viewLifecycleOwner){
            subtitle = it.latihanHijaiyahAudio[indexTerkini - 1].subtitle
            title = it.latihanHijaiyahAudio[indexTerkini  - 1].title
            binding.textJudul.text = it.latihanHijaiyahAudio[indexTerkini - 1].subtitle
            binding.txtPenjelasan.text = it.latihanHijaiyahAudio[indexTerkini - 1].question
            url = it.latihanHijaiyahAudio[indexTerkini - 1].audio
            player = ExoPlayer.Builder(requireContext()).build().also {
                // We still bind the player to the PlayerView but the view is gone
                binding.exoPlayer.player = it
                // URL dari API atau sumber audio lainnya
                val mediaItem = MediaItem.fromUri(Uri.parse(url))
                it.setMediaItem(mediaItem)
                it.prepare()
                it.addListener(object : Player.Listener {
                    override fun onPlaybackStateChanged(state: Int) {
                        if (state == Player.STATE_ENDED) {
                            isPlaying = false

                            audioEnded = true
                            Toast.makeText(requireContext(), "Audio Ended", Toast.LENGTH_SHORT).show()
                        }
                    }
                })
            }
            binding.txtJawaban1.text = it.latihanHijaiyahAudio[indexTerkini - 1].options[0]
            binding.txtJawaban2.text = it.latihanHijaiyahAudio[indexTerkini - 1].options[1]
            binding.txtJawaban3.text = it.latihanHijaiyahAudio[indexTerkini - 1].options[2]
            binding.txtJawaban4.text = it.latihanHijaiyahAudio[indexTerkini - 1].options[3]
        }
    }
    private fun defaultStyle(){
        val optionsText = ArrayList<TextView>()
        optionsText.add(0, binding.txtJawaban1)
        optionsText.add(1, binding.txtJawaban2)
        optionsText.add(2, binding.txtJawaban3)
        optionsText.add(3, binding.txtJawaban4)
        for (option in optionsText){
            option.setTextColor(resources.getColor(R.color.black))
        }
        val optionsCv = ArrayList<CardView>()
        optionsCv.add(0, binding.option1)
        optionsCv.add(1, binding.option2)
        optionsCv.add(2, binding.option3)
        optionsCv.add(3, binding.option4)
        for (optionCv in optionsCv){
            optionCv.setCardBackgroundColor(resources.getColor(R.color.white))
        }
    }
    private fun selectedOption(tv: TextView, cv: CardView, indexOption: Int){
        defaultStyle()
        indexYangDipilih = indexOption
        tv.setTextColor(resources.getColor(R.color.white))
        cv.setCardBackgroundColor(resources.getColor(R.color.warna_hijau_muda))
    }
    override fun onDestroyView() {
        super.onDestroyView()
        releasePlayer()
    }

    private fun releasePlayer() {
        player?.release()
        player = null
    }
    private fun showBottomSheetDialog() {
        val bottomSheetDialogFragment = DialogFragmentJawabanLatihanAudio()
        bottomSheetDialogFragment.isCancelable = false
        bottomSheetDialogFragment.show(childFragmentManager, bottomSheetDialogFragment.tag)
    }

}