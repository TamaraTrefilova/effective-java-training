import java.util.ArrayList;

public class AlgoSort {

	public AlgoSort() {
		// TODO Auto-generated constructor stub
		
		
	}
	
	
	public static int[] sortA (int[] notSortedArray) {
		
		int index = 0;
		for(int i= 0; i<notSortedArray.length;i++) {
			int min = notSortedArray[i];
			for(int z = i; z<notSortedArray.length; z++) {
				if(min>notSortedArray[z]) {
					min = notSortedArray[z];
					index = z;
				}				
			}
			if(min!=notSortedArray[i]) {
				int temp = notSortedArray[i];
				notSortedArray[i] = min;
				notSortedArray[index]=temp;	
			}
			
			
		}
		
		return notSortedArray;
	}
	
	public static int[] sortB (int[] notSortedArray) {
		
	
		for(int i= 0; i<notSortedArray.length-2;i++) {
			int min = i;
			for(int z = i; z<notSortedArray.length-1; z++) {
				if(notSortedArray[min]>notSortedArray[z]) {
					int temp = notSortedArray[z];
					notSortedArray[min] = notSortedArray[z];
					notSortedArray[min]=temp;	
				}				
			}
		
				
		
			
		}
		
		return notSortedArray;
	}
	
	
	public static void printArray(int[]sortedArray) {
		for(int i= 0; i<sortedArray.length;i++) {
			System.out.print(sortedArray[i]+" ");
			
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		int array[] = { 1,2,2,2,4,0,-1};
		printArray(array);
		
		int sortedArray[]=sortA(array);
		
		printArray(sortedArray);
		
		int sortedArrayB[]=sortB(array);
		
		printArray(sortedArrayB);
		
	}
	
	
}
