public class BinarySearchDemo {


    public static int binarySearch(int[] sortedArray, int search) {
        int low = 0;
        int high = sortedArray.length - 1;

        while (low <= high) {
            int middle = (low + high) / 2;
            if (search == sortedArray[middle]) {
                return middle;
            } else if (search < sortedArray[middle]) {
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        return -1;
    }



    public static void main(String[] args) {

        int[] sortedArray = {1,9,11,16,24,39,55};
        int search = 11;


        int index = binarySearch(sortedArray, search);

        if (index != -1) {
            System.out.println("Element is found at index " + index);
        } else {
            System.out.println("-1");
        }

    }
}