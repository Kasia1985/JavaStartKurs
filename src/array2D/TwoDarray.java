package array2D;

public class TwoDarray {
    public static void main(String[] args) {
        double[][] array2d = {
                {1, 1.5, 2},
                {1.5, 2, 2.5},
                {2, 2.5, 3}
        };


        double result = array2d[0][0] * array2d[1][1] * array2d[2][2]
                + array2d[0][2] * array2d[1][1] * array2d[2][0];
        System.out.println("The sum of the multiplication of two diagonalso: " + result);

        result = (array2d[0][1] + array2d[1][1] + array2d[2][1]) * (array2d[1][0] + array2d[1][1] + array2d[1][2]);
        System.out.println("Multiplication of the sums of the middle row and middle column: " + result);

        result = array2d[0][0] + array2d[0][1] + array2d[0][2]
                + array2d[1][2] + array2d[2][2] + array2d[2][1]
                + array2d[2][0] + array2d[1][0];
        System.out.println("the sum of all elements located at the edge of the array: " + result);
    }
}
