import org.junit.jupiter.api.*;


import static org.junit.jupiter.api.Assertions.*;

class OperationsTest {

    Operations operations;

    @BeforeAll
    static void beforeAll(){
        System.out.println("Executing before all method");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("Executing after all method");
    }

    @BeforeEach
    void beforeEach(){
        operations = new Operations();
        System.out.println("Before each method");
    }

    @AfterEach
    void afterEach(){
        System.out.println("After each method");
    }

    @Test
    @DisplayName("Test 5.9 + 5.1 = 11")
    void add() {

        // Given / Arrange
        double firstNumber = 5.9;
        double secondNumber = 5.1;
        double expected = 11;

        // When / Act
        double result = operations.add(firstNumber,secondNumber);

        // Then / Assert
        assertEquals(expected, result, () -> firstNumber + " + " + secondNumber + " did not produce 10");
        // write messages with lambdas is the right way, it is called lazzy assert messages
    }

    @Test
    @DisplayName("Test 8.1 - 0.1 = 8.0")
    void sub() {
        // Arrange
        double firstNumber = 8.1;
        double secondNumber = 0.1;
        double expected = 8.0;

        // Act
        double result = operations.sub(firstNumber,secondNumber);

        // Assert
        assertEquals(expected, result, () -> firstNumber + " - " + secondNumber + " did not produce 0");
    }

    @Test
    @DisplayName("Test 7.5 * 5 = 37.5")
    void mult() {

        // Arrange
        double firstNumber = 7.5;
        double secondNumber = 5;
        double expected = 37.5;

        // Act
        double result = operations.mult(firstNumber, secondNumber);

        // Assert
        assertEquals(expected, result, () -> firstNumber + " * " + secondNumber + " did not produce 25");
    }

    @Test
    @DisplayName("Test 10 / 5 = 2")
    void div() {

        // Arrange
        double firstNumber = 10;
        double secondNumber = 5;
        double expected = 2;

        // Act
        double result = operations.div(firstNumber,secondNumber);

        // Assert
        assertEquals(expected, result, () -> firstNumber + " / " + secondNumber + " did not produce 1");
    }
}