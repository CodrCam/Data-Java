public class BinarySearch {

    private int[] sortedArray;

    public BinarySearch(int[] sortedArray) {
        this.sortedArray = sortedArray;
    }

    public int search(int searchKey) {
        int low = 0;
        int high = sortedArray.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int midValue = sortedArray[mid];

            if (midValue == searchKey) {
                return mid;
            } else if (midValue < searchKey) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int searchKey = 5;
        BinarySearch binarySearch = new BinarySearch(sortedArray);
        System.out.println(binarySearch.search(searchKey));  // Output: 4 (as the index of 5 is 4)
    }
}


