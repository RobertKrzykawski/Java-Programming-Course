public class CarExercise {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels = 4;

    public CarExercise(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
    }

    public String startEngine() {
        return "Car -> engine is starting";
    }

    public String accelerate() {
        return "Car -> is accelerating";
    }

    public String brake () {
        return "Car -> is braking";
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }
}

class Mitsubishi extends CarExercise {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Mitsubishi -> engine is starting";
    }

    @Override
    public String accelerate() {
        return "Mitsubishi -> is accelerating";
    }

    @Override
    public String brake() {
        return "Mitsubishi -> is braking";
    }
}

class Holden extends CarExercise {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Holden -> engine is starting";
    }

    @Override
    public String accelerate() {
        return "Holden -> is accelerating";
    }

    @Override
    public String brake() {
        return "Holden -> is braking";
    }
}

class Ford extends CarExercise {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Ford -> engine is starting";
    }

    @Override
    public String accelerate() {
        return "Ford -> is accelerating";
    }

    @Override
    public String brake() {
        return "Ford -> is braking";
    }
}
