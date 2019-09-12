class Runner {
    public static void main(String[] args) {

        PrimeSaver p = new PrimeSaver(100);
        long startTime = System.currentTimeMillis();
        p.findPrimes();
        long timeElapsed = System.currentTimeMillis() - startTime;
        p.printPrimes();
        System.out.println("Took " + timeElapsed + " miliseconds");
        p.StorePrimes();

    }
}