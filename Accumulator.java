package com.altariwing.loopdemo;

/**
 * 我是一個叫做累加器的程式 System.out.println(accumulator.accumulateToUsingForLoop(100));
 * System.out.println(accumulator.accumulateToUsingWhileLoop(100));
 * System.out.println(accumulator.accumulateToUsingDoWhileLoop(100));
 */
public class Accumulator {

    public int accumulateToUsingForLoop(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += i;
        }
        return sum;
    }

    public int accumulateToUsingWhileLoop(int number) {
        int sum = 0;
        while (number >= 0) {
            sum += number;
            number--;
        }
        return sum;
    }

    public int accumulateToUsingDoWhileLoop(int number) {
        int sum = 0;
        int count = 1;
        do {
            sum = sum + count;
            count++;
        } while (count <= number);
        return sum;
    }

    public int returnEndIndexForTotal(int total) {
        int sum = 0;
        int count = 0;
        while (sum < total) {            
            sum+=count;   
            count++;         
        }
        return count-1; //多算一次Orz
    }

    public int returnEndIndexForTotalUsingInfinityLoop(int total) {
        int sum = 0;
        int count = 1;
        while(true){
           sum+=count; 
           if (sum >=total){ 
            break;
            }
           count++;
        }
        return count;
    }

}
