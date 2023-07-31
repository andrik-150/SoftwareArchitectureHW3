// Интерфейс, отвечающий за работу
public interface Worker {
    void work();
}

// Интерфейс, отвечающий за прием пищи
public interface Eater {
    void eat();
}

// Класс человека, реализующий интерфейс Worker и Eater
public class HumanWorker implements Worker, Eater {
    public void work() {
        System.out.println("Человек работает");
    }

    public void eat() {
        System.out.println("Человек ест");
    }
}

// Класс робота, реализующий интерфейс Worker
public class RobotWorker implements Worker {
    public void work() {
        System.out.println("Робот работает");
    }
}
