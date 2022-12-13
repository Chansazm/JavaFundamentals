public class Animal2 implements Comparable<Animal2>{
    private int id;
    public int compareTo(Animal2 a){
        return id - a.id;
    }

    public static void main(String[] args) {

    }
}
