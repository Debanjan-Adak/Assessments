/*
=====================================================
      Java: Volleyball Team Ranking System
=====================================================

Create a system to monitor the scores of volleyball teams based on match
outcomes. Develop a class that:
- Tracks team scores
- Allows efficient querying to find the team with the highest score after all
  match results have been recorded

Given an interface GameTracker, with the following functions:
- void addMatch(String team1, String team2, String score);
- String findFirst();

Create a class called VolleyballGameTracker implementing the
GameTracker interface. The specifications are given below.

1. Constructor:
   - VolleyballGameTracker(String[] teamNames): Initializes the
     tracker with the names of teams.

2. Methods:
   - void addMatch(String team1, String team2, String score): Records the
     match result between two teams.
     * Scoring Rule derived from sample:
       - Win: 2 points
       - Draw: 1 point each
       - Loss: 0 points
   - String findFirst(): Returns the name of the team with the highest score.

Constraints:
- The findFirst method should have a time complexity of less than O(n).

Input Format for Custom Testing
Sample Case 0
Sample Input 0
4
TeamA
TeamB
TeamC
TeamD
3
TeamA TeamB 20:19
TeamC TeamD 25:25
TeamA TeamC 23:25

Sample Output 0
TeamC

Explanation
After the first match, TeamA has 2 points and TeamB has 0 points.
After the second match, TeamC has 1 point and TeamD has 1 point.
After the third match, TeamA had 2 points and TeamC 3 points.
TeamC has the highest score of 3 points.
=====================================================
*/
import java.util.*;

// --------- LOCKED / GIVEN CODE (DO NOT MODIFY) ---------

interface GameTracker {
    void addMatch(String team1, String team2, String score);
    String findFirst();
}

// --------- YOUR TASK STARTS HERE ---------

class VolleyballGameTracker implements GameTracker {

    // Declare your variables here
    

    public VolleyballGameTracker(String[] teamNames) {
        // YOUR CODE GOES HERE
        
    }

    @Override
    public void addMatch(String team1, String team2, String score) {
        // YOUR CODE GOES HERE
        // 1. Parse the score string (e.g., "20:19")
        // 2. Determine winner/loser or draw
        // 3. Update team points (Win=2, Draw=1, Loss=0)
        // 4. Update the leader if necessary to satisfy O(1) for findFirst()
        
    }

    @Override
    public String findFirst() {
        // YOUR CODE GOES HERE
        return ""; // Placeholder
    }
}

// --------- MAIN CLASS (ALREADY IMPLEMENTED) ---------

public class Prob4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 1. Read number of teams
        int n = Integer.parseInt(sc.nextLine());
        String[] teams = new String[n];
        
        // 2. Read team names
        for(int i = 0; i < n; i++) {
            teams[i] = sc.nextLine().trim();
        }
        
        // Initialize Tracker
        GameTracker tracker = new VolleyballGameTracker(teams);
        
        // 3. Read number of matches
        int m = Integer.parseInt(sc.nextLine());
        
        // 4. Process matches
        for(int i = 0; i < m; i++) {
            String line = sc.nextLine();
            String[] parts = line.split(" ");
            
            // Format: Team1 Team2 Score1:Score2
            // parts[0] = Team1, parts[1] = Team2, parts[2] = Score
            String team1 = parts[0];
            String team2 = parts[1];
            String score = parts[2];
            
            tracker.addMatch(team1, team2, score);
        }
        
        // 5. Output result
        System.out.println(tracker.findFirst());
        
        sc.close();
    }
}