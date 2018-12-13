package barriers;

import animals.Animal;

public class Cross implements Barriers {

    int distance;

    public Cross(int distance){
        this.distance = distance;
    }

    @Override
    public void doIt(Animal animal) {
        animal.Run(distance);
    }
}
