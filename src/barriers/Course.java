package barriers;

import animals.Animal;
import animals.Team;

public class Course {

    Barriers[] barriers;

    public Course(){
        barriers = new Barriers[]{new Cross(120), new Wall(1), new Lake(110)};
    }

    public void doIt(Team team){

        for (Animal animal:team.animals){
            for (Barriers barrier:barriers){
                barrier.doIt(animal);

            }
        }
    }
}
