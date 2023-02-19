public class Main {

    public static void main(String[] args) {
        Dog thello = new Dog("Thello", 12, true);
        Dog lina = new Dog("Lina", 3, false);
        System.out.println(thello);
        System.out.println(lina);



        Recipe specialJapanese = new Recipe("chicken", true, 10);
        System.out.println(specialJapanese);

        Tinderprofile rachel = new Tinderprofile("Rachel", 69, "single", true);
        System.out.println(rachel);

        Instrument trumpet = new Instrument("trumpet", 8, "yellow", true);
        System.out.println(trumpet);

        Instrument guitar = new Instrument("guitar", 6, "brown", false);
        System.out.println(guitar);

        Lamp bosch = new Lamp(true);
        System.out.println(bosch);

        bosch.toggleLight(true);


        Dognew fiddo = new Dognew(2, 1 ,8);
        fiddo.energyRaiser();

        }

            }




