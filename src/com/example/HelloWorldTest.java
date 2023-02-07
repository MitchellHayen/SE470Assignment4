package com.example;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Vector;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloWorldTest {
    @Test
    void allObjectsExistAfterUnion(){
        Vector a = new Vector<>(Arrays.asList(1,3,5,7,9));
        Vector b = new Vector<>(Arrays.asList(2,4,6,8));
        var vectorManipulation = new HelloWorld();
        Vector r = vectorManipulation.union(a,b);
        for (int i = 0; i < a.size(); i++){
            assertTrue(r.contains(a.get(i)), "Missing element "+a.get(i)+" discovered");
        }
        for (int i = 0; i < b.size(); i++){
            assertTrue(r.contains(b.get(i)), "Missing element "+b.get(i)+" discovered");
        }
        System.out.println("All objects exist after Union");
    }
    @Test
    void noDuplicates(){
        Vector a = new Vector<>(Arrays.asList(1,2,3,4,5,7));
        Vector b = new Vector<>(Arrays.asList(7,8,9));
        var vectorManipulation = new HelloWorld();
        Vector r = vectorManipulation.union(a,b);
        Vector t = new Vector<>(r.size());
        System.out.println(r);
        for (int i = 0; i < r.size(); i++){
            assertFalse(t.contains(r.get(i)), "Element "+r.get(i)+" is a duplicate");
            t.add(r.get(i));
        }
    }
}