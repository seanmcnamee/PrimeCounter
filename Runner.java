class Runner {
    public static void main(String[] args) {

        //int[] data = {1, 2, 3, 5};
        Data testData = new Data("Woah.dat");
        //testData.writeToFile(data);
        int[] data = testData.readFromFile();

        System.out.println("Data: ");
        for (int i = 0; i < data.length; i++) {
            System.out.println("\t" + data[i]);
        }
        /*
        //Figure out primes to a certain amount and prints them out along with how long it took to find the primes.
        System.out.println("Primes...");
        Prime p = new Prime(100);
        long startTime = System.currentTimeMillis();
        p.findPrimes();
        long timeElapsed = System.currentTimeMillis() - startTime;
        p.printPrimes();
        System.out.println("Took " + timeElapsed + " miliseconds");
        */
    }
}