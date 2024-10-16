public class Car extends Vehicle{

    private final String make = "BMW";

    protected String honk() {
        return "BMW is honking";

    }

    public Car(String model) {
        super(model);
    }

    @Override
    public String start() {
     return "BMW is starting";
    }

    @Override
    public String stop() {
        return "BMW is stopping";
    }
}
