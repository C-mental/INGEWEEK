package com.example.sem07.ui.agenda

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.sem07.databinding.FragmentAgendaBinding

class AgendaFragment : Fragment() {

    private var _binding: FragmentAgendaBinding? = null
    private val binding get() = _binding!!

    private val listaEventos = listOf(
        Evento("Lunes", "10:00 am", "Inauguración", "Plazuela"),
        Evento("Martes", "11:00 am", "Feria de Proyectos", "Complejo Ing."),
        Evento("Miércoles", "9:00 am", "Seminario Ambiental", "Auditorio"),
        Evento("Jueves", "3:00 pm", "Panel de Expertos", "Auditorio"),
        Evento("Viernes", "2:00 pm", "Clausura y premiación", "Plazuela")
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAgendaBinding.inflate(inflater, container, false)
        val adapter = EventoAdapter(listaEventos)
        binding.recyclerAgenda.adapter = adapter
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
