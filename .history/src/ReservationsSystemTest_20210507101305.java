import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReservationsSystemTest {
    //Global object
    ReservationsSystem obj = new ReservationsSystem();
    //Test Cases
    @Test
    public void fSeatFreeCheckerTest(){
        //Arrange
        boolean expected = true;
        //Actual
        boolean actual = obj.fSeatFreeChecker();
        //Assert
        assertEquals(expected, actual);
    }
    @Test
    void eSeatFreeCheckerTest(){
        //Arrange
        boolean expected = true;
        //Actual
        boolean actual = obj.eSeatFreeChecker();
        //Assert
        assertEquals(expected, actual);
    }
    @Test
    void fSeatAllocatorTest(){
        //Arrange
        boolean seat = true;
        int expected = 0;
        //Actual
        int actual = obj.fSeatAllocator(seat);
        //Assert
        assertEquals(expected, actual);
    }
    @Test
    void eSeatAllocatorTest(){
        //Arrange
        boolean seat = true;
        int expected = 5;
        //Actual
        int actual = obj.eSeatAllocator(seat);
        //Assert
        assertEquals(expected, actual);
    }
}