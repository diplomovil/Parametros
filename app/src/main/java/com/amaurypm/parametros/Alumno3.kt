package com.amaurypm.parametros

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

/**
 * Creado por Amaury Perea Matsumura el 08/10/22
 */

@Parcelize
data class Alumno3(var nombre: String, var numCuenta: String, var grupo: Int): Parcelable
