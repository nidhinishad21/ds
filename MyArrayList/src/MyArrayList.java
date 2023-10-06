
public class MyArrayList {
	private int[] arr;
	private int count;
	private int index; 
	
	
	public MyArrayList() {
		count=0;
		index=0;
		arr = new int[10];
	}
	/**
	 * 
	 * @param input
	 */
	public void add(int input) {
		if(count>arr.length) {
			//
			int[] arr2 = new int[arr.length*2];
			copyIntoNewArr(arr, arr2);
		}
		arr[index]=input;
		index++;
		count++;
		
	}
	
	private void copyIntoNewArr(int[] oldArr, int[] newArr) {
		
		for(int i=0; i<oldArr.length; i++) {
			newArr[i]=oldArr[i];
		}
		
	}
	
	public void print() {
		for (int i=0; i<index;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public int size() {
		return count;
		//
	}
	/*
	public void update(int numU, int pos) {
		
	}
	public void delete(int ) {
		
	}
	public void retrieve() {
		
	}
	*/

}
