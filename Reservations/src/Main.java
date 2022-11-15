
import java.util.Scanner;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) {
        System.out.println("Reservations Program");
        Scanner sc = new Scanner(System.in);

        while(true){
            char c = sc.next().charAt(0);

            if(new Scanner(new InputStreamReader(System.in)).nextLine().length()>0){
                // check for terminating key and terminate program
                System.out.println("Terminating Program");
                System.exit(0);
            }

        }


    }
}