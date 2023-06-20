public class objectCollebration {
    public static void main(String[] args) {
        Student student = new Student();
        student.age = 10;
        Adress adressOfStudent = new Adress();
        adressOfStudent.city = "BLR";
        adressOfStudent.country = "India";

        student.studentAdress = adressOfStudent;
        System.out.println(student.studentAdress.city);
    }
}

//if we have some repetative class values;

class Adress {
    String city;
    String country;
}
class  Student {
    String name;
    int age ;
//    Composition : One object is made up of another object.
   Adress studentAdress;
}

class Employee{
    String empId;
//    Composition : One object is made up of another object.
    Adress employeeAdress;
}