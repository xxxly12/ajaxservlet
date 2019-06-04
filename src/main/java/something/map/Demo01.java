package something.map;

import java.util.ArrayList;
import java.util.HashMap;

public class Demo01 {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("AAAA1","aaaa1");
        hashMap.put("AAAA2","aaaa2");
        hashMap.put("AAAA3","aaaa3");
        hashMap.put("AAAA4","aaaa4");
        ArrayList<HashMap<String, String>> list = new ArrayList<>();
        list.add(hashMap);
        hashMap.clear();
        System.out.println(list.toString());
    }
}
