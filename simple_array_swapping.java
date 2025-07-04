public class simple_array_swapping {

    // public static void swap(int a[],int i,int j)
    // {
    //     int temp=a[i];
    //     a[i]=a[j];
    //     a[j]=temp;
        
    // }

    public static void main(String[] args) {
        int a[],i;
        a=new int[5];
         
        a[0]=3;
        a[2]=6;
        a[3]=4;
        a[4]=8;
      
        // swap(a,0,4);
        int temp=a[0];
        a[0]=a[4];
        a[4]=temp;
            

        for(i=0;i<a.length;i++)
        {
        System.out.println("After Swapping:"+a[i]);
        }
        
    }
    
}
