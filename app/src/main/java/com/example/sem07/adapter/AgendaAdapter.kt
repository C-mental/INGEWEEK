package com.example.sem07.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sem07.databinding.ItemAgendaBinding
import com.example.sem07.model.Evento

class AgendaAdapter(private val lista: List<Evento>) :
    RecyclerView.Adapter<AgendaAdapter.AgendaViewHolder>() {

    inner class AgendaViewHolder(private val binding: ItemAgendaBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(evento: Evento) {
            binding.txtTitulo.text = evento.titulo
            binding.txtHora.text = "Hora: ${evento.hora}"
            binding.txtLugar.text = "Lugar: ${evento.lugar}"
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AgendaViewHolder {
        val binding = ItemAgendaBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return AgendaViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AgendaViewHolder, position: Int) {
        holder.bind(lista[position])
    }

    override fun getItemCount(): Int = lista.size
}
