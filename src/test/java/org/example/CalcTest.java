package org.example;

import org.junit.jupiter.api.Test; // JUnit 5 注解
import static org.junit.jupiter.api.Assertions.assertEquals; // JUnit 5 断言

public class CalcTest {
    @Test
    public void testAddition() {
        Calc c = new Calc();
        assertEquals(5, c.add(2, 3));
    }

    @Test
    public void testSubtraction() {
        Calc c = new Calc();
        assertEquals(2, c.subtract(4, 2));
    }
}