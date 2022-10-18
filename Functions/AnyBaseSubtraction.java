public class AnyBaseSubtraction {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();

    int d = getDifference(b, n1, n2);
    System.out.println(d);
 }

 public static int getDifference(int b, int n1, int n2){
     int rv = 0;
     int c = 0;
     int p = 1;
     while(n2 > 0) {
         int digit1 = n1 % 10;
         n1 = n1 / 10;
         int digit2 = n2 % 10;
         n2 = n2 / 10;

         int d = 0;
         digit2 = digit2 + c;
         if(digit2 >= digit1) {
             c = 0; 
             d = digit2 - digit1;
         } else {
             c = -1;
             d = digit2 + b - digit1;
         }
         rv += d * p;
         p = p * 10;

     }
     return rv;
 }
}
