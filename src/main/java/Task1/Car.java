package Task1;

public class Car {

    private String model;

    public Car(String model) {
        this.model = model;
    }

    public static class Engine{
        private int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }

    public Engine spec(int horsePower){
        return new Engine(horsePower);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                '}';
    }
}
