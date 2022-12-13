public @interface Hazard {
    int danger();//required element
    public String description() default "Fire";//optional element
    public static  final int UNKNOWN = -1;//constant variable
}
