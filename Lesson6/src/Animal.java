public abstract class Animal {

    protected double distanceToRun;
    protected double distanceToJump;
    protected double distanceToSwim;

    public Animal(double run, double jump, double swim) {
        this.distanceToJump = jump;
        this.distanceToRun = run;
        this.distanceToSwim = swim;
    }

    public boolean action (Animal someAnimal, double distance, String action){
        switch (action.toLowerCase()) {
            case "swim":
                if (distance < someAnimal.distanceToSwim) return true;
                break;
            case "run":
                if (distance < someAnimal.distanceToRun) return true;
                break;
            case "jump":
                if (distance < someAnimal.distanceToJump) return true;
                break;
        }
        return false;
    }


}
