public class Tinderprofile {
    public String name;
    public int age;
    public String datingStatus;

    public boolean hotOrNot;

    public Tinderprofile(String name, int age, String datingStatus, boolean hotOrnot) {
        System.out.println("Up and running");
        this.name = name;
        this.age = age;
        this.datingStatus = datingStatus;
        this.hotOrNot = hotOrnot;

    }
    public String toString() {
       return "The users name is: " + name + " and " + name + " is " + age + " years old. " + name
               + " is currently " + datingStatus + " and let us see if they are hot or not; " + hotOrNot;
    }
}
