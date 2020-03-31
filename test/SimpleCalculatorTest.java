import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    void add1vs1() {
        int firstOperand = 1;
        int secondOperand = 1;
        int expected = 2;
        int real = SimpleCalculator.add(firstOperand,secondOperand);
        assertEquals(expected,real);
    }

    @Test
    void add1vs0() {
        int firstOperand = 1;
        int secondOperand = 0;
        int expected = 1;
        int real = SimpleCalculator.add(firstOperand, secondOperand);
        assertEquals(expected, real);
    }

    @Test
    void addPositive1vsNegative1() {
        int firstOperand = 1;
        int secondOperand = -1;
        int expected = 0;
        int real = SimpleCalculator.add(firstOperand, secondOperand);
        assertEquals(expected, real);
    }

    @Test
    void addNegative1vsNegative1() {
        int firstOperand = -1;
        int secondOperand = -1;
        int expected = -2;
        int real = SimpleCalculator.add(firstOperand, secondOperand);
        assertEquals(expected, real);
    }
    @Test
    void addNegative1vsZero() {
        int firstOperand = -1;
        int secondOperand = 0;
        int expected = -1;
        int real = SimpleCalculator.add(firstOperand, secondOperand);
        assertEquals(expected, real);
    }

    @Test
    void addMAXvs1() {
        int x = Integer.MAX_VALUE;
        int y = 1;
        SimpleCalculator instance = new SimpleCalculator();
        try {
            int result  = instance.add(x,y);
            assertFalse(true);
        }catch(Exception e){
            assertTrue(true);
        }
    }
    @Test
    void addMINvsNegative1() {
        int x = Integer.MIN_VALUE;
        int y = -1;
        SimpleCalculator instance = new SimpleCalculator();
        try {
            int result  = instance.add(x,y);
            assertFalse(true);
        }catch(Exception e){
            assertTrue(true);
        }
    }


}

