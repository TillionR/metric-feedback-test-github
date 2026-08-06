package fitness;

import java.util.ArrayList;
import java.util.List;

public class WorkoutSession {
    private User user;
    private List<Exercise> exercises;

    public WorkoutSession(User user) {
        this.user = user;
        this.exercises = new ArrayList<>();
    }

    public void addExercise(Exercise exercise) {
        this.exercises.add(exercise);
    }

    public void printSummary() {
        System.out.println("Workout für: " + user.getName());
        System.out.println("Aktuelles Gewicht: " + user.getWeight() + " kg");
        for (Exercise ex : exercises) {
            System.out.println("- " + ex.getDetails());
        }
    }
}