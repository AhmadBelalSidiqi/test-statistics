package com.pluralsight;

import java.util.Arrays;

public class TestStatistics {
    public static void main(String[] args) {
        int[] testScores = {96, 93, 40, 100, 97, 92, 95, 98, 94, 90};
        Arrays.sort(testScores);
        int highScore=testScores.length-1;
        int lowScore= testScores[0];
        double average=0;
        int scoreLength = testScores.length;
        double median;
        int medianIndex = scoreLength/2;

        average = average/scoreLength;

        // Median is the middle dataset if there are two middle numbers then median is the average of those two.
        if (scoreLength%2==0){
            median = (double) (testScores[medianIndex-1] + testScores[medianIndex]) /2;
        } else {
            median = testScores[medianIndex]; }

        System.out.println(" High score: "+highScore+ "\n low score: " + lowScore+ "\n Average score: " +average + "\n Median is: "+median);
    }
}
