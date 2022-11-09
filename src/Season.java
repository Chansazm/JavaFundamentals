import java.lang.Runnable;

public enum Season {
    WINTER, SUMMER, SPRING, FALL;

    //Season s =  Season.SUMMER;

//    #for(Season season : Season.Values()){
//        System.out.println(Season.values());
//        System.out.println(Season.name() + " "+Season.ordinal());
//    }

    Runnable run = new Runnable() {
        @Override
        public void run() {
            System.out.println("Hello");
        }
    };

    Runnable snake = ()-> System.out.println("Hello world");

}
