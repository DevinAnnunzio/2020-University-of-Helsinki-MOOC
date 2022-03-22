
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team:");
        String usersTeamFind = scan.nextLine();
        int userTeamsGamesPlayed = 0;
        int userTeamsGamesWon = 0;
        int userTeamsGameLoss = 0;

        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String parts[] = line.split(",");
                String homeTeam = parts[0];
                String awayTeam = parts[1];
                int homeTeamPoints = Integer.valueOf(parts[2]);
                int awayTeamPoints = Integer.valueOf(parts[3]);
                if (usersTeamFind.contains(homeTeam) || usersTeamFind.contains(awayTeam)) {
                    userTeamsGamesPlayed++;
                    //how to account for wins and losses
                }
                if (usersTeamFind.contains(homeTeam) && homeTeamPoints > awayTeamPoints) {
                    userTeamsGamesWon++;
                }

                if (usersTeamFind.contains(homeTeam) && homeTeamPoints < awayTeamPoints) {
                    userTeamsGameLoss++;
                }
                if (usersTeamFind.contains(awayTeam) && homeTeamPoints < awayTeamPoints) {
                    userTeamsGamesWon++;
                }

                if (usersTeamFind.contains(awayTeam) && homeTeamPoints > awayTeamPoints) {
                    userTeamsGameLoss++;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Games: " + userTeamsGamesPlayed);
        System.out.println("Wins: " + userTeamsGamesWon);
        System.out.println("Losses: " + userTeamsGameLoss);

    }

}
