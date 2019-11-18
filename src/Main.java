import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String string=s.nextLine();
        numCount(string);
    }
    public static void  numCount(String s) {
        char[] a = s.toCharArray();
        int[] b = new int[10];
        for (int i = 0; i < a.length; i++) {
            b[a[i] - '0']++;
        }
        for (int i = 0; i < b.length; i++) {
            if (b[i] != 0) {
                System.out.println(i + ":" + b[i]);
            }
        }
    }

}
