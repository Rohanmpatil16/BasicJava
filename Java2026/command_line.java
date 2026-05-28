public class command_line {

    public static void main(String args[]) {

        if(args.length == 0) {
            System.out.println("Please provide a number");
            return;
        }

        int a = Integer.parseInt(args[2]);

        if(a % 2 == 0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
}