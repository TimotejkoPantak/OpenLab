package com.company;

public class Main {

    public static void main(String[] args) {

        int[] array = {2, 8, 7, 5};
        int even_number = 0;
        int odd_number = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] %2 == 0){
                even_number += array[i];
            }
            else{
                odd_number += array[i];
            }
        }

        if(even_number > odd_number){
            System.out.println("Even number is bigger than odd number");
            int a = even_number - odd_number;
            System.out.println(a);
        }
        else{
            System.out.println("Odd Number is bigger than even number");
            int b = odd_number - even_number;
            System.out.println(b);
        }
    }
}
