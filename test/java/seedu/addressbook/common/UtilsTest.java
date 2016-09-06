package seedu.addressbook.common;

import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;

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
    
    @Test 
    public void elementsAreUnique_checkEmptyArgument() {
        assertTrue(Utils.elementsAreUnique(new ArrayList<String>()));
    }
    
    @Test
    public void elementsAreUnique_uniqueElements() {
        List<Integer> list;
        
        list = makeList(new int[]{1, 2, 3, -1, 0, 500}); 
        assertTrue(Utils.elementsAreUnique(list));
        list = makeList(new int[]{0, 400, 123, -100, 1, 12}); 
        assertTrue(Utils.elementsAreUnique(list));
    }
    
    @Test
    public void elementsAreUnique_duplicateElements() {
        List<Integer> list;
        
        list = makeList(new int[]{1, 1}); 
        assertFalse(Utils.elementsAreUnique(list));
        list = makeList(new int[]{0, 1, 2, 3, 4, 0}); 
        assertFalse(Utils.elementsAreUnique(list));
    }
    
    private List<Integer> makeList(int[] ints) {
        ArrayList<Integer> list = new ArrayList<Integer>(); 
        for (int i : ints) {
            list.add(i);
        }
        return list; 
    }
}
