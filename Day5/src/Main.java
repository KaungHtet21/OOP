public class Main {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 10; i <=50; i++) {
            if (isPrime(i)) {
                System.out.println("Number " + i + " is a prime number");
                count++;
            }
        }
        System.out.println("Total number of prime numbers " + count);
    }
    public static boolean isPrime(int inputNumber) {
        if (inputNumber <=2) {
            return (inputNumber == 2);
        }

        for (int divisor = 2; divisor <= inputNumber / 2;divisor++) {
            if (inputNumber % divisor == 0) {
                //break;
                return false;
            }
        }
        return true;
    }
}