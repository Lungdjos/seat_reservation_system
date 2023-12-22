

/**
 * LAB 3 PRACTICAL
 * Name: Lungu David
 * SID: 18122108
 * Instructor: Mr M. Chuibuluma
 * Date: 26.03.2021
 * QUESTION 2
 */
import java.util.Arrays;

public class ReservationsSystem {
    //Attributes
    private boolean[] seatCapacity;
    private String classType;
    private String classState;
    private String alternate;
    private int firstCSeatNum;
    private int economyCSeatNum = 5;
    private final int ARRAY_SIZE = 10;
    //Constructors
    public ReservationsSystem(){
        seatCapacity = new boolean[ARRAY_SIZE];
        //Initializing an array
        Arrays.fill(seatCapacity, false);
    }
    

    //First Class
    //Check if the is free
    protected boolean fSeatFreeChecker() {
        boolean emptySeatInF = false;
        for(firstCSeatNum = 0; firstCSeatNum < 5; firstCSeatNum++){
            if(seatCapacity[firstCSeatNum] == false){
                emptySeatInF = true;
                break;
            }else{
                emptySeatInF = false;
            }
        }
        return emptySeatInF;
    }
    //Seat allocation method
    protected int fSeatAllocator(boolean emptySeat) {
        if(emptySeat == true){
            seatCapacity[firstCSeatNum] = true;
        }else{
            firstCSeatNum = 20;
        }
        return firstCSeatNum;
    }
    
    public int firstClassSeats() {
        classType = "First Class";
        return fSeatAllocator(fSeatFreeChecker());
    }

    //Economy Class
    protected boolean eSeatFreeChecker() {
        boolean emptySeatInE = false;
        for(;economyCSeatNum < seatCapacity.length; economyCSeatNum++){
            if(seatCapacity[economyCSeatNum] == false){
                emptySeatInE = true;
                break;
            }else{
                emptySeatInE = false;
            }
        }
        return emptySeatInE;
    }
    
    protected int eSeatAllocator(boolean emptySeat) {
        if(emptySeat == true){
            seatCapacity[economyCSeatNum] = true;
        }else{
            economyCSeatNum = 20;
        }
        return economyCSeatNum;
    }
    public int economyClassSeats() {
        classType = "Economy Class";
        return eSeatAllocator(eSeatFreeChecker());
    }

    //A toString method to print the state of the class.
    @Override
    public String toString(){
        classState = "This Class is Full";
        alternate = "1. Would you like to get to the other class type? \n2. Or you will wait for the next flight in 3 hours";
        return classState + "\n" + alternate;
    }
}
