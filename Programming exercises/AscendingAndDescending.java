import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class AscendingAndDescending {

    public static void main(String[] args) {
        int one, two, three;
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter the first number");
        one = Input.nextInt();
        System.out.println("Enter the second number");
        two = Input.nextInt();
        System.out.println("Enter the third number");
        three = Input.nextInt();
        Integer array[] = {one,two,three};
        Arrays.sort(array);
        System.out.println("ascending order " + Arrays.toString(array));
        Arrays.sort(array,Collections.reverseOrder());
        System.out.println("descending order " + Arrays.toString(array));

    }
}

