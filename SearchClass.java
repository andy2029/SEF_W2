public class SearchClass {

	public static void main(String[] args) {
		System.out.println("Today is Thursday");
		
		SearchClass searcher = new SearchClass();
		
		int[] arr1 = {70, 61, 72 , 83, 38};
		int[] arr2 = {7, 2, 76, 4, 99};
		
		int max = searcher.findMax(arr2);
		
		System.out.println(max);
	}
	
	public int findMax(int[] arr) {
		// Assume that the first element is the max
		int max = arr[0];
		
		// Create a loop to go from the second element to the last element in the array
		for(int i = 1; i <arr.length; i++) {
			//WITHIN the loop
			//if there is an element greater than the assumed max
			if(arr[i] > max) {
				//then set the max to that element
				max = arr[i];
			}
		}
		
		// After the loop, we have the max element in the array 
		return max;
		
	}

}
