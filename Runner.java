package test.version.one;

/**
 * Program runner.
 * @autor Nikolai Filatov
 */

public class Runner {
    public static void main(String[] args) {
        Helper helper = new Helper();
        helper.integerProcessor(8);
        helper.nameProcessor("Вячеслав");
        helper.arrayProcessor(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
    }
}