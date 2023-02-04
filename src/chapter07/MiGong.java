package chapter07;

public class MiGong {
    public static void main(String[] args){
        int row = 8;
        int column = 7;
        int[][] map = new int[row][column];
        for (int i = 0; i < column; i++){
            map[0][i] = 1;
            map[row - 1][i] = 1;
        }
        for (int j = 1; j < row - 1; j++){
            map[j][0] = 1;
            map[j][column - 1] = 1;
        }
        map[3][1] = 1;
        map[3][2] = 1;
        map[2][2] = 1;
        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
        T1 t = new T1();
        System.out.println(t.findWay(map,1,1));
        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }
}

class T1 {
    public boolean findWay(int[][] map, int x, int y) {
        System.out.println(x+""+y);
        if (map[map.length - 2][map[0].length - 2] == 2){
            return true;
        }else if (map[x][y] == 0){
            map[x][y] = 2;
            if (findWay(map,x+1,y)){
                return findWay(map,x+1,y);
            }else if (findWay(map,x,y+1)){
                return findWay(map,x,y+1);
            }else if (findWay(map,x-1,y)){
                return findWay(map,x-1,y);
            }else if (findWay(map,x,y-1)){
                return findWay(map,x,y-1);
            }else {
                map[x][y] = 3;
                return false;
            }
        }else {
            return false;
        }
    }
}