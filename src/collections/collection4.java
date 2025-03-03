package collections;
 import java.util.ArrayList;
 import  java.util.Collection;
public class collection4 {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add(100);
        al.add(200);
        al.add(300);
        al.add(0,50000);
        al.add("bbb");

        System.out.println(al);

        ArrayList al2=new ArrayList();
        al2.add("aaa");
        al2.add("bbb");
        al2.add("ccc");
        al2.add("aaa");
        System.out.println(al2);

        al.addAll(al2);
        System.out.println(al);
      System.out.println(al.add("kkk"));//boolean value return importance
        System.out.println(al.contains(500));
        System.out.println(al.isEmpty());
        System.out.println(al.size());
        System.out.println(al.remove(0));
        al.remove("ccc");
        System.out.println(al);
        al.removeAll(al2);
        System.out.println(al);
        System.out.println(al.containsAll(al2));
        System.out.println(al.size());
        al.clear();
        System.out.println(al);
    }

}
