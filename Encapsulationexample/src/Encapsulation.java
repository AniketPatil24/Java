public class Encapsulation {
    public static void main(String[] args){
        A a = new A();
        System.out.println("value " +a.getVar());
        a.setVar(100);
        System.out.println("value " +a.getVar());
    }
}
