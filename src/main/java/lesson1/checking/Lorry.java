package lesson1.checking;

public class Lorry extends Car implements Moveable, Stopable {
    public void move(){
        System.out.println("Car is moving");
    }
    public void stop(){
        System.out.println("Car is stop");
    }

    @Override
    void open() {

    }
}
