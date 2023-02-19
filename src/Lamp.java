public class Lamp {
    public static boolean turnedOn;

    public static int toggleCounter;

    





    public Lamp(boolean turnedOn) {
        System.out.println("Lamp working");
        this.turnedOn = turnedOn;
    }


    public static void toggleLight(boolean turnedOn) {
        if (turnedOn) {
            System.out.println("Light has been turned off");
        } else if (!turnedOn) {
            System.out.println("Light has been turned on");
        }
        toggleCounter++;
        System.out.println("The switch has been automatically toggled " + toggleCounter + " time(s)");
    }

};



            





















