public class Deer {
    enum Food{APPLES, BERRIES, GRASS}
    protected static class Diet{
        private Food getFavorite(){
            return Food.BERRIES;
        }
    }

    public static void main(String[] args) {
        switch (new Diet().getFavorite()){
            case APPLES:
                System.out.println("a");
            case BERRIES:
                System.out.println("B");
                break;
            default:
                System.out.println("C");
        }
    }
}
