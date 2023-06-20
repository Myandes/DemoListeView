package com.reytian.demolisteview

import java.io.Serializable

class Etudiant(var nom: String, var prenom: String, var age: Int): Serializable {

    override fun toString(): String {
        return "$nom $prenom $age"
    }
}