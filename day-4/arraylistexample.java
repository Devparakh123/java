import java.util.ArrayList;
import java.util.Scanner;
public class arraylistexample {
    public static void main(String[] args) {

        Scanner in  = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(10);
        //    list.add(23);
        //    list.add(24);
        //    list.add(25);
        //    list.add(26);
        //    list.add(27);
        //    list.add(28);
        //    list.add(23);

        //    list.add(23); 
        //      list.add(23);
        //    list.add(23);
        //    list.add(23);
        //      list.set(0,50);
        //      list.remove(1);
        //    System.out.println(list.contains(23));
        //        System.out.println(list);

               for (int i = 0; i < 5; i++) {
                list.add(in.nextInt());
               }
               for (int i = 0; i < 5; i++) {
                System.out.println(list.get(i));
               }
            //    System.out.println(list);
    }
}
