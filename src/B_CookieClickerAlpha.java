import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;


public class B_CookieClickerAlpha {

	private static double calTime(double C, double F, double X){
		double result = Double.MAX_VALUE/10;
		double preresult = Double.MAX_VALUE;
		double curCookies = 0.0;
		double curSpeed = 2.0;
		double curTimeUsed = 0.0;
		
		while (preresult >= result){
			// as long as current result is less than prev, keep going.
			preresult = result;
			//assuming from this round, we don't increase speed, only go direct to X
			result = X / curSpeed + curTimeUsed;
			// now modify speed, as if we only increase speed this round
			curTimeUsed += C/curSpeed;
			curSpeed += F;
		}
		
		return preresult;
		
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
		
		for (int i = 1; i<=numTests; i++){
			double C= sIn.nextDouble();
			double F = sIn.nextDouble();
			double X = sIn.nextDouble();
			//System.out.println(C);
			//System.out.println(F);
			//System.out.println(X);
			System.out.println("Case #" + i + ": " + calTime(C, F, X));
		}
	}
}
