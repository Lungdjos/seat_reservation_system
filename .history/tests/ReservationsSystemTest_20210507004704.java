import org.junit.Test;

public class ReservationsSystemTest {
    //Global object
    ReservationsSystem obj = new ReservationsSystem();
    //Test Cases
    @Test
    void fSeatFreeCheckerTest(){
        //Arrange
        boolean expected = true;
        //Actual
        boolean actual = obj.fSeatFreeChecker();
        //Assert
        assertE
    }
    @Test
    void eSeatFreeCheckerTest(){
        //Arrange
        boolean expected = true;
        //Actual
        boolean actual = obj.eSeatFreeChecker();
        //Assert
        
    }
    @Test
    void fSeatAllocatorTest(){
        //Arrange
        boolean seat = true;
        int expected = 0;
        //Actual
        int actual = obj.fSeatAllocator(seat);
        //Assert

    }
    @Test
    void eSeatAllocatorTest(){
        //Arrange
        boolean seat = true;
        int expected = 5;
        //Actual
        int actual = obj.eSeatAllocator(seat);
        //Assert
        
    }
}