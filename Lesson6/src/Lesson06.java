public class Lesson06 {
    public static void main(String[] args) {
        Animal defCat = new Cat();
        Animal dog1 = new Dog();
        Animal dog2 = new Dog(400, 1, 10);

        double tryToJump = 0.5;
        double tryToSwim = 3;
        double tryToRun = 500;

        System.out.printf("Cat trying to jump on %s meters\n", tryToJump);
        System.out.println(defCat.action(defCat, tryToJump, "jump"));

        System.out.printf("Cat trying to swim on %s meters\n", tryToSwim);
        System.out.println(defCat.action(defCat, tryToSwim, "Swim"));

        System.out.printf("Dog2 trying to run on %s meters\n", tryToRun);
        System.out.println(defCat.action(defCat, tryToRun, "rUn"));
    }
}
