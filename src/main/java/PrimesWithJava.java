import java.util.stream.IntStream;

class PrimesWithJava {
  public static void main(String args[]) {
    IntStream.rangeClosed(2, 100)
            .filter(i -> IntStream.rangeClosed(2, (int)Math.sqrt(i))
                    .allMatch(j -> i%j != 0))
            .filter(prime -> {
              String primeToString = String.valueOf(prime);
              String lastNumber = primeToString.substring(primeToString.length() - 1);
              return lastNumber.equals("7");
            })
            .forEach(n -> {
              System.out.println(n);
            });
  }
}