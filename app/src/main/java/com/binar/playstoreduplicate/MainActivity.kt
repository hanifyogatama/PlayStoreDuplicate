package com.binar.playstoreduplicate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val learningAppCategory = arrayListOf(
            PlayStore("Zenius","24 MB",R.drawable.zenius),
            PlayStore("Zenius","24 Mb",R.drawable.quipper),
            PlayStore("Zenius","24 Mb",R.drawable.ruang_guru),
            PlayStore("Zenius","24 Mb",R.drawable.pahamify),
            PlayStore("Zenius","24 Mb",R.drawable.skil_academy),
            PlayStore("Zenius","24 Mb",R.drawable.mezza)
        )

        val gameAppCategory = arrayListOf(
            PlayStore("Zenius","24 Mb",R.drawable.all_football),
            PlayStore("Zenius","24 Mb",R.drawable.tiga_enam_lima_scores),
            PlayStore("Zenius","24 Mb",R.drawable.bein_sport),
            PlayStore("Zenius","24 Mb",R.drawable.goal_live),
            PlayStore("Zenius","24 Mb",R.drawable.live_score),
            PlayStore("Zenius","24 Mb",R.drawable.sofa_scores)
        )

        val musicAppCategory = arrayListOf(
            PlayStore("Zenius","24 Mb",R.drawable.shazam),
            PlayStore("Zenius","24 Mb",R.drawable.spotify),
            PlayStore("Zenius","24 Mb",R.drawable.joox),
            PlayStore("Zenius","24 Mb",R.drawable.apple_music),
            PlayStore("Zenius","24 Mb",R.drawable.soundcloud),
            PlayStore("Zenius","24 Mb",R.drawable.deezer_music)
        )

        val movieAppCategory = arrayListOf(
            PlayStore("Zenius","24 Mb",R.drawable.vidio),
            PlayStore("Zenius","24 Mb",R.drawable.prime_video),
            PlayStore("Zenius","24 Mb",R.drawable.ifflix),
            PlayStore("Zenius","24 Mb",R.drawable.viu),
            PlayStore("Zenius","24 Mb",R.drawable.imdb),
            PlayStore("Zenius","24 Mb",R.drawable.netflix)
        )

        val healthAppCategory = arrayListOf(
            PlayStore("Zenius","24 Mb",R.drawable.alodokter),
            PlayStore("Zenius","24 Mb",R.drawable.halodoc),
            PlayStore("Zenius","24 Mb",R.drawable.klik_dokter),
            PlayStore("Zenius","24 Mb",R.drawable.link_sehat),
            PlayStore("Zenius","24 Mb",R.drawable.sehatq),
            PlayStore("Zenius","24 Mb",R.drawable.lindungipeduli)
        )

        learningAppRecycle.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        learningAppRecycle.adapter = PlayStoreAdapter(learningAppCategory)

        gamingAppRecycle.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        gamingAppRecycle.adapter = PlayStoreAdapter(gameAppCategory)

        musicAppRecycle.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        musicAppRecycle.adapter = PlayStoreAdapter(musicAppCategory)

        movieAppRecycle.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        movieAppRecycle.adapter = PlayStoreAdapter(movieAppCategory)

        healthAppRecycle.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        healthAppRecycle.adapter = PlayStoreAdapter(healthAppCategory)

    }
}