package at.fh.swengb.kotlinandclasses

class Player (val level: Int,
              val experience: Int,
              name: String,
              health: Int,
              isAlive: Boolean,
              attackStrength: Int):LivingThing(name,health,attackStrength, isAlive){
}


