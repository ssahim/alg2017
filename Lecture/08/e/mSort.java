class mSort {
	
	public static void main(String[] args) {

		int[] arr={10,2,100,1,0,4,9,2,1,90};

		for (int x: mergeSort(arr) ) {
			System.out.print(x+" ");
		}
		System.out.println();
		
	}

	static int[] mergeSort(int[] arr){

		if (arr.length==1) {
			return arr;
		}

		else{

			int mid=arr.length/2;
			int[] left=new int[mid];
			int[] right= new int[arr.length-mid];

			for (int i=0;i<arr.length ;i++ ) {
				if (i<mid)
					left[i]=arr[i];
				else
					right[i-mid]=arr[i];
			}

				left=mergeSort(left);
				right=mergeSort(right);
				
				arr=merge(left,right);
				return arr;
				
				
		}

		
	} //merge sort ends here


	static int[] merge(int[] left, int[] right){
		int size= left.length+right.length, l=0,r=0;

		int[] result= new int[size];

		for (int i=0;i<size ;i++ ) {
			
			if (l==left.length) {
				result[i]=right[r];
				r++;
			}
			else if(r==right.length){
				result[i]=left[l];
				l++;
			}
			else if(left[l]>right[r]){
				result[i]=right[r];
				r++;
			}
			else{
				result[i]=left[l];
				l++;
			}
		}

		return result;

	}
}