public interface IsWarmBlooded {
    boolean hasScales();
    default double getTempreture(){
        return 10.0;
    }


}
