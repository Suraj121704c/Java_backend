public class evenAndOddArray {
    public static void main(String[] args) {
        int arr[] = {10 , 20 , 32,3234,43,23,34,23,3,12 , 324, 43, 12, 1,3};

        int i , e = 0 , o = 0;

        for( i = 0;i<arr.length ; i++){
            if(arr[i] % 2 == 0){
                e++;
            }else {
                o++;
            }
        }
        System.out.println("Even : " + e);
        System.out.println("Odd : " + o);
    }
}
