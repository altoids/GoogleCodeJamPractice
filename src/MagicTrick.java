import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;


public class MagicTrick {

	private static String[] getAnswerLine(Scanner sIn, int row){
		String[] oneNumLine = null;
		String oneline = null;
		for (int j= 0; j<4; j++){
			if(j+1 == row){
				// retrieve the answered line
				oneline = sIn.nextLine();
				oneNumLine = oneline.split(" ");
			}else{
				//ignore this line
				oneline = sIn.nextLine();
			}
			
		}
		return oneNumLine;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sIn = new Scanner(System.in);
		try {
		    System.setOut(new PrintStream(new File("jamresult.out")));
		} catch (Exception e) {
		     e.printStackTrace();
		}
		int numTests = Integer.parseInt(sIn.nextLine());
		for (int i = 0; i< numTests; i++){
			int firstAns = Integer.parseInt(sIn.nextLine());
			String[] firstAnsNumLine = getAnswerLine(sIn, firstAns);
			int secondAns = Integer.parseInt(sIn.nextLine());
			String[] secondAnsNumLine = getAnswerLine(sIn, secondAns);
			int countSameNum = 0;
			String val = null;
			for(int j = 0; j<4; j++){
				for (int k = 0; k<4; k++){
					if (firstAnsNumLine[j].equals(secondAnsNumLine[k])){
						countSameNum++;
						val = firstAnsNumLine[j];
					}
				}
			}
			
			if (countSameNum == 0)
				System.out.println("Case #" + (i+1) +": Volunteer cheated!");
			else if (countSameNum > 1)
				System.out.println("Case #" + (i+1) +": Bad magician!");
			else if (countSameNum == 1)
				System.out.println("Case #" + (i+1) +": " + val);
			
		}
	}
}
