import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("WELCOME TO SMK AIRPORT");
        ReservationsSystem reservation = new ReservationsSystem();
        
        Scanner keyboardInput = new Scanner(System.in);
        int option;
        int seat;
        int counter = 0;
        while(counter <= 10){
            System.out.println("Which Class Would You Like To Board?");
            System.out.printf("%s%n%s%n", "1. First Class", "2. Economy Class");
            
            try{
                option = Integer.parseInt(keyboardInput.nextLine());
                switch(option){
                    case 1:
                    seat = reservation.firstClassSeats() + 1;
                    if(seat <= 5){
                    System.out.printf("%s %d  %s", "Your ticket is First Class and Seat Number:", seat, "Thank You! Call Again.");
                    }else{
                        reservat
                    }
                    break;
                    case 2:
                    seat = reservation.economyClassSeats() + 1;
                    System.out.printf("%s %d  %s", "Your ticket is Economy Class and Seat Number:", seat, "Thank You! Call Again.");
                    break;
                    default:
                    System.out.println("Invalid input");
                }
            }catch(ExceptionInInitializerError e){
                System.out.println(e);
            }
        }
        
    }
}
