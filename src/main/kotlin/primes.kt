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
            if (t && endsWith7(i)) result.add(i)
        }
        return result
    }

    fun endsWith7(prime: Int): Boolean {
        val primeToString = prime.toString()
        val lastNumber = primeToString.subSequence(primeToString.lastIndex, primeToString.lastIndex + 1)
        return lastNumber.equals("7")
    }

}

fun main(args: Array<String>) {

    println(Primes().getPrimesBrute(60))

}
