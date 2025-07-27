public class recursion_reverse_string {
    public static void rev(String sr,int index)
    {
        if(index<0)
        {
            return;
        }
        System.err.print(sr.charAt(index));
        rev(sr,index-1);
        
    }
    
    public static void main(String args[]) {
        String sr="abcd";
        
        System.out.print("Revese String is:");
        rev(sr, sr.length()-1);
    }
        
}