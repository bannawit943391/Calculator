package com.example.a22032021bannawit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        a1.setOnClickListener{
            if(ans.text.toString() == "1"){
                ans.setText("1")
            }
            else {
                var str = ans.text.toString().plus(1)
                ans.setText(str)
            }
        }

        b2.setOnClickListener{
            if(ans.text.toString() == "2"){
                ans.setText("2")
            }
            else {
                var str = ans.text.toString().plus(2)
                ans.setText(str)
            }
        }

        c3.setOnClickListener{
            if(ans.text.toString() == "3"){
                ans.setText("3")
            }
            else {
                var str = ans.text.toString().plus(3)
                ans.setText(str)
            }
        }

        d4.setOnClickListener{
            if(ans.text.toString() == "4"){
                ans.setText("4")
            }
            else {
                var str = ans.text.toString().plus(4)
                ans.setText(str)
            }
        }
        e5.setOnClickListener{
            if(ans.text.toString() == "5"){
                ans.setText("5")
            }
            else {
                var str = ans.text.toString().plus(5)
                ans.setText(str)
            }
        }
        f6.setOnClickListener{
            if(ans.text.toString() == "6"){
                ans.setText("6")
            }
            else {
                var str = ans.text.toString().plus(6)
                ans.setText(str)
            }
        }
        g7.setOnClickListener{
            if(ans.text.toString() == "7"){
                ans.setText("7")
            }
            else {
                var str = ans.text.toString().plus(7)
                ans.setText(str)
            }
        }

        h8.setOnClickListener{
            if(ans.text.toString() == "8"){
                ans.setText("8")
            }
            else {
                var str = ans.text.toString().plus(8)
                ans.setText(str)
            }
        }

        i9.setOnClickListener{
            if(ans.text.toString() == "9"){
                ans.setText("9")
            }
            else {
                var str = ans.text.toString().plus(9)
                ans.setText(str)
            }
        }

        c.setOnClickListener{
            ans.setText("0")
        }
        del.setOnClickListener{
            if(ans.text.toString().lengh <= 1) {
                ans.setText("0")
            }
            else if (ans.text.isNotEmpty()) {
                ans.text = ans.text.dropLast(1)
            }
        }

    }
}