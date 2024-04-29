package com.example.estudio

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    lateinit var navegacion: BottomNavigationView

    private val opcionMenuSeleccionada = BottomNavigationView.OnNavigationItemSelectedListener {item ->
        when(item.itemId) {
            R.id.fragmento3 -> {
                supportFragmentManager.commit {
                    replace<fragmento3>(R.id.contenedorFragment)
                    setReorderingAllowed(true)
                    addToBackStack("replacement")
                }
                return@OnNavigationItemSelectedListener true
            }
            R.id.fragmento4 -> {
                supportFragmentManager.commit {
                    replace<fragmento4>(R.id.contenedorFragment)
                    setReorderingAllowed(true)
                    addToBackStack("replacement")
                }
                return@OnNavigationItemSelectedListener true
            }
            R.id.fragmento5 -> {
                supportFragmentManager.commit {
                    replace<fragmento5>(R.id.contenedorFragment)
                    setReorderingAllowed(true)
                    addToBackStack("replacement")
                }
                return@OnNavigationItemSelectedListener true
            }
            R.id.fragmento6 -> {
                supportFragmentManager.commit {
                    replace<fragmento6>(R.id.contenedorFragment)
                    setReorderingAllowed(true)
                    addToBackStack("replacement")
                }
                return@OnNavigationItemSelectedListener true
            }

        }
        false
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        supportFragmentManager.commit {
            replace<fragmento3>(R.id.contenedorFragment)
            setReorderingAllowed(true)
            addToBackStack("replacement")


    }
        navegacion = findViewById(R.id.nav_menu)
        navegacion.setOnNavigationItemSelectedListener(opcionMenuSeleccionada)
    }
}