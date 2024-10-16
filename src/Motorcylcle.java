public class Motorcylcle extends Vehicle{
    public Motorcylcle(String model) {
        super(model);
    }

    @Override
    public String start() {
        return "Yamaha R3 is starting";
    }

    @Override
    public String stop() {
        return "Yamaha R3 is stopping";
    }

    @Override
    protected String honk() {
        return "Yamaha R3 is honking";
    }
}
