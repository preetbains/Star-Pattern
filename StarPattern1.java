/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaclass;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class StarPattern1 {
    public static void main(String[] args) { 
        Scanner sc=new Scanner(System.in);
        System.out.println("How many Rows you want in this Pattern?");
        
        int rows=sc.nextInt();
        
        System.out.println("Here is Your Pattern...!!!");
         
        for(int i=0;i<rows;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
