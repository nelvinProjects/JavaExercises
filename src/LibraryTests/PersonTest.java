package LibraryTests;

import Library.Person;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class PersonTest {
    @Test
    void getCustomerID() {
        Person person = new Person(1, "Sim");
        Person person2 = new Person(3, "Kim");
        Assert.assertEquals("ID do not match", 3, person2);
        Assert.assertEquals("ID do not match", 1, person);
    }

    @Test
    void getCustomerName() {
    }

    @Test
    void setCustomerID() {
    }

    @Test
    void setCustomerName() {
    }
}
