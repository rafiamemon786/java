import java.util.*;

// Defining a class named studentStatistics
public class StudentStatistics {

    // Main method, the entry point of the program
    public static void main(String[] args) {
        // Input data in the format "Name:Score"
        String studentData = "John:85, Alice:92, Bob:78, Carol:95, David:88, Emma:79, Frank:90";

        // Split the input data into individual student records
        String[] records = studentData.split(", ");

        // Create arrays to store student names and scores
        String[] names = new String[records.length];
        int[] scores = new int[records.length];

        // Initialize variables for calculating statistics
        int totalScore = 0; // To store the sum of all scores
        int highestScore = Integer.MIN_VALUE; // To find the highest score
        int lowestScore = Integer.MAX_VALUE; // To find the lowest  score
        String highestScorer = ""; // To store the name of the student with the highest score
        String lowestScorer = ""; // To store the name of the student with the lowest score

        // Extracting data and populating arrays
        for (int i = 0; i < records.length; i++) {
            // Split each record into name and score
            String[] record = records[i].split(":");
            names[i] = record[0];
            scores[i] = Integer.parseInt(record[1].trim());

            // Update the total score
            totalScore += scores[i];

            // Finding Highest score and scorer
            if (scores[i] > highestScore) {
                highestScore = scores[i];
                highestScorer = names[i];
            }

            // Finding Lowest score and scorer
            if (scores[i] < lowestScore) {
                lowestScore = scores[i];
                lowestScorer = names[i];
            }
        }

        // Calculating statistics
        int numberOfStudents = records.length; // Total number of students
        double averageScore = (double) totalScore / numberOfStudents; // Average score 

        // Displaying statistics
        System.out.println("Total number of students: " + numberOfStudents);
        System.out.println("Average score of all students: " + averageScore);
        System.out.println("Highest score: " + highestScore + " achieved by " + highestScorer);
        System.out.println("Lowest score: " + lowestScore + " achieved by " + lowestScorer);
    }
}
