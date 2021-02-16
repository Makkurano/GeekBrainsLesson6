public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Рыжий", 200, 0);
        Dog dog = new Dog("Мухтар",500, 10);
        Dog dog2 = new Dog("Люси",600, 20);
        Cat cat2 = new Cat("Морской", 10, 400);
        Cat cat3 = new Cat("Сфинкс", 100, 0);


        cat.swim(0);
        cat.run(100);
        dog.swim(5);
        dog.run(450);
        cat2.swim(100);
        cat2.run(100);
        dog2.swim(0);
        dog2.run(600);
        Animal.objectCount();
    }
}
