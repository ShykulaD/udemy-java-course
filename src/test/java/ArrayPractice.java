/**
 * Created by ShykulaD on 03/01/2021.
 */
public class ArrayPractice {

    static int[] mainArray = {3, 34343434, 4344, 1, 5, 14};

    public static void sortBubleArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        sortBubleArray(mainArray);
        for (int  i = 0; i < mainArray.length; i++) {
            System.out.println(mainArray[i]);
        }
    }




}
