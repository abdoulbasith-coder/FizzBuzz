package abdoulbasith.apps.fizzbuzz

import android.content.Intent
import android.os.Bundle
import android.text.InputFilter
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editInt1 = findViewById<EditText>(R.id.edit_int1)
        val editInt2 = findViewById<EditText>(R.id.edit_int2)
        val editLimit = findViewById<EditText>(R.id.edit_limit)
        val editStr1 = findViewById<EditText>(R.id.edit_str1)
        val editStr2 = findViewById<EditText>(R.id.edit_str2)
        val btnValider = findViewById<Button>(R.id.valider_formulaire)

        editInt1.filters = arrayOf<InputFilter>(MinMaxFilter("1", "10"))
        editInt2.filters = arrayOf<InputFilter>(MinMaxFilter("1", "10"))
        editLimit.filters = arrayOf<InputFilter>(MinMaxFilter("1", "100"))

        btnValider.setOnClickListener {

            val bundle = Bundle()
            bundle.putInt(getString(R.string.int1), Integer.valueOf(if(editInt1.text.isNotEmpty()) editInt1.text.toString() else "0"))
            bundle.putInt(getString(R.string.int2), Integer.valueOf(if(editInt2.text.isNotEmpty()) editInt2.text.toString() else "0"))
            bundle.putInt(getString(R.string.limit), Integer.valueOf(if (editLimit.text.isNotEmpty()) editLimit.text.toString() else "0"))
            bundle.putString(getString(R.string.str1), if(editStr1.text.isNotEmpty()) editStr1.text.toString() else "")
            bundle.putString(getString(R.string.str2), if(editStr2.text.isNotEmpty()) editStr2.text.toString() else "")

            val fizzBuzzIntent = Intent(this, FizzBuzzActivity::class.java)
            fizzBuzzIntent.putExtras(bundle)


            startActivity(fizzBuzzIntent)

        }
    }


}