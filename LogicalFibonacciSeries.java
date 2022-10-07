package com.bridgelabz;

//  Fibonacci series is a special type of series in which the next term is the sum of the
//  previous two terms. For example, if 0 and 1 are the two previous terms in a series, then
//  the next term will be 1(0+1).

public class LogicalFibonacciSeries {
    public static void main(String[] args){
        int n1=0,n2=1,n3,i,count=10;
        System.out.println(n1+" "+n2);
        for(i =2;i < count;i++)
        {
            n3 = n1+n2;
            System.out.println(""+n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
