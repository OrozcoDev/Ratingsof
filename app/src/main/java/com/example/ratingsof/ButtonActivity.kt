package com.example.ratingsof

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.android.material.button.MaterialButton
import com.google.android.material.button.MaterialButtonToggleGroup

class ButtonActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button)
        val containedButton = findViewById<MaterialButton>(R.id.containedButton)
        val outlinedButton = findViewById<MaterialButton>(R.id.outlinedButtonWithIcon)
        val textButton = findViewById<MaterialButton>(R.id.textButton)
        val toggleButton = findViewById<MaterialButtonToggleGroup>(R.id.toggleButton)
        val customButton = findViewById<MaterialButton>(R.id.customButton)


        containedButton.setOnClickListener(this)
        outlinedButton.setOnClickListener(this)
        textButton.setOnClickListener(this)
        customButton.setOnClickListener(this)

        toggleButton.addOnButtonCheckedListener{ group, checkedId, isChecked ->
            if(isChecked){
                when(checkedId){
                    R.id.button1->{  Toast.makeText(this, "smith 4",Toast.LENGTH_SHORT).show()}
                    R.id.button2->{  Toast.makeText(this, "smith 5",Toast.LENGTH_SHORT).show()}
                    R.id.button3->{  Toast.makeText(this, "smith 6",Toast.LENGTH_SHORT).show()}
                }
            }
        }


    }

    override fun onClick(v: View?) {
        when(v!!.id){
            R.id.containedButton->{
                Toast.makeText(this, "smith 1",Toast.LENGTH_SHORT).show()
            }
            R.id.outlinedButtonWithIcon->{
                Toast.makeText(this, "smith 1",Toast.LENGTH_SHORT).show()
            }
            R.id.textButton->{
                Toast.makeText(this, "smith 1",Toast.LENGTH_SHORT).show()
            }
            R.id.customButton->{
                Toast.makeText(this, "smith 1",Toast.LENGTH_SHORT).show()
            }
        }
    }
}