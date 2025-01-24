import java.util.*;
class assig{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        if (input.matches("-?\\d+")) {
            System.out.println("The input data type is: Integer");
        } else if (input.matches("-?\\d*\\.\\d+")) {
            System.out.println("The input data type is: Float");
        } else if (input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false")) {
            System.out.println("The input data type is: Boolean");
        } else {
            System.out.println("The input data type is: String");
        }
    }
}