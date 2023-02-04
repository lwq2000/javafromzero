package chapter07;

public class EightQueen {
    public static void main(String[] args){

        int row = 8;
        int column = 8;
        int[][] chessBoard = new int[row][column];
        Chess eightQueen = new Chess();
        int c = eightQueen.nextChessBoard(chessBoard, 0);
        System.out.println(c);
        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                System.out.print(chessBoard[i][j]);
            }
            System.out.println();
        }
    }
}
class Chess {
    public int nextChessBoard(int[][] chessBoard, int row){
        if (row < chessBoard.length){
            for (int j = 0; j < chessBoard[row].length; j++){
                if (check(chessBoard, row, j)){
                    chessBoard[row][j] = 1;
                    nextChessBoard(chessBoard, row + 1);
                    chessBoard[row][j] = 0;
                }
            }
            return 0;
        }else {
            return 1;
        }
    }

    public boolean check(int[][] chessBoard, int x, int y){
        boolean thisok = checkRow(chessBoard, x, y) && checkColumn(chessBoard, x, y) && checkXie(chessBoard, x, y);
        return thisok;
    }
    public boolean checkRow(int[][] chessBoard, int x, int y){
        boolean thisok = true;
        for (int i = 0; i < chessBoard.length; i++){
            if (chessBoard[i][y] == 1){
                thisok = false;
                break;
            }
        }
        return thisok;
    }
    public boolean checkColumn(int[][] chessBoard, int x, int y){
        boolean thisok = true;
        for (int i = 0; i < chessBoard[0].length; i++){
            if (chessBoard[x][i] == 1){
                thisok = false;
                break;
            }
        }
        return thisok;
    }
    public boolean checkXie(int[][] chessBoard, int x, int y){
        boolean thisok = true;
        for (int i = Math.abs(x - y); i < chessBoard.length && y + i - x < chessBoard[0].length; i++){
            if (chessBoard[i][y + i - x] == 1){
                thisok = false;
                break;
            }
        }
        if (x + y > 7){
            for (int i = x + y - 7; i < chessBoard.length; i++){
                if (chessBoard[i][x + y - i] == 1){
                    thisok = false;
                    break;
                }
            }
        }else {
            for (int i = 0; i < x + y; i++){
                if (chessBoard[i][x + y - i] == 1){
                    thisok = false;
                    break;
                }
            }
        }
        return thisok;
    }
}