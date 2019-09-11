class Runner {
    public static void main(String[] args) {
        //Figure out primes to a certain amount and prints them out along with how long it took to find the primes.
        System.out.println("Primes...");
        long startTime = System.currentTimeMillis();
        Prime p = new Prime(100000);
        long timeElapsed = System.currentTimeMillis() - startTime;
        p.printPrimes();
        System.out.println("Took " + timeElapsed + " miliseconds");
    }
}