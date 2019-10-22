package Tests;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestsTest {
    Tests tests;

    @Before
    public void before() {
        this.tests = new Tests();
    }

    @Test
    public void add() {
        assertEquals(12, tests.add(5, 7));
    }

    @Test
    public void sub() {
        assertEquals(8, tests.sub(10, 2));
    }

    @Test
    public void mul() {
        assertEquals(20, tests.mul(10, 2));
    }

    @Test
    public void div() {
        assertEquals(5, tests.div(10, 2));
    }
}

