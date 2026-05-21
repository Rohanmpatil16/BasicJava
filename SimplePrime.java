import java.util.*;

public class SimplePrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("HOW MANY NUMBERS DO YOU WANT TO CHECK FOR PRIME?");
        int n = sc.nextInt();

        int[] numbers = new int[n]; 

        System.out.println("Enter " + n + " numbers to check for Prime or Not:");

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();  
        }

        System.out.println("\nResults:");
        for (int i = 0; i < n; i++) {
            int a = numbers[i];
            int count = 0;

            for (int div = 1; div <= a; div++) {
                if (a % div == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.println(a + " is Prime");
            } else {
                System.out.println(a + " is Not Prime");
            }
        }

        sc.close();
    }
}
