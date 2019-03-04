import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {

        String o;
        String r = "";

        System.out.println("Enter String to reverse");
        Scanner sc = new Scanner(System.in);
        o = sc.nextLine();

        StringBuffer sb = new StringBuffer(o);
        r = sb.reverse().toString();



        System.out.println("O string is : " + o);
        System.out.println("R of string is :" + r);
    }
}