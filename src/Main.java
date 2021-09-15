import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	String greeting = "Hello World!";
    Scanner userinput = new Scanner(System.in);

    System.out.println(greeting);
    System.out.println("Anything you want me to know human?");
    String needToKnow = userinput.nextLine();
    System.out.println("Okay so, " + needToKnow);


    }
}
