
    import java.util.*;

class Coach {
    String type;
    int maxSeats = 60;
    int maxWaiting = 10;
    List<String> booked = new ArrayList<>();
    Queue<String> waitingList = new LinkedList<>();

    public Coach(String type) {
        this.type = type;
    }

    public boolean bookTicket(String passengerName) {
        if (booked.size() < maxSeats) {
            booked.add(passengerName);
            System.out.println("Ticket Booked for " + passengerName + " in " + type + " coach.");
            return true;
        } else if (waitingList.size() < maxWaiting) {
            waitingList.add(passengerName);
            System.out.println("Added to Waiting List: " + passengerName + " in " + type + " coach.");
            return true;
        } else {
            System.out.println("Booking Failed: No Seats or Waiting slots in " + type + " coach.");
            return false;
        }
    }

    public boolean cancelTicket(String passengerName) {
        if (booked.remove(passengerName)) {
            System.out.println("Ticket Cancelled for " + passengerName + " in " + type + " coach.");
            if (!waitingList.isEmpty()) {
                String movedPassenger = waitingList.poll();
                booked.add(movedPassenger);
                System.out.println("Moved from waiting to booked: " + movedPassenger);
            }
            return true;
        } else if (waitingList.remove(passengerName)) {
            System.out.println("Removed from Waiting List: " + passengerName + " in " + type + " coach.");
            return true;
        } else {
            System.out.println("Cancellation Failed: " + passengerName + " not found.");
            return false;
        }
    }

    public void showStatus() {
        System.out.println("==== " + type + " Coach Status ====");
        System.out.println("Booked (" + booked.size() + "/" + maxSeats + "): " + booked);
        System.out.println("Waiting List (" + waitingList.size() + "/" + maxWaiting + "): " + waitingList);
    }

    public void prepareChart() {
        System.out.println("### Chart for " + type + " Coach ###");
        int i = 1;
        for (String name : booked) {
            System.out.println(i++ + ". " + name);
        }
    }
}

public class RailwayReservationSystem {
    static Map<String, Coach> coaches = new HashMap<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        coaches.put("AC", new Coach("AC"));
        coaches.put("NonAC", new Coach("NonAC"));
        coaches.put("Seater", new Coach("Seater"));

        while (true) {
            System.out.println("\n1. Book Ticket\n2. Cancel Ticket\n3. Show Status\n4. Prepare Chart\n5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Passenger Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Coach Type (AC / NonAC / Seater): ");
                    String coachType = sc.nextLine();
                    if (coaches.containsKey(coachType))
                        coaches.get(coachType).bookTicket(name);
                    else
                        System.out.println("Invalid Coach Type");
                    break;

                case 2:
                    System.out.print("Enter Passenger Name to Cancel: ");
                    String cname = sc.nextLine();
                    System.out.print("Enter Coach Type: ");
                    String ctype = sc.nextLine();
                    if (coaches.containsKey(ctype))
                        coaches.get(ctype).cancelTicket(cname);
                    else
                        System.out.println("Invalid Coach Type");
                    break;

                case 3:
                    for (Coach coach : coaches.values())
                        coach.showStatus();
                    break;

                case 4:
                    for (Coach coach : coaches.values())
                        coach.prepareChart();
                    break;

                case 5:
                    System.out.println("Exiting system.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice.");
            }
        }
    }
}


