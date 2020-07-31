import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class TwoSum {

	public TwoSum() {
			
	}

	
	
	 public static int[] twoSum(int[] nums, int target) {
		 
	        
	        for(int i = 0; i<nums.length-1;i++) {
	        	
	        	for(int z = i+1; z<nums.length; z++) {
	      
	        		if((nums[i]+nums[z])==target) {
	        			return new int[] {i,z};
	        		}
	        	}
	        }
	        
	        return new int [] {}; 
	    }
	 
	 

	 public static int[] twoSum1(int[] nums, int target) {
	        Map<Integer, Integer> data = new HashMap<>();
	      
        	data.put(target - nums[0], 0);
        	
	        for(int i = 1; i<nums.length;i++) {	        	
	        	if(data.containsKey(nums[i])) {
	        		return new int [] { data.get(nums[i]), i};
	        	}
	        	data.put(target - nums[i], i);
	        }
	        
		    return new int [] {}; 
	    }
	 
	 
	 
	 public static void printArray(int[]sortedArray) {
			for(int i= 0; i<sortedArray.length;i++) {
				System.out.print(sortedArray[i]+" ");
				
			}
			System.out.println();
		}
		
	 
	 public static void main(String[] args) {
			
			int array[] = { 2,7,11,15};
			printArray(array);
			
//int sortedArray[]=twoSum(array, 6);
			
//			printArray(sortedArray);
			
		int	sortedArray[]=twoSum1(array, 9);
			
			printArray(sortedArray);
			
		
			
		}
}
 
 