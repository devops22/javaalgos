package at.ac.fh_kufstein;

/**
 * Created by marti on 22.06.2017.
 */

public class binäre {

    static int size = 7;
    static int[] data = {2,3,4,5,7,8,9};

    static boolean binarySearch(int key)
    {
        int low = 0;
        int high = size - 1;

        while(high >= low) {
            int middle = low + ((key - data[low]) * (high - low)) / (data[high] - data[low]);

            if(data[middle] == key) {
                return true;
            }
            if(data[middle] < key) {
                low = middle + 1;
            }
            if(data[middle] > key) {
                high = middle - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(binarySearch(8));




    }

}