import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("WELCOME TO SMK AIRPORT");
        ReservationsSystem reservation = new ReservationsSystem();
        
        Scanner keyboardInput = new Scanner(System.in);
        int option;
        int seat;
        System.out.println("Which Class Would You Like To Board?");
        System.out.printf("%s%n%s%n", "1. First Class", "2. Economy Class");
        
        try{
            option = Integer.parseInt(keyboardInput.nextLine());
        }catch(ExceptionInInitializerError e){
            System.out.println(e);
        }

        
    }
}
