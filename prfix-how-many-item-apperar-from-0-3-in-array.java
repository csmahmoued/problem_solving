
package com.prefix;

/**
 *
 * @author developer
 * /*
   
    arr= 5  5  3  5  2 
    
    [how many times  element 5 appear in element from [1:3 ]
    
    sol: by using prefix techinge
    
          0   1   2   3   4    5
          2   5   5   3   5    2
 sum      2   7   12  15  20   22
         
         * 
   
    */
public class PerfixSum {
    
   
    
  public static void main(String[] arg){
  
         int ar[]={2,5,5,3,5,2};   
    
    int prefix_arr[]=new int[ar.length];
    
      for (int i = 0; i < ar.length; i++) {
          if(ar[i]==5)
          prefix_arr[i]=prefix_arr[Math.abs(i-1)]+1;
          else
          prefix_arr[i]=prefix_arr[Math.abs(i-1)];
              
      }
    
    
    
    
  }
    
}
