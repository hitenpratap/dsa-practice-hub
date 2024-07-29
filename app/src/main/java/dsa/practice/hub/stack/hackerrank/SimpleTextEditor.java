package dsa.practice.hub.stack.hackerrank;

import java.util.Scanner;
import java.util.Stack;

// https://www.hackerrank.com/challenges/simple-text-editor/problem
public class SimpleTextEditor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        scanner.nextLine();

        StringBuilder currentString = new StringBuilder();
        Stack<String> operations = new Stack<>();

        for (int i = 0; i < q; i++) {
            String[] command = scanner.nextLine().split(" ");
            String operationType = command[0];

            switch (operationType) {
                case "1":
                    operations.push(currentString.toString());
                    String appendString = command[1];
                    currentString.append(appendString);
                    break;
                case "2":
                    operations.push(currentString.toString());
                    int deleteCount = Integer.parseInt(command[1]);
                    currentString.delete(currentString.length() - deleteCount,
                            currentString.length());
                    break;
                case "3":
                    int printIndex = Integer.parseInt(command[1]) - 1;
                    System.out.println(currentString.charAt(printIndex));
                    break;
                case "4":
                    if (!operations.isEmpty()) {
                        currentString = new StringBuilder(operations.pop());
                    }
                    break;
                default:
                    break;
            }
        }
    }
}
