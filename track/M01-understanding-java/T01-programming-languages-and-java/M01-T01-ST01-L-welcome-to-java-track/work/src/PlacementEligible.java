public class PlacementEligible {
    public static void main(String[] args) {
        int marks = 85;
        int attendance = 75;
        boolean projectCompleted = true;

        boolean marksEligible = marks > 70;
        boolean attendanceEligible = attendance >= 75;
        boolean acadimicsEligible = marksEligible && attendanceEligible;
        boolean placementEligible = acadimicsEligible && projectCompleted;
        System.out.println("Placment Eligible:" + placementEligible);
    }
}
