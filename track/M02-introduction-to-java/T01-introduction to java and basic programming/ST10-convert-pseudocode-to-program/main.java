public static void main(String[] args) {

    int javaHoursPerDay = 2;
    int aptitudeHoursPerDay = 1;
    int numberOfDays = 5;

    int weeklyJavaHours = javaHoursPerDay * numberOfDays;
    int weeklyAptitudeHours = aptitudeHoursPerDay * numberOfDays;
    int totalPreparationHours = weeklyJavaHours + weeklyAptitudeHours;

    System.out.println("Java: " + weeklyJavaHours);
    System.out.println("Aptitude: " + weeklyAptitudeHours);
    System.out.println("Total: " + totalPreparationHours);
}
