public class PlayingGuitar {
    public static void main(String[] args) {
        Electric guitar1 = new MyMainGuitar("Fender", "Telecaster", "Electric");
        guitar1.pluggingGuitarCable();
        guitar1.pluggingToAmp();

        Electric guitar2 = new MySecondGuitar("Gibson", "Les Paul", "Electric");
        guitar2.pluggingGuitarCable();
        guitar2.pluggingToAmp();
    }
}
