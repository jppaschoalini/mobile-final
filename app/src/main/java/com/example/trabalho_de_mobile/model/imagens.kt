package com.example.trabalho_de_mobile.model

class imagens {
    var id: String? = null
    var uid: String? = null
    var imagem: String? = null
    var nome: String? = null

    constructor()
    constructor(id: String?, uid: String?, imagem: String?, nome: String?) {
        this.id = id
        this.uid = id
        this.imagem = imagem
        this.nome = nome
    }
}
