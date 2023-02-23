public class ArrayExample {

    public static void main(String[] args) {

       /* creating array is a 3 step process
       1.Declare array
       2.Allocating memory
       3.Initializing array
        */

        int a[]; //first way
        int [] b; // another way

         a = new int[5]; // allocating memory
         b = new int [5];

         //initializing
        a[0]=10;
        a[1]=20;
        a[2]=30;
        a[3]=40;
        a[4]=50;

        for(int i=0; i<a.length; i++){
            System.out.println("a [" +i+"] :" + a[i]);
        }

        //declaration + memory allocation + initialization

       int c[] = new int[5];
       int d[] = new int[] {1,2,3,4,5};
        for(int i=0; i<a.length; i++){
            System.out.println("d [" +i+"] :" + d[i]);
        }
    }
}
