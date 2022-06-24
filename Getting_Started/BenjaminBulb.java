import java.util.Scanner;

import java.util.Scanner;
public class BenjaminBulb {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i = 0; i * i <= n; i++){
            System.out.println(i * i);
        }
    }
} 