package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Vector;

public class TestVector {
    Person personOne = new Person("Matt", 1989);
    Person personTwo = new Person("Kim", 1983);

    @Test
    public void testAdd() {
        List<Person> vector = new Vector<>();
        vector.add(personOne);

        Integer expected = 1;
        Integer actual = vector.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSizeMethod() {
        List<Person> vector = new Vector<>();
        vector.add(personOne);
        vector.add(personTwo);

        Integer expected = 2;
        Integer actual = vector.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAddByIndex() {
        List<Person> vector = new Vector<>();
        vector.add(personOne);
        vector.add(0, personTwo);

        Assert.assertEquals(personTwo, vector.get(0));
    }

    @Test
    public void testRemove() {
        List<Person> vector = new Vector<>();
        vector.add(personOne);
        vector.remove(personOne);

        Assert.assertFalse(vector.contains(personOne));
    }

    @Test
    public void testRemoveByIndex() {
        List<Person> vector = new Vector<>();
        vector.add(personOne);
        vector.add(personTwo);
        vector.remove(0);

        Assert.assertEquals(personTwo, vector.get(0));
    }

    @Test
    public void testClear() {
        List<Person> vector = new Vector<>();
        vector.add(personOne);
        vector.add(personTwo);
        vector.clear();

        Integer expected = 0;
        Integer actual = vector.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAddAll() {
        List<Person> vector = new Vector<>();
        List<Person> vector2 = new Vector<>();
        vector.add(personOne);
        vector.add(personTwo);
        vector2.addAll(vector);

        Assert.assertEquals(vector, vector2);
    }
}
