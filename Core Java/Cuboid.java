public class Cuboid {

    int width;
    int height;
    int depth;

//    java allows us to create many constructor at once

    Cuboid(int width , int height , int depth){
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    Cuboid(int width , int height){
        this.width = width;
        this.height = height;
        this.depth = 10;
    }

    Cuboid(int dimension){
        width = dimension;
        height = dimension;
        depth = dimension;
    }

    Cuboid(){
        this.width = 10;
        this.height = 10;
        this.depth = 10;
    }


    int volume (){
        return width * height * depth;
    }

    public static void main(String[] args) {

        int volume;

        Cuboid stdCuboid = new Cuboid(10 , 20 , 15);

        volume = stdCuboid.volume();

        System.out.println("Volume of a sample cuboid is : " + volume);

        Cuboid cuboidwithDefaults = new Cuboid(10 , 20);
        volume = cuboidwithDefaults.volume();
        System.out.println("Volume 2 : " + volume);


        Cuboid cuboid2 = new Cuboid(50);
        volume = cuboid2.volume();
        System.out.println("Volume 3 : " + volume);

        Cuboid cuboid3 = new Cuboid();
        volume = cuboid3.volume();
        System.out.println("Volume 4 : "  + volume );
    }
}
