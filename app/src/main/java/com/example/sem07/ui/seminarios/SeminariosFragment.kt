package com.example.sem07.ui.seminarios

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.sem07.databinding.FragmentSeminariosBinding

class SeminariosFragment : Fragment() {

    private var _binding: FragmentSeminariosBinding? = null
    private val binding get() = _binding!!

    private val listaSeminarios = listOf(
        Seminario("Lunes 10", "10:00 am", "Innovación en la Ingeniería", "Ing. Juan Pérez", "Auditorio Central"),
        Seminario("Martes 11", "12:00 pm", "IA en la actualidad", "Ing. María López", "Complejo de Ingeniería"),
        Seminario("Miércoles 12", "9:00 am", "Ingeniería Ambiental", "Ing. Carlos Ríos", "Plazuela UNS"),
        Seminario("Jueves 13", "3:00 pm", "Energías Renovables", "Dra. Ana Vega", "Auditorio Central"),
        Seminario("Viernes 14", "1:00 pm", "Ingeniería Biomédica", "Dr. Andrés Salas", "Complejo de Ingeniería")
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSeminariosBinding.inflate(inflater, container, false)

        val adapter = SeminarioAdapter(listaSeminarios)
        binding.recyclerSeminarios.adapter = adapter

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
