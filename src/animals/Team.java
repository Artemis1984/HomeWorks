package animals;

public class Team {

    public Animal [] animals;
    public Team(){

        animals = new Animal[]{new Cat("Барсик", 2, 100, 0),
                new Dog("Граф", 2, 500, 120),
                new Bear("Мишка", 0, 150,10),
                new Parrot("Попугай", 0, 20, 0)};
    }

    public void Show(){
        System.out.println(new String("----------------------------------------"));
        for (Animal animal : animals){
            if (animal.isOndistance())
                System.out.println(animal.getName() + " преодолел все барьеры!");
            else
                System.out.println(animal.getName() + " не смог преодолеть все барьеры!");
        }
    }

}
