public class Lesson07 {
    public static void main(String[] args) {
        Cat[] cats = new Cat[] {
                new Cat ("Barsik", 5),
                new Cat ("Murzik",10),
                new Cat ("Vaska", 10),
                new Cat ("Tom",5) };
        Plate plate = new Plate (25);
        plate.printInfo();

        for (int i = 0; i < cats.length; i++ ) {
            cats[i].eatFood(plate);
            System.out.printf("Cat %s is trying to eat. Cat is full: %s \n", i+1, cats[i].getCatSatiation());
        }

        plate.printInfo();

    }
}
