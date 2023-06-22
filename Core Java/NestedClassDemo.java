public class NestedClassDemo {

    private  int outerData;

    public void outerMethod(){
        System.out.println("Outer Method");
    }

//  Static nested class
    public static class staticNestedClass{
        public void nestedMethod(){
            System.out.println("Static nested method");
        }
    }

//  Inner Class Or non-static nested Class
    public class InnearClass{
        public void innerMethod(){
            System.out.println("Inner Method");
        }
    }

//    Creating innear Object
    public void createInnerObject() {
        InnearClass innerObject = new InnearClass();
        innerObject.innerMethod();
    }

    public static void main(String[] args) {


        staticNestedClass nestedObject = new staticNestedClass();
        nestedObject.nestedMethod();


        NestedClassDemo outerObject = new NestedClassDemo();
        outerObject.outerMethod();
        outerObject.createInnerObject();

        InnearClass innerObject = outerObject.new InnearClass();
        innerObject.innerMethod();
    }
}
