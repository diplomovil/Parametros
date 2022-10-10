package com.amaurypm.parametros

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.firebase.analytics.FirebaseAnalytics
import com.google.firebase.analytics.ktx.analytics
import com.google.firebase.analytics.ktx.logEvent
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {

    private lateinit var analytics: FirebaseAnalytics

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Obtain the FirebaseAnalytics instance.
        analytics = Firebase.analytics

        analytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT) {
            param(FirebaseAnalytics.Param.ITEM_ID, "1");
            param(FirebaseAnalytics.Param.ITEM_NAME, "Pantalla principal");
            param(FirebaseAnalytics.Param.CONTENT_TYPE, "Pantalla");
        }

    }

    fun click(view: View) {

        val parametros = Bundle()

        val alumno1 = Alumno1("Amaury", "111111")
        val alumno2 = Alumno2("Héctor", "222222")
        val alumno3 = Alumno3("Mi nombre alumno 3", "Mi núm cuenta 3", 3)

        //Instanciando un objeto de la clase hecha con Java y que también implementa Serializable
        val alumno4 = Alumno4("Mi nombre alumno 4", "Mi núm cuenta 4")

        val intent = Intent(this, MainActivity2::class.java)


        analytics.logEvent("clic_botón"){
            param("acción", "clic")
            param("texto_botón", "Ir a 2")
        }

        //parametros.putString("usuario","Amaury")
        //parametros.putInt("sesion", 12345)

        parametros.apply{
            putString("usuario", "Amaury")
            putInt("sesion", 12345)
            putSerializable("alumno1", alumno1)
            putParcelable("alumno2", alumno2)
            putParcelable("alumno3", alumno3)
            putSerializable("alumno4", alumno4)
        }

        intent.putExtras(parametros)

        startActivity(intent)

    }
}
