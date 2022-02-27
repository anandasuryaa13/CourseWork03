import java.util.Scanner;

public class ProcessAName5026211142 {

    public static void main(String[] args) {
        Scanner firstname = new Scanner(System.in);
        System.out.println("Type Your Name ==>");

        String lastname = firstname.nextLine();
        int x  = lastname.indexOf (' ');
	System.out.println(x);

        String Format;
        Format = lastname.substring(x + 1) + ", " + lastname.charAt(0)+ ".";

        System.out.println("Your name is ==>" + Format);

    }

}