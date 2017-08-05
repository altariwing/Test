package com.altariwing.loopdemo;

//meow
public class Loopdemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Accumulator accumulator=new Accumulator();
        
        System.out.println(accumulator.accumulateToUsingForLoop(100));
        System.out.println(accumulator.accumulateToUsingWhileLoop(100));
        System.out.println(accumulator.accumulateToUsingDoWhileLoop(100));
       
        System.out.println(accumulator.accumulateToUsingForLoop(0));
        System.out.println(accumulator.accumulateToUsingWhileLoop(0));
        System.out.println(accumulator.accumulateToUsingDoWhileLoop(0));
        
System.out.println("多印一行你知道嗎");

        System.out.println(accumulator.returnEndIndexForTotal(50));
        System.out.println(accumulator.returnEndIndexForTotalUsingInfinityLoop(50));
        System.out.println(accumulator.returnEndIndexForTotal(5050));
        System.out.println(accumulator.returnEndIndexForTotalUsingInfinityLoop(5050));

    }

}
