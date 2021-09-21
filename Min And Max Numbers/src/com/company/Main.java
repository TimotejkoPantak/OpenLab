package com.company;

public class Main {

    public static void main(String[] args) {

        int[] num_array = {4,5,6,7,8,9,27};
        int max_value = num_array[0];
        int min_value = num_array[0];

        for (int i = 1; i < num_array.length; i++){

            if (num_array[i] > max_value){
                max_value = num_array[i];
            }
            else if (num_array[i] < min_value) {
                min_value = num_array[i];
            }
        }

        System.out.println(max_value - min_value);
    }
}
