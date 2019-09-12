class Runner {
    public static void main(String[] args) {

        /**
         * Creates a PrimeSaver, which will handle figuring out the prime numbers and storing them
         * Print out the primes, the time elapsed, and stores all the primes on file (if a new one could've been found).
         */
        PrimeSaver p = new PrimeSaver(1000);
        long startTime = System.currentTimeMillis();
        p.findPrimes();
        long timeElapsed = System.currentTimeMillis() - startTime;
        p.printPrimes();
        System.out.println("Took " + timeElapsed + " miliseconds");
        p.StorePrimes();

    }
}