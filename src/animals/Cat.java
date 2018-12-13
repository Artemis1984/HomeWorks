package animals;

public class Cat implements Animal {

    String name;
    int maxjumpheight;
    int maxrundistance;
    int maxswimdistance;
    boolean ondistance;

    public Cat(String name, int maxjumpheight, int maxrundistance, int maxswimdistance){
        this.maxjumpheight = maxjumpheight;
        this.maxrundistance = maxrundistance;
        this.maxswimdistance = maxswimdistance;
        this.name = name;
        ondistance = true;
    }

    @Override
    public void Run(int distance) {
        if (maxrundistance >= distance){
            System.out.println(name + " пробежал успешно " + maxrundistance + " метров");
        }
        else {
            System.out.println(name + " не смог преодолеть дистанцию в " + distance + " метров");
            ondistance = false;
        }

    }

    @Override
    public void Jump(int height) {
        if (maxjumpheight >= height){
            System.out.println(name + " прыгнул успешно на " + maxjumpheight + " метра");
        }
        else {
            System.out.println(name + " не смог прыгнуть на " + height + " метра");
            ondistance = false;
        }
    }

    @Override
    public void Swim(int swimdistance) {
        if (maxswimdistance >= swimdistance){
            System.out.println(name + " проплыл успешно " + maxswimdistance + " метров");
        }
        else {
            System.out.println(name + " не смог проплыть дистанцию в " + swimdistance + " метров");
            ondistance = false;
        }

    }

    @Override
    public boolean isOndistance() {
        return ondistance;
    }

    @Override
    public String getName() {
        return name;
    }

}
