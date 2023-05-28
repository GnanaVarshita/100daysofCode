package Gnana;
import java.util.ArrayList;
import java.util.Scanner;
public class Arraylistexp {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args){
        //Syntax
        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(67);
        list.add(67);
        list.add(67);
        list.add(67);
        list.add(67);
        list.add(67);
        list.add(67);
        list.add(67);list.add(67);
        list.add(67);
        list.add(67);
        list.add(67);
        list.add(67);
        list.add(67);

        System.out.println(list.contains(67));

        list.set(0,99);
        list.remove(2);
        System.out.println(list);

    }
}
