package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestArrayList {
    Person personOne = new Person("Matt", 1989);
    Person personTwo = new Person("Kim", 1983);

    @Test
    public void testAdd() {
        List<Person> arrList = new ArrayList<>();
        arrList.add(personOne);

        Integer expected = 1;
        Integer actual = arrList.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSizeMethod() {
        List<Person> arrList = new ArrayList<>();
        arrList.add(personOne);
        arrList.add(personTwo);

        Integer expected = 2;
        Integer actual = arrList.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAddByIndex() {
        List<Person> arr = new ArrayList<>();
        arr.add(personOne);
        arr.add(0, personTwo);

        Assert.assertEquals(personTwo, arr.get(0));
    }

    @Test
    public void testRemove() {
        List<Person> arr = new ArrayList<>();
        arr.add(personOne);
        arr.remove(personOne);

        Integer expected = 0;
        Integer actual = arr.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemoveByIndex() {
        List<Person> arr = new ArrayList<>();
        arr.add(personOne);
        arr.add(personTwo);
        arr.remove(0);

        Assert.assertEquals(personTwo, arr.get(0));
    }

    @Test
    public void testClear() {
        List<Person> arr = new ArrayList<>();
        arr.add(personOne);
        arr.add(personTwo);
        arr.clear();

        Integer expected = 0;
        Integer actual = arr.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAddAll() {
        List<Person> arr = new ArrayList<>();
        List<Person> arr2 = new ArrayList<>();
        arr.add(personOne);
        arr.add(personTwo);
        arr2.addAll(arr);

        Assert.assertEquals(arr, arr2);
    }
}
