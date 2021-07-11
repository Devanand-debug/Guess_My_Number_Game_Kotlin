package com.example.guess_my_number_game_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var number : Int = 5

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        question_textView.text = String.format(resources.getString(R.string.str_question),number)
      //  printTheQuestion()
    }

    fun clickDownArraow(view: View) {

        if (number == 5){
            guessTheNumber(3)
//            number = 3
//           // question_textView.text = String.format(resources.getString(R.string.str_success),number)
//            printTheQuestion()
        }else if (number == 3){
            guessTheNumber(2)
//            number = 2
//           // question_textView.text = String.format(resources.getString(R.string.str_success),number)
//            printTheQuestion()
        }else if (number == 2){
            guessTheNumber(1)
        }else if (number == 8){
            guessTheNumber(7)
        }else if (number == 7){
            guessTheNumber(6)
        }

    }

    fun clickSuccess(view: View) {

        question_textView.visibility = View.INVISIBLE
        result_textView.visibility = View.VISIBLE
        printTheQuestion()
        result_textView.text = String.format(resources.getString(R.string.str_success),number)
    }

    fun clickUpArraow(view: View) {

        if (number == 3){
            guessTheNumber(4)
//            number = 4
//            printTheQuestion()
        }else if (number == 5){
            guessTheNumber(8)
        }else if (number == 8){
            guessTheNumber(9)
        }else if (number == 9){
            guessTheNumber(10)
        }
    }

    fun clickResetButton(view: View) {

        question_textView.visibility = View.VISIBLE
        result_textView.visibility = View.INVISIBLE

        number = 5  // game Starting at beginning.
        printTheQuestion()


    }
    fun printTheQuestion(){
        question_textView.text = String.format(resources.getString(R.string.str_question),number)
    }

    fun guessTheNumber(myNumber : Int){
        number = myNumber
        printTheQuestion()
    }
}