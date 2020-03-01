package rocks.zipcode;

import org.junit.Assert;
import org.junit.Test;

import java.util.TreeSet;

public class TreeSetTest {

    @Test
    public void testAdd() {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(5);

        Integer expected = 1;
        Integer actual = set.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemove() {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(5);
        set.remove(5);

        Integer expected = 0;
        Integer actual = set.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testContains() {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(5);

        Assert.assertTrue(set.contains(5));
    }

    @Test
    public void testDoesNotContain() {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(5);
        set.add(10);
        set.remove(5);

        Assert.assertFalse(set.contains(5));
    }

    @Test
    public void testIsEmpty() {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);

        Assert.assertFalse(set.isEmpty());
    }

    @Test
    public void testIsNotEmpty() {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.remove(10);

        Assert.assertTrue(set.isEmpty());
    }

    @Test
    public void testClear() {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(10);
        set.add(20);
        set.clear();

        Integer expected = 0;
        Integer actual = set.size();

        Assert.assertEquals(expected, actual);
    }
}
