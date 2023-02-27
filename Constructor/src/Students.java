public class Students {
    int id;
    String name;
    int age;

    //Constructor overloading
    Students(int studentId, String studentName){
      id=studentId;
      name=studentName;
    }

    Students(int studentId, String studentName, int studentAge){
        id=studentId;
        name=studentName;
        age=studentAge;
    }

    void display(){
        System.out.println(+id +name +age);
    }

    public static void main(String[] args) {
      Students S1 = new Students(111,"ABCD");
      Students S2 = new Students(112,"WXYZ",21);
      S1.display();
      S2.display();
    }
}
