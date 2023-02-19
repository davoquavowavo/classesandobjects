public class Room {
    public static void main(String[] args) {
        Lamp newLamp = new Lamp(true);
        System.out.println(newLamp);

        newLamp.toggleLight(false);

        Lamp secondNewLamp = new Lamp(true);
        secondNewLamp.toggleLight(false);



    }
}
