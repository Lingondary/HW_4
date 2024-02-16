public class Calculator {
    // Метод для сложения двух чисел разного типа
    public static <T extends Number> double sum(T num1, T num2) {
        return num1.doubleValue() + num2.doubleValue();
    }

    // Метод для умножения двух чисел разного типа
    public static <T extends Number> double multiply(T num1, T num2) {
        return num1.doubleValue() * num2.doubleValue();
    }

    // Метод для деления двух чисел разного типа
    public static <T extends Number> double divide(T num1, T num2) {
        if (num2.doubleValue() == 0) {
            throw new IllegalArgumentException("Division by zero");
        }
        return num1.doubleValue() / num2.doubleValue();
    }

    // Метод для вычитания двух чисел разного типа
    public static <T extends Number> double subtract(T num1, T num2) {
        return num1.doubleValue() - num2.doubleValue();
    }

    public static void main(String[] args) {
        int intNum1 = 10;
        int intNum2 = 5;
        double doubleNum1 = 10.5;
        double doubleNum2 = 3.5;

        System.out.println("Sum of int numbers: " + sum(intNum1, intNum2));
        System.out.println("Sum of double numbers: " + sum(doubleNum1, doubleNum2));

        System.out.println("Product of int numbers: " + multiply(intNum1, intNum2));
        System.out.println("Product of double numbers: " + multiply(doubleNum1, doubleNum2));

        System.out.println("Division of int numbers: " + divide(intNum1, intNum2));
        System.out.println("Division of double numbers: " + divide(doubleNum1, doubleNum2));

        System.out.println("Subtraction of int numbers: " + subtract(intNum1, intNum2));
        System.out.println("Subtraction of double numbers: " + subtract(doubleNum1, doubleNum2));
    }
}
