package com.example.estudio

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [fragmento2.newInstance] factory method to
 * create an instance of this fragment.
 */
class fragmento2 : Fragment() {
    // se declara la referencia del TextView que mostrara la informacion recibida
    lateinit var respuesta: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // se obtiene el valor de la "key" con el dato que sostiene la variable
        // "valor campo"
        parentFragmentManager.setFragmentResultListener("key", this) {requestKey, bundle ->

            val resultReceived = bundle.getString("valor_campo_respuesta").toString()
            respuesta.setText(resultReceived)

        }

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragmento2, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // se muestra el valor recibido en el mensaje que viene del fragment 1
        respuesta   = view.findViewById(R.id.txt_recibido)
    }
}