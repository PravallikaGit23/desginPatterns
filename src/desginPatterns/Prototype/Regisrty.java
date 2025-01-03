package desginPatterns.Prototype;

import java.util.HashMap;
import java.util.Map;

public class Regisrty {
    Map<String , ClassmateNoteBook>  map = new HashMap();

    public void register(String key , ClassmateNoteBook noteBook){
        if(! map.containsKey(key))
             map.put(key , noteBook);
        else{
            System.out.println(key +" with " +map.get(key) + " is already registered. Please choose a different key");
        }
    }

    public ClassmateNoteBook get(String key){
        if(map.containsKey(key))
           return map.get(key);
        return null;
    }

    public void remove(String key){
        if(map.containsKey(key))
          map.remove(key);
    }

}
