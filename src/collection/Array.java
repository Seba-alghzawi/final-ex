package collection;

import java.util.Arrays;

public class Array {

	static int counterMethod1=0; 
	static int counterMethod2=0; 
	static int counterMethod3=0; 
	static int counterMethod4=0; 

	/*
	 * a)Write method that takes many input to calculate and print the average of the numbers.
	 */
	public static double Avg(int ...nums)
	{
		counterMethod1++;
		int sum=0;
		for(int i=0;i<nums.length;i++)
		{
			sum+=nums[i];
		}
		double avg=(sum/nums.length);
		return avg;
	}
	/*
	 * b)Write method to sort a numeric array and a string array
*/
	public static int[] sorting(int arr[])
	{
		counterMethod2++;
		Arrays.sort(arr);
		return arr;
	}
	
	/*
	 * c)Write method program to sum values of an array

	 * */
	public static int summation(int arr[])
	{
		counterMethod3++;
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		return sum;
	}
	
	
	/*
	 *d)Write method program to test if an array contains a specific value.

	 */
	
	public static boolean findValue(int arr[],int num)
	{
		counterMethod4++;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==num)
				return true;
			
		}
		return false;
	}
	
	/*
	 * e)write method print how many times calls each method 

	 * */
	public static void numberOfCalls()
	{
		System.out.println("num of calls for method 1:"+counterMethod1);
		System.out.println("num of calls for method 2:"+counterMethod2);
		System.out.println("num of calls for method 3:"+counterMethod3);
		System.out.println("num of calls for method 4:"+counterMethod4);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Avg(1,2,3,5,66,40));
		int arr[]= {1,5,9,8,3,4};
		sorting(arr);
		System.out.println(arr);
		System.out.println(summation(arr));
		System.out.println(findValue(arr,8));
		numberOfCalls();
	}

}
