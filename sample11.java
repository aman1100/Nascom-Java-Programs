import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;



public class sample11 {
    public static ArrayList<Integer> getKeys(LinkedHashMap<Integer, String> linkedHashMap) {
        Set<Integer> keySet = linkedHashMap.keySet();
        ArrayList<Integer> keys = new ArrayList<>();
        ArrayList<String> values = new ArrayList<>();
        for (Integer key : keySet) {
            String value = linkedHashMap.get(key);
            values.add(value);
        }

        String dup = "";
        for (String str: values) {
            if (Collections.frequency(values, str) > 1 && !str.equals(dup)) {
                dup = str;
                for (Map.Entry<Integer, String> entry: linkedHashMap.entrySet()) {
                    if (entry.getValue().equals(str)) {
                        keys.add(entry.getKey());
                    }
                }
            }
        }

        return keys;
    }

    public static void main(String[] args) {
        LinkedHashMap<Integer, String> hm = new LinkedHashMap<>();
        hm.put(105, "Rajnish");
        hm.put(103, "Suraj");
        hm.put(101, "Surya");
        hm.put(104, "Siva");
        hm.put(102, "Syam");
        hm.put(106, "Surya");

        System.out.println(getKeys(hm));
    }
}