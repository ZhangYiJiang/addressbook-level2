package seedu.addressbook.common;

import static org.junit.Assert.*;

import org.junit.Test;

public class UtilsTest {

    @Test
    public void isAnyNull_checkEmptyArgument() {
        assertFalse(Utils.isAnyNull());
    }
    
    @Test
    public void isAnyNull_checkSomeNull() {
        assertTrue(Utils.isAnyNull(null));
        assertTrue(Utils.isAnyNull("not null", null));
        assertTrue(Utils.isAnyNull(123, "not null", null));
    }
    
    @Test 
    public void isAnyNull_allNotNull() {
        assertFalse(Utils.isAnyNull(1));
        assertFalse(Utils.isAnyNull(1, "Hello world"));
        assertFalse(Utils.isAnyNull(false, 1, "Hello world"));
    }
}
