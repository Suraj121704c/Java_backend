public class StudentDataManagement {
//    instance variables
  String name;
  int age;
  String address;

//  constructor --> Special type of method
  public StudentDataManagement(String name , int age , String address){
      this.name = name;
      this.age = age;
      this.address = address;
  }

//  setting setters and getters

  public void setName(String name){
      this.name = name;
  }

  public  void setAge (int age){
      this.age = age;
  }

  public  void setAddress(String address){
      this.address = address;
  }

  public String getName(){
      return name;
  }

  public int getAge(){
      return age;
  }

  public  String getAddress(){
      return  address;
  }


  public  String toString(){
      return ("Student name is " + this.getName() + " , age is : " + this.getAge() + " and address is : " + this.getAddress());
  }

    public static void main(String[] args) {


        StudentDataManagement john = new StudentDataManagement("john" , 25 , "23 East , blue");

        System.out.println(john.getName());
        System.out.println(john.getAddress());
        System.out.println(john.getAge());

        System.out.println(john.toString());
    }
}
