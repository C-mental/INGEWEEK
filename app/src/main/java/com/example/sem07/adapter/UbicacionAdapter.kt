package com.example.sem07.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sem07.databinding.ItemUbicacionBinding
import com.example.sem07.model.Ubicacion

class UbicacionAdapter(private var lista: List<Ubicacion>) :
    RecyclerView.Adapter<UbicacionAdapter.UbicacionViewHolder>() {

    inner class UbicacionViewHolder(private val binding: ItemUbicacionBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(ubicacion: Ubicacion) {
            binding.txtLugar.text = ubicacion.nombre
            binding.txtDireccion.text = ubicacion.direccion
            binding.imgUbicacion.setImageResource(ubicacion.imagenResId)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UbicacionViewHolder {
        val binding = ItemUbicacionBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return UbicacionViewHolder(binding)
    }

    override fun onBindViewHolder(holder: UbicacionViewHolder, position: Int) {
        holder.bind(lista[position])
    }

    override fun getItemCount(): Int = lista.size

    fun actualizarLista(nueva: List<Ubicacion>) {
        lista = nueva
        notifyDataSetChanged()
    }
}
