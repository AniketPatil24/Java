public class Main {
    int x;
    public Main(int y){
      x=y;
    }
    public static void main(String[] args) {
        Main newObj = new Main(5);
        System.out.println("value of y :"+newObj.x);
    }
}
