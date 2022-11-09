public class Main {
    public static void main(String[] args) {
        System.out.println("Hi");
        Seasons s = Seasons.SUMMER;
        Seasons w = Seasons.WINTER;

        System.out.println(Seasons.SUMMER);
        Seasons.SUMMER.printExpectedVisitors();
        Seasons.WINTER.printExpectedVisitors();

        Outer outer = new Outer();
        outer.callInner();

        System.out.println(Hop.getJumpHeight());






            }
}
