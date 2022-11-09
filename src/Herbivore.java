public interface Herbivore {
    int amount = 10;
    static boolean gather = true;
    static void eatgrass(){}
    private int findMore(){return 2;}
    default float rest(){return 2;}
    private int chew(){return 13;}
    private static void eatLeaves(){}
}
