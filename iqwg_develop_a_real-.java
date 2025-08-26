Java
import java.util.Scanner;

public class iqwq_develop_a_real {
    public static void main(String[] args) {
        // Script notifier simulation
        System.out.println("Script Notifier v1.0");
        System.out.println("Enter script name to receive notifications:");
        Scanner scanner = new Scanner(System.in);
        String scriptName = scanner.nextLine();

        // Simulation of automation script execution
        System.out.println("Script '" + scriptName + "' executed successfully!");
        System.out.println("Notifications sent to stakeholders...");

        // Real-time notification simulation
        while (true) {
            System.out.println("Notification received at " + getCurrentTime());
            try {
                Thread.sleep(5000); // 5-second interval
            } catch (InterruptedException e) {
                break;
            }
        }
    }

    private static String getCurrentTime() {
        return java.time.LocalTime.now().toString();
    }
}