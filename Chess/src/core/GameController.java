package core;

import boardSetUp.SetBoard;
import components.ChessBoard;
import java.util.Scanner;

public class GameController {

  public static void main(String args[]) {
    ChessBoard c = new ChessBoard();
    SetBoard s = new SetBoard(c);
    s.setPieces();
    Move m = new Move(c);

    //Infinite Game-Loop
    while (true) {
      c.displayBoard();
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter move:");
      String move = scanner.nextLine();
      m.move(move);
    }
  }
}
