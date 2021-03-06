package abdoulbasith.apps.fizzbuzz

class Utils {

    /**
     * int1: First integer
     * int2: Second integer
     * limit: limit of the loop
     * str1: First string
     * str2: Second String
     *
     * return: ArrayList<String>
     */
    fun fizzBuzz(int1: Int, int2: Int, limit: Int, str1: String, str2: String): ArrayList<String>{

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