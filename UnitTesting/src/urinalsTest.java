import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class urinalsTest {

    @org.junit.jupiter.api.Test
    void isStringValid() {
        System.out.println("======SOWMYA VELDANDI==TEST EXECUTED====");
        Assertions.assertEquals(urinals.isStringValid("Hi"), false);
        Assertions.assertEquals(urinals.isStringValid("10001"),true);
        Assertions.assertEquals(urinals.isStringValid("110"),false);
    }

    @Test
    void countUrinals() {
        System.out.println("======SOWMYA VELDANDI==TEST TWO EXECUTED====");
        System.out.println("==TEST 1==");
        Assertions.assertEquals(urinals.countUrinals("Hi"),-1);
        System.out.println("==TEST 2==");
        Assertions.assertEquals(urinals.countUrinals("10001"),1);
        System.out.println("==TEST 3==");
        Assertions.assertEquals(urinals.countUrinals("1001"),0);
        System.out.println("==TEST 4==");
        Assertions.assertEquals(urinals.countUrinals("00000"),3);
        System.out.println("==TEST 5==");
        Assertions.assertEquals(urinals.countUrinals("0000"),2);
        System.out.println("==TEST 6==");
        Assertions.assertEquals(urinals.countUrinals("01000"),1);
        System.out.println("==TEST 7==");
        Assertions.assertEquals(urinals.countUrinals("011"),-1);

    }

    @Test
    void createFile() {
        System.out.println("======SOWMYA VELDANDI==TEST THREE EXECUTED====");
        Assertions.assertNotEquals(urinals.createFile(),null);
    }


}