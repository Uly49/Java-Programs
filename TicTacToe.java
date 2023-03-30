class TicTacToe {
  public static void main(String[] args) {
    DrawBoard();
    double cx = 0;
    double cy = 0;
    boolean endOfGame = false;
    boolean vClick = true;
    int turns = 1;
    int Player = 0;
    int[]score = new int[10];
    for (int i=0; i<10; i++) {
      score[i] = 0;
    }
    double mouseX = 0;
    double mouseY = 0;
    
    while (!endOfGame) {
      while (StdDraw.isMousePressed()) {
        mouseX = StdDraw.mouseX();
        mouseY = StdDraw.mouseY();
        cx = mouseX;
        cy = mouseY;
        if ((turns%2)==1) {
          if ((score[spotOnBoard(cx, cy)])==0) {
            vClick = DrawXCentered(cx, cy);
            score[spotOnBoard(cx, cy)] = 1;
            turns++;
          }
          System.out.println(turns);
        }
        else {
          if ((score[spotOnBoard(cx, cy)])==0) {
            vClick = DrawOCentered(cx, cy);
            score[spotOnBoard(cx, cy)] = 2;
            turns++;
          }
        }
        if (!vClick) {
          System.out.println("Invalid location, try again.");
        }
        else {
          if (turns >= 5){
            Player = checkWin(score);
            if (Player > 0){
              System.out.println("Player " + Player + " won!");
              endOfGame = true;
            }
            else {
              if (turns==9) {
                System.out.println("It's a draw.");
                endOfGame = true;
              }
            }
          }
        }
      }
    }
  }
  public static void DrawBoard() {
    double xMin = 0;
    double xMax = 30;
    double yMin = 0;
    double yMax = 30;
    StdDraw.setXscale(xMin, xMax);
    StdDraw.setYscale(yMin, yMax);
    StdDraw.line(10,0,10,30);
    StdDraw.line(20,0,20,30);
    StdDraw.line(0,10,30,10);
    StdDraw.line(0,20,30,20);
  }
  public static void DrawX(double cx, double cy) {
    StdDraw.line(cx-2, cy-2, cx+2, cy+2);
    StdDraw.line(cx-2, cy+2, cx+2, cy-2);
  }
  public static void DrawO(double cx, double cy) {
    StdDraw.circle(cx, cy, 3);
  }
  public static boolean DrawXCentered(double cx, double cy) {
    if ((0<cx) && (cx<10) && (0<cy) && (cy<10)) {
      cx = 5;
      cy = 5;
      DrawX(cx, cy);
      //score[7] = 1;
      return true;
    }
    else if ((10<cx) && (cx<20) && (0<cy) && (cy<10)) {
      cx = 15;
      cy = 5;
      DrawX(cx, cy);
      return true;
    }
    else if ((20<cx) && (cx<30) && (0<cy) && (cy<10)) {
      cx = 25;
      cy = 5;
      DrawX(cx, cy);
      return true;
    }
    else if ((0<cx) && (cx<10) && (10<cy) && (cy<20)) {
      cx = 5;
      cy = 15;
      DrawX(cx, cy);
      return true;
    }
    else if ((10<cx) && (cx<20) && (10<cy) && (cy<20)) {
      cx = 15;
      cy = 15;
      DrawX(cx, cy);
      return true;
    }
    else if ((20<cx) && (cx<30) && (10<cy) && (cy<20)) {
      cx = 25;
      cy = 15;
      DrawX(cx, cy);
      return true;
    }
    else if ((0<cx) && (cx<10) && (20<cy) && (cy<30)) {
      cx = 5;
      cy = 25;
      DrawX(cx, cy);
      return true;
    }
    else if ((10<cx) && (cx<20) && (20<cy) && (cy<30)) {
      cx = 15;
      cy = 25;
      DrawX(cx, cy);
      return true;
    }
    else if ((20<cx) && (cx<30) && (20<cy) && (cy<30)) {
      cx = 25;
      cy = 25;
      DrawX(cx, cy);
      return true;
    }
    else {
      return false;
    }
  }
  public static boolean DrawOCentered(double cx, double cy) {
    if ((0<cx) && (cx<10) && (0<cy) && (cy<10)) {
      cx = 5;
      cy = 5;
      DrawO(cx, cy);
      return true;
    }
    else if ((10<cx) && (cx<20) && (0<cy) && (cy<10)) {
      cx = 15;
      cy = 5;
      DrawO(cx, cy);
      return true;
    }
    else if ((20<cx) && (cx<30) && (0<cy) && (cy<10)) {
      cx = 25;
      cy = 5;
      DrawO(cx, cy);
      return true;
    }
    else if ((0<cx) && (cx<10) && (10<cy) && (cy<20)) {
      cx = 5;
      cy = 15;
      DrawO(cx, cy);
      return true;
    }
    else if ((10<cx) && (cx<20) && (10<cy) && (cy<20)) {
      cx = 15;
      cy = 15;
      DrawO(cx, cy);
      return true;
    }
    else if ((20<cx) && (cx<30) && (10<cy) && (cy<20)) {
      cx = 25;
      cy = 15;
      DrawO(cx, cy);
      return true;
    }
    else if ((0<cx) && (cx<10) && (20<cy) && (cy<30)) {
      cx = 5;
      cy = 25;
      DrawO(cx, cy);
      return true;
    }
    else if ((10<cx) && (cx<20) && (20<cy) && (cy<30)) {
      cx = 15;
      cy = 25;
      DrawO(cx, cy);
      return true;
    }
    else if ((20<cx) && (cx<30) && (20<cy) && (cy<30)) {
      cx = 25;
      cy = 25;
      DrawO(cx, cy);
      return true;
    }
    else {
      return false;
    }
  }
  public static int checkWin(int[] score) {
    if ((score[1] == score[2]) && (score[2] == score[3])) {
      if (score[1]==1) {
        return 1;
      }
      else if (score[1]==2) {
        return 2;
      }
    }
    else if ((score[4] == score[5]) && (score[5] == score[6])) {
      if (score[4]==1) {
        return 1;
      }
      else if (score[4]==2) {
        return 2;
      }
    }
    else if ((score[7] == score[8]) && (score[8] == score[9])) {
      if (score[7]==1) {
        return 1;
      }
      else if (score[7]==2) {
        return 2;
      }
    }
    else if ((score[1] == score[5]) && (score[5] == score[9])) {
      if (score[1]==1) {
        return 1;
      }
      else if (score[1]==2) {
        return 2;
      }
    }
    else if ((score[7] == score[5]) && (score[5] == score[3])) {
      if (score[7]==1) {
        return 1;
      }
      else if (score[7]==2) {
        return 2;
      }
    }
    else if ((score[1] == score[4]) && (score[4] == score[7])) {
      if (score[1]==1) {
        return 1;
      }
      else if (score[1]==2) {
        return 2;
      }
    }
    else if ((score[2] == score[5]) && (score[5] == score[8])) {
      if (score[2]==1) {
        return 1;
      }
      else if (score[2]==2) {
        return 2;
      }
    }
    else if ((score[3] == score[6]) && (score[6] == score[9])) {
      if (score[3]==1) {
        return 1;
      }
      else if (score[3]==2) {
        return 2;
      }
    }
    return 0;
  }
  public static int spotOnBoard(double cx, double cy) {
    if ((0<cx) && (cx<10) && (0<cy) && (cy<10)) {
      cx = 5;
      cy = 5;
      return 7;
    }
    else if ((10<cx) && (cx<20) && (0<cy) && (cy<10)) {
      cx = 15;
      cy = 5;
      return 8;
    }
    else if ((20<cx) && (cx<30) && (0<cy) && (cy<10)) {
      cx = 25;
      cy = 5;
      return 9;
    }
    else if ((0<cx) && (cx<10) && (10<cy) && (cy<20)) {
      cx = 5;
      cy = 15;
      return 4;
    }
    else if ((10<cx) && (cx<20) && (10<cy) && (cy<20)) {
      cx = 15;
      cy = 15;
      return 5;
    }
    else if ((20<cx) && (cx<30) && (10<cy) && (cy<20)) {
      cx = 25;
      cy = 15;
      return 6;
    }
    else if ((0<cx) && (cx<10) && (20<cy) && (cy<30)) {
      cx = 5;
      cy = 25;
      return 1;
    }
    else if ((10<cx) && (cx<20) && (20<cy) && (cy<30)) {
      cx = 15;
      cy = 25;
      return 2;
    }
    else if ((20<cx) && (cx<30) && (20<cy) && (cy<30)) {
      cx = 25;
      cy = 25;
      return 3;
    }
    else {
      return 0;
    }
  }
}