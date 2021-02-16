public class Animal {

    private static int objCounter;
    protected String name;
    protected int runLimit;
    protected int swimLimit;


    public Animal() {
        objCounter++;
    }

    public Animal(String name, int runLimit, int swimLimit) {
        objCounter++;
    }

    public static int objectCount() {
        System.out.println("Объектов создано: " + objCounter);
        return objCounter;
    }
}
