package com.example;

import java.util.Arrays;
import java.util.Vector;

public class HelloWorld {
    public static Vector union(Vector a, Vector b){
        Vector r = new Vector();

        for (int i = 0; i < a.size(); i++)
            if (!r.contains(a.elementAt(i)))
                r.add(a.elementAt(i));

        for (int i = 0; i < b.size(); i++)
            if (!r.contains(b.elementAt(i)))
                r.add(b.elementAt(i));

        return r;
    }
    public static void main(String[] args) {
        Vector arr1 = new Vector<>(Arrays.asList(
                1,3,5,7,'a'
        ));
        Vector arr2 = new Vector<>(Arrays.asList(
                2,4,6,3
        ));


        Vector result = new Vector(union(arr1,arr2));


        System.out.println(result);
    }
}

