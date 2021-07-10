import java.util.HashMap;
import java.util.TreeMap;

public class class_07 {

    public static class Node{
        public int value;

        public Node(int v){
            value = v;
        }
    }

    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        treeMap.put(1,"I am 1");
        treeMap.put(2,"I am 2");
        treeMap.put(9,"I am 9");
        treeMap.put(5,"I am 5");
        treeMap.put(7,"I am 7");
        System.out.println(treeMap.containsKey(2));
        System.out.println(treeMap.firstKey());

    }
}
