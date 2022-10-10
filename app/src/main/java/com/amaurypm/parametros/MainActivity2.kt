package com.amaurypm.parametros

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val bundle = intent.extras

        val usuario = bundle?.getString("usuario", "")
        val sesion = bundle?.getInt("sesion", 0)

        val alumno1 = bundle?.getSerializable("alumno1") as Alumno1
        val alumno2 = bundle?.getParcelable<Alumno2>("alumno2")
        val alumno3 = bundle?.getParcelable<Alumno3>("alumno3")
        val alumno4 = bundle?.getSerializable("alumno4") as Alumno4

        if (alumno1 != null) {
            Toast.makeText(
                this,
                "Nombre del alumno 1 serializable: ${alumno1.nombre}, núm cuenta: ${alumno1.numCuenta}",
                Toast.LENGTH_LONG
            )
                .show()
        }

        Toast.makeText(
            this,
            "Nombre del alumno 2 parcelable: ${alumno2?.nombre}, núm cuenta: ${alumno2?.numCuenta}",
            Toast.LENGTH_LONG
        ).show()

        Toast.makeText(
            this,
            "Nombre del alumno 3 parcelable: ${alumno3?.nombre}, núm cuenta: ${alumno3?.numCuenta}, grupo: ${alumno3?.grupo}",
            Toast.LENGTH_LONG
        ).show()

        Toast.makeText(
            this,
            "Nombre del alumno 4 serializable: ${alumno4?.nombre}, núm cuenta: ${alumno4?.numCuenta}",
            Toast.LENGTH_LONG
        ).show()


        //Toast.makeText(this, "Nombre: $usuario, Sesión: $sesion", Toast.LENGTH_LONG).show()

    }
}