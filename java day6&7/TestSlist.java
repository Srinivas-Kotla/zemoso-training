/**
 * Created by zemoso on 24/7/17.
 */
import java.util.*;
public class TestSlist{
    public static void main(String[] args) {
        SList<Integer> list = new SList<Integer>();
        //System.out.println(head.toString());
        SListIterator<Integer> it = list.Iterator();
        System.out.println(list.toString());
        System.out.println(it.isEmpty());
        it.add(2);
        System.out.println(list.toString());
        it.remove();
        System.out.println(list.toString());
        it.addAtIndex(0,1);
        it.add(5);
        it.add(4);
        it.add(6);
        it.addAtIndex(3,3);
        it.addAtIndex(0,1);
        it.addAtIndex(2,100);
        it.removeAtIndex(0);
        it.removeAtIndex(0);
        it.removeAtIndex(0);
        it.removeAtIndex(3);
        //it.remove();
        System.out.println(it.isEmpty());
        System.out.println(list.toString());
    }
}


