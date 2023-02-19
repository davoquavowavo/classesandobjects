public class Dognew {
    public static int mood;

    public static int energy = 0;


    public static int hunger;

    public Dognew(int mood, int energy, int hunger) {
        this.mood = mood;
        this.energy = energy;
        this.hunger = hunger;
        System.out.println("Woof");
    }

    public static void moodRaiser(int mood){
        for (int d = 0; d < mood; d++) {
            if (mood > 10) {
                mood = 10;
            } else if (mood < 0) {
                mood = 0;
            }
        }
    }

    public static void hungerReducer(int hunger){
        for (int d = 10; d > hunger; d--) {
            if (hunger < 0) {
                hunger = 10;
            }
        }
    }

    public static void energyRaiser() {
        for (int i = 0; i < 11; i++){
            System.out.println("Fiddo's energy has been raised to: " + i);
        }


    }

            }




