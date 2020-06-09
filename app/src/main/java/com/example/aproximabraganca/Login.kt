package com.example.aproximabraganca

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation

class Login : Fragment(), CompoundButton.OnCheckedChangeListener, View.OnClickListener {

    var navController: NavController? = null
    lateinit var comerciante: Boolean

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        view.findViewById<Button>(R.id.btnEntrar).setOnClickListener(this)

        val prefs =
                this.requireActivity().getSharedPreferences("br.com.example.maratonasamsung", Context.MODE_PRIVATE)

        //val isButtonSelected = prefs.getBoolean("comerciante", false)

        //view.findViewById<RadioButton>(R.id.radioButton).isChecked = isButtonSelected

        val switchBtn = view.findViewById<Switch>(R.id.radioButton)
        switchBtn.setOnCheckedChangeListener(this)
        view.findViewById<ImageButton>(R.id.radioButton).setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.btnEntrar -> {
                if(comerciante)
                    navController!!.navigate(R.id.action_login_to_dashboardCliente)
                else
                    navController!!.navigate(R.id.action_login_to_dashboardComercio)
            }
        }
    }

    override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) {
        comerciante = isChecked
    }
}