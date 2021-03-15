package abdoulbasith.apps.fizzbuzz

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun fizzBuzzTest(){
        val stringList = Utils().fizzBuzz(3, 5, 100, "fizz", "buzz")

        assertEquals("fizz", stringList[2])
        assertEquals("buzz", stringList[4])
        assertEquals("fizzbuzz", stringList[14])
        assertEquals(100, stringList.size)

    }

}