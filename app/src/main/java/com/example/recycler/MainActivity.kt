package com.example.recycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.recycler.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val adapter = ListAdapter(getItems())
        recyclerView.adapter= adapter
    }

    private fun getItems(): List<MokData> {
        return arrayListOf(
            MokData("Chaves", "chaves@vila.com.br"),
            MokData("Quico", "quico@vila.com.br"),
            MokData("Chiquinha", "chiquinha@vila.com.br"),
            MokData("Madruguinha", "madruguinha@vila.com.br"),
            MokData("Professor Girafalez", "girafalez@escola.com.br"),
            MokData("Nhonho", "nhonho@barriga.com.br"),
            MokData("Quico", "quico@vila.com.br"),
            MokData("Chiquinha", "chiquinha@vila.com.br"),
            MokData("Madruguinha", "madruguinha@vila.com.br"),
            MokData("Professor Girafalez", "girafalez@escola.com.br"),
            MokData("Nhonho", "nhonho@barriga.com.br"),
            MokData("Sr.Barriga", "sr_barriga@barriga.com.br"),  MokData("Quico", "quico@vila.com.br"),
            MokData("Chiquinha", "chiquinha@vila.com.br"),
            MokData("Madruguinha", "madruguinha@vila.com.br"),
            MokData("Professor Girafalez", "girafalez@escola.com.br"),
            MokData("Nhonho", "nhonho@barriga.com.br"),
            MokData("Sr.Barriga", "sr_barriga@barriga.com.br"),  MokData("Quico", "quico@vila.com.br"),
            MokData("Chiquinha", "chiquinha@vila.com.br"),
            MokData("Madruguinha", "madruguinha@vila.com.br"),
            MokData("Professor Girafalez", "girafalez@escola.com.br"),
            MokData("Nhonho", "nhonho@barriga.com.br"),
            MokData("Sr.Barriga", "sr_barriga@barriga.com.br"),  MokData("Quico", "quico@vila.com.br"),
            MokData("Chiquinha", "chiquinha@vila.com.br"),
            MokData("Madruguinha", "madruguinha@vila.com.br"),
            MokData("Professor Girafalez", "girafalez@escola.com.br"),
            MokData("Nhonho", "nhonho@barriga.com.br"),
            MokData("Sr.Barriga", "sr_barriga@barriga.com.br"),  MokData("Quico", "quico@vila.com.br"),
            MokData("Chiquinha", "chiquinha@vila.com.br"),
            MokData("Madruguinha", "madruguinha@vila.com.br"),
            MokData("Professor Girafalez", "girafalez@escola.com.br"),
            MokData("Nhonho", "nhonho@barriga.com.br"),
            MokData("Sr.Barriga", "sr_barriga@barriga.com.br"),  MokData("Quico", "quico@vila.com.br"),
            MokData("Chiquinha", "chiquinha@vila.com.br"),
            MokData("Madruguinha", "madruguinha@vila.com.br"),
            MokData("Professor Girafalez", "girafalez@escola.com.br"),
            MokData("Nhonho", "nhonho@barriga.com.br"),
            MokData("Sr.Barriga", "sr_barriga@barriga.com.br"),
            MokData("Sr.Barriga", "sr_barriga@barriga.com.br"),
            MokData("Chapolin", "chapolim@colorado.com.br")git
        ).toList()
    }

}