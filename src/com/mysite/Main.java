package com.mysite;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // printd all the values divisible by 7 in the range of 1 to 100 in reverse order (for)
        // int i = 0;

        // do {
        //if ((i % 7) == 0)
        // System.out.print(i);
        //  System.out.print((","));
        //  i++;
        //  }

        // while (i < 100);


//

//        int[] array= {10, 14, 18};
//        int expected = 13;
//        boolean result = false;
//
//         {
////            if (array[i]==expected) {
////                result = true;
////                System.out.println (result) ;
////                break;
////
////            }
////            System.out.println(result);
////       }   for (int i=0; i < array.length; i++)
//
//
//        int height = 2;
//        int width = 5;
//        int i = 0;
//
//
//        while (i < height) {
//
//            i++;
//            {
//
//                for (int a = 0; a < width; a++) {
//
//                    System.out.print("*");
//                }
//
//            }
//            System.out.println(" ");
//        }

        Scanner in= new Scanner(System.in);

        System.out.println("Please, enter your pass");


        String expected = "yev";
        int retries= 3;

        for (int i=0;  i < retries ; i++){
            String  pass= in.next();


            if (pass.equals(expected))
            {
                System.out.println("Correct, welcome back");
                break;
            }
            else if ((i==2) && (expected!=pass)){
                System.out.println("Sorry but you have been locked out");

                }

            else  {
                System.out.println("Incorrect, try again");
            }
            }

        }

    }

    class Additional_task {
        public static void main(String[] args) {

//            1. Program to print the duplicate elements of an array
//            In this program, we need to print the duplicate elements present in the array.
//            This can be done through two loops.
//            The first loop will select an element and the second loop will iteration through the array
//            by comparing the selected element with other elements.
//            If a match is found, print the duplicate element.
//
//                    Program to print the duplicate elements of an array
//            In the above array, the first duplicate will be found at the index 4 which is the duplicate of the element (2) present at index 1. So, duplicate elements in the above array are 2, 3 and 8.
//
//            Algorithm
//            STEP 1: START
//            STEP 2: INITIALIZE arr[]= {1, 2, 3, 4, 2, 7, 8, 8, 3}.
//                    STEP 3: PRINT "Duplicate elements in given array:"
//            STEP 4: REPEAT STEP 5 to STEP 7 for(i=0; i<arr.length; i++)
//                STEP 5: REPEAT STEP 6 and STEP 7 for(j=i+1; j<arr.length; j++)
//                STEP 6: if(arr[i] == arr[j])
//                STEP 7: PRINT arr[j]
//            STEP 8: END


            int[] arr = {1, 2, 3, 4, 2, 7, 8, 8, 3};


            for (int i = 0; i < arr.length; i++) {
                for (int j = i+1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        System.out.println(arr[j]);
                    }
                }

            }
        }
    }





