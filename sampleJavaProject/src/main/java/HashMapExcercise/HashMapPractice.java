package HashMapExcercise;

import java.util.*;

public class HashMapPractice {

    public void simpleHashmap()
    {
        HashMap hashMap = new HashMap<String, Integer>();
        hashMap.put("test",1);
        hashMap.put("test123",2);
        hashMap.put("test345",3);


        Set<Map.Entry<String, Integer>> value =  hashMap.entrySet();
        int count = 0 ;

        for(HashMap.Entry entry : value)
        {
            System.out.println(entry.getKey() +" -> "+entry.getValue());
            count++;

    }
        System.out.println("count "+count);
    }

    public void iterateHashMap(HashMap hashMap)
    {
        Set<Map.Entry<String, Integer>> value =  hashMap.entrySet();
        for(HashMap.Entry entry : value)
        {
            System.out.println(entry.getKey() +" -> "+entry.getValue());

        }

    }

    public void PrintReverse(HashMap hashMap)
    {
        Set<String> arrlist = hashMap.keySet();

        Iterator itr = arrlist.iterator();
        while(itr.hasNext())
        {
            System.out.println();
        }



    }




    public static void main(String [] args)
    {
        HashMapPractice obj = new HashMapPractice();
        obj.simpleHashmap();
    }




}
