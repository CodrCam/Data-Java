public class Main {

    public static int[] insertShiftArray(int[] arr, int value) {
        int length = arr.length;
        int[] newArr = new int[length + 1];
        int middleIndex = (length + 1) / 2;

        for (int i = 0; i < middleIndex; i++) {
            newArr[i] = arr[i];
        }

        newArr[middleIndex] = value;

        for (int i = middleIndex; i < length; i++) {
            newArr[i + 1] = arr[i];
        }

        return newArr;
    }

    public static int[] removeShiftArray(int[] arr) {
        int length = arr.length;
        int[] newArr = new int[length - 1];
        int middleIndex = length / 2;

        for (int i = 0; i < middleIndex; i++) {
            newArr[i] = arr[i];
        }

        for (int i = middleIndex + 1; i < length; i++) {
            newArr[i - 1] = arr[i];
        }

        return newArr;
    }

    public static void main(String[] args) {
        int[] inputArray1 = {2, 4, 6, -8};
        int value1 = 5;
        int[] resultArray1 = insertShiftArray(inputArray1, value1);
        for (int i : resultArray1) {
            System.out.print(i + " ");
        }
        System.out.println();

        int[] inputArray2 = {42, 8, 15, 23, 42};
        int value2 = 16;
        int[] resultArray2 = insertShiftArray(inputArray2, value2);
        for (int i : resultArray2) {
            System.out.print(i + " ");
        }
        System.out.println();

        int[] inputArray3 = {2, 4, 5, 6, -8};
        int[] resultArray3 = removeShiftArray(inputArray3);
        for (int i : resultArray3) {
            System.out.print(i + " ");
        }
        System.out.println();

        int[] inputArray4 = {42, 8, 15, 16, 23, 42};
        int[] resultArray4 = removeShiftArray(inputArray4);
        for (int i : resultArray4) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
