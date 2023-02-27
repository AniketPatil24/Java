public class Car {
    String modelName;
    int modelYear;

    //constructor with two parameters
    public Car(String name, int year ){
        modelName = name;
        modelYear = year;
    }
    public static void main(String[] args) {
        Car car = new Car("Honda",1972);
        System.out.println("Model :"+car.modelName);
        System.out.println("Year :"+car.modelYear);
    }
}
