package at.fh.swengb.kotlinandclasses

import java.lang.Math.PI

class Circle (private val r: Double): Shape{
    override fun calculateArea(): Double{
        return PI * r * r
    }
}