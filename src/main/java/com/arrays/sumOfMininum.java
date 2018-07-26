
package com.arrays;

import java.util.Random;
import java.util.Stack;
import org.testng.Assert;
import org.testng.annotations.Test;

// Find the sum of minimum of all sub arrays
// http://codeforces.com/blog/entry/47547
// https://agc005.contest.atcoder.jp/tasks/agc005_b
// http://codeforces.com/blog/entry/47547
public class sumOfMininum {
  public static void main(String[] args) {
      int [] input = new int []{0,0};
      sumOfMininum sumOfMininum = new sumOfMininum();
    System.out.println("Actual="+sumOfMininum.OrderOfNCube(input));
    System.out.println("Received="+sumOfMininum.OrderOfN(input));
  }

  int  OrderOfN(int [] input){
    int len = input.length;
    int sum=0;
    Stack<Integer> stck = new Stack<>();
    int nextRightMin[] = new int[input.length];
    nextRightMin[len-1] = len;
    stck.push(len-1);
    for(int i=len-2;i>=0;i--){
      int current = input[i];
      while(!stck.isEmpty()&& input[stck.peek()]>=current){
        stck.pop();
      }
      if(stck.isEmpty()){
        nextRightMin[i] = len;
      }else{
        nextRightMin[i] = stck.pop();
        stck.push(i);
      }
    }

    int sums[] = new int[input.length+1];
    sums[len] = 0;
    for(int i=len-1;i>=0;i--){
      sums[i] = (nextRightMin[i] - i)*input[i] + sums[nextRightMin[i]];
    }

    int result =0;
    for(int i=0;i<len;i++){
      result += sums[i];
    }
    return  result;
  }

  int OrderOfNCube(int[] arr) {
    int len = arr.length;
    int sum = 0;

    for (int i = 0; i < len; i++) {
      for (int j = i; j < len; j++) {
        int min = arr[i];
        for (int k = i + 1; k <= j; k++) {
          if (arr[k] < min) {
            min = arr[k];
          }
        }
        sum += min;
      }
    }
  //  System.out.println("Minimum =" + sum);
    return sum;
  }


  @Test
  public void testMinSum(){
    Random random = new Random();
    int[] arraySizes = random.ints(10, 0, 30).toArray();
    for(int i=0;i<arraySizes.length;i++){
      int input[] = random.ints(arraySizes[i],0,Integer.MAX_VALUE).toArray();
      int expectedResult = OrderOfNCube(input);
      int actualResult = OrderOfN(input);
      Assert.assertEquals(expectedResult,actualResult);
    }

  }

}
