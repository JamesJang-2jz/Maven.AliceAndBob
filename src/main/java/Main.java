/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args ){
        String alice = "Alice";
        String bob = "Bob";

        Scanner scan = new Scanner(System.in);
        System.out.println("What do they call you?");
        String input = scan.nextLine();

        if (input.equalsIgnoreCase(alice)) {
            System.out.println("Bongiorno " + input + "!, letsa go get some gelato!");
        } else if (input.equalsIgnoreCase(bob)) {
            System.out.println("Hello " + input + ", would you like corn on the cob?");
        } else {
            System.out.println("Imposter, goodbye");
        }

    }
}
