public class Ghost {
    public static void boo() {
        System.out.println("Not scared");
    }
    protected  class Spirit {
        public void boo() {
            System.out.println("Boo!!!");
        }
    }
    public static void main(String[] haunt) {
        var g = new Ghost().new Spirit() {};
        g.boo();
        Ghost.boo();
        new Ghost().boo();

    }


}
