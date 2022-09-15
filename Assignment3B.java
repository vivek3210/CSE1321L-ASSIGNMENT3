import java.util.Scanner;
public class Assignment3B {
    public static void main(String[] args) {
        int beltGrade = 0;
        int numStripes = 0;
        System.out.println("[Martial Arts Belt]");
        Scanner input = new Scanner(System.in);
        System.out.print("What belt grade are you? ");
        beltGrade = input.nextInt();

        switch(beltGrade)
        {
            case 10:
                System.out.println("You have a white belt,\nwith 0 stripes!");
                break;
            case 9:
                System.out.println("You have a white belt,\nwith 1 stripe!");
                break;
            case 8:
                System.out.println("You have a yellow belt,\nwith 1 stripe!");
                break;
            case 7:
                System.out.println("You have a yellow belt,\nwith 2 stripes!");
                break;
            case 6:
                System.out.println("You have a blue belt,\nwith 1 stripe!");
                break;
            case 5:
                System.out.println("You have a blue belt,\nwith 2 stripes!");
                break;
            case 4:
                System.out.println("You have a green belt,\nwith 1 stripe!");
                break;
            case 3:
                System.out.println("You have a green belt,\nwith 2 stripes!");
                break;
            case 2:
                System.out.println("You have a brown belt,\nwith 1 stripe!");
                break;
            case 1:
                System.out.println("You have a brown belt,\nwith 2 stripes!");
                break;
            case 0:
                System.out.println("You have a black belt,\nwith 0 stripes!");
                break;
            default:
                System.out.println("You have no belt...");

        }
    }
}
