package org.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class NumberPlayList {
    public static void main(String[] args) {

        //creating sample collection
        List<Integer> myNumberList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            myNumberList.add(i);
        }
        //Method1:Explicit Lambda Function
        Consumer<Integer> myListAction = n -> {
            System.out.println("METHOD 1 : forEach lambda impl value::" + n);
        };
        myNumberList.forEach(myListAction);

        //method2:Explicit Lambda Function
        myNumberList.forEach(n -> {
            System.out.println("METHOD 2 : forEach Lambda impl Value :: " + n);
        });

        //method3: Implicit Lambda Function to print double value
        Function<Integer, Double> toDoubleFunction = Integer::doubleValue;

        // Function<Integer, Double> toDoubleFunction = n-> n.doubleValue;
        myNumberList.forEach(n -> {
            System.out.println("METHOD 3 : forEach Lambda double Value::" +
                    toDoubleFunction.apply(n));
        });
    }
}
