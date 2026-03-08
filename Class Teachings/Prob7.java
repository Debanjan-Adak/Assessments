import java.util.*;

// --------- LOCKED / GIVEN CODE (DO NOT MODIFY) ---------

interface Sport {
    void calculateAvgAge(int[] age);
    void retirePlayer(int id);
}

// --------- YOUR TASK STARTS HERE ---------

abstract class Team implements Sport {
    protected int[] playerIDs;

    public Team() {
        // Requirement: Initialize with 11 elements set to 1
        playerIDs = new int[11];
        Arrays.fill(playerIDs, 1);
    }

    // Moved common logic here to satisfy "Use inheritance to reduce duplication"
    @Override
    public void calculateAvgAge(int[] age) {
        double sum = 0;
        for (int a : age) {
            sum += a;
        }
        double avg = sum / 11;
        System.out.println("The average age of the team is " + String.format("%.2f", avg));
    }

    // Moved common logic here
    @Override
    public void retirePlayer(int id) {
        // Adjust 1-based ID to 0-based index (id - 1)
        if (playerIDs[id - 1] != -1) {
            playerIDs[id - 1] = -1;
            System.out.println("Player with id: " + id + " has retired");
        } else {
            System.out.println("Player has already retired");
        }
    }
}

class Cricket extends Team {
    public Cricket() {
        super();
        System.out.println("A new cricket team has been formed");
    }
}

class Football extends Team {
    public Football() {
        super();
        System.out.println("A new football team has been formed");
    }

    public void playerTransfer(int fee, int id) {
        if (playerIDs[id - 1] != -1) {
            playerIDs[id - 1] = -1;
            System.out.println("Player with id: " + id + " has been transferred with a fee of " + fee);
        } else {
            System.out.println("Player has already retired");
        }
    }
}

// --------- MAIN CLASS (ALREADY IMPLEMENTED) ---------

public class Prob7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Initialize Objects
        Cricket c = new Cricket();
        Football f = new Football();

        int[] age1 = new int[11];
        int[] age2 = new int[11];

        // 1. Read Ages for both teams
        for(int i = 0; i < 2; i++) {
            String[] age = sc.nextLine().split(" ");
            if(i == 0) {
                int j = 0;
                for(String s : age) age1[j++] = Integer.parseInt(s);
            } else {
                int j = 0;
                for(String s : age) age2[j++] = Integer.parseInt(s);
            }
        }

        // 2. Calculate Averages
        c.calculateAvgAge(age1);
        f.calculateAvgAge(age2);

        // 3. Process 6 Operations
        for(int i = 0; i < 6; i++) {
            if(i < 3) {
                // First 3 inputs are for Cricket retirement
                int x = Integer.parseInt(sc.nextLine());
                c.retirePlayer(x);
            } else if (i < 5) {
                // Next 2 inputs are for Football retirement
                int x = Integer.parseInt(sc.nextLine());
                f.retirePlayer(x);
            } else {
                // Last input is for Football transfer (Fee ID)
                String[] temp = sc.nextLine().split(" ");
                f.playerTransfer(Integer.parseInt(temp[0]), Integer.parseInt(temp[1]));
            }
        }
        sc.close();
    }
}