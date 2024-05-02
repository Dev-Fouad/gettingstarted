import java.util.Scanner;

public class NestedConditionals {
    public static void main(String[] args) {
        int largestnumber;

        System.out.println("Enter first Number");
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();

        System.out.println("Enter second number");
        Scanner s2 = new Scanner(System.in);
        int n2 = s.nextInt();

        System.out.println("Enter third number");
        Scanner s3 = new Scanner(System.in);
        int n3 = s.nextInt();

//        n1 = 100
//        n2 = 70
//        n3 = 50

        if (n1 > n2){
            if (n1 > n3){
                largestnumber= n1;
            }
            else {
                largestnumber = n3;
            }
        }else {
            if (n2 > n3){
                largestnumber = n2;
            }
            else
            {
                largestnumber = n3;
            }
        }
        System.out.println("Largerst Number is:" + largestnumber);
    }
}
