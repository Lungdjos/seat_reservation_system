import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //Printing the Welcome Message to The Customer
        System.out.println("WELCOME TO SIMON MWANSA KAPWEPWE INTERNATIONAL AIRPORT");
        //Creating Objects
        ReservationsSystem reservation = new ReservationsSystem();
        Scanner keyboardInput = new Scanner(System.in);
        //Declaring and Initializing Variables
        int option;
        int seat;
        int counter = 0;
        //Using the while loop to run the UI continually.
        while(counter <= 10){
            System.out.println("Which Class Would You Like To Board?");
            System.out.printf("%s%n%s%n", "1. First Class", "2. Economy Class");
            //Throwing an exception in the case where the user inputs an erroneous input
            try{
                option = Integer.parseInt(keyboardInput.nextLine());
                switch(option){
                    case 1:
                    seat = reservation.firstClassSeats() + 1;
                    if(seat <= 5){
                    System.out.printf("%s %d  %s%n", "Your ticket is First Class and Seat Number:", seat, "Thank You! Call Again.");
                    }else{
                        System.out.println(reservation.toString());
                        try{
                            String option2 =keyboardInput.nextLine();
                            if(Integer.parserInt(option2) == 1){
                                seat = reservation.economyClassSeats() + 1;
                                System.out.printf("%s %d  %s%n", "Your ticket is Economy Class and Seat Number:", seat, "Thank You! Call Again.");
                            }else{
                                break;
                            }
                        }catch(ExceptionInInitializerError e){
                            
                        }
                    }
                    break;
                    case 2:
                    seat = reservation.economyClassSeats() + 1;
                    System.out.printf("%s %d  %s%n", "Your ticket is Economy Class and Seat Number:", seat, "Thank You! Call Again.");
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
