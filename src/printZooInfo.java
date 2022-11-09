public class printZooInfo {
    private void printZooInfo(boolean isWeekend){
        final int giraffe = 5;
        final long lemur;
        if (isWeekend) lemur = 5;
        else lemur = 10;
        System.out.println(giraffe+ " "+lemur);


        final StringBuilder cobra = new StringBuilder();
        cobra.append("Hi");
        cobra.append(" Wheel");

    }

    public static void main(String[] args) {
        printZooInfo zoo = new printZooInfo();
        zoo.printZooInfo(true);
    }
}
