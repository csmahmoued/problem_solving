
package com.prefix;

/**
 *
 * @author developer
 * /*
   
    arr= 5  5  3  5  2 
    
    what is the sum of elements from arr[0:3]
    
    sol: by using prefix techinge
    
          0   1   2   3   4    5
          2   5   5   3   5    2
 sum      2   7   12  15  20   22
         
   
    */
public class PerfixSum {
    
   
    
  public static void main(String[] arg){
  
         int ar[]={2,5,5,3,5,2};   
    
    int prefix_arr[]=new int[ar.length];
    
      for (int i = 0; i < ar.length; i++) {
          
          prefix_arr[i]=ar[i]+prefix_arr[Math.abs(i-1)];
      }
    
     System.out.println(prefix_arr[4]-prefix_arr[1]);
    
    
    
  }
    
}
