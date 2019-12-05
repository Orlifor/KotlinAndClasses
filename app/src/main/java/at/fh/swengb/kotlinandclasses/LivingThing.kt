package at.fh.swengb.kotlinandclasses

import android.util.Log

open class LivingThing(val name: String, var health: Int, val attackStrength: Int, var isAlive: Boolean) {
   open fun attack(attackee: LivingThing) {
        Log.i("LivingThing", "Attacking ${attackee.name} with attackStrength: ${attackStrength}")
        attackee.takeDamageFrom(this, attackStrength)
    }

    fun takeDamageFrom(attacker: LivingThing, damage: Int) {
        Log.i("LivingThing", "${name} is taking ${damage} damage from: ${attacker.name}")
        this.health = this.health - damage
        if (this.health <= 0) {
            this.isAlive = false
            Log.i("LivingThing", "${name} died!")
        }
    }
}