public class FindElementInArray {
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i < arr.length; i++){
        arr[i] = scn.nextInt();
    }
    int key = scn.nextInt();
    int pos = findInArray(arr, n, key);
    System.out.println(pos);
 }

 public static int findInArray(int[] arr, int n, int key){
     for(int i = 0 ; i < arr.length ; i++){
         if(arr[i] == key){
             return i;
         }
     }
     return -1;
 }
}
