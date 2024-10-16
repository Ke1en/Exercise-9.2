public class Car implements Vehicle{
    @Override
    public void start() {
        System.out.println("Завел жигуль с пол пинка");
    }

    @Override
    public void stop() {
        System.out.println("Жигуль заглох на повороте");
    }
}
