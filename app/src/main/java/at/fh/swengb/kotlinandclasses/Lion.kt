package at.fh.swengb.kotlinandclasses

import android.util.Log

class Lion (val level: Int,
            val experience: Int,
            name: String,
            health: Int,
            isAlive: Boolean,
            attackStrength: Int):LivingThing(name,health,attackStrength, isAlive) {
    init {
        roar()
    }
    private fun roar() {
        Log.i("LION", "The Lion roars")
    }
}


