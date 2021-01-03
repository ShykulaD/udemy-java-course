/**
 * Created by ShykulaD on 29/12/2020.
 */
public class Program {

    public static void main(String[] args) {
//        Dog dog = new Dog();
//        Animal dog2 = new Dog();

        try {
            Animal a1 = new Animal();
            Animal a2 = new Dog();
            a1.voiceAnimal();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
