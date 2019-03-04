import java.util.Scanner;

public class StringOp {

    public static void main(String[] args){

        String s1, s2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings");

        s1 = sc.nextLine();
        s2 = sc.nextLine();

        int l1 = s1.length();
        int l2 = s2.length();

        System.out.println("String 1 is : " + l1);
        System.out.println("String 2 is : " + l2);

        String s3 = s1.concat(s2);
        System.out.println("Result on Concatenation is: " + s3);

        s1 = s1.toUpperCase();
        System.out.println("1st String in Uppercase" + s1);
    }
}
