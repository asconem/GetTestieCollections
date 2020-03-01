package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator  {
    Person personOne = new Person("Matt", 1989);
    Person personTwo = new Person("Kim", 1983);
    Person personThree = new Person("Andrew", 1991);

    List<Person> list = new ArrayList<>();

    @Test
    public void testIterator() {
        list.add(personOne);
        list.add(personTwo);
        list.add(personThree);

        Iterator<Person> listIterator = list.iterator();
        Assert.assertEquals(personOne, listIterator.next());
    }

    @Test
    public void testIteratorNext() {
        list.add(personOne);
        list.add(personTwo);
        list.add(personThree);

        Iterator<Person> listIterator = list.iterator();
        listIterator.next();

        Assert.assertEquals(personTwo, listIterator.next());
    }

    @Test
    public void testIteratorHasNext() {
        list.add(personOne);
        list.add(personTwo);
        list.add(personThree);

        Iterator<Person> listIterator = list.iterator();
        listIterator.next();

        Assert.assertTrue(listIterator.hasNext());
    }

    @Test
    public void testIteratorDoesNotHaveNext() {
        list.add(personOne);
        list.add(personTwo);
        list.add(personThree);

        Iterator<Person> listIterator = list.iterator();
        listIterator.next();
        listIterator.next();
        listIterator.next();

        Assert.assertFalse(listIterator.hasNext());
    }

}
