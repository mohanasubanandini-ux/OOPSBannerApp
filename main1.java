class SampleProgram2 {
    public static void main(String[] args) {

        // Distances
        double chennaiToVellore = 156.6;
        double velloreToBangalore = 211.8;

        // Time (convert everything into minutes)
        int time1Hours = 4;
        int time1Minutes = 4;

        int time2Hours = 4;
        int time2Minutes = 25;

        // Total Distance
        double totalDistance = chennaiToVellore + velloreToBangalore;

        // Convert time to minutes
        int totalMinutes = (time1Hours * 60 + time1Minutes) 
                         + (time2Hours * 60 + time2Minutes);

        // Convert back to hours and minutes
        int finalHours = totalMinutes / 60;
        int finalMinutes = totalMinutes % 60;

        // Display Results
        System.out.println("Total Distance from Chennai to Bangalore: " + totalDistance + " km");
        System.out.println("Total Time from Chennai to Bangalore: " + finalHours + " Hours and " + finalMinutes + " Minutes");
    }
}
