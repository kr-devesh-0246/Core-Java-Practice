package One;
class One {
    int x;
    Two t;

    One(Two t) {
        this.t = t;
        x = 10;
    }
    void display() {
        System.out.println("One's x = "+x);
        t.display();
        System.out.println("Two's var = "+t.y);
    }
}

class Two {
    int y;
    Two(int y) {
        this.y = y;
    }
    public void display() {
        System.out.println("Two's y = "+y);
    }
}

public class Relate {
    public static void main(String args[]) {
        Two obj2 = new Two(22);
        One obj1 = new One(obj2);
        obj1.display();
    }
}