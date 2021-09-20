package ListImplement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class UDCSortArrayList {

    public static void main(String[] args)
    {
        List lis = new ArrayList<student>();
        lis.add(new student("Malya",23));
        lis.add(new student("Calya",24));
        lis.add(new student("Aalya",43));
        System.out.println("before sorting" + lis.toString());
       // Collections.sort(lis);
       // System.out.println("after sorting" + lis.toString());


        Collections.sort(lis,new sortArrayListUDC());
        System.out.println("after custom sorting" + lis.toString());


    }
}
