package arrays;
// Java implementation of the approach
class GFG {

	// Function to return the maximum
	// water that can be stored
	public static int maxWater(int arr[], int n)
	{
		int size = n - 1;

		// Let the first element be stored as
		// previous, we shall loop from index 1
		int prev = arr[0];

		// To store previous wall's index
		int prev_index = 0;
		int water = 0;

		// To store the water until a larger wall   
		// is found, if there are no larger walls
		// then delete temp value from water
		int temp = 0;
		for (int i = 1; i <= size; i++) {

			// If the current wall is taller than
			// the previous wall then make current
			// wall as the previous wall and its
			// index as previous wall's index
			// for the subsequent loops
			if (arr[i] >= prev) {
				prev = arr[i];
				prev_index = i;

				// Because lar ger or same height wall is
				// found
				temp = 0;
			}
			else {

				// Since current wall is shorter than
				// the previous, we subtract previous
				// wall's height from the current wall's
				// height and add it to the water
				water += prev - arr[i];

				// Store the same value in temp as well
				// If we dont find any larger wall then
				// we will subtract temp from water
				temp += prev - arr[i];
			}
			
			System.out.println(i+"======================="+prev_index+"======="+arr[i]);
		}

		// If the last wall was larger than or equal
		// to the previous wall then prev_index would
		// be equal to size of the array (last element)
		// If we didn't find a wall greater than or equal
		// to the previous wall from the left then   
		// prev_index must be less than the index
		// of the last element
		if (prev_index < size) {
			System.out.println("eeeeeee??"+prev_index);

			// Temp would've stored the water collected
			// from previous largest wall till the end
			// of array if no larger wall was found then
			// it has excess water and remove that
			// from 'water' var
			water -= temp;

			// We start from the end of the array, so 
			// previous should be assigned to the last
			// element
			prev = arr[size];

			// Loop from the end of array up to the
			// 'previous index' which would contain the
			// "largest wall from the left"
			for (int i = size; i >= prev_index; i--) {
				System.out.println(i+"eeeeeee??"+prev_index);  
				// Right end wall will   definitely smaller
				// than the 'previous index' wall
				if (arr[i] >= prev) {
					prev = arr[i];
				}
				else {
					water += prev - arr[i];
				}
			}
		}

		// Return the maximum water
		return water;
	}

	// Driver code
	public static void main(String[] args)
	{   //     int arr[] = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };

		 int arr[] = { 0, 1, 0, 2, 1, 0, 1, 3, 6, 1, 5, 4 };
		int N = arr.length;
		System.out.print(maxWater(arr, N));
	}
}
