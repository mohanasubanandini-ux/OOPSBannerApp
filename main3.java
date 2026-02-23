import java.util.Scanner;

public class TravelDetails {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name, fromCity, viaCity, toCity;
        double fromToVia, viaToFinalCity;
        double timeFromToVia, timeViaToFinalCity;

        System.out.print("Enter name: ");
        name = sc.nextLine();

        System.out.print("Enter From City: ");
        fromCity = sc.nextLine();

        System.out.print("Enter Via City: ");
        viaCity = sc.nextLine();

        System.out.print("Enter To City: ");
        toCity = sc.nextLine();

        System.out.print("Enter distance from " + fromCity + " to " + viaCity + " (in km): ");
        fromToVia = sc.nextDouble();

        System.out.print("Enter distance from " + viaCity + " to " + toCity + " (in km): ");
        viaToFinalCity = sc.nextDouble();

        System.out.print("Enter time taken from " + fromCity + " to " + viaCity + " (in minutes): ");
        timeFromToVia = sc.nextDouble();

        System.out.print("Enter time taken from " + viaCity + " to " + toCity + " (in minutes): ");
        timeViaToFinalCity = sc.nextDouble();

        double totalDistance = fromToVia + viaToFinalCity;
        double totalTime = timeFromToVia + timeViaToFinalCity;

        System.out.println("The Total Distance travelled by " + name +
                " from " + fromCity + " to " + toCity +
                " via " + viaCity + " is " + totalDistance +
                " km and the Total Time taken is " + totalTime + " minutes");

        sc.close();
    }
}
