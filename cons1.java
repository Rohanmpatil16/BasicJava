import java.util.*;
public class cons1{
   
        Scanner sc=new Scanner(System.in);
    int l,h;
        void get(){
         l= sc.nextInt();
         h=sc.nextInt();
        } 

        void dis()
        {
            int a=l*h;
            System.out.println(a);
        }

        public static void main(String args[])
    {
        cons1 o=new cons1();
        o.get();
        o.dis(); 

    }
    
}
