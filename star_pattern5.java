
public class star_pattern5 {
    public static void main(String[] args) {
        
    
    for(int i=1;i<=5;i++)
    {
        for(int j=5;j>=i;j--)
        {
            System.out.print("\t");
        }
        
         for(int k=1;k<=(i*2-1);k++)
        {
        System.out.print("*\t");
         }
    
    System.out.println("");
    }
    
}
}