public class Cat {
    private String name;
    private int appetite;
    private boolean satiation;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiation = false;
    }

    public boolean eatFood(Plate plate){
        if (this.appetite > plate.getFoodAmount()) return false; //Это проверка котика (п.4)
        if (plate.decreaseFood(this.appetite)) {
            this.satiation = true;
            return true;
        }
        return false;
    }

    public boolean getCatSatiation(){
        return this.satiation;
    }
}
