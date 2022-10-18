public class FirstAndLastIndex {
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i < arr.length ; i++){
        arr[i] = scn.nextInt();
    }
    int data = scn.nextInt();
    int lo = 0; 
    int hi = arr.length - 1;
    int firstIndex = -1;
    while(lo <= hi){
        int mid = (lo + hi) / 2;
        if(data > arr[mid]){
            lo = mid + 1;
        }else if(data < arr[mid]){
            hi = mid - 1;
        }else {
            firstIndex = mid;
            hi = mid - 1;
        }
    }
    System.out.println(firstIndex);

    lo = 0; 
    hi = arr.length - 1;
    int lastIndex = -1;
    while(lo <= hi){
        int mid = (lo + hi) / 2;
        if(data > arr[mid]){
            lo = mid + 1;
        }else if(data < arr[mid]){
            hi = mid - 1;
        }else {
            lastIndex = mid;
            lo = mid + 1;
        }
    }
    System.out.println(lastIndex);
 }
}
