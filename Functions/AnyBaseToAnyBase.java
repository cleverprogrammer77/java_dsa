public class AnyBaseToAnyBase {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int sourceBase = scn.nextInt();
   int  destBase= scn.nextInt();
   int soln = getvalue( n ,  sourceBase,  destBase);
   System.out.println(soln);

}

   public static int getvalue(int n, int b1, int b2){
     int decimal = getvaluetodecimal(n, b1);
     int destination = getvaluetobase(decimal, b2);

     return destination;
   }

   public static int getvaluetodecimal(int n, int sourceBase){
     int p = 1;
     int rv = 0;
     while(n > 0){
       int digit = n % 10;
       n = n / 10;
       rv += digit * p;
       p = p * sourceBase;
     }
     return rv;
   }

   public static int getvaluetobase(int dec , int b2){
     int p = 1;
     int rv = 0;

     while(dec > 0) {
       int digit = dec % b2;
       dec = dec / b2;
       rv += digit * p;
       p = p * 10;
     }
     return rv;
   }
}
