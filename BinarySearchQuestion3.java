public class BinarySearchQuestion3 {
  public static void main(String[] args) {
   int  arr[] = {12,15,18,21,34,45,52};
   int index = bitonicArray(arr);
   if (index == -1){
    System.out.println("Element does not exist");
   } else {
    System.out.println("Found "+ arr[index]+ " at " + index);
   }
  }
  public static int bitonicArray(int arr[]){
    int start = 0;
    int end = arr.length-1;
    int mid = start+(end-start)/2;
    while(start<=end){
      int next = (mid+1)%arr.length;
      int prev = (mid-1 + arr.length)%arr.length;
      if (arr[mid] > arr[prev] && arr[mid] > arr[next]){
        return mid;
      }else if (arr[mid] > arr[prev]){
        start = mid+1;
      } else {
        end = mid -1;
      }
    }
    return -1;
  }
}

