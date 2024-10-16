public class Boat implements Vehicle{
    @Override
    public void start() {
        System.out.println("Хожу по воде");
    }

    @Override
    public void stop() {
        System.out.println("Сбросить якорь");
    }
}
