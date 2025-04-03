public class BinarySearch {
  public static void main(String[] args) {
    int arr[] ={11,14,18,21,34,54,65,} ;

    int arr1[] ={78,68,56,45,34,11,1} ;
    
    // binarySearch(arr,18);
   // binarySearch(arr,100);
    //binarySearchDec(arr1 ,45);
    binarySearchAgonastic(arr1,45);
    binarySearchAgonastic(arr,21);
  }
  public static void binarySearchAgonastic(int arr[],int target){
  int start=0;
  int end=arr.length-1;
  if(arr[start]<=arr[end]){
    binarySearch( arr,target);
  }else{
    binarySearchDec(arr, target);
  }
}
  public static void binarySearch(int arr[],int target){
    int ans =-1;
    int start = 0;
    int end = arr.length-1;
    while(start<=end){
      int mid = start + (end-start)/2;
      if(arr[mid] == target){
        ans = mid;
        break;
      } else if (arr[mid]<target){
        start = mid+1;
      } else
           end = mid-1;
    }
    if(ans == -1){
      System.out.println(" element not found " );
    } else {
      System.out.println(" element found at index " + target + " at index : " + ans);
    }
  }


/*public class BinarySearch {
  public static void main(String[] args) {
    int arr[] ={78,68,56,45,34,11,1} ;
   // binarySearch(arr,18);
    //binarySearch(arr,100);
    binarySearchDec(arr,34);
  }*/
  public static void binarySearchDec(int arr[],int target){
    int ans =-1;
    int start = 0;
    int end = arr.length-1;
    while(start<=end){
      int mid = start + (end-start)/2;
      if(arr[mid] == target){
        ans = mid;
        break;
      } else if (arr[mid]<target){
        end = mid-1;
      } else
           start = mid+1;
    }
    if(ans == -1){
      System.out.println(" element not found " );
    } else {
      System.out.println(" element found at index " + target + " at index : " + ans);
    }
  }

}






