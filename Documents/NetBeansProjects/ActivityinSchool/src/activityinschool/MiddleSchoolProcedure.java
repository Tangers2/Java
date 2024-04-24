import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MiddleSchoolProcedure {

    // Function to find prime factors of a number
    public static List<Integer> findPrimeFactors(int n) {
        List<Integer> factors = new ArrayList<>();
        // Divide by 2 until n is odd
        while (n % 2 == 0) {
            factors.add(2);
            n = n / 2;
        }
        // Divide by odd numbers starting from 3
        for (int i = 3; i <= Math.sqrt(n); i = i + 2) {
            while (n % i == 0) {
                factors.add(i);
                n = n / i;
            }
        }
        // If n is a prime number greater than 2
        if (n > 2) {
            factors.add(n);
        }
        return factors;
    }

    // Function to find GCD using Middle School Procedure
    public static int findGCD(int a, int b) {
        // Find prime factors of both numbers
        List<Integer> factorsA = findPrimeFactors(a);
        List<Integer> factorsB = findPrimeFactors(b);

        // Find common prime factors
        Set<Integer> commonFactors = new HashSet<>(factorsA);
        commonFactors.retainAll(factorsB);

        // Multiply common prime factors to get GCD
        int gcd = 1;
        for (int factor : commonFactors) {
            gcd *= factor;
        }

        // Display prime factors and common prime factors
        System.out.println("Prime factors of " + a + ": " + factorsA);
        System.out.println("Prime factors of " + b + ": " + factorsB);
        System.out.println("Common prime factors: " + commonFactors);

        return gcd;
    }

    public static void main(String[] args) {
        int a = 84;
        int b = 126;
        System.out.println("GCD of " + a + " and " + b + " is: " + findGCD(a, b));
    }
}
