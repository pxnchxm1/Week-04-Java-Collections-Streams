package com.testfiles;

import org.junit.jupiter.api.Test;

import com.test.ListManager;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class ListManagerTest {

    ListManager manager = new ListManager();
    List<Integer> list = new ArrayList<>();

    @Test
    public void testAddElement() {
        manager.addElement(list, 10);
        assertTrue(list.contains(10));
        assertEquals(1, list.size());
    }

    @Test
    public void testRemoveElement() {
        manager.removeElement(list, 10);
        assertFalse(list.contains(10));
        assertEquals(0, list.size());
    }

    @Test
    public void testGetSize() {
        manager.addElement(list, 1);
        manager.addElement(list, 2);
        assertEquals(2, manager.getSize(list));
    }
}
