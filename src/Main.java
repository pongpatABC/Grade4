import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("input number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner . nextInt();

        if (number>=80) {
            System.out.println("A");
        }
        else if (number>=70) {
            System.out.println("B");
        }
        else if (number>=60) {
            System.out.println("C");
        }
        else if (number>=50) {
            System.out.println("D");
        }
        else  {
            System.out.println("F");
        }
        }
    }
