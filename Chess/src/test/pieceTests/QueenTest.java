package test.pieceTests;

import static org.junit.Assert.*;

import boardSetUp.SetBoard;
import components.ChessBoard;
import components.ChessBox;
import components.piece.Piece;
import components.piece.Queen;
import org.junit.Test;

public class QueenTest {

  /**
   * Tests all Bishops moves by a Queen
   * @throws Exception
   */

  public void testBishopMoveValidity() throws Exception {
    ChessBoard c = new ChessBoard();
    SetBoard s = new SetBoard(c, false);
    Piece queen;
    ChessBox boxToPutIn;
    boxToPutIn = c.boxes[0][7];
    queen = new Queen("white", boxToPutIn);
    System.out.println(queen.getCurrentPosition());
    c.allPieces.add(queen);
    System.out.println("----------------------------------");

    ChessBox boxToMoveTo = c.boxes[7][0];
    boolean check = queen.checkMoveValidity(c, boxToMoveTo);
    assertEquals(true, check);
  }

  /**
   * Tests all possible Rook Moves by a Queen
   * @throws Exception
   */
  @Test
  public void testRookMoveValidity() throws Exception {
    ChessBoard c = new ChessBoard();
    SetBoard s = new SetBoard(c, false);
    Piece queen;
    ChessBox boxToPutIn;
    boxToPutIn = c.boxes[0][7];
    queen = new Queen("white", boxToPutIn);
    System.out.println(queen.getCurrentPosition());
    c.allPieces.add(queen);
    System.out.println("----------------------------------");

    ChessBox boxToMoveTo = c.boxes[7][7];
    boolean check = queen.checkMoveValidity(c, boxToMoveTo);
    assertEquals(true, check);

    boxToMoveTo = c.boxes[0][0];
    check = queen.checkMoveValidity(c, boxToMoveTo);
    assertEquals(true, check);
  }

  /**
   * Tests all possible Rook Moves by a Queen
   * @throws Exception
   */
  @Test
  public void testCornerCase() throws Exception {
    ChessBoard c = new ChessBoard();
    SetBoard s = new SetBoard(c, false);
    Piece queen;
    ChessBox boxToPutIn;
    boxToPutIn = c.boxes[3][7];
    queen = new Queen("white", boxToPutIn);
    System.out.println(queen.getCurrentPosition());
    c.allPieces.add(queen);
    System.out.println("----------------------------------");

    ChessBox boxToMoveTo = c.boxes[3][6];
    boolean check = queen.checkMoveValidity(c, boxToMoveTo);
    assertEquals(true, check);

    boxToMoveTo = c.boxes[4][6];
    check = queen.checkMoveValidity(c, boxToMoveTo);
    assertEquals(true, check);
  }

  /**
   * Tests all possible Rook Moves by a Queen
   * @throws Exception
   */
  @Test
  public void testAnotherCase() throws Exception {
    ChessBoard c = new ChessBoard();
    SetBoard s = new SetBoard(c, false);
    Piece queen;
    ChessBox boxToPutIn;
    boxToPutIn = c.boxes[0][4];
    queen = new Queen("white", boxToPutIn);
    System.out.println(queen.getCurrentPosition());
    c.allPieces.add(queen);
    System.out.println("----------------------------------");

    ChessBox boxToMoveTo = c.boxes[3][7];
    boolean check = queen.checkMoveValidity(c, boxToMoveTo);
    assertEquals(true, check);
  }
}
