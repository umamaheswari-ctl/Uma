package com.uma.string;

import java.util.Scanner;

//Driver class 
public class GFG { 

//Driver code 
public static void main(String[] args) 
{ 
 Scanner sc = new Scanner(System.in); 

 // length of array 
 int n = 5; 

 // Array of Pair 
 Pair arr[] = new Pair[n]; 

 arr[0] = new Pair(10, 20); 
 arr[1] = new Pair(1, 2); 
 arr[2] = new Pair(3, 1); 
 arr[3] = new Pair(10, 8); 
 arr[4] = new Pair(4, 3); 

 Compare obj = new Compare(); 

 obj.compare(arr, n); 
} 
} 

