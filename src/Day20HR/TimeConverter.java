package Day20HR;

import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer to covert to time:");
        int n = sc.nextInt(); // Sample input
        System.out.println(convertSecondsToHHMMSS(n));
    }

    public static String convertSecondsToHHMMSS(int n) {
        // Calculate hours, minutes, and seconds
        int hours = n / 3600;
        int minutes = (n % 3600) / 60;
        int seconds = n % 60;

        // Format each component to ensure two digits
        String formattedTime = String.format("%02d:%02d:%02d", hours, minutes, seconds);

        return formattedTime;
    }
}
