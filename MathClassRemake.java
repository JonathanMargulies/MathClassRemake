import java.lang.Math;
public class MathClassRemake {
	public static void main(String [] args) {
		System.out.println(xToPowerOfn(2, 10));
		System.out.println(SumOfyAndz(5,5));
		System.out.println(SqrtPlusOthers(64,-4,3));
		System.out.println(RandomizeNum(5));
		System.out.println(WhichIsGreater(5, 2));
		System.out.println(WhichIsSmaller(6, 7));
		System.out.println(RoundNum(7.2));
		System.out.println(CeilNum(5.7));
		System.out.println(FloorNum(4.62));
	}



	public static double xToPowerOfn(double x, double n) {
		return Math.pow(x, n);
	}
	public static int SumOfyAndz(int y, int z) {
		return y+z;
	}
	public static double SqrtPlusOthers(double x, double g, double f) {
		x = Math.sqrt(x);
		g = Math.abs(g);
		f = Math.pow(f, g);
		return x + g + f;
	}
	public static double RandomizeNum(double Num) {
		double NumTimesRandomNum = Num + (int)(Math.random()*10);
		return NumTimesRandomNum;
	}
	public static int WhichIsGreater(int Hello, int Hi) {
		int GreaterNum = Math.max(Hello, Hi);
		return GreaterNum;
	}
	public static int WhichIsSmaller(int Six, int Seven) {
		int SmallerNum = Math.min(Six, Seven);
		return SmallerNum;
	}
	public static double RoundNum(double SevenPoint2) {
		double RoundedNum = Math.round(SevenPoint2);
		return RoundedNum;
	}
	public static double CeilNum(double FivePointSeven) {
		double CeiledNum = Math.ceil(FivePointSeven);
		return CeiledNum;
	}
	public static double FloorNum(double FourPointSixTwo) {
		double FlooredNum = Math.floor(FourPointSixTwo);
		return FlooredNum;
	}
}
