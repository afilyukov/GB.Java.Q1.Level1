import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arrayBinary = new int[] {1, 0, 0, 0, 1, 0, 1, 0, 1, 1};
        System.out.println("Task 1: ");
        printIntArray(arrayBinary);
        invertBinaryArray(arrayBinary);
        printIntArray(arrayBinary);

        int[] intArray = new int[8];
        int[] intArrayTemp = new int[] {0, 3, 6, 9, 12, 15, 18, 21};
        System.out.println("Task 2: ");
        fillIntArray(intArrayTemp, intArray);
        printIntArray(intArrayTemp);
        printIntArray(intArray);

       int[] intArraySix = new int[] {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Task 3: ");
        printIntArray(intArraySix);
        doTask3(intArraySix);
        printIntArray(intArraySix);

        int[][] intQuadArray = new int[6][6];
        System.out.println("Task 4: ");
        fillQuadArray(intQuadArray);
        printQuadArray(intQuadArray);

        System.out.println("Task 5: ");
        System.out.println("Current array:");
        printIntArray(intArraySix);
        int[] minElement = findMin(intArraySix);
        int[] maxElement = findMax(intArraySix);
        System.out.println("Index of min element is: " + minElement[0] + ". It's value is " + minElement[1]);
        System.out.println("Index of max element is: " + maxElement[0] + ". It's value is " + maxElement[1]);

        System.out.println("Task 6: ");
        System.out.println("Current array:");
        int[] balanceArray = new int[] {1, 2, 2, 1, 1, 1, 1, 3};
        int[] balanceIndex = new int[1];
        printIntArray(balanceArray);
        if (findBalance(balanceArray, balanceIndex)) {
            int temp = balanceIndex[0]+2;
            System.out.println("Balance was found. Right part starts from " + temp + " element");
        } else {
            System.out.println("Balance was not found :(");
        }

        //System.out.println("Task 7: ");
        //System.out.println("Current array:");
        //int[] task7Array = new int[] {1, 2, 2, 1, 1, 1, 1, 3};
        //int n = 3;
        //printIntArray(task7Array);
        //shiftArray(task7Array, n);
        //System.out.println("Shifted array:");
        //printIntArray(task7Array);
    }

    //Task 1
    private static void invertBinaryArray(int[] myArray){
        for (int i=0; i < myArray.length; i++){
            if (myArray[i] == 0) {
                myArray[i] = 1;
            } else {
                myArray[i] = 0;
            }
        }
    }

    //Task 2
    private static void fillIntArray(int[] tempArray, int[] newArray){
        for (int i=0; i < tempArray.length; i++){
            newArray[i] = tempArray[i];
        }
    }

    //Task 3
    private static void doTask3(int[] tempArray){
        for (int i=0; i < tempArray.length; i++){
            if (tempArray[i] < 6) {
                tempArray[i] = tempArray[i] *2;
            }
        }
    }

    //Task 4
    private static void fillQuadArray(int[][] myQuadArray){
        for (int i=0; i < myQuadArray.length; i++){
            for (int j=0; j < myQuadArray[i].length; j++){
                if (i==j || i+j==myQuadArray.length-1){
                    myQuadArray[i][j] = 1;
                }else {
                    myQuadArray[i][j] = 0;
                }
            }
        }
    }

    //Task 5
    private static int[] findMin(int[] myArray){
        int[] minElement = new int[] {0, myArray[0]};
        for (int i=0; i < myArray.length; i++){
            if (myArray[i] < minElement[1]) {
                minElement[0] = i;
                minElement[1] = myArray[i];
            }
        }
        return minElement;
    }

    //Task 5
    private static int[] findMax(int[] myArray){
        int[] maxElement = new int[] {0, myArray[0]};
        for (int i=0; i < myArray.length; i++){
            if (myArray[i] > maxElement[1]) {
                maxElement[0] = i;
                maxElement[1] = myArray[i];
            }
        }
        return maxElement;
    }

    //Task 6
    private static boolean findBalance(int[] myArray, int[] b){
        if (myArray.length >=2) {
            int summLeft = 0;
            int summRight = 0;
            for (int i=0; i < myArray.length-1; i++) {
                summLeft = summLeft + myArray[i];
                for (int j=i+1; j < myArray.length;j++){
                    summRight = summRight + myArray[j];
                }
                if (summLeft == summRight) {
                    b[0] = i;
                    return true;
                }
                summRight = 0;
            }
            return false;
        } else {
            return false;
        }
    }

    //Task 7
    //private static void shiftArray(int[] myArray, int n){
     //   for (int i=0; i < myArray.length; i++) {
     //       if
     //   }
    //}
    //Задание 7 не совсем понял условие. Элементы надо сдвинуть "по кругу" на N позиций или просто
    // заполнить нулями или еще чем-то освободившиеся места


    //Auxiliary method
    private static void printIntArray(int[] myArray){
        System.out.println(Arrays.toString(myArray));
    }

    //Auxiliary method
    private static void printQuadArray(int[][] myQuadArray){
        for (int i=0; i < myQuadArray.length; i++){
            printIntArray(myQuadArray[i]);
        }
    }
}
