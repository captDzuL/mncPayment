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
public class Q3 {
    
    public static String[] function3(String input, int num){
        String[] kata; 
        kata = input.split("\\s+");
    
        for(String result : kata){
           if(kata.length == num){
            System.out.println("output : "+result);
            }
        }
    return kata;
    }
}
