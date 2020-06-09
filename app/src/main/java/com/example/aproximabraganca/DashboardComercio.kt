package com.example.aproximabraganca

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation

class DashboardComercio : Fragment(), View.OnClickListener {

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
        view.findViewById<ImageButton>(R.id.imagePerfil).setOnClickListener(this)
        view.findViewById<ImageButton>(R.id.imageSituacao).setOnClickListener(this)
        view.findViewById<ImageButton>(R.id.imageAvaliacao).setOnClickListener(this)
        view.findViewById<ImageButton>(R.id.imageChat).setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.imagePerfil -> navController!!.navigate(R.id.action_dashboardComercio_to_perfilComercio)
            R.id.imageSituacao -> navController!!.navigate(R.id.action_dashboardComercio_to_situacaoComercio)
            R.id.imageAvaliacao -> navController!!.navigate(R.id.action_dashboardComercio_to_avaliacaoComercio)
            R.id.imageChat -> navController!!.navigate(R.id.action_dashboardComercio_to_chatComercio)
        }
    }
}

private fun Button.setOnClickListener(dashboardComercio: DashboardComercio) {
    TODO("Not yet implemented")
}