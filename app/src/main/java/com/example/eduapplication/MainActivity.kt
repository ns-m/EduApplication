package com.example.eduapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

/*
class MainActivity : AppCompatActivity() {
    val investArray = arrayOf(120000, 80000, 50000, 45000, 23000, 71000)
    val profitArray = arrayOf(142000, 94000, 62000, 51000, 24000, 77000)
    val resultArray = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val names = resources.getStringArray(R.array.names)
        for ((index, name) in names.withIndex()){
            resultArray.add("Name: $name - profit = ${investArray[index] - profitArray[index]}")
            Log.d("MyActLog", "Output Data -/- ${resultArray[index]}")
        }

    }
}*/
/*class MainActivity : AppCompatActivity() {
    val bad = 0..3
    val normal = 4..6
    val nice = 7..9
    val excellent = 10
    val gradeArray = arrayOf(4, 7, 3, 6, 10, 2)
    val nameArray = arrayOf("Антон", "Егор", "Маша", "Светлана", "Юля", "Семен")
    val badArray = ArrayList<String>()
    val normalArray = ArrayList<String>()
    val niceArray = ArrayList<String>()
    val excellentArray = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        for ((index, name) in nameArray.withIndex()){
            when(gradeArray[index]){
                in bad -> badArray.add("Bad grade: Student $name - ${gradeArray[index]}")
                in normal -> normalArray.add("Normal grade: Student $name - ${gradeArray[index]}")
                in nice -> niceArray.add("Nice grade: Student $name - ${gradeArray[index]}")
                excellent -> excellentArray.add("Excellent grade: Student $name - ${gradeArray[index]}")
            }
        }
        badArray.forEach { Log.d("MyActLog", it) }
        normalArray.forEach { Log.d("MyActLog", it) }
        niceArray.forEach { Log.d("MyActLog", it) }
        excellentArray.forEach { Log.d("MyActLog", it) }
    }
}*/

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)}
}