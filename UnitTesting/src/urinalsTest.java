import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class urinalsTest {

    @org.junit.jupiter.api.Test
    void isStringValid() {
        System.out.println("======SOWMYA VELDANDI==TEST EXECUTED====");
        Assertions.assertEquals(urinals.isStringValid("Hi"), false);
    }
}