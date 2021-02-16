public class Cat extends Animal {

    public Cat(String name, int runLimit, int swimLimit) {
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;

    }

    public void run(int i) {
        if (i <= this.runLimit  && i > 0) {
            System.out.println("Кот по имени " + this.name + " пробежал " + i + " метров");
        } else if (i == 0) {
            System.out.println("Кот по имени " + this.name + " решил вообще не вставать");
        } else {
            System.out.println("Кот по имени " + this.name + " не умеет бегать так далеко");
        }
    }

    public void swim(int i) {
        if (i <= this.swimLimit && i > 0) {
            System.out.println("Кот по имени " + this.name + " проплыл " + i + " метров");
        } else if (i == 0) {
            System.out.println("Кот по имени " + this.name + " решил вообще не плавать");
        } else {
            System.out.println("Кот по имени " + this.name + " не умеет плавать так далеко");
        }
    }
}
