//abstract class declaration
public abstract class AbstractDemo {
    int x , y;

//    concrete method
    void  moveTo(int newX , int newY){
        System.out.println("move to x : " + x + "and y : " + y);
    }

//  Abstract method declaration
    abstract void draw();
    abstract  void  resize();
}
