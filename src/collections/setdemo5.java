package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class setdemo5 {
    public static void main(String[] args) {
        Set l=new HashSet();
//        repitation is eliminated
        l.add(400);
        l.add(300);
        l.add(200);
        l.add(100);
        l.add(400);
        l.add(300);
        l.add(200);
        l.add(500);
        l.add(null);
        l.add(null);
        System.out.println(l);

    }
}
