package battleship;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void greater() {
        assertAll(() -> assertEquals(false, Calculator.greater(1, 2)),
                () -> assertEquals(true, Calculator.greater(2, 1)));
    }

    @Test
    void less() {
    }

    @Test
    void sum() {
    }

    @Test
    void sub() {
    }

    @Test
    void mul() {
    }

    @Test
    void div() {
    }

    @Test
    void getValue() {
    }
}