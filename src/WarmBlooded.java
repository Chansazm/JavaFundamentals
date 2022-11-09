public class WarmBlooded implements IsWarmBlooded{
    @Override
    public boolean hasScales() {
        return false;
    }

    @Override
    public double getTempreture() {
        return IsWarmBlooded.super.getTempreture();
    }
}
