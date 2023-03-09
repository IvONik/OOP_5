import java.util.Scanner;

public class View {

    
    static Scanner scanner = new Scanner(System.in);
   

    public static float getValueRational() {
        System.out.println("введите рациональное число через <.> ");
        float number = Float.parseFloat(scanner.nextLine());
        return number;
    }

    public static float getValueComplex() {
        System.out.println("введите комплексное число ");
        float number = Float.parseFloat(scanner.nextLine());
        return number;
    }
    

}