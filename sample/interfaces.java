package sample;

/**
 * interface
 */
interface driving {
    void startEngin();
    void stopEngin();
};

class Car implements driving {
    public void startEngin() {
        System.out.println("Engline Start");
    };

    public void stopEngin() {
        System.out.println("Engline Stop");
    }
}

public class interfaces {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.startEngin();
        c1.stopEngin();
    }
}