import java.util.Scanner;

public class ReadingStringFromConsole {
    public void useScanner(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three words seperated by spaces: ");

        String s1 = input.next();
        String s2 = input.next();
        String s3 = input.next();
        System.out.println("s1 is " + s1);
        System.out.println("s2 is " + s2);
        System.out.println("s3 is " + s3);
    }
    public void useReadStringFromConsole() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String s = input.nextLine();
        char ch = s.charAt(0);
        System.out.println("The character entered is " + ch);
    }
}
