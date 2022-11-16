
import java.util.Scanner;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int     bedType = 0;
        int     NumberRoomAvailable = 0;
        int     NumberRoomToBook = 0;
        boolean flag = true;
        int RoomNumberMax = 500;
        double roomCost = 0;
        double singleBedPrice = 1000;
        double doubleBedPrice = 3000;
        double totalCost = 0;
        String  firstName = "";
        String  lastName  = "";

        InputStreamReader inKey = new InputStreamReader(System.in);
        Scanner sc = new Scanner(inKey);
        Scanner userInput = new Scanner(System.in);
        Random rand = new Random();

        // Generate random integers in range 0 to 999
        int rand_num1 = rand.nextInt(500);

        Hotel hotelLasVegas = new Hotel();
        Room  room1 =  new Room();
        Guest guest1 = new Guest();


        System.out.println("======================================");
        System.out.println("Welcome to the Hotel Reservation page");

        System.out.println("======================================");
        System.out.println("The price for single bed is $1000 a night");
        System.out.println("The price for double bed is $3000 a night");

        if (rand_num1 == RoomNumberMax) {
            System.out.println("Sorry we are full today, check back tomorrow");
            System.exit(0);
        }
        else {
            System.out.println("======================================");
            System.out.println("We currently have " + rand_num1 + " rooms booked");
        }
        System.out.println("======================================");
        System.out.println("Enter first name here: ");

        guest1.setFirstName(sc.next());
        System.out.println("You entered first name " + guest1.getFirstName());

        System.out.println("======================================");
        System.out.println("Enter last name here: ");

        guest1.setLastName(sc.next());
        System.out.println("You entered last name " + guest1.getLastName());


        NumberRoomAvailable = hotelLasVegas.getNumberRoomsAvailable() - rand_num1;
        hotelLasVegas.setRoomNumber(NumberRoomAvailable);


        System.out.println("======================================");
        System.out.println(" Enter number of rooms to book");
        NumberRoomToBook = sc.nextInt();
        System.out.println("You selected " + NumberRoomToBook + " number of rooms");

        NumberRoomAvailable = hotelLasVegas.getNumberRoomsAvailable() - NumberRoomToBook;
        hotelLasVegas.setRoomNumber(NumberRoomAvailable); // update new number of rooms available


        System.out.println("======================================");
        System.out.println(" Enter 1 for Single Bed or Enter 2 for Double bed");


        while( flag ) {
            bedType = sc.nextInt();
            if (bedType == 1) {
                room1.setBedType("single");
                System.out.println("You entered Single Bed");
                System.out.println("======================================");
                System.out.println(" Enter the number of nights you are staying");
                hotelLasVegas.setNumberOfNights(sc.nextInt());

                roomCost = NumberRoomToBook * singleBedPrice;
                room1.setPrice(singleBedPrice);
                System.out.println("The total cost per night is " + roomCost);
                totalCost = roomCost * hotelLasVegas.getNumberOfNights();
                System.out.println("and the total stay is $" + totalCost  );
                flag = false;

            } else if (bedType == 2) {
                room1.setBedType("double");
                System.out.println("You entered Double Beds");
                System.out.println("======================================");

                roomCost = NumberRoomToBook * doubleBedPrice;
                room1.setPrice(doubleBedPrice);
                System.out.println("The total cost is $" + roomCost + "for" );
                System.out.println(" Enter the number of nights you are staying");
                hotelLasVegas.setNumberOfNights(sc.nextInt());

                roomCost = NumberRoomToBook * doubleBedPrice;
                room1.setPrice(doubleBedPrice);
                System.out.println("The total cost per night is " + roomCost);
                totalCost = roomCost * hotelLasVegas.getNumberOfNights();
                System.out.println("and the total stay is $" + totalCost  );
                flag = false;

            } else {
                System.out.println("You entered the wrong number, try again");
                flag = true;
            }
        }

        while(true){


             if(sc.nextLine().length()>0){
                // check for terminating key and terminate program
                System.out.println("Terminating Program");
                System.exit(0);
            }
        }
    }
}