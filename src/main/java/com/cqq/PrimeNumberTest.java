package com.cqq;

public class PrimeNumberTest {
    public static void main(String[] args) {
        int sum =0;

        for(int i = 2; i<=100; i++){
            int count = 0;

            for (int j = 2; j < i ; j++) {
                if( i % j == 0){
                    count++;
                }
            }

            if(count==0){
                System.out.println(i+"为质数。");
                sum++;
            }
//            else {
//                System.out.println(i + " :约数有"+count+ "个");
//            }

        }
        System.out.println("100以内质数总数为："+sum+ "个");

    }
}
