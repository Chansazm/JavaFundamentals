public class IceCream {
    enum Flavors{
        CHOCOLATE, STRAWBERRY, VANILLA
    }

    public static void main(String[] args) {
        Flavors STRAWBERRY = null;
        switch (STRAWBERRY){
            //case Flavors.VANILLA: System.out.println("V");
            //case Flavors.CHOCOLATE: System.out.println("C");
            //case Flavors.STRAWBERRY: System.out.println("s");
            //break;
            default:
                System.out.println("Missing Flavor");
        }
    }
}
