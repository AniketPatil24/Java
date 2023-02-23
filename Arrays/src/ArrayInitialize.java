import java.util.Arrays;
import java.util.Scanner;

public class ArrayInitialize {

    public static void main(String[] args) {

        //Array.fill method

       int a[] = new int[5];
       Arrays.fill(a,5);
       for(int i =0; i<a.length; i++)
       System.out.println("a["+i+"] :"+a[i]);

       System.out.println();
       // Initialize using for loop

        int b[] = new int[5];

        for(int i=0; i<b.length; i++)
           b[i]=i+1;

        for(int i =0; i<b.length; i++)
            System.out.println("b["+i+"] :"+b[i]);

        //Initialize by taking user input

     Scanner sc = new Scanner(System.in);
    int c[] = new int[5];
        for(int i=0; i<c.length; i++)
        c[i] = sc.nextInt();
        for(int i =0; i<c.length; i++)
        System.out.println("c["+i+"] :"+c[i]);
        }
        }