class star_pattern9{
    public static void main(String args[])
    {
            
        for(int i=1;i<=5;i++)
        {
            for(int j=i;j<5;j++)
            {
                System.out.print("\t");
            }

            for(int k=1;k<=(2*i-1);k++)
            {
                System.out.print("*\t");
            }
       System.out.println("");
        }


    }
}