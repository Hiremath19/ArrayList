package ArrayList1;

import java.util.*;

public class ArrayList1
{
    public static void main(String [] args)
    {
        ArrayList a=new ArrayList<>();
        a.add("bharat");
        a.add("shahsi");
        a.add("sagar");
        a.add("sunil");
        a.add("veeresh");
        a.add("bharat");
        a.add("shahsi");
        System.out.println(a);
        a.remove(2);
        System.out.println(a.size());
        Collections.sort(a);
        System.out.println(a);


        System.out.println();

        LinkedList l =new LinkedList();
        l.add("bharat");
        l.add("durga");
        l.add("nagesh");
        l.add("jagadish");
        l.add("maltesh");
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        System.out.println(l);
        l.set(0,"software");
        System.out.println(" size of the list is" +l.size());


        System.out.println(l);

        System.out.println("get spefied name:");
        System.out.println(l.get(2));

        System.out.println(l);

        l.addFirst("good morning");
        System.out.println(l);

        System.out.println();


        HashSet h = new HashSet();
        String[] s={"B","C","A","B","C","A","B","E","F","L"};

        System.out.println();

        System.out.println("duplictes remove using hashset");
        System.out.println();

        h.addAll(Arrays.asList(s));

        System.out.println(h);


    }
}
