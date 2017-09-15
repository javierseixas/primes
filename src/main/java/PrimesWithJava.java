import java.util.stream.IntStream;

class PrimesWithJava {

  public static final int SEARCH_LIMIT = 2000;
  public static final int RESULT_LIMIT = 60;

  public static void main(String args[]) {

    IntStream.rangeClosed(2, SEARCH_LIMIT)
            .filter(i -> IntStream.rangeClosed(2, (int)Math.sqrt(i))
                    .allMatch(j -> i%j != 0))
            .filter(PrimesWithJava::endsWith7)
            .limit(RESULT_LIMIT)
            .forEach(n -> {
              System.out.println(n);
            });
  }

  private static boolean endsWith7(int prime) {
    String primeToString = String.valueOf(prime);
    String lastNumber = primeToString.substring(primeToString.length() - 1);
    return lastNumber.equals("7");
  }
}