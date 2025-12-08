//1 Two Sum Problem
// Problem Statement
// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to the target.
// Input: nums = [2, 5, 8, 4, 6], target = 12
// Output: [2, 3]
// nums[0] + nums[1] = 8 + 4 = 12

// Explanation target= 12
// current number= 2 at index[0]
// complement= 10 where target - currentnumber : 12-2=10
// example if u have 1rs , you need 10 then u need 9 to make 10
package Java.Pograms;

import java.util.HashMap;
import java.util.Map;


public class TwoSum_usingArray {
	 public static int[] twosum(int[] num, int target) {
		 Map<Integer, Integer> map = new HashMap<>();
		 for(int i=0; i<num.length;i++) {
			 int complement = target-num[i];            //12-2=10 , 12-5=7 , 12-8=4 , 12-4=8 
			 if(map.containsKey(complement)) {
				 return new int[] { map.get(complement),i};        //8=2 first index , i=3 second index
			 }
			 map.put(num[i], i);                                  //8,2
		 }
		 return null;
	 }
	 
	 public static void main(String[]args) {
		 int[] num = {2,5,8,4,6};
		 int target = 12;
		 int []result = twosum(num,target);
		 
		 if(result!=null) {
			 System.out.println("Indices :" + result[0] + "," + result[1]);
			 System.out.println( num [result[0]] + num[result[1]]);
		 }
		 else {
			 System.out.println("No two numbers add up together to the target");
		 }
	 }

}
