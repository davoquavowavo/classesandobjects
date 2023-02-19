
public class Dog{
    public String name;
    public int age;
    public boolean isEnergetic;
    public Dog(String name, int age, boolean isEnergetic) {
        System.out.println("Is in constructor method");
        System.out.println(name);
        this.name = name;
        this.age = age;
        this.isEnergetic = isEnergetic;

    }
    public String toString() {
        return "Cat:" + name + "," + "Age:" + age + "," + "isEnergetic:" + isEnergetic;
    }

}

