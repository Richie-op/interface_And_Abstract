public class Main {
    public static void main(String[] args) {
Car bmw = new Car("M3");
Motorcylcle yamaha = new Motorcylcle("R3");

        System.out.println(bmw.start());
        System.out.println(bmw.stop());
        System.out.println(bmw.honk());

        System.out.println(yamaha.start());
        System.out.println(yamaha.stop());
        System.out.println(yamaha.honk());
    }
}