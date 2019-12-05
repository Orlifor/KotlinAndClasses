package at.fh.swengb.kotlinandclasses

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = listOf(Circle(5.0), Rectangle(2.5, 4.5), Square(6.0))

        for (item in list) {
            Log.v("Area", "${item.javaClass.canonicalName} ${item.calculateArea()}")


            val dragon1 = Dragon(10,0,"Smaug",100,true,10)
            val lion1 = Lion(10,0,"tom",80,true,8)
            val player1 = Player(10,0,"mathe man",50,true,5)

            player1.attack(lion1)
            lion1.attack(player1)
            dragon1.attack(player1)
        }
    }
}
