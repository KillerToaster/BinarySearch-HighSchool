import java.util.Scanner;
import java.util.Arrays;
class Main 
{
	public static void main(String[] args) 
	{
		int [] nums = new int [1200];
		int low = 0;
		int high = nums.length - 1;
		int mid = (low + high) / 2;
		Scanner in = new Scanner(System.in);
		System.out.println("What number would you like to find?");
		int key = in.nextInt();
		for(int idx = 0; idx < nums.length; idx++)
		{
			nums [idx] = (int) (Math.random()* 1000 + 1);
		}
		Arrays.sort(nums);
		boolean found = false;
		while(! found && low < high)
		{
			if(key == nums[mid])
				found = true;
			else if(key > nums[mid])
				low = mid + 1;
			else
				high = mid-1;
			mid = (low + high) / 2;
		}
		if (found)
			System.out.println("The number you ae looking for is at position " + mid);
		else
			System.out.println("Sorry, I could not find your number.  :/");
	}
}