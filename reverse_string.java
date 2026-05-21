
public class reverse_string {
    public static void main(String[] args) {
        String a="Rohan";
        System.out.println("Normal String is:"+a);
        System.out.print("Reversed String is:");
        for(int i=a.length()-1;i>=0;i--)
        {
            System.out.print(a.charAt(i));
        }
        
    }

    
}
