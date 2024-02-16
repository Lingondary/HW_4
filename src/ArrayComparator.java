public class ArrayComparator {
    // Обобщенный метод для сравнения двух массивов
    public static <T> boolean compareArrays(T[] array1, T[] array2) {
        // Проверка на равенство длин массивов
        if (array1.length != array2.length) {
            return false;
        }

        // Проверка на равенство элементов массивов
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // Пример использования метода compareArrays() для сравнения массивов различных типов
        Integer[] intArray1 = {1, 2, 3, 4, 5};
        Integer[] intArray2 = {1, 2, 3, 4, 5};
        System.out.println("Arrays are equal: " + compareArrays(intArray1, intArray2));

        String[] strArray1 = {"apple", "banana", "orange"};
        String[] strArray2 = {"apple", "banana", "orange"};
        System.out.println("Arrays are equal: " + compareArrays(strArray1, strArray2));

        Double[] doubleArray1 = {1.5, 2.5, 3.5};
        Double[] doubleArray2 = {1.5, 2.5, 3.5};
        System.out.println("Arrays are equal: " + compareArrays(doubleArray1, doubleArray2));

        // Пример массивов с разной длиной
        Character[] charArray1 = {'a', 'b', 'c'};
        Character[] charArray2 = {'a', 'b', 'c', 'd'};
        System.out.println("Arrays are equal: " + compareArrays(charArray1, charArray2)); // Выведет false
    }
}
