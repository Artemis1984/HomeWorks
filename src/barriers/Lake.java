package barriers;

import animals.Animal;

public class Lake implements Barriers {

    int swimdistance;

    public Lake(int swimdistance){
        this.swimdistance = swimdistance;
    }

    @Override
    public void doIt(Animal animal) {
        animal.Swim(swimdistance);
    }
}
