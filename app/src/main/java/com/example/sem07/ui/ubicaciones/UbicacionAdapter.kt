package com.example.sem07.ui.ubicaciones

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sem07.databinding.ItemUbicacionBinding
import com.bumptech.glide.Glide

class UbicacionAdapter(private var lista: List<Ubicacion>) :
    RecyclerView.Adapter<UbicacionAdapter.UbicacionViewHolder>() {

    inner class UbicacionViewHolder(val binding: ItemUbicacionBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UbicacionViewHolder {
        val binding = ItemUbicacionBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return UbicacionViewHolder(binding)
    }

    override fun onBindViewHolder(holder: UbicacionViewHolder, position: Int) {
        val item = lista[position]
        holder.binding.txtLugar.text = item.nombre
        holder.binding.txtDireccion.text = item.direccion
        Glide.with(holder.itemView.context)
            .load(item.imagenResId)
            .into(holder.binding.imgUbicacion)
    }

    override fun getItemCount(): Int = lista.size

    fun actualizarLista(nueva: List<Ubicacion>) {
        lista = nueva
        notifyItemRangeChanged(0, lista.size) // 👈 Suavizado
    }
}
