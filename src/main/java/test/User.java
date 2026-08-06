package fitness;

public class User {
    private String name;
    private double heightInMeters;
    private double weightInKg;

    public User(String name, double heightInMeters, double weightInKg) {
        this.name = name;
        this.heightInMeters = heightInMeters;
        this.weightInKg = weightInKg;
    }

    public double calculateBMI() {
        return weightInKg / (heightInMeters * heightInMeters);
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weightInKg;
    }
}