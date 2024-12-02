package com.example.trabalho_de_mobile.controller

import com.example.trabalho_de_mobile.model.imagens
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.Query

class imagensController {

    private val db = FirebaseFirestore.getInstance()

    fun adicionar(tarefa: imagens, onResult: (Boolean, String?) -> Unit) {

        val collectionRef = db.collection("imagens")

        collectionRef.add(tarefa).addOnCompleteListener { task ->
            if (task.isSuccessful) {
                onResult(true, null)
            } else {
                val errorMessage = task.exception?.message
                onResult(false, errorMessage)
            }
        }
    }

    fun listarPorIdUsuario(idUsuario: String?): Query {
        return db.collection("tarefas").whereEqualTo("uid", idUsuario)
    }


}

