public class Instrument {
    public String type;
    public int loudness;
    public String color;
    public boolean mouthPiece;

    public Instrument(String type, int loudness, String color, boolean mouthPiece) {
        System.out.println("Running");
        this.type = type;
        this.loudness = loudness;
        this.color = color;
        this.mouthPiece = mouthPiece;
    }
    public String toString(){
       return "Instrument is a: " + type + ". The loudness is: " + loudness + " out of 10. The instrument is "
               + color + ". It has a mouthpiece: " + mouthPiece;
    }
}
