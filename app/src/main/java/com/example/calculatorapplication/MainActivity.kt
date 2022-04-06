package com.example.calculatorapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var number: String = ""
    var numberfloatone: Float = 0.0F
    var numberfloattwo: Float = 0.0F
    var isAddition: Boolean = false
    var isDivision: Boolean = false
    var isMultiplication: Boolean = false
    var isSubstraction: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun operationFun(view: View){

        var edTxtOne: EditText? = findViewById(R.id.cal_ed_txt_1)
        var edTxtTwo: EditText? = findViewById(R.id.cal_ed_txt_2)

        when(view.id){
            R.id.cal_btn_1 -> {
                number += "1"
                edTxtOne?.setText(number)
            }
            R.id.cal_btn_2 ->{
                number += "2"
                edTxtOne?.setText(number)
            }
            R.id.cal_btn_3 ->{
                number += "3"
                edTxtOne?.setText(number)
            }
            R.id.cal_btn_4 ->{
                number += "4"
                edTxtOne?.setText(number)
            }
            R.id.cal_btn_5 ->{
                number += "5"
                edTxtOne?.setText(number)
            }
            R.id.cal_btn_6 ->{
                number += "6"
                edTxtOne?.setText(number)
            }
            R.id.cal_btn_7 ->{
                number += "7"
                edTxtOne?.setText(number)
            }
            R.id.cal_btn_8 ->{
                number += "8"
                edTxtOne?.setText(number)
            }
            R.id.cal_btn_9 ->{
                number += "9"
                edTxtOne?.setText(number)
            }
            R.id.cal_btn_clear -> {
                number = ""
                edTxtOne?.setText("")
                edTxtTwo?.setText("")
            }
            R.id.cal_btn_dot -> {
                number += "."
                edTxtOne?.setText(number)
            }
            R.id.cal_btn_add -> {
                if(number.isNullOrBlank()){
                    edTxtOne?.setText("")
                }
                else{
                    numberfloatone = number.toFloat()
                    edTxtOne?.setText(number.toString()+"+")
                    isAddition = true
                    number = ""
                }
            }
            R.id.cal_btn_div -> {
                if(number.isNullOrBlank()){
                    edTxtOne?.setText("")
                }
                else{
                    numberfloatone = number.toFloat()
                    edTxtOne?.setText(number.toString()+"/")
                    isDivision = true
                    number = ""
                }
            }
            R.id.cal_btn_min -> {
                if(number.isNullOrBlank()){
                    edTxtOne?.setText("")
                }
                else{
                    numberfloatone = number.toFloat()
                    edTxtOne?.setText(number.toString()+"-")
                    isSubstraction = true
                    number = ""
                }
            }
            R.id.cal_btn_mul -> {
                if(number.isNullOrBlank()){
                    edTxtOne?.setText("")
                }
                else{
                    numberfloatone = number.toFloat()
                    edTxtOne?.setText(number.toString()+"*")
                    isMultiplication = true
                    number = ""
                }
            }
            R.id.cal_btn_eq ->{
                if (isAddition){
                    numberfloattwo = number.toFloat()
                    edTxtOne?.setText(numberfloatone.toString()+"+"+numberfloattwo.toString())
                    edTxtTwo?.setText((numberfloatone+numberfloattwo).toString())
                    isAddition=false
                }
                else if(isDivision){
                    numberfloattwo = number.toFloat()
                    edTxtOne?.setText(numberfloatone.toString()+"/"+numberfloattwo.toString())
                    edTxtTwo?.setText((numberfloattwo/numberfloattwo).toString())
                    isDivision=false
                }
                else if(isSubstraction){
                    numberfloattwo = number.toFloat()
                    edTxtOne?.setText(numberfloatone.toString()+"-"+numberfloattwo.toString())
                    edTxtTwo?.setText((numberfloatone-numberfloattwo).toString())
                    isSubstraction=false
                }
                else if(isMultiplication){
                    numberfloattwo = number.toFloat()
                    edTxtOne?.setText(numberfloatone.toString()+"*"+numberfloattwo.toString())
                    edTxtTwo?.setText((numberfloatone*numberfloattwo).toString())
                    isMultiplication=false
                }
            }
        }
    }
}