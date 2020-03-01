package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    @Test
    public void popTest() {
        Stack<String> stack = new Stack<>();
        stack.push("Devils");
        stack.push("Rangers");
        stack.push("Flyers");
        stack.push("Islanders");
        stack.push("Penguins");

        String expected = "Penguins";
        String actual = stack.pop();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void peekTest() {
        Stack<String> stack = new Stack<>();
        stack.push("Lions");
        stack.push("Vikings");
        stack.push("Bears");
        stack.push("Packers");

        Assert.assertEquals("Packers", stack.peek());
    }

    @Test
    public void checkIfStackIsEmptyTest() {
        Stack<String> stack = new Stack<>();
        stack.push("Lions");
        stack.push("Vikings");
        stack.push("Bears");
        stack.push("Packers");

        Assert.assertFalse(stack.isEmpty());
    }
}
