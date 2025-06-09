package com.example.sem07.ui.agenda

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sem07.databinding.ItemEventoBinding

class EventoAdapter(private val lista: List<Evento>) :
    RecyclerView.Adapter<EventoAdapter.EventoViewHolder>() {

    inner class EventoViewHolder(val binding: ItemEventoBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(evento: Evento) {
            binding.txtTitulo.text = evento.titulo
            binding.txtHora.text = "Hora: ${evento.hora}"
            binding.txtLugar.text = "Lugar: ${evento.lugar}"
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventoViewHolder {
        val binding = ItemEventoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return EventoViewHolder(binding)
    }

    override fun onBindViewHolder(holder: EventoViewHolder, position: Int) {
        holder.bind(lista[position])
    }

    override fun getItemCount(): Int = lista.size
}
