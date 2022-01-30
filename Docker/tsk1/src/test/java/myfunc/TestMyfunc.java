package myfunc;

import static org.junit.Assert.*;
import org.junit.Test;

public class TestMyfunc {
    @Test
    public void test_func() {
        assertEquals(Myfunc.func(0), 42);
        assertEquals(Myfunc.func(1), 43);
        assertEquals(Myfunc.func(10), 52);
    }
}