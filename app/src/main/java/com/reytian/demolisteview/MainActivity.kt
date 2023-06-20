package com.reytian.demolisteview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.reytian.demolisteview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        var list = arrayListOf<Etudiant>(
            Etudiant("Rey", "Tian", 20),
            Etudiant("Tian", "Rey", 20),
            Etudiant("Rey", "Rey", 20),
            Etudiant("Tian", "Tian", 20)
        )

        binding.ListEtudiant.adapter = MonAdaptateur(this, list)
    }
}