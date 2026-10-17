import java.util.Arrays;

public class TwoDArrays {

    public static void main(String[] args) {
        char[][] board = new char[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
        board[0][0] = '0';
        board[1][0] = '0';
        board[2][0] = '0';
        System.out.println(Arrays.deepToString(board));

        char[][] secondBoard = new char[][] {
                new char[] {'0', '-', '-'},
                new char[] {'0', '-', '-'},
                new char[] {'0', '-', '-'}
        };


        System.out.print(Arrays.deepToString(secondBoard));


    }


}
