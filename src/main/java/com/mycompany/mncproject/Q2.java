/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mncproject;

import java.util.Arrays;

/**
 *
 * @author 1003
 */
public class Q2 {
    
    public static int[] function2(int[] input, int x)
    {
        int output[] = new int[input.length+1];
      
        //System.out.println(Arrays.toString(input));
        //System.out.println(x);
        for(int i=0;i<input.length;i++){
            if ((x / input[i]) != x){
                //System.out.println(input[i]);
                output[i] = input[i];
                //System.out.println(output[i]);
            }
        }
    return output;
    }
}
