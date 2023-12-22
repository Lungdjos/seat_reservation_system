public class ReservationsSystemTest {
    ReservationsSystem obj = new ReservationsSystem();
    void fSeatFreeCheckerTest(){
        //Arrange
        boolean expected = true;
        //Actual
        boolean actual = obj.fSeatFreeChecker();
        //Assert
        
    }
    void eSeatFreeCheckerTest(){
        //Arrange
        boolean expected = true;
        //Actual
        boolean actual = obj.eSeatFreeChecker();
        //Assert
        
    }
    void fSeatAllocatorTest(){
        //Arrange
        boolean seat
        int expected = 0;
        //Actual
        int actual = obj.fSeatAllocator(emptySeat);
    }
}