package at.fh.swengb.kotlinandclasses

import android.util.Log

class Dragon    (val level: Int,
                 val experience: Int,
                 name: String,
                health: Int,
                isAlive: Boolean,
                 attackStrength: Int):LivingThing(name,health,attackStrength, isAlive) {
    private fun breathfire() {

    }

    override fun attack(attackee: LivingThing) {
        super.attack(attackee)
        Log.i("DRAGON", "The dragon breathes Fire")
    }
}
