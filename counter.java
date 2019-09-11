public class Counter {
    /**
     * Returns an array of all the primes up the the max
     * @max : The highest value checked to be prime
     */
    public static int[] findPrimes(int max) {
        ArrayList<> primes = new ArrayList<Integer> ();
        for (int check = 2; check <= max; check++) {
            System.out.println("Checking " + check);
            boolean isPrime = true;
            for (int index = 0; index < primes.size(); index++) {
                if (check % primes.get(index) == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                primes.add(check);
                System.out.println("       Found prime: " + check);
            }
        }

        int[] foundPrimes = new int[primes.size()];
        for (int i = 0; i < foundPrimes.length; i++){
            foundPrimes[i] = primes.get(i);
        }
        return foundPrimes;
    }
}