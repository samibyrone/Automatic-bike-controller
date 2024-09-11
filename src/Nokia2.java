import java.util.Scanner;

public class Nokia2{

    public static void main(String[] args) {
        Scanner zoe = new Scanner(System.in);

        System.out.println("Welcome To Your Nokia Menu, Kindly Select from The Options Below.");
        System.out.print("To continue, press 1 to continue or -1 to quit! ");
        System.out.println();
             System.out.println("""
                Enter 1:	=>	Phonebook
                Enter 2:	=>	Messages
                Enter 3:	=>	Chat
                Enter 4:	=>	Call Register
                Enter 5:	=>	Tones
                Enter 6:	=>	Settings
                Enter 7:	=>	Call divert
                Enter 8:	=>	Games
                Enter 9:	=>	Calculator
                Enter 10:	=>	Reminders
                Enter 11:	=>	Clock
                Enter 12:	=>	Profiles
                Enter 13:	=>	Sim Services 
                """);

            int menuList = zoe.nextInt();

        switch (menuList) {
            case 1:
                System.out.println("PhoneBook");
                System.out.print("""
                        Enter 1:	=>	Search
                        Enter 2:	=>	Service Nos
                        Enter 3:	=>	Add name
                        Enter 4:	=>	Erase
                        Enter 5:	=>	Assign tone
                        Enter 6:	=>	Edit
                        Enter 7:	=>	Send  b'card
                        Enter 8:	=>	Options
                        Enter 9:	=>	Speed dails
                        Enter 10:	=>	Voice tags
                        """);

                int phonebook = zoe.nextInt();

                switch (phonebook) {
                    case 1:
                        System.out.println("Search");
                        break;
                    case 2:
                        System.out.println("Service Nos.");
                        break;
                    case 3:
                        System.out.println("Add name");
                        break;
                    case 4:
                        System.out.println("Erase");
                        break;
                    case 5:
                        System.out.println("Edit");
                        break;
                    case 6:
                        System.out.println("Assign tone");
                        break;
                    case 7:
                        System.out.println("Send b'card");
                        break;
                    case 8:
                        System.out.println("Options");

                        System.out.println("""
                                Enter 1:	=>	Type of view
                                Enter 2:	=>	Memory Status
                                """);
                        int options = zoe.nextInt();

                        switch (options) {
                            case 1:
                                System.out.println("Type of view");
                                break;
                            case 2:
                                System.out.print("Memory Status");
                                break;
                        }

                    case 9:
                        System.out.print("Speed dials");
                        break;
                    case 10:
                        System.out.print("Voice tags");
                        break;
                    default:
                        System.out.println("Have a good day!!!!!");
                }
                break;

//			case 2 :	System.out.println(Messages);
//							String message = """

        }

    }
}