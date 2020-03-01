package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestPriorityQueue {

    @Test
    public void testAdd() {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("welcome");
        queue.add("to");
        queue.add("Delaware");

        Assert.assertEquals("Delaware", queue.peek());
    }

    @Test
    public void testRemove() {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("welcome");
        queue.add("to");
        queue.add("Delaware");

        Assert.assertEquals("Delaware", queue.remove());
    }

    @Test
    public void testPoll() {
        Queue<String> queue = new PriorityQueue<>();
        queue.add("welcome");
        queue.add("to");
        queue.add("Delaware");

        Assert.assertEquals("Delaware", queue.poll());
    }
}
