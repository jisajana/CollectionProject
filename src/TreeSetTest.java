import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet mySet = new TreeSet();
        System.out.println("Set is ready");

        mySet.add(12);
        mySet.add(8);
        mySet.add(4);
        mySet.add(10);
        mySet.add(2);

        System.out.println("contents added to the set");

        System.out.println("Tree Set " + mySet + "\n");

        Iterator myIterator = mySet.iterator();
        while (myIterator.hasNext()){
            Object obj = myIterator.next();
            // int value = (int)obj;
            System.out.println("value: " + obj);
        }

        System.out.println("======================================");

        TreeSet mySet2 = new TreeSet();
        System.out.println("Set2 is ready");

        mySet2.add(29);
        mySet2.add(2);
        mySet2.add(3);
        mySet2.add(5);
        mySet2.add(7);
        mySet2.add(11);
        mySet2.add(13);
        mySet2.add(17);
        mySet2.add(19);
        mySet2.add(23);
        mySet2.add(29);

        System.out.println("contents added to the Set2");

        System.out.println("Tree Set2 " + mySet2 + "\n");

        Iterator myIterator2 = mySet2.iterator();
        while (myIterator2.hasNext()){
            Object obj = myIterator2.next();
            // int value = (int)obj;
            System.out.println("value: " + obj);
        }

        System.out.println("======================================");

        TreeSet mySet3 = new TreeSet();
        System.out.println("Set3 is ready");

        mySet3.add(0);
        mySet3.add(1);
        mySet3.add(153);
        mySet3.add(370);
        mySet3.add(371);
        mySet3.add(407);


        System.out.println("contents added to the Set3");

        System.out.println("Tree Set3 " + mySet3 + "\n");

        Iterator myIterator3 = mySet3.iterator();
        while (myIterator3.hasNext()){
            Object obj = myIterator3.next();
            // int value = (int)obj;
            System.out.println("value: " + obj);
        }
    }
}


