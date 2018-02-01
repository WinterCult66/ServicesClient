//MAIN CLASS
package com.emida.webservice;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/* @author krodriguez */
public class NewMain {

    

    public static void main(String[] args) throws IOException {

        /* This is how to declare HashMap */
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();

        /*Adding elements to HashMap*/
        hmap.put(12, "Chaitanya");
        hmap.put(2, "Rahul");
        hmap.put(7, "Singh");
        hmap.put(49, "Ajeet");
        hmap.put(3, "Anuj");
        
        System.out.println("Valor 3 "+hmap.get(3));


        
        for (Map.Entry<Integer, String> entry : hmap.entrySet()){
            System.out.println(entry.getKey()+"/"+entry.getValue());
        }
        
        
        
        Set set = hmap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry) iterator.next();
            System.out.print("key is: " + mentry.getKey() + " & Value is: ");
            System.out.println(mentry.getValue());
        }


    }
}
