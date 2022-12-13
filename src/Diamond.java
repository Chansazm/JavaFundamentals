import java.util.*;

public class Diamond {

    List<Integer> list1 = new ArrayList<>();
    Map<String, Integer> map = new HashMap<>();
    Map<Long,List<Integer>> mapOfLists = new HashMap<>();
    Collection<String> set = new HashSet<>();
    Collection<String> list = new ArrayList<>();
    Collection<String> map1 = new TreeSet<>();
    Collection<String> LList = new LinkedList<>();
    static Collection<String> birds = new ArrayList<>();

    public static void main(String[] args) {

        System.out.println(birds.isEmpty());
        Queue<Integer> queue = new LinkedList<>();

        System.out.println(queue.offer(10));

        Map<String, String> map = new HashMap<>();
        map.put("Koala","Bamboo");
    }

}
