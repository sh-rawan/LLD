package Introduction.SingletonPattern;

import org.junit.Assert;
import org.junit.Test;

public class EmployeeIdStoreTest {

    @Test
    public void testGetNameForValidId() {
        String actualValue = EmployeeIdStore.getInstance().getName("101");
        String expectedValue = "Shrawan";
        Assert.assertEquals("Names dont match", expectedValue, actualValue);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetNameForInValidId() {
        EmployeeIdStore.getInstance().getName("1001");
    }
}