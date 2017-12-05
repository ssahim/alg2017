public class BinarySearch {


    public static void main(String[] args) {

        // in binary search the array should be sorted before running the algorithm
        int[] arr={1,2,3,4,5,6,7,8};

        int result= binarysearch(arr,3);
 

        System.out.println(result);
      

    }

// a helper function for binary search
static int bHelper(int[] a, int low, int high, int key){
        if (high<=low){
            return -999;
        }
        int mid=low+(high-low)/2;
        if (key==a[mid])
            return mid;
        else if (key<a[mid])
            return bHelper(a,low,mid-1,key);
        else
            return bHelper(a,mid+1,high,key);
    }

    // binary search method
    static int binarysearch(int[] arr,int key){
        int low=arr[0];
        int high=arr[arr.length-1];
        return bHelper(arr,low,high,key);
    }


   }
