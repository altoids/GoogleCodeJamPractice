import java.io.File;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Scanner;


public class C_MineSweepMaster {
	private static boolean judgePossibility(char[][] board, int mineCnt, int rowCnt, int colCnt){
		if (mineCnt >= rowCnt * colCnt )
			return false;
		if (mineCnt == rowCnt * colCnt -1)
			return true;
		
		return true;
	}
	
	private class Point{
		int row;
		int col;
		Point(int row, int point){
			this.row = row;
			this.col = col;
		}
	}
	//given a board with mines filled, and click row and col, judge if this click can win the game
	private boolean isClickWorking(char[][] board, int rowCnt, int colCnt, int clickRow, int clickCol){
		boolean result = false;
		Stack<Point> q = new LinkedList<Point>();
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sIn = new Scanner(System.in);
		/*try {
		    System.setOut(new PrintStream(new File("jamresult.out")));
		} catch (Exception e) {
		     e.printStackTrace();
		}*/
		int numTests = Integer.parseInt(sIn.nextLine());
		for (int i = 1; i<=numTests; i++){
			int R= sIn.nextInt();
			int C = sIn.nextInt();
			int M = sIn.nextInt();
			char[][] board = new char[R][C];
			for (int j = 0; j< R; j++)
				for (int k = 0; k<C; k++)
					board[j][k] = '.';
			
			boolean result = judgePossibility(board, M, R, C);
			System.out.println("Case #" + i + ":");
			if (!result)
				System.out.println("Impossible");
			else {
				for (int j = 0; j< R; j++){
					for (int k = 0; k<C; k++)
						System.out.print(board[j][k]);
					System.out.println("");
				}
			}
				
			
			//System.out.println(C);
			//System.out.println(F);
			//System.out.println(X);
			
		}

	}

}
