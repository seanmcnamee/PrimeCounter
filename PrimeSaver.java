class PrimeSaver extends Prime{
    Data primesOnFile;

    public PrimeSaver(int maxCheck) {
        super(maxCheck);
        primesOnFile = new Data("Primes.dat");
        this.primes = primesOnFile.readFromFile();
        if (this.primes != null && this.primes.length > 0) {
            this.minPrime = this.primes[this.primes.length-1]+1;
        }
        
    }

    public void StorePrimes() {
        primesOnFile.writeToFile(this.primes);
    }
}