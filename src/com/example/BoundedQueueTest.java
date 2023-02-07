package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoundedQueueTest {

    @Test
    void enQueue()
    {
        var value = 2;
        var q = new BoundedQueue(10);
        q.enQueue(value);
        var after = q.toString();
        var expected =  "["+Integer.toString(value)+"]";
        assertTrue(expected.equals(after));
        assertFalse(q.isEmpty());
    }

    @Test
    void deQueue()
    {
        int values[] = {4};
        var q = new BoundedQueue(10);
        for (int i = 0; i < values.length; i++)
        {
            q.enQueue(values[i]);
        }
        var expected = Integer.toString(values[0]);
        var actual = q.deQueue().toString();
        assertTrue(expected.equals(actual));
        assertFalse(q.isEmpty());
    }

    @Test
    void isEmpty()
    {
        var value = 5;
        var q = new BoundedQueue(10);
        assertTrue(q.isEmpty());
        q.enQueue(value);
        assertFalse(q.isEmpty());
    }

    @Test
    void isFull()
    {
        int values[] = {1,2,3};
        var q = new BoundedQueue(3);
        for (int i = 0; i < values.length; i++)
        {
            q.enQueue(values[i]);
        }
        assertTrue(q.isFull());
        q.deQueue();
        assertFalse(q.isFull());
    }

    @Test
    void testToString()
    {
        var q = new BoundedQueue(1);
        q.enQueue(1);
        var queueString = q.toString();
        var normalString = "String";
        assertEquals(queueString.getClass(),normalString.getClass());
    }
}