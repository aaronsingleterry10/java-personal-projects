public class MySecondGuitar extends Guitar implements Electric {
    public MySecondGuitar(String brand, String model, String type) {
        super(brand, model, type);
    }

    @Override
    public void pluggingGuitarCable() {
        System.out.println("Taking out ErnieBall cable from bag and plugging it in to strat...");
    }

    @Override
    public void pluggingToAmp() {
        System.out.println("Plugging in other end of the cable to Deluxe Reverb amp...");
    }
}
