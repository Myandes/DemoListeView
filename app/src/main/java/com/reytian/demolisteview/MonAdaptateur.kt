package com.reytian.demolisteview

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import android.widget.ArrayAdapter
import android.widget.TextView

class MonAdaptateur (var context : Activity, var liste : ArrayList<Etudiant>): ArrayAdapter<Etudiant>(context, R.layout.liste_test, liste) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var rowview = context.layoutInflater.inflate(R.layout.liste_test, null, true)

        rowview.findViewById<TextView>(R.id.textViewPrenom).text = liste[position].prenom
        rowview.findViewById<TextView>(R.id.textViewnNom).text = liste[position].nom
        rowview.findViewById<TextView>(R.id.textViewAge).text = liste[position].age.toString()

        return rowview
    }
}