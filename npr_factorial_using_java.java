import java.util.*;
public class npr_factorial_using_java {
    
    

    
public static int fact(int x){
    int f=1;
    for(int i=1;i<=x;i++){
        f=f*i;
    }
    return f;
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter values for n and r:");
    int n = sc.nextInt();
    int r=sc.nextInt();

    int factn=fact(n);
    int factr=fact(n-r);
    int npr=factn/factr;
        System.out.println("NPR of " + n + " and " + r + " is: " + npr);

}

}