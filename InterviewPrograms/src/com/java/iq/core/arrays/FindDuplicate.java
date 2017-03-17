package com.java.iq.core.arrays;

public class FindDuplicate {

	public static void main(String[] args) {

		System.out.println(findDuplicate2(new int[] { 2, 5, 1, 1, 4, 3 }));
		System.out.println(findDuplicate2(new int[] { 5, 1, 2, 4, 2, 3 }));
		System.out.println(findDuplicate2(new int[] { 1, 4, 5, 5, 3, 2 }));
	}

	/**
	 * Time Complexity: O(n)
	 * 
	 * @param nums
	 * @return
	 */
	public static int findDuplicate2(int[] nums) {
		int n = nums.length;
		int slow = n;
		int fast = n;
		do {
			slow = nums[slow - 1];
			fast = nums[nums[fast - 1] - 1];
		} while (slow != fast);
		slow = n;
		while (slow != fast) {
			slow = nums[slow - 1];
			fast = nums[fast - 1];
		}
		return slow;
	}

private void printRepeating( int arr[], int n)
{
    // First check all the values that are
    // present in an array then go to that
    // values as indexes and increment by
    // the size of array
    for (int i = 0; i < n; i++)
    {
        int index = arr[i] % n;
        arr[index] += n;
    }
 
    // Now check which value exists more
    // than once by dividing with the size
    // of array
    for (int i = 0; i < n; i++)
    {
        if ((arr[i]/n) > 1)
            cout << i << " ";
    }
}

}
