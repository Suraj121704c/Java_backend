public class EqualsDemo {
    //    instance variables

    String name;
    int age;
    String address;

    //  constructor --> Special type of method
    public EqualsDemo(String name , int age , String address){
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

    //    to make use of equals.
    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }

        if(obj == null  || obj.getClass() != this.getClass()){
            return false;
        }

        EqualsDemo student = (EqualsDemo) obj;

    //        we defined equality condition on the basis of age
        return (student.age == this.age);
    }

//    make use of hashCode works same as equals
    @Override
    public int hashCode(){
        return this.age;
    }

    public static void main(String[] args) {

    EqualsDemo student1 = new EqualsDemo("Suraj" , 2 , "India");
    EqualsDemo student2 = new EqualsDemo("Rohan" , 2 , "India");
    EqualsDemo student3 = new EqualsDemo("Suraj" , 2 , "India");


//    we defined equality on the basis of age so
        System.out.println(student1.equals(student2)); //true
    }
}
