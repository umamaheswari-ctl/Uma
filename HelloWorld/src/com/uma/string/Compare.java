package com.uma.string;

import java.util.Arrays;
import java.util.Comparator;

//class to define user defined conparator 
class Compare { 

static void compare(Pair arr[], int n) 
{ 
 // Comparator to sort the pair according to second element 
 Arrays.sort(arr, new Comparator<Pair>() { 
     @Override public int compare(Pair p1, Pair p2) 
     { 
         return p1.y - p2.y; 
     } 
 }); 

 for (int i = 0; i < n; i++) { 
     System.out.print(arr[i].x + " " + arr[i].y + " "); 
 } 
 System.out.println(); 
} 
} 