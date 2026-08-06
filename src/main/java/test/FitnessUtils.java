package fitness;

public class FitnessUtils {
    
    private String logMessage;

    public double convertKgToLbs(double kg) {
        return kg * 2.20462;
    }

    public int calculateNextPullupGoal(int currentMax) {
        return currentMax + 2;
    }

    public String generateMotivationString() {
        this.logMessage = "Motivation generiert";
        return "Bleib dran! " + logMessage;
    }
    
    public boolean isAdequateRest(int seconds) {
        return seconds >= 60;
    }
}