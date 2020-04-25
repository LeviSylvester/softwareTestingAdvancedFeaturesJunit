import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OperationsTest {

    Operations operations = new Operations();

    @BeforeAll
    static void beforeMessage() {
        System.out.println("Before methods");
    }

    @BeforeEach
    public void beforeEachMessage() {
        System.out.println("Before method");
    }

    @AfterAll
    static void afterMessage() {
        System.out.println("After methods");
    }



    @Test
    public void addingSuccessflyFiveAndTen() {
        //given
//        Operations operations = new Operations();
        //when
        double result = operations.add(5, 10);
        //then
        assertEquals(15, result);
    }

    @Test
    public void addingSuccessflyFiveAndNine() {
        //given
        Operations operations = new Operations();
        //when
        double result = operations.add(5, 9);
        //then
        assertEquals(14, result);
    }

    @RepeatedTest(3)
    public void addingOneHundredAndOneHundred() {
//        ArithmeticException exception = Assertions.assertThrows(ArithmeticException.class,
//                () -> {
//                    operations.addByteNumbers((byte) 100, (byte) 100);
//                });
        try {
            operations.addByteNumbers((byte) 100, (byte) 100);
        } catch (ArithmeticException exception) {
            assertEquals("Out of byte", exception.getMessage());
            assertTrue(exception instanceof ArithmeticException);
//        byte result = operations.addByteNumbers((byte) 100, (byte) 100);
//        System.out.println(result);
        }
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 5, 13, 79, 43})
    public void isOddShouldReturnTrue(int number) {
        assertTrue(operations.isEven(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 8, 12, 14})
    public void isEvenShouldReturnTrue(int number) {
        assertTrue(operations.isEven(number));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/dataSource.csv")
    public void shouldReturnSubtractionOperation(int a, int b, int sub) {
        assertEquals(sub, operations.sub(a, b));
    }


}
