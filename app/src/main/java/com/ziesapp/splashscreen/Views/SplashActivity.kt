package com.ziesapp.splashscreen.Views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.ziesapp.splashscreen.MainActivity
import com.ziesapp.splashscreen.R

class SplashActivity : AppCompatActivity() {

    //pemesanan variabel
    private lateinit var mDelayHandler:Handler
    private var splashTime:Long = 3000

    //Method setelah splash berakhir
    internal val mRunnable:Runnable = Runnable {
        val intent = Intent(this@SplashActivity,MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        //inisialisasi Handler
        mDelayHandler = Handler()

        //navigasi dengan durasi
        mDelayHandler.postDelayed(mRunnable,splashTime)
    }
}
