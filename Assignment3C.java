import java.util.Scanner;
public class Assignment3C {
    public static void main(String[] args) {
        String deviceType;
        String bluetoothSupport;
        String augmentedRealitySupport;
        float version = 0;

        System.out.println("[App Checklist]");
        Scanner input = new Scanner(System.in);
        System.out.print("What mobile device do you have? ");
        deviceType = input.next();


        if (deviceType.equals("Android") || deviceType.equals("Apple"))
        {
            System.out.print("What version do you have? ");
            version = input.nextFloat();
        }
        else
        {
            System.out.println("I’m sorry, our app does not support your device.");
        }


        if (deviceType.equals("Apple") && (version >= 12))
        {
            System.out.println("Congratulations, you can run the app!");
        }

        if (deviceType.equals("Apple") && (version < 12))
            {
                System.out.print("Does your device support Bluetooth connections? ");
                bluetoothSupport = input.next();
                if (bluetoothSupport.equals("Yes"))
                {
                    System.out.println("Congratulations, you can run the app!");
                }
                else
                {
                    System.out.println("I’m sorry, our app does not support your device.");
                }
        }

        if (deviceType.equals("Android") && (version >= 11))
        {
            System.out.println("Congratulations, you can run the app!");
        }

        if (deviceType.equals("Android") && (version < 11))
        {
            System.out.print("Does your device support Augmented Reality? ");
            augmentedRealitySupport = input.next();
            if (augmentedRealitySupport.equals("Yes"))
            {
                System.out.println("Congratulations, you can run the app!");
            }
            if (augmentedRealitySupport.equals("No"))
            {
                System.out.println("I’m sorry, our app does not support your device.");
            }

        }
    }
}
