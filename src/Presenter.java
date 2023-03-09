import java.util.Scanner;

public class Presenter {
    public static void buttonClick() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("выберете с какими числами будем работать:1-рациональные числа, 2-комплексные числа");
        int c = Integer.parseInt(scanner.nextLine());
        if (c == 1) {
            float x = View.getValueRational();
            float y = View.getValueRational();
            System.out.println("выберете действие : + , - , * , / .");
            String str = scanner.nextLine();

            if (str.equals("+")) {
                SummRational.result(x, y);
            }
            if (str.equals("-")) {
                SubtractionRational.result(x, y);
            }
            if (str.equals("*")) {
                MultiplicationRational.result(x, y);
            }
            if (str.equals("/")) {
                DivisionRational.result(x, y);
            }

        }
        if (c == 2) {
            float x1 = View.getValueComplex();
            float y1 = View.getValueComplex();
            float x2 = View.getValueComplex();
            float y2 = View.getValueComplex();
            
            System.out.println("выберете действие : + , - , * , / .");
            String str = scanner.nextLine();
            if (str.equals("+")) {
                SummComplex.result(x1, y1, x2, y2);
            }
            if (str.equals("-")) {
                SubtractionComplex.result(x1, y1, x2, y2);
            }
            if (str.equals("*")) {
                MultiplicationComple.result(x1, y1, x2, y2);
            }
            if (str.equals("/")) {
                DivisionComplex.result(x1, y1, x2, y2);
            }

        } 
        if ((c != 1) && (c != 2) ) {
            System.out.println("некорректный ввод");
        }

    }

}