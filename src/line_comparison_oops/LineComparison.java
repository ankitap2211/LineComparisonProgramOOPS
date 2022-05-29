package line_comparison_oops;

public class LineComparison {
    static double line_length(int x1, int x2, int y1, int y2) {
        int lenOfLine = (int) Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("Length of first line " + lenOfLine);

        return lenOfLine;
    }
}

class checkEquality {
    void result(String line1, String line2) {
        if (line1.equals(line2))
            System.out.println("Line is equal");
        else
            System.out.println("Lines are not equal");
    }
}