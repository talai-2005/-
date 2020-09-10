package test.version.one;

/**
 * Program execution class.
 * @autor Nikolai Filatov
 */

public class Helper {
    public void integerProcessor (int intInput) {
        if (intInput <= 7) {
            System.out.println("Привет");
        } else System.out.println("Вы вввели " + intInput);
    }

    public void nameProcessor (String name){
        if (name.contains("Вячеслав")) {
            System.out.println("Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }

    public void arrayProcessor (int [] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                System.out.println(array[i]);
            }
        }
    }
}






