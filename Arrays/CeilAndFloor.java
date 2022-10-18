public class CeilAndFloor {
  public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int arr[] = new int[n];

    for(int i = 0; i < arr.length; i++){
        arr[i] = scn.nextInt();
    }

    int d = scn.nextInt();
    int lo = 0; 
    int hi = arr.length - 1;
    int ceil = 0; 
    int floor = 0;
    while(lo <= hi){
        int mid = (lo + hi) / 2;
        if(d > arr[mid]){
            lo = mid + 1;
            floor = arr[mid];
        }else if(d < arr[mid]){
            hi = mid - 1;
            ceil = arr[mid];
        } else {
            ceil = arr[mid];
            floor = arr[mid];
            break;
        }
    }
    System.out.println(ceil);
    System.out.println(floor);
 }
}
