package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestArrayDeque {
    Person personOne = new Person("Matt", 1989);
    Person personTwo = new Person("Kim", 1983);

    @Test
    public void testAddLast() {
        Deque<Person> deque = new ArrayDeque<>();
        deque.addLast(personOne);
        deque.addLast(personTwo);

        Assert.assertEquals(personOne, deque.getFirst());
    }

    @Test
    public void testAddFirst() {
        Deque<Person> deque = new ArrayDeque<>();
        deque.addFirst(personOne);
        deque.addFirst(personTwo);

        Assert.assertEquals(personTwo, deque.getFirst());
    }

    @Test
    public void testPeekFirst() {
        Deque<Person> deque = new ArrayDeque<>();
        deque.addLast(personOne);
        deque.addLast(personTwo);

        Assert.assertEquals(personOne, deque.peekFirst());
    }

    @Test
    public void testPeekLast() {
        Deque<Person> deque = new ArrayDeque<>();
        deque.addLast(personOne);
        deque.addLast(personTwo);

        Assert.assertEquals(personTwo, deque.peekLast());
    }

    @Test
    public void testRemoveFirst() {
        Deque<Person> deque = new ArrayDeque<>();
        deque.addLast(personOne);
        deque.addLast(personTwo);

        Assert.assertEquals(personOne, deque.removeFirst());
    }

    @Test
    public void testRemoveLast() {
        Deque<Person> deque = new ArrayDeque<>();
        deque.addLast(personOne);
        deque.addLast(personTwo);

        Assert.assertEquals(personTwo, deque.removeLast());
    }

}
