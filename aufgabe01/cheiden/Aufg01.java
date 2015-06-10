public class Aufg01{
	public static void main(String[] args) {
		String[] ret = create(Integer.parseInt(args[0]));
		for (int i = 0; i < ret.length; i++) {
			System.out.println(ret[i]);
		}
	}

	private static String[] create(int n){
		String[] ret = new String[n+1];
		for (int i = 1; i < ret.length; i++) {

			String s = "";
			if (i%3 == 0){
				s += "Fizz";
			} 

			if (i%5 == 0) {
				s += "Buzz";
			}

			if (s.equals("")){
				s += i;
			}
			ret[i-1] = s;
		}
		return ret;
	}
}

