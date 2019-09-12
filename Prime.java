import java.util.ArrayList;

class Prime {

    private int[] primes;
    private int maxCheck;
    private int minPrime = 2;


    public Prime(int maxToCheck) {
        maxCheck = maxToCheck;
    }

    public void findPrimes() {
        ArrayList<Integer> primes = new ArrayList<Integer> ();
        findPrimes(primes);
    }

    /**
     * Calculates all the primes up to and including this.maxCheck
     * For each number that it checks, sees if any previous primes are divisible. If none are, it is a prime
     * @primes : the previously found prime numbers
     */
    public void findPrimes(ArrayList<Integer> primes) {
        
        //If primes are already found then start at the next possible prime
        if (primes.size() > 0) {
            minPrime = primes.get(primes.size()-1) + 1;
        }
        
        //Check all numbers up to and uncluding this.maxCheck
        for (int check = this.minPrime; check <= this.maxCheck; check++) {
            boolean isPrime = true;
            int maxPrime = (int)(Math.sqrt(check));

            //Check if the current number, 'check', is divisible by any previously found primes. If it is, 'check' is composite
            for (int index = 0; index < primes.size(); index++) {
                int prime = primes.get(index);
                if (prime > maxPrime) {
                    break;
                }
                if (check % prime == 0 ) {
                    isPrime = false;
                    break;
                }
            }

            //If 'check' is prime, add it to the primes ArrayList.
            if (isPrime) {
                primes.add(check);
            }
        }

        //Move all the values from the method's ArrayList to the class' integer array
        this.primes = new int[primes.size()];
        for (int i = 0; i < this.primes.length; i++){
            this.primes[i] = primes.get(i);
        }
    }

    /**
     * Prints out all the primes up to this.maxCheck
     */
    public void printPrimes() {
        if (this.primes.length > 0) {
            System.out.println("Primes up to " + maxCheck + ":");
            for (int i = 0; i < this.primes.length; i++) {
                System.out.println("\t" + this.primes[i]);
            }
        }   else {
            System.out.println("There are no primes up to " + maxCheck + ".");
        }
        
    }
}