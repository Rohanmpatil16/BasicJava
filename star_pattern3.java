
public class star_pattern3 {
    public static void main(String[] args) {
        for(int i=5;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("\t");
            }

            for (int k=1;k<=i;k++) {
                System.out.print("*\t");
                
            }
            System.out.println();
        }

        
    }
}
