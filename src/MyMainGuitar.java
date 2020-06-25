public class MyMainGuitar extends Guitar implements Electric {
    public MyMainGuitar(String brand, String model, String type) {
        super(brand, model, type);
    }

    public void pluggingGuitarCable() {
        System.out.println("Taking out Mogami cable from bag, uncoiling it and plugging it to guitar...");
    }

    public void pluggingToAmp() {
        System.out.println("Plugging other end of cable to Mesa Boogie...");
    }
}
