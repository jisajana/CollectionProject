import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList myList = new ArrayList();
        System.out.println("Container is ready");

        myList.add(14);
        myList.add(4);
        myList.add(8);
        myList.add(10);
        myList.add(12);

        System.out.println("contents added to the container");

        System.out.println("Array List " + myList + "\n");

        Iterator myIterator = myList.iterator();
        while (myIterator.hasNext()){
            Object obj = myIterator.next();
            // int value = (int)obj;
            System.out.println("value: " + obj);
        }

        System.out.println("======================================");

        ArrayList myList2 = new ArrayList();
        System.out.println("Container2 is ready");

        myList2.add(2);
        myList2.add(3);
        myList2.add(5);
        myList2.add(7);
        myList2.add(11);
        myList2.add(13);
        myList2.add(17);
        myList2.add(19);
        myList2.add(23);
        myList2.add(29);

        System.out.println("contents added to the container2");

        System.out.println("Array List2 " + myList2 + "\n");

        Iterator myIterator2 = myList2.iterator();
        while (myIterator2.hasNext()){
            Object obj = myIterator2.next();
            // int value = (int)obj;
            System.out.println("value: " + obj);
        }

        System.out.println("======================================");

        ArrayList myList3 = new ArrayList();
        System.out.println("Container3 is ready");

        myList3.add(0);
        myList3.add(1);
        myList3.add(153);
        myList3.add(370);
        myList3.add(371);
        myList3.add(407);


        System.out.println("contents added to the container3");

        System.out.println("Array List3 " + myList3 + "\n");

        Iterator myIterator3 = myList3.iterator();
        while (myIterator3.hasNext()){
            Object obj = myIterator3.next();
            // int value = (int)obj;
            System.out.println("value: " + obj);
        }
    }
}
