package SeparateUserInterface.GradingSystem;

import java.util.ArrayList;

public class Grades {
    private ArrayList<Integer> grades;

    public Grades() {
        this.grades = new ArrayList<>();
    }

    // Add the point entered to the list
    public void add(int point) {
        grades.add(point);
    }

    // Give the star points based on the grades
    public void starPoint() {
        int fiveStarCount = 0;
        int fourStarCount = 0;
        int threeStarCount = 0;
        int twoStarCount = 0;
        int oneStarCount = 0;

        for (int grade: grades) {
            if (grade >= 80 && grade < 100) {
                fiveStarCount++;
            } else if (grade >= 60 && grade < 80) {
                fourStarCount++;
            } else if (grade >= 40 && grade < 60) {
                threeStarCount++;
            } else if (grade >= 20 && grade < 40) {
                twoStarCount++;
            } else if (grade >= 0 && grade < 20) {
                oneStarCount++;
            }
        }

        System.out.println("5: " + "*".repeat(fiveStarCount));
        System.out.println("4: " + "*".repeat(fourStarCount));
        System.out.println("3: " + "*".repeat(threeStarCount));
        System.out.println("2: " + "*".repeat(twoStarCount));
        System.out.println("1: " + "*".repeat(oneStarCount));
    }
}