import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GradeManager managerGrade = new GradeManager();
        int[] grades = {80, 45,92,68, 75, 55, 82};
        managerGrade.printGrades(grades);
        System.out.println("All grades:" + Arrays.toString(grades));
        System.out.println("Average grade: " + managerGrade.calculateAverage(grades));
        System.out.println("Grades sorted: " + Arrays.toString(managerGrade.sortGrades(grades)));
        managerGrade.searchGrades(grades, 68);
        try {
            managerGrade.getGrades(grades, 4);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        int highest = managerGrade.findHighestGrade(grades);
        int lowest = managerGrade.findLowestGrade(grades);

        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);

}}