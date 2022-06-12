import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Listlearn {
    public static void main (String [] args){
        ArrayList l = new ArrayList();
        l.add(2);
        l.add("3");
        l.add("9");
        l.add(true);
        l.add(null);
        System.out.println(l);
        l.remove(true);
        l.set(2, "honey");
        System.out.println(l);
        List l1 = Collections.synchronizedList(l);
        System.out.println(l1);

        LinkedList ll = new LinkedList(l);
        ll.addFirst("A");
        Object o = ll.getFirst();
        System.out.println(o);
        System.out.println(ll);

        Vector v = new Vector(ll);
        System.out.println(v);
        Object o1 = ll;
        System.out.println(v.capacity());
        v.add(o1);
        System.err.println(v);
    
        Stack s = new Stack();
        s.push("a");
        s.push("b");
        s.push("c");
        s.push("d");
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.search("b"));

        Enumeration e = v.elements();
        while(e.hasMoreElements()){
            Object s1 = (Object)e.nextElement();
            System.out.println(s1);
        }
        

    }
}
