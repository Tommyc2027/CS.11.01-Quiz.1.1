import java.util.Scanner;

/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Tommy Carale
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        String name;
        String food;
        System.out.print("please enter your age:");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("please input your name:");
        name = scanner.nextLine();
        System.out.print("please input your favourite food:");
        food = scanner.nextLine();
        System.out.print("Name:" + name + "\n" + "Age:" + age + "\n" + "Favourite Food: " + food);





















    }

}
