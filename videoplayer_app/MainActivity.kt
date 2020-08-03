package com.sabbir.example.simplevideoplayer

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.net.Uri
import android.widget.MediaController
import android.widget.VideoView

//An android activity that plays a video file from res/raw folder , it's just a very basic represntation

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val videoView = findViewById<VideoView>(R.id.vid_vw)

        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)

        val uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.sample_vid)

        videoView.setMediaController(mediaController)
        videoView.setVideoURI(uri)
        videoView.requestFocus()
        videoView.start()
    }
}
