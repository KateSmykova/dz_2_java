import java.util.Arrays;
import java.util.Random;

public class dz1{
    public static void main(String[] args) {
      int i = new Random().nextInt(2001);
      int n = Integer.toBinaryString(i).length();

      int c = 0;
      for (int j = Short.MIN_VALUE; j<i; j++){
        if(j%n==0) c++;
      }
      int[]m1 =new int [c];
      c=0;
      for (int j = Short.MIN_VALUE; j < i; j++){
        if (j%n==0) m1[c++]=j;
      }


      c = 0;
      for (int j = i; i<Short.MAX_VALUE; j++){
        if(j%n!=0) c++;
      }
      int[]m2 =new int [c];
      c=0;
      for (int j = i; j < Short.MAX_VALUE; j++){
        if (j%n!=0) m2[c++]=j;
      }

      System.out.println(i);
      System.out.println(n);
      System.out.println(Arrays.toString(m1));
      System.out.println(Arrays.toString(m2));
    }
}