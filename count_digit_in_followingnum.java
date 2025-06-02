import java.util.*;
public class count_digit_in_followingnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("HOW MANY NUMBERS DO YOU WANT TO CHECK FOR COUNT OF DIGITS?");
        int a=sc.nextInt();
        int count=0;

        while(a!=0)
        {
            
            a=a/10;
            count++;
            
        }
        System.out.println("Count of the Number is:"+count);
        

    }
    
}
