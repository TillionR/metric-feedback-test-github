package fitness;

public class Exercise {
    private String name;
    private int repetitions;
    private int sets;

    public Exercise(String name, int sets, int repetitions) {
        this.name = name;
        this.sets = sets;
        this.repetitions = repetitions;
    }

    public int getTotalVolume() {
        return sets * repetitions;
    }

    public String getDetails() {
        return sets + " Sätze à " + repetitions + " Wiederholungen " + name;
    }
}