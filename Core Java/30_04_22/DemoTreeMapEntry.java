//demo map entry using tree map
import java.util.*;
import java.util.Map.Entry;
public class DemoTreeMapEntry
{
    public static void main(String[] args)
    {
        TreeMap<Integer,String>map1;
        map1=new TreeMap<>();
        map1.put(10,"A");
        map1.put(20,"B");
        map1.put(30,"B");
        map1.put(40,"C");
        map1.put(50,"D");
        System.out.println(map1);

        //ready all keys
        Set<Integer>keys;
        keys=map1.keySet();
        System.out.println("Keys......");
        for(Integer k:keys)
        {
            System.out.println(k);
        }

        //###################//#endregion
        Collection<String>values;
        values=map1.values();
        System.out.println("Values.....");
        for(String v:values)
        {
            System.out.println(v);
        }
        System.out.println("Iteams....");
        Set<Entry<Integer,String>>items;
        items=map1.entrySet();
        for(Entry<Integer,String>e1:items)
        {
            System.out.println(e1.getKey()+":"+e1.getValue());
        }

    }
}