package HashMap;

import java.util.HashMap;

public class basic {

    public static void main(String[] args) {
         HashMap<String,Integer> map = new HashMap<>();

        //  map.put("priyanshu", 32);
        //  map.put("Ayushi", 64);

        //  System.out.println(map.keySet());
        //  System.out.println(map.get("priyanshu"));
        //  System.out.println(map.containsKey("Ayushi"));
        //  System.out.println(map.size());
        //  System.out.println(map.remove("Ayushi"));
        //  System.out.println(map.size());

        
         map.put("priyanshu", 32);
         map.put("Ayushi", 64);
          map.put("priyanshu", 100);
                map.put("Rahul", 64);
                System.out.println(map);
          
    }
    
}
