import java.util.Scanner;

public class Quiz4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n;

            System.out.println("Enter a number between 1 and 20: ");
             n = scan.nextInt();

        while (n < 1 || n > 20) {
            System.out.println("Enter number between 1 and 20: ");

            n = scan.nextInt();

        }
        int[] arr = new int[n];

        for (int x = 1; x < arr.length; x++) {

           arr[x] = (int)Math.pow(2,x);
           System.out.println(arr[x]);

    //    }

        // System.out.println(arr[3]);


         }
    }
}









