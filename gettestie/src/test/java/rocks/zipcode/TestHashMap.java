package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class TestHashMap {
    Person personOne = new Person("Matt", 1989);
    Person personTwo = new Person("Ben", 1959);

    Address NJ = new Address("153 Hudson Avenue", "Middletown", "07748");
    Address DE = new Address("1502 North Franklin Street", "Wilmington", "19806");

    @Test
    public void testPut() {
        HashMap<Person, Address> map = new HashMap<>();
        map.put(personOne, DE);

        Assert.assertEquals(DE, map.get(personOne));
    }

    @Test
    public void testGet() {
        HashMap<Person, Address> map = new HashMap<>();
        map.put(personTwo, NJ);

        Assert.assertEquals(NJ, map.get(personTwo));
    }

    @Test
    public void testRemoveByContainsKey() {
        HashMap<Person, Address> map = new HashMap<>();
        map.put(personOne, DE);
        map.put(personTwo, NJ);
        map.remove(personOne);

        Assert.assertFalse(map.containsKey(personOne));
    }

    @Test
    public void testRemoveBySize() {
        HashMap<Person, Address> map = new HashMap<>();
        map.put(personOne, DE);
        map.put(personTwo, NJ);
        map.remove(personTwo);

        Integer expected = 1;
        Integer actual = map.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testContainsValue() {
        HashMap<Person, Address> map = new HashMap<>();
        map.put(personOne, DE);
        map.put(personTwo, NJ);

        Assert.assertTrue(map.containsValue(NJ));
    }

    @Test
    public void testReplace() {
        HashMap<Person, Address> map = new HashMap<>();
        map.put(personOne, DE);
        map.replace(personOne, NJ);

        Assert.assertEquals(NJ, map.get(personOne));
    }

    @Test
    public void testValuesMethod() {
        HashMap<Person, Address> map = new HashMap<>();
        map.put(personOne, DE);
        map.put(personTwo, NJ);

        Integer expected = 2;
        Integer actual = map.values().size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testKeySet() {
        HashMap<Person, Address> map = new HashMap<>();
        map.put(personOne, DE);
        map.put(personTwo, NJ);

        Integer expected = 2;
        Integer actual = map.keySet().size();

        Assert.assertEquals(expected, actual);
    }
}
