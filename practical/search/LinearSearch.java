public class LinearSearch {


    public static void main(String[] args) {


        int[] arr={10,3,1,4,5,6,7,20};

        int result= linearsearch(arr,7);
 

        System.out.println("found in index "+result);
      

    }


   static int linearHelp(int[] a, int low, int high, int key){

   		

   		

        if (high<=low){
            System.out.println("Not found");
            return -999;
        }

        

        if (a[low]==key)
            return low;
    
        return linearHelp(a,low+1,high,key);

    }


    static int linearsearch(int arr[], int key){

        int low= 0;
        int high= arr.length-1;

        return linearHelp(arr,low,high,key);

    }

   }
