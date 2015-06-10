public class mbultmann_02 {
	public static String SquareInRectangle(int length, int heigth){
		if(!(length ==  heigth)){
			if(length > heigth){
				return heigth + " " + SquareInRectangle(length - heigth, heigth);
			}
			else{
				return length + " " + SquareInRectangle(length, heigth - length);
			}
		}
		else{
			return length + " ";
		}
	}
	
	public static void main(String[] args){
		int heigth = Integer.parseInt(args[0]);
		int length = Integer.parseInt(args[1]);
		System.out.println(SquareInRectangle(length, heigth));
	}
}
