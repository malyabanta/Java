package MapImplementation;

import java.util.Map;
import java.util.TreeMap;

public class UDCdriver {

    public static void main(String[] args)
    {
        TreeMap map1 = new TreeMap<Student, Integer>(new SortUDC());
        map1.put(new Student("Malyabanta",33),1);
        map1.put(new Student("Akash", 23),2);
        map1.put(new Student("Chaesle", 54),3);

        // Iterate map

        System.out.println("Key set"+map1.keySet());

       /* for (Map.Entry<Student, Integer> entry :
                map1.entrySet()) {
            System.out.println("Key : (" + entry.getKey()
                    + "), Value : "
                    + entry.getValue());
        }

        TreeMap map = new TreeMap();
        map.put("abc","wer");
        map.put("xyx","we23r");
        map.put("ktm","wsdfser");

        for(Map.Entry<String, String > entry: map.entrySet())
        {

        }*/


    }
}
