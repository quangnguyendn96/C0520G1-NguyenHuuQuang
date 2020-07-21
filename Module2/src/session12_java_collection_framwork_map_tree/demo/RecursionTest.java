package session12_java_collection_framwork_map_tree.demo;

public class RecursionTest {
    public static void print1(int i){
        System.out.println(i);
        if(i == 100) {
            return;
        }
        print1(++i);
    }
}
