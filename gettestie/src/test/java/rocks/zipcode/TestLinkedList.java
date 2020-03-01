package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

public class TestLinkedList {
    Person personOne = new Person("Matt", 1989);
    Person personTwo = new Person("Kim", 1983);

    @Test
    public void testAdd() {
        Queue<Person> list = new LinkedList<>();
        list.add(personOne);

        Assert.assertTrue(list.contains(personOne));
    }

    @Test
    public void pollTest() {
        Queue<Person> list = new LinkedList<>();
        list.add(personOne);
        list.add(personTwo);
        list.poll();

        Assert.assertFalse(list.contains(personOne));
    }

    @Test
    public void peekTest() {
        Queue<Person> list = new LinkedList<>();
        list.add(personOne);
        list.add(personTwo);
        list.peek();

        Assert.assertEquals(personOne, list.peek());
    }

    @Test
    public void testSize() {
        Queue<Person> list = new LinkedList<>();
        list.add(personOne);
        list.add(personTwo);

        Assert.assertEquals(2, list.size());
    }

    @Test
    public void testAddAll() {
        Queue<Person> list = new LinkedList<>();
        Queue<Person> list2 = new LinkedList<>();
        list.add(personOne);
        list.add(personTwo);
        list2.addAll(list);

        Assert.assertEquals(list, list2);
    }
}
