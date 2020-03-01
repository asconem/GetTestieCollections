package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;

public class TestHashSet {
    Person personOne = new Person("Matt", 1989);
    Person personTwo = new Person("Kim", 1983);

    @Test
    public void testAdd() {
        HashSet<Person> set = new HashSet<>();
        set.add(personOne);

        Integer expected = 1;
        Integer actual = set.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemove() {
        HashSet<Person> set = new HashSet<>();
        set.add(personTwo);
        set.remove(personTwo);

        Integer expected = 0;
        Integer actual = set.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testContains() {
        HashSet<Person> set = new HashSet<>();
        set.add(personOne);

        Assert.assertTrue(set.contains(personOne));
    }

    @Test
    public void testDoesNotContain() {
        HashSet<Person> set = new HashSet<>();
        set.add(personOne);
        set.add(personTwo);
        set.remove(personOne);

        Assert.assertFalse(set.contains(personOne));
    }

    @Test
    public void testIsEmpty() {
        HashSet<Person> set = new HashSet<>();
        set.add(personOne);

        Assert.assertFalse(set.isEmpty());
    }

    @Test
    public void testIsNotEmpty() {
        HashSet<Person> set = new HashSet<>();
        set.add(personTwo);

        Assert.assertTrue(!(set.isEmpty()));
    }
}
