package com.example.estudio

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [fragmento1.newInstance] factory method to
 * create an instance of this fragment.
 */
class fragmento1 : Fragment() {
    // TODO: Rename and change types of parameters

    //referencia al editText
    private lateinit var editText: EditText
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragmento1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // se inicializa la referencia con los id declarados en el XML
        val boton = view.findViewById<Button>(R.id.btn_boton)
        editText = view.findViewById(R.id.txt_edit)

        // se define una accion al dar tap en el boton
        boton.setOnClickListener(View.OnClickListener {view ->
            var message: String = editText.text.toString()
            val bundle = Bundle()

            // se declara una variable con el nombre "valor_campo" que sera usada
            // en el fragment 2 para mostrar el valor
            bundle.putString("valor_campo_respuesta", message)

            arguments = bundle
            parentFragmentManager.setFragmentResult("key", bundle)

        })
    }
}