public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void printInfo(){
        System.out.println("Plate: " + this.food);
    }

    public int getFoodAmount() {
        return this.food;
    }

    public boolean addFood(int food){
        this.food += food;
        return true;
    }

    public boolean decreaseFood(int food) {
        if (food <= this.food){ // Это проверка тарелки (п.2)
            this.food -= food;
            return true;
        }
        return false;
    }
}
