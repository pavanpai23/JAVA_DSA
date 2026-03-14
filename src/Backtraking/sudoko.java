package Backtraking;

public class sudoko {

    public static boolean issafe(int sudoko[][],int row, int col,int digit){
        //row
        for (int i = 0; i <=8 ; i++) {
            if(sudoko[i][col]==digit){
                return false;
            }
        }
//        col
        for (int j = 0; j <=8 ; j++) {
            if(sudoko[row][j]==digit){
                return false;
            }
        }
        //grid
        int sr=(row/3)*3;
        int sc=(col/3)*3;

        //3x3 grid
        for (int i = sr; i <sr+3  ; i++) {
            for (int j = sc; j <sc+3 ; j++) {
                if(sudoko[i][j]==digit){
                    return false;
                }
            }
            
        }
        return true;

    }

public static boolean SudokoSolver(int sudoko[][],int row,int col ){
    //base casae
    if(row==9 && col==0){
        return true;
    }
    //recurssion
    int nextrow=row,nextcol=col+1;
    if(col+1==9){
        nextrow=row+1;
        nextcol=0;
    }
    if(sudoko[row][col]!=0){
        return SudokoSolver(sudoko,nextrow,nextcol);
    }
    for (int digit = 1; digit <=9; digit++) {
        if(issafe(sudoko,row,col,digit)){
            sudoko[row][col]=digit;
            if(SudokoSolver(sudoko,nextrow,nextcol)){
                return true;
            }
            sudoko[row][col]=0;
        }
    }
    return false;
}

public static void printsudoko(int sudoko[][]){
    for (int i = 0; i < 9; i++) {
        for (int j = 0; j < 9; j++) {
            System.out.print(sudoko[i][j]);
        }
        System.out.println();
    }
}

    public static void main(String[] args) {
  int sudoko[][]={   {5, 3, 0, 0, 7, 0, 0, 0, 0},
          {6, 0, 0, 1, 9, 5, 0, 0, 0},
          {0, 9, 8, 0, 0, 0, 0, 6, 0},
          {8, 0, 0, 0, 6, 0, 0, 0, 3},
          {4, 0, 0, 8, 0, 3, 0, 0, 1},
          {7, 0, 0, 0, 2, 0, 0, 0, 6},
          {0, 6, 0, 0, 0, 0, 2, 8, 0},
          {0, 0, 0, 4, 1, 9, 0, 0, 5},
          {0, 0, 0, 0, 8, 0, 0, 7, 9}
    };


        if(SudokoSolver(sudoko,0,0)){
            System.out.println("SOl exits");
            printsudoko(sudoko);
        }
        else{
            System.out.println("not exits");
        }
    }
}
