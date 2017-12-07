package org.eclipse.che.examples;

import java.util.List;

public class HelloWorld {
    public static void main(String... argvs) {
        List<Integer> list = List.of(4,5,6);
        System.out.println("Hello, the list is" + list);
    }
}
