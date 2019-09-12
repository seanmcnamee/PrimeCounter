class PrimeSaver extends Prime{
    Data primesOnFile;

    /**
     * Creates the Prime class, gets any primes on file, and resets the minimum value to check
     */
    public PrimeSaver(int maxCheck) {
        super(maxCheck);
        primesOnFile = new Data("Primes.dat");
        this.primes = primesOnFile.readFromFile(maxCheck);
        if (this.primes != null && this.primes.length > 0) {
            this.minPrime = this.primes[this.primes.length-1]+1;
        }
        
    }

    /**
     * Uses the Data class to store the primes on file.
     */
    public void StorePrimes() {
        if (this.maxCheck > this.primes[this.primes.length-1]) {
            primesOnFile.writeToFile(this.primes);
        }
    }
}