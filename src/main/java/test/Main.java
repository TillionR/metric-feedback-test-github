package fitness;

public class Main {
    public static void main(String[] args) {
        User athlete = new User("Peter", 1.83, 75.0);
        WorkoutSession session = new WorkoutSession(athlete);

        Exercise pullups = new Exercise("Klimmzüge", 5, 5);
        Exercise pushups = new Exercise("Liegestütze", 3, 15);

        session.addExercise(pullups);
        session.addExercise(pushups);

        session.printSummary();
    }
}