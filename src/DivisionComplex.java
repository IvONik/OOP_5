public class DivisionComplex {
    public static void result(float x1, float y1, float x2, float y2) {
        if ((y1 * x2 - x1 * y2) / (x2 * x2 + y2 * y2) < 0) {
            System.out.println(((x1 * x2 + y1 * y2) / (x2 * x2 + y2 * y2)) + ""
                    + ((y1 * x2 - x1 * y2) / (x2 * x2 + y2 * y2)) + "i");
        } else {
            System.out.println(((x1 * x2 + y1 * y2) / (x2 * x2 + y2 * y2)) + "+"
                    + ((y1 * x2 - x1 * y2) / (x2 * x2 + y2 * y2)) + "i");
        }
    }

}
