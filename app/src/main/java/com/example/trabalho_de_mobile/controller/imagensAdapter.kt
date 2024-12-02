package com.example.trabalho_de_mobile.controller

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.trabalho_de_mobile.databinding.ItenLayoutBinding
import com.example.trabalho_de_mobile.model.imagens

class imagensAdapter(private val listaimagens: MutableList<imagens>) :
    RecyclerView.Adapter<imagensAdapter.TarefaViewHolder>() {

    class TarefaViewHolder(val binding: ItenLayoutBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TarefaViewHolder {
        val binding = ItenLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TarefaViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TarefaViewHolder, position: Int) {
        if (getItemCount() > 0 ){
            val tarefa = listaimagens[position]
            holder.binding.nomeConteudo.text = tarefa.nome
            holder.binding.imagemConteudo.setOnClickListener {
                notifyItemRemoved(position)
                notifyItemRangeChanged(position, listaimagens.size)
            }
        }
    }

    override fun getItemCount() = listaimagens.size

    fun atualizarLista(novasTarefas: List<imagens>) {
        listaimagens.clear()
        listaimagens.addAll(novasTarefas)
        notifyDataSetChanged()
    }
}
