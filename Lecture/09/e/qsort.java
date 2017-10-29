class qsort{
	
	public static void main(String[] args) {
	
	int[] ar={22,3,4,5,66,7,8};
	qqsort q = new qqsort(ar);
	q.sort();
	for (int x:q.arr ) {
		System.out.print(x+" ");
	}

	System.out.println();

	
		
	
	}

	 
	
}

class qqsort{

	int[] arr;
	int size;

	qqsort(int[] a){
		this.arr = a;
		this.size= arr.length;
	}
	void sort(){

	 	

	 	if (arr==null || arr.length==0) {
	 		return;
	 	}

		
		quickSort(0, size-1);


}
	 void quickSort(int low, int high){

		int left=low;
		int right= high;
		int pavoit= arr[low+(high-low)/2];

		while(left<=right){
			while(arr[left]<pavoit)
				left++;
			while(arr[right]>pavoit)
				right--;


			if (left<=right) {
				
				exchange(left,right);
				left++;
				right--;
			}
		}

		if (low<right) {
			quickSort(low,right);

		}

		if (left<high) {
			
			quickSort(right,high);
		}



	}

	 void exchange(int left, int right){

		int temp=arr[left];
		arr[left]=arr[right];
		arr[right]=temp;
	}



}


