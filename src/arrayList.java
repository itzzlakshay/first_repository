import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class arrayList {

    static void reverseList(ArrayList<Integer> list){
        int i =0;
        int j = list.size() -1;
        while(i<j){
            Integer temp = Integer.valueOf(list.get(i));
            list.set(i,list.get(j));
            list.set(j,temp);
            i++;
            j--;
        }
    }


    public static void main(String[] args) {
        // wrapper class
        Integer a = Integer.valueOf(3);
        System.out.println(a);

        ArrayList <Integer> l1 = new ArrayList<>();

        // add new element
        l1.add(3);
        l1.add(5);
        l1.add(9);
        l1.add(7);

        // get an element at index i
        System.out.println(l1.get(2));

        // print element using loop
        for(int i=0; i<l1.size() ; i++){
            System.out.print(l1.get(i) + " " );
        }

        // printing array directly
        System.out.println(l1);

        // adding element at some index
        l1.add(1,2);
        System.out.println(l1);

        // modify an element at index i
        l1.set(1,20);
        System.out.println(l1);

        // remove an element from index i
        l1.remove(1);
        System.out.println(l1);

        // remove an element without knowing its index
        l1.remove(Integer.valueOf(7));
        System.out.println(l1);

        // checking if an element exist or not
        Boolean ans = l1.contains(Integer.valueOf(9));
        System.out.println(ans);

        // if we don't specify wrapper class , then we can put anything
        ArrayList l2  = new ArrayList();
        l2.add("hey");
        l2.add(2);
        l2.add(true);
        System.out.println(l2);


        // program to reverse an array list
        ArrayList <Integer> list = new ArrayList <> ();
        list.add(7);
        list.add(3);
        list.add(9);
        list.add(1);
        list.add(2);
        System.out.println(" orignal list " + list);
//        reverseList(list);
//        System.out.println("reversed list " + list);

        // print reverse array list directly using collection method
        Collections.reverse(list);
        System.out.println(list);

        // sorting array list using collection method directly
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);




    }
}
