package a2;

import java.util.ArrayList;
import java.util.List;

public class Rect {

	static List<Integer> ints = new ArrayList<Integer>();

	public static void main(String[] args) {
		
		int length = Integer.parseInt(args[0]);
		int height = Integer.parseInt(args[1]);
				
		calcRects(length, height);
		
		while(!ints.isEmpty())
		{
			int index = getMax(ints);
			System.out.print(ints.get(index) + ",");
			ints.remove(index);
		}
	}

	public static void calcRects(int length, int height)
	{
		if(height < length)
		{
			ints.add(height);
			calcRects(height, (length - height));
		}
		else if(height > length)
		{
			ints.add(length);
			calcRects((height-length), length);
		}
		else
			ints.add(length);
	}
	
	public static int getMax(List<Integer> listint)
	{
		int max = 0;
		int index = 0;
		
		for(int i = 0; i < listint.size(); i++)
		{
			if(listint.get(i) > max)
			{
				max = listint.get(i);
				index = i;
			}
		}
		
		return index;
	}
}
