import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("WELCOME TO SMK AIRPORT");
        ReservationsSystem reservation = ReservationsSystem();
        
        Scanner keyboardInput = Scanner(System.in);
        int option;
        System.out.println("Which Class Would You Like To Board?");
        System.out.printf("%s%n%s%n", "1. First Class", "2. Economy Class");
        try{
            option = Integer.parseToInt(keyboardInput.nextLine());
        }catch(Exception e){
            System.out.println(e);
        }
        switch(option){
            case 1:
            int seat = reservation.firstClassSeats();
            break;
            case 2:
            int seat = reservation.eSeatFreeChecker();
            break;
        }
    }
}
