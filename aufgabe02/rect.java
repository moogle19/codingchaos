
import java.util.ArrayList;

public class rect {

	public static void main(String[] args) {
		int l = Integer.parseInt(args[0]);
		int h = Integer.parseInt(args[1]);
		
		ArrayList stack = new ArrayList();
		while(l >= 0 && h >= 0){
			if(l > h){// weiter als hoch
				stack.add(h);
				l -= h;
			}
			else if(l < h){ // hoeher als weit
				stack.add(l);
				h -= l;
			}
			else{// gleich gross
				stack.add(h);
				h -= l;
				l -= h;
				break;
			}
		}
		for(int i = 0; i < stack.size();i++){
			System.out.println(stack.get(i));
		}
	}


}


