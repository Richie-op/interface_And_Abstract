public abstract class Vehicle implements Drivable {
    private String model;


    public Vehicle(String model){
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    protected abstract String honk();
}
