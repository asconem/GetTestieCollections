package rocks.zipcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparable {

    @Test
    public void testComparable() {
        Person personOne = new Person("Matt", 1989);
        Person personTwo = new Person("Kim", 1983);
        Person personThree = new Person("Andrew", 1991);
        Person personFour = new Person("Benjamin", 1999);

        List<Person> list = new ArrayList<>();
        list.add(personOne);
        list.add(personTwo);
        list.add(personThree);
        list.add(personFour);

        //Collections.sort(list);
    }
}
