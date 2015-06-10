class quadrate {
  public static void main( String[] args ) {
	String os = "";

	int a = Integer.parseInt(args[0]);
	int b = Integer.parseInt(args[1]);
	int mn = 0;
	while (a > 0)
	{
		mn = (a < b ? a : b);
		System.out.println(mn);
		os += " "+mn;
		if (a > b)a -= mn; else  b -= mn; 
	}
	System.out.println(os);
		
	
	
  }
}
