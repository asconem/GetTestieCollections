package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;
import java.util.TreeMap;

public class TestTreeMap {

    @Test
    public void testFirstKey() {
        TreeMap<Integer, String> tree = new TreeMap<>();
        tree.put(23, "Bagel");
        tree.put(19, "Pizza");

        Integer expected = 19;
        Integer actual = tree.firstKey();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testLastKey() {
        TreeMap<Integer, String> tree = new TreeMap<>();
        tree.put(23, "Bagel");
        tree.put(19, "Pizza");

        Integer expected = 23;
        Integer actual = tree.lastKey();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemoveByContainsKey() {
        TreeMap<Integer, String> tree = new TreeMap<>();
        tree.put(23, "Bagel");
        tree.put(19, "Pizza");
        tree.remove(23);

        Assert.assertFalse(tree.containsKey(23));
    }

    @Test
    public void testRemoveBySize() {
        TreeMap<Integer, String> tree = new TreeMap<>();
        tree.put(23, "Bagel");
        tree.put(19, "Pizza");
        tree.remove(19);

        Integer expected = 1;
        Integer actual = tree.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testContainsValue() {
        TreeMap<Integer, String> tree = new TreeMap<>();
        tree.put(23, "Bagel");
        tree.put(19, "Pizza");

        Assert.assertTrue(tree.containsValue("Pizza"));
    }

    @Test
    public void testReplace() {
        TreeMap<Integer, String> tree = new TreeMap<>();
        tree.put(23, "Bagel");
        tree.replace(23, "Pizza");

        Assert.assertEquals("Pizza", tree.get(23));
    }

    @Test
    public void testValuesMethod() {
        TreeMap<Integer, String> tree = new TreeMap<>();
        tree.put(23, "Bagel");
        tree.put(19, "Pizza");

        Integer expected = 2;
        Integer actual = tree.values().size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testKeySet() {
        TreeMap<Integer, String> tree = new TreeMap<>();
        tree.put(23, "Bagel");
        tree.put(19, "Pizza");

        Integer expected = 2;
        Integer actual = tree.keySet().size();

        Assert.assertEquals(expected, actual);
    }
}
