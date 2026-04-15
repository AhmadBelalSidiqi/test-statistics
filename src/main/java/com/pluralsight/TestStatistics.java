package com.pluralsight;

public class TestStatistics {
    public static void main(String[] args) {
        int[] testScores = {96, 93, 40, 100, 97, 92, 95, 98, 94, 90};
        int highScore=0;
        int lowScore= testScores[0];
        int average=0;

        for (int x : testScores){
            average += x;
            if (x>highScore){
                highScore = x;}

            if (x<lowScore) {
                lowScore =x;}
        }


        average = average/testScores.length;
        System.out.println("High score: "+highScore+ "\n low score: " + lowScore+ "\n Average score: " +average);
    }
}
