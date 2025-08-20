public class CountEvenAndOdd {
    public static void main(String [] args){

        int[] array = {1,3,4,5,6,7,89,7,6,5,4,63,3,24,67,5};
        int countEven = 0;
        int countOdd = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] %2 == 0){
                countEven++;
            }
            else{
                countOdd++;
            }
        }

        System.out.println("number of even in array: "+countEven);
        System.out.println("number of odd in array: "+countOdd);
    }
    
}
