package abdoulbasith.apps.fizzbuzz

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class FizzBuzzActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fizz_buzz)

        val bundle: Bundle = intent.extras!!
        val int1: Int = bundle.getInt(getString(R.string.int1))
        val int2: Int = bundle.getInt(getString(R.string.int2))
        val limit: Int = bundle.getInt(getString(R.string.limit))
        val str1: String = bundle.getString(getString(R.string.str1))!!
        val str2: String = bundle.getString(getString(R.string.str2))!!


        val listView = findViewById<ListView>(R.id.listView)
        val arrayAdapter: ArrayAdapter<*>

        val fizzBuzz = fizzBuzz(int1, int2, limit, str1, str2)

        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, fizzBuzz)

        listView.adapter = arrayAdapter
    }



    private fun fizzBuzz(int1: Int, int2: Int, limit: Int, str1: String, str2: String): ArrayList<String>{

        val stringList = arrayListOf<String>()

        for(i in 1..limit){
            when {
                i % (int1*int2) == 0 -> stringList.add(str1+str2)
                i % int2 == 0 -> stringList.add(str2)
                i % int1 == 0 -> stringList.add(str1)
            }

            if(i % int1 != 0 && i % int2 != 0 && i % (int1*int2) != 0)
                stringList.add(i.toString())
        }

        return stringList
    }
}