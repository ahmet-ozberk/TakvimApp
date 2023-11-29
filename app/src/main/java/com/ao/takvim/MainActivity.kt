package com.ao.takvim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ao.takvim.databinding.ActivityMainBinding
import java.util.Calendar

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setCurrentDate()
    }

    private fun setCurrentDate(){
        val currentDate=Calendar.getInstance()
        val currentDay=currentDate.get(Calendar.DAY_OF_WEEK)
        val year=currentDate.get(Calendar.YEAR)
        val month=currentDate.get(Calendar.MONTH)
        val day=currentDate.get(Calendar.DAY_OF_MONTH)
        val dayName=when(currentDay){
            1->"Pazar"
            2->"Pazartesi"
            3->"Salı"
            4->"Çarşamba"
            5->"Perşembe"
            6->"Cuma"
            7->"Cumartesi"
            else->"Hata"
        }
        val monthName=when(month){
            0->"Ocak"
            1->"Şubat"
            2->"Mart"
            3->"Nisan"
            4->"Mayıs"
            5->"Haziran"
            6->"Temmuz"
            7->"Ağustos"
            8->"Eylül"
            9->"Ekim"
            10->"Kasım"
            11->"Aralık"
            else->"Hata"
        }
        binding.currentDateTextView.text="$day $monthName $year\n$dayName"
    }
}