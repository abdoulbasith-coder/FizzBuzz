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

        val fizzBuzz = Utils().fizzBuzz(int1, int2, limit, str1, str2)

        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, fizzBuzz)

        listView.adapter = arrayAdapter
    }

}