package barriers;

import animals.Animal;

public class Wall implements Barriers {

    int height;

    public Wall(int height){
        this.height = height;
    }

    @Override
    public void doIt(Animal animal) {

        animal.Jump(height);
    }
}
