package com.mysite;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // wprintd all the values divisible by 7 in the range of 1 to 100 in reverse order (for)
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
//       for (int i=0; i < array.length; i++)
//        {
//            if (array[i]==expected) {
//                result = true;
//                System.out.println (result) ;
//                break;
//
//            }
//            System.out.println(result);
//       }
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








