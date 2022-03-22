
import java.util.*;

public class Game {
  
  static Character[][] board;
  static char turn;

  static void printBoard() {
    System.out.println("|---|---|---|");
    for (int i = 0; i < board.length; i++) {
      System.out.print("| ");
      for (int j = 0; j < board[i].length; j++) {
        System.out.print(board[i][j] + " | ");
      }
      System.out.println();
      System.out.println("|---|---|---|");
    }
  }

  static boolean checkWinner(char c) {
    //check horizontal + vertical 
    for (int i = 0; i < board.length; i++) {
      int counth = 0;
      int countv = 0;
      for (int j = 0; j < board[i].length; j++) {
        if (board[i][j] == c) { counth++; }
        if (board[j][i] == c) { countv++; }
        if (counth >= 3 || countv >= 3) { return true; }
      }
    }

    //check diagonals
    int countl = 0;
    int countr = 0;
    for (int i = 0; i < board.length; i++) {
      if (board[i][i] == c) { countl++; }
      if (board[i][board.length-1-i] == c) {
        countr++;
      }
      if (countl >= 3 || countr >= 3) {
        return true; }
    }
    return false;
  }

  public static void main(String[] args) {
  
    board = new Character[3][3];
    for (int i = 0; i < board.length; i++) {
      Arrays.fill(board[i], ' ');
    }   
    
  }
}