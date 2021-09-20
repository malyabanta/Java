package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ImplementArrayList {

    public void ArrayListUse()
    {
        ArrayList arr = new ArrayList<String>();
        arr.add("adi");
        arr.add("tst");
        arr.add("ks");



        Iterator itr = arr.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());

        }
    }

    public static void main(String[] args)
    {
        ImplementArrayList obj = new ImplementArrayList();
        obj.ArrayListUse();
    }
}
