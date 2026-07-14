package org.example;

import org.example.packageone.ClassOne;
import org.example.packagetwo.ClassTwo;
import org.example.packagethree.ClassThree;

public class Main {
    public static void main(String[] args) {
        ClassOne objOne = new ClassOne();
        ClassTwo objTwo = new ClassTwo();
        ClassThree objThree = new ClassThree();

        System.out.println(objOne.greet());
        System.out.println(objTwo.greet());
        System.out.println(objThree.greet());
    }
}
