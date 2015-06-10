import java.util.ArrayList;

public class aufgabe02 {
    public static  void main(String[] args) {
        int length = Integer.parseInt(args[0]);
        int height = Integer.parseInt(args[1]);

        ArrayList<Integer> list = new ArrayList<>();

        while(length > 0 && height > 0) {
            if(length > height) {
                list.add(height);
                length -= height;
            }
            else {
                list.add(length);
                height -= length;
            }
        }

        System.out.println(list);
    }
}
