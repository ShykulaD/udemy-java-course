/**
 * Created by ShykulaD on 03/01/2021.
 */
public class ArrayPractice {

    static int[] mainArray = {23232329,666,7,88,77};

    public static void main(String[] args) {
        sortBubbleArray(mainArray);
        for (int i = 0; i < mainArray.length; i++) {
            System.out.println(mainArray[i]);
        }
    }

    public static void sortBubbleArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }


}
