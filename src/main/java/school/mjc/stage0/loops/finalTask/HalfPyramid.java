package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        int half = cathetusLength - 1;

        for (int row = 1; row <= cathetusLength; row++) {
            int colLength = half + 1;
            for (int col = 1, num = cathetusLength; col <= colLength; col++) {
                if (num > row) {
                    System.out.print(' ');
                } else if (num <= row) {
                    System.out.print('*');
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
        new HalfPyramid().printHalfPyramid(8);
    }
}
