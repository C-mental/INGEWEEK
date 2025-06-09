package com.example.sem07.ui.ubicaciones

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.sem07.R
import com.example.sem07.databinding.FragmentUbicacionesBinding

class UbicacionesFragment : Fragment() {

    private var _binding: FragmentUbicacionesBinding? = null
    private val binding get() = _binding!!
    private lateinit var adapter: UbicacionAdapter

    val ubicaciones = listOf(
        Ubicacion("Auditorio Central", "Pabellón A", "Auditorio", R.drawable.ic_auditorio),
        Ubicacion("Plazuela U.N.S.", "Ingreso principal", "Plazuela", R.drawable.ic_plazuela),
        Ubicacion("Complejo Ing.", "Zona deportiva", "Complejo", R.drawable.ic_complejo)
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentUbicacionesBinding.inflate(inflater, container, false)

        adapter = UbicacionAdapter(ubicaciones)
        binding.recyclerUbicaciones.adapter = adapter

        // ✅ Corrección: incluimos chipTodos
        binding.chipGroupUbicaciones.setOnCheckedChangeListener { _, checkedId ->
            val filtro = when (checkedId) {
                R.id.chipAuditorio -> "Auditorio"
                R.id.chipPlazuela -> "Plazuela"
                R.id.chipComplejo -> "Complejo"
                R.id.chipTodos -> null
                else -> null
            }

            val filtrados = if (filtro == null) {
                ubicaciones
            } else {
                ubicaciones.filter { it.tipo == filtro }
            }

            adapter.actualizarLista(filtrados)
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
