import java.util.*

class Primes() {

    fun getPrimesBrute(n: Int): ArrayList<Int> {
        val result = ArrayList<Int>()

        for (i in (2..n)) {
            var t = true
            s@ for (j in 2..i-1) {
                if (i % j == 0) {
                    t = false
                    // Breaking the for loop so we do not waste
                    // time on a number which is not a prime
                    break@s
                }
            }
            if (t) result.add(i)
        }
        return result
    }

}

fun main(args: Array<String>) {

    println(Primes().getPrimesBrute(60))

}
