package com.bridgelabz;

//  Just like the Perfect number, the Prime number is also a special type of number. When
//  the number is divided greater than 1 and divided by 1 or itself is referred to as the Prime
//  number. 0 and 1 are not counted as prime numbers. All the even numbers can be
//  divided by 2, so 2 is the only even prime minister.

public class logicalPrimeNumber {
    public static void main(String[] args){
        int num = 20,count;
        for(int i = 1;i <= num;i++){
            count = 0;
            for(int j = 2; j <= i/2;j++) {
                if (i % j == 0) {
                    count++;
                    break;
                }
            }
            if(count == 0){
                System.out.println(i);
            }
        }
    }
}
