/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mncproject;

/**
 *
 * @author 1003
 */
public class Q1 {
    
    public static int function1 (int[] array){
        int output = 0;
        int outputAsli = 0;
    
        for(int i=0;i<array.length;i++){
            if(array[i]>output){
                output = array[i];
            }
        }
    
        for(int j=0;j<array.length;j++)
        {
            if(output - array[j] > 0){
                outputAsli = output;
            }
        }
        System.out.println("result : "+outputAsli);
        return outputAsli;
    }
}
