import java.util.*

class Constants {
    companion object {
        val MAX_INTEGER_NUMBER_TO_LOOP = 10000
    }
}

class Primes() {

    fun getPrimesBrute(desiredNumberOfResults: Int): ArrayList<Int> {
        val result = ArrayList<Int>()

        for (i in (2..Constants.MAX_INTEGER_NUMBER_TO_LOOP)) {
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

            if (result.size.equals(desiredNumberOfResults)) break
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
