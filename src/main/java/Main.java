//2. Написать метод, которому в качестве аргумента передается не пустой одномерный целочисленный массив.
// Метод должен вернуть новый массив, который получен путем вытаскивания из исходного массива элементов,
// идущих после последней четверки. Входной массив должен содержать хотя бы одну четверку, иначе в методе необходимо
// выбросить RuntimeException.
// Написать набор тестов для этого метода (по 3-4 варианта входных данных). Вх: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ].
//3. Написать метод, который проверяет состав массива из чисел 1 и 4. Если в нем нет хоть одной четверки или единицы,
// то метод вернет false; Написать набор тестов для этого метода (по 3-4 варианта входных данных).

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(method1(new int[]{3, 5, 22, 45, 4, 7, 1, 55, 2, 4, 77})));
        System.out.println(method2(new int[]{9, 34, 1, 78, 45, 22, 82, 124, 55, 4, 12, 7}));
    }

    public static int[] method1(int[] in) {
        if (in == null)
            return null;

        int massive = 0;
        for (int i = 0; i < in.length; i++)
            if (in[i] == 4)
                massive = i;
        if (in[massive] != 4)
            throw new RuntimeException();

        return Arrays.copyOfRange(in, massive + 1, in.length);
    }

    public static boolean method2(int[] in) {
        if (in == null)
            return false;

        boolean search1 = false, search2 = false;
        for (int elem : in) {
            if (elem == 1) search1 = true;
            else if (elem == 4) search2 = true;
            else return false;
        }

        return (search1 & search2);
    }

}
