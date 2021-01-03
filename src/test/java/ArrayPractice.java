import org.testng.annotations.Test;

/**
 * Created by ShykulaD on 03/01/2021.
 */
public class ArrayPractice {

    int[] mainArray = {233, 3, 444, 1, 344, 22};

    @Test
    public void sortBubleArray(int[] array) {

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


}
