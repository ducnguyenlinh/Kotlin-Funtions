package com.example.admin.kotlinfuntions

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    fun sum2number(a: Int, b:Int):Int{
        return a+b
    }

    fun sub2number(a: Int, b:Int):Int{
        return a-b
    }

    fun multi2number(a: Int, b:Int):Int{
        return a*b
    }

    fun div2number(a: Float, b:Float):Float{
        if (b!=0f)
            return a/b
        else
            return 0f
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSummation.setOnClickListener {
            Toast.makeText(this, "" + sum2number(edtNum1.text.toString().toInt(),
                    edtNum2.text.toString().toInt()), Toast.LENGTH_LONG).show()
        }

        btnSubtraction.setOnClickListener {
            Toast.makeText(this, "" + sub2number(edtNum1.text.toString().toInt(),
                    edtNum2.text.toString().toInt()), Toast.LENGTH_LONG).show()
        }

        btnMultiplication.setOnClickListener {
            Toast.makeText(this, "" + multi2number(edtNum1.text.toString().toInt(),
                    edtNum2.text.toString().toInt()), Toast.LENGTH_LONG).show()
        }

        btnDivision.setOnClickListener {
            Toast.makeText(this, "" + div2number(edtNum1.text.toString().toFloat(),
                    edtNum2.text.toString().toFloat()), Toast.LENGTH_LONG).show()
        }
    }
}
