package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        int half = cathetusLength - 1;

        for (int row = 1; row <= cathetusLength; row++) {
            int colLength = half + row;
            for (int col = 1, num = cathetusLength; col <= colLength; col++) {
                if (num > row) {
                    System.out.print(' ');
                } else if (num <= row) {
                    System.out.print(num);
                }

                if (col == colLength) {
                    System.out.println();
                }
                if (col <= half) {
                    num--;
                } else {
                    num++;
                }
            }
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
