public class Bicycle implements Vehicle{
    @Override
    public void start() {
        System.out.println("Лечу, а волосы назад");
    }

    @Override
    public void stop() {
        System.out.println("Колесо сдуло, дальше не уехать, придется идти пешком");
    }
}
