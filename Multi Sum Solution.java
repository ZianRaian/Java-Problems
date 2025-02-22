import java.util.Scanner;

public class Arithmetic {

    // Method to sum integers in an array
    public Integer sum(Integer[] ints) {
        int total = 0;
        for (int num : ints) {
            total += num;
        }
        return total;
    }

    // Overloaded method to concatenate strings in an array
    public String sum(String[] strings) {
        StringBuilder result = new StringBuilder();
        for (String str : strings) {
            result.append(str);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");

        // Determine if input is integers or strings
        boolean isIntegerArray = true;
        for (String part : parts) {
            if (!part.matches("\\d+")) {
                isIntegerArray = false;
                break;
            }
        }

        Arithmetic arithmetic = new Arithmetic();
        if (isIntegerArray) {
            Integer[] numbers = new Integer[parts.length];
            for (int i = 0; i < parts.length; i++) {
                numbers[i] = Integer.parseInt(parts[i]);
            }
            System.out.println(arithmetic.sum(numbers));
        } else {
            System.out.println(arithmetic.sum(parts));
        }

        scanner.close();
    }
}
