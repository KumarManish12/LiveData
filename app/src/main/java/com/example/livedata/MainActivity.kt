package com.example.livedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.example.livedata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    lateinit var activityViewModel: ActivityViewModel
    val fragment1=Fragment1()
    var i=0
    private  val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        activityViewModel=ViewModelProvider(this).get(ActivityViewModel::class.java)

        activityViewModel.counter.observe(this){
            Log.e(TAG,"in intvalue $it")

        }

        binding.btnred.setOnClickListener {
            activityViewModel.text.setValue("Red is clicked")
        }
        binding.btnblue.setOnClickListener {
            activityViewModel.text.setValue("Blue is clicked")
        }
        binding.fragmentcontainer.setOnClickListener {
            i++
            binding.tvcount.text=i.toString()
        }
    }
}