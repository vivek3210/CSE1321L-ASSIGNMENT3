import java.util.Scanner;
public class Assignment3A {
    public static void main(String[] args) {
        int userInput;
        System.out.println("Hello stranger! Do you have time to hear my tale?");
        System.out.println("1) Yes");
        System.out.println("2) No");
        Scanner input = new Scanner(System.in);
        userInput = input.nextInt();
        if (userInput == 2) {
            System.out.println("Ah, then goodbye...");
        }
        if (userInput == 1)
        {
            System.out.println("Thank you! I come from the land of Pax Bisonica. Our country has been\n" +
                    "taken over by a cruel tyrant!");
            System.out.println("1) That's awful!");
            System.out.println("2) What can I do?");
            userInput = input.nextInt();
            if (userInput == 1)
            {
                System.out.println("Alas, it is truly terrible...");
                System.out.println("Please, you must journey to Pax Bisonica and free our country!");
                System.out.println("1) Yes");
                System.out.println("2) No");
                userInput = input.nextInt();
                if (userInput == 1)
                {
                    System.out.println("Hooray!");
                }
                if(userInput == 2)
                {
                    System.out.println("Then all is lost...");
                }
            }
            if (userInput == 2)
            {
                System.out.println("Please, you must journey to Pax Bisonica and free our country!");
                System.out.println("1) Yes");
                System.out.println("2) No");
                userInput = input.nextInt();
                if (userInput == 1)
                {
                    System.out.println("Hooray!");
                }
                if(userInput == 2)
                {
                    System.out.println("Then all is lost...");
                }
            }
        }

    }
}
