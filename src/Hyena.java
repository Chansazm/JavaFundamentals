import java.util.function.Predicate;
@Hazard(danger = 100, description = "Teeth")
public class Hyena {
    private int age = 1;

    public static void main(String[] args) {
        var p = new Hyena();
        double height = 10;
        int age = 1;
        testLaugh(p,var ->p.age <=10);
//        testLaugh(h -> h.age < 5);
        age = 2;
    }
    static void testLaugh(Hyena panda, Predicate<Hyena> joke){
        var r = joke.test(panda) ? "hahaha": "Silence";
        System.out.println(r);
    }
}
