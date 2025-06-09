package com.example.sem07.ui.seminarios

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sem07.databinding.ItemSeminarioBinding

class SeminarioAdapter(private val lista: List<Seminario>) :
    RecyclerView.Adapter<SeminarioAdapter.SeminarioViewHolder>() {

    inner class SeminarioViewHolder(val binding: ItemSeminarioBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Seminario) {
            binding.txtTitulo.text = item.titulo
            binding.txtPonente.text = "Ponente: ${item.ponente}"
            binding.txtFechaHora.text = "${item.fecha} - ${item.hora}"
            binding.txtLugar.text = "Lugar: ${item.lugar}"
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SeminarioViewHolder {
        val binding = ItemSeminarioBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SeminarioViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SeminarioViewHolder, position: Int) {
        holder.bind(lista[position])
    }

    override fun getItemCount(): Int = lista.size
}
