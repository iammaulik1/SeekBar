package com.example.a13seekbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.SeekBar.OnSeekBarChangeListener
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var seekBarNormal:SeekBar?=null
    var seekBarDiscrete:SeekBar?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        seekBarNormal=findViewById(R.id.seekBar_Default)
        seekBarDiscrete=findViewById(R.id.seekBar_discrete)

        seekBarNormal?.setOnSeekBarChangeListener(object :SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar,progress:Int,fromUser:Boolean){
                Toast.makeText(applicationContext,"seekbar progress $progress",Toast.LENGTH_LONG).show()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
                Toast.makeText(applicationContext,"seekbar Touch Started !",Toast.LENGTH_LONG).show()
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                Toast.makeText(applicationContext,"Seekbar Touch Stopped",Toast.LENGTH_LONG).show()
            }
        })

        seekBarDiscrete?.setOnSeekBarChangeListener(object :SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?,progress:Int,fromUser:Boolean){
                Toast.makeText(applicationContext,"discrete seekbar progress : $progress",Toast.LENGTH_LONG).show()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
                Toast.makeText(applicationContext,"Discrete Seekbar Touch Started !!",Toast.LENGTH_LONG).show()
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                Toast.makeText(applicationContext,"Discrete Seekbar Stopped ..",Toast.LENGTH_LONG).show()
            }
        })
    }
}