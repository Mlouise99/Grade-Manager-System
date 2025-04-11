import java.util.Arrays;

public class GradeManager {

    public void printGrades(int[] grades) {
        for (int grade : grades) {
            if (grade < 0) {
                throw new IllegalArgumentException("Grades cannot be negative");
            }
            System.out.println(grade);
        }
    }

    public int[] sortGrades(int[] grades) {
        Arrays.sort(grades);
        return grades;
    }

    public void searchGrades (int[] grades, int target){
        for (int grade : grades) {
            if (grade == target) {
                System.out.println("Grade found: " + target);
                return;
            }
        }
        System.out.println("Grade not found: " + target);

    }
    public void getGrades(int[] grades, int index) throws RuntimeException {
        try{
            if (index < 0 || index >= grades.length) {
                throw new IllegalArgumentException("Index out of bounds");
            }
        }
        catch (IllegalArgumentException e) {
            throw new RuntimeException(e.getMessage());
        }
        finally {
            System.out.println("Grade at index " + index + " is grade: " + " " + grades[index]);
        }
    }
    public double calculateAverage(int[] grades) {
        if (grades.length == 0) return 0;

        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }
    public int findHighestGrade(int[] grades) {
        if (grades == null || grades.length == 0) {
            throw new IllegalArgumentException("Grade array is empty.");
        }

        int max = grades[0];
        for (int grade : grades) {
            if (grade > max) {
                max = grade;
            }
        }
        return max;
    }

    public int findLowestGrade(int[] grades) {
        if (grades == null || grades.length == 0) {
            throw new IllegalArgumentException("Grade array is empty.");
        }

        int min = grades[0];
        for (int grade : grades) {
            if (grade < min) {
                min = grade;
            }
        }
        return min;
    }


}
