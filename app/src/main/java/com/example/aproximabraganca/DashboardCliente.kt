package com.example.aproximabraganca

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation

class DashboardCliente : Fragment() {

    var navController: NavController? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dashboard_cliente, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        view.findViewById<Button>(R.id.imagePerfil).setOnClickListener(this)
    }

    fun onClick(v: View?) {
        when (v!!.id) {
            R.id.imagePerfil -> navController!!.navigate(R.id.action_dashboardCliente_to_perfilCliente)
        }
    }
}

private fun Button.setOnClickListener(dashboardCliente: DashboardCliente) {
    TODO("Not yet implemented")
}
