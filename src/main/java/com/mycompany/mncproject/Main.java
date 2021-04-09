/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mncproject;
import static com.mycompany.mncproject.Q1.function1;
//import static com.mycompany.mncproject.Q3.function3;
import static com.mycompany.mncproject.Q2.function2;
import static com.mycompany.mncproject.Q3.function3;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author 1003
 */
public class Main {
    public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      int output1;
      int[] output2;
      String[] output3;
      String input3;
//      System.out.println("Enter the word:");
//      input3 = sc.nextLine();
      System.out.println("Enter the size of the array that is to be created::");
      int size = sc.nextInt();
      int[] myArray = new int[size];

      for(int i=0; i<size; i++) {
         myArray[i] = sc.nextInt();
      }


      output1 = function1(myArray);
      System.out.println(output1);

      System.out.println("Enter the size of the array that is to be created::");
      int size2 = sc.nextInt();
      System.out.println("Enter the 'x' : ");
      int varX = sc.nextInt();
      int[] myArray2 = new int[size2];

      for(int i=0; i<size2; i++) {
         System.out.println("Masukkan array ke"+i);
          myArray2[i] = sc.nextInt();
      }
      
      //System.out.println(Arrays.toString(myArray2));
      output2 = function2(myArray2, varX);
      
      System.out.println(Arrays.toString(output2));
      
      Scanner sc2 = new Scanner(System.in);
      System.out.println("Enter the word:");
      input3 = sc2.nextLine();
      
      System.out.println("Enter num:");
      int num = sc2.nextInt();
      
      output3 = function3(input3,num);
      System.out.println(Arrays.toString(output3));
    }
}


