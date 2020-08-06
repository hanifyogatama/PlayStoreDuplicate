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
            PlayStore("Zenius ","24 MB",R.drawable.zenius),
            PlayStore("Quipper","24 Mb",R.drawable.quipper),
            PlayStore("Ruang guru","24 Mb",R.drawable.ruang_guru),
            PlayStore("Pahamify","24 Mb",R.drawable.pahamify),
            PlayStore("Skill Academy","24 Mb",R.drawable.skil_academy),
            PlayStore("Mezzu 9","24 Mb",R.drawable.mezza)
        )
        val gameAppCategory = arrayListOf(
            PlayStore("All Football","24 Mb",R.drawable.all_football),
            PlayStore("365 Scores","24 Mb",R.drawable.tiga_enam_lima_scores),
            PlayStore("Bein Sports","24 Mb",R.drawable.bein_sport),
            PlayStore("Goal Live","24 Mb",R.drawable.goal_live),
            PlayStore("LiveScores","24 Mb",R.drawable.live_score),
            PlayStore("Sofa Scores","24 Mb",R.drawable.sofa_scores)
        )

        val musicAppCategory = arrayListOf(
            PlayStore("Shazam Music","24 Mb",R.drawable.shazam),
            PlayStore("Spotify","24 Mb",R.drawable.spotify),
            PlayStore("JOOX","24 Mb",R.drawable.joox),
            PlayStore("Apple Music","24 Mb",R.drawable.apple_music),
            PlayStore("SoundCloud","24 Mb",R.drawable.soundcloud),
            PlayStore("Deezer Music","24 Mb",R.drawable.deezer_music)
        )

        val movieAppCategory = arrayListOf(
            PlayStore("Vidio.com","24 Mb",R.drawable.vidio),
            PlayStore("Prime Video","24 Mb",R.drawable.prime_video),
            PlayStore("Ifflix","24 Mb",R.drawable.ifflix),
            PlayStore("Viu","24 Mb",R.drawable.viu),
            PlayStore("IMDB","24 Mb",R.drawable.imdb),
            PlayStore("Netflix","24 Mb",R.drawable.netflix)
        )

        val healthAppCategory = arrayListOf(
            PlayStore("Alodokter","24 Mb",R.drawable.alodokter),
            PlayStore("halodoc","24 Mb",R.drawable.halodoc),
            PlayStore("Klik Dokter","24 Mb",R.drawable.klik_dokter),
            PlayStore("Link Sehat","24 Mb",R.drawable.link_sehat),
            PlayStore("SehatQ","24 Mb",R.drawable.sehatq),
            PlayStore("LindungiPeduli","24 Mb",R.drawable.lindungipeduli)
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