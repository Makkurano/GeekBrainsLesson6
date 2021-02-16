public class Dog extends Animal {

    public Dog(String name, int runLimit, int swimLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
    }

    public void run(int i) {
        if (i <= this.runLimit && i > 0) {
            System.out.println("Собака по кличке " + this.name + " пробежала " + i + " метров");
        } else if (i == 0) {
        System.out.println("Собака по кличке " + this.name + " решила вообще не вставать");
        } else {
            System.out.println("Собака по кличке " + this.name + " не умеет бегать так далеко");
        }
    }

    public void swim(int i) {
        if (i <= this.swimLimit && i > 0) {
            System.out.println("Собака по кличке " + this.name + " проплыла " + i + " метров");
        } else if (i == 0) {
            System.out.println("Собака по кличке " + this.name + " решила вообще не плавать");
        } else {
            System.out.println("Собака по кличке " + this.name + " не умеет плавать так далеко");
        }
    }
}