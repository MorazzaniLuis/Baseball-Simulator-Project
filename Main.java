import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int singleFunction(int[] bases, int score, int i) {
        System.out.println("Single!");
        // Check if runner on third score
        if (bases[2] != 0) {
            score++;
            bases[2] = 0;
        }
        // Move runners
        for (int j = 1; j >= 0; j--) {
            bases[j + 1] = bases[j];
            bases[j] = 0;
        }
        // Put batter on first base
        bases[0] = i;

        return score;

    }

    public static int doubleFunction(int[] bases, int score, int i) {

        System.out.println("Double!");
        // Check if runner on third score
        if (bases[2] != 0) {
            bases[2] = 0;
            score++;
        }
        // Check if runner on second scored
        if (bases[1] != 0) {
            score++;
            bases[1] = 0;
        }
        // Move runners
        if (bases[0] != 0) {
            bases[2] = i;
            bases[0] = 0;
        }
        // Put batter on second base
        bases[1] = i;

        return score;

    }

    public static int tripleFunction(int[] bases, int score, int i) {
        System.out.println("Triple");
        for (int j = 0; j < 3; j++) {
            if (bases[j] != 0) {
                score++;
                bases[j] = 0;
            }
        }
        bases[2] = i; // Put batter on third base

        return score;
    }

    public static int homeRunFunction(int[] bases, int score, int i) {

        Random randActions = new Random();
        int FeetHR = randActions.nextInt(191) + 390;
        System.out.println("Home run! A long shot of " + FeetHR + " feets.");

        // score all runners on base
        for (int j = 0; j < 3; j++) {
            if (bases[j] != 0) {
                score++;
                bases[j] = 0;
            }
        }
        score++; // Add 1 for batter

        return score;

    }

    public static int baseOnBall(int[] bases, int score, int i) {
        System.out.println("Base on Ball");
        // Check if 1st base if empty
        if (bases[0] == 0) {
            bases[0] = i;
        } else {
            // check if bases are loaded
            if (bases[2] != 0 && bases[1] != 0 && bases[0] != 0) {
                score++;
                bases[2] = 0;
            }
            // Move runners
            for (int j = 1; j >= 0; j--) {
                bases[j + 1] = bases[j];
                bases[j] = 0;
                // Put batter on first base
                bases[0] = i;
            }
        }

        return score;
    }

    public static HashMap<Integer, String> getTeams() {

        HashMap<Integer, String> teams = new HashMap<>();

        teams.put(1, "Houston Astros");
        teams.put(2, "New York Mets");
        teams.put(3, "Philadelphia Phillies");
        teams.put(4, "New York Yankees");
        teams.put(5, "San Diego Padres");
        teams.put(6, "Atlanta Braves");
        teams.put(7, "Los Angeles Dodgers");
        teams.put(8, "Cleveland Guardians");
        teams.put(9, "Seattle Mariners");
        teams.put(10, "Tampa Bay Rays");
        teams.put(11, "Toronto Blue Jays");
        teams.put(12, "San Luis Cardenas");

        return teams;
    }

    public static String[] getTeamPlayers(String teamChosed) {
        String[] teamPlayers = new String[9];

        if (teamChosed.equals("Houston Astros")) {

            teamPlayers[0] = "Jose Altuve";
            teamPlayers[1] = "Jeremy Peña";
            teamPlayers[2] = "Yordan Alvarez";
            teamPlayers[3] = "Alex Bregman";
            teamPlayers[4] = "Jose Abreu";
            teamPlayers[5] = "Kyle Tucker";
            teamPlayers[6] = "Chad McCornick";
            teamPlayers[7] = "Michael Brantley";
            teamPlayers[8] = "Martin Maldonado";

        }

        if (teamChosed.equals("New York Mets")) {

            teamPlayers[0] = "Brandon Nimmo";
            teamPlayers[1] = "Starling Marte";
            teamPlayers[2] = "Francisco Lindor";
            teamPlayers[3] = "Pete Alonso";
            teamPlayers[4] = "Daniel Voglebach";
            teamPlayers[5] = "Jeff McNeil";
            teamPlayers[6] = "Mark Canha";
            teamPlayers[7] = "Omar Narvaez";
            teamPlayers[8] = "Eduardo Escobar";
        }

        if (teamChosed.equals("Philadelphia Phillies")) {

            teamPlayers[0] = "Brandon Marsh";
            teamPlayers[1] = "Trea Turner";
            teamPlayers[2] = "Bryce Harper";
            teamPlayers[3] = "Kyle Schwarber";
            teamPlayers[4] = "Nick Castellanos";
            teamPlayers[5] = "J.T. Realmuto";
            teamPlayers[6] = "Alec Bohm";
            teamPlayers[7] = "Josh Harrison";
            teamPlayers[8] = "Bryson Scott";
        }

        if (teamChosed.equals("New York Yankees")) {

            teamPlayers[0] = "Anthony Volpe";
            teamPlayers[1] = "Aaron Judge";
            teamPlayers[2] = "Anthony Rizzo";
            teamPlayers[3] = "Giancarlo Stanton";
            teamPlayers[4] = "Gleyber Torres";
            teamPlayers[5] = "D.J. LeMahieu";
            teamPlayers[6] = "Josh Donaldson";
            teamPlayers[7] = "Oswaldo Cabrera";
            teamPlayers[8] = "Kyle Higashioka";
        }

        if (teamChosed.equals("San Diego Padres")) {

            teamPlayers[0] = "Trent Grisham";
            teamPlayers[1] = "Fernando Tatis Jr";
            teamPlayers[2] = "Juan Soto";
            teamPlayers[3] = "Xander Bogaerts";
            teamPlayers[4] = "Manny Machado";
            teamPlayers[5] = "Jake Croneworth";
            teamPlayers[6] = "Ha-Seong Kim";
            teamPlayers[7] = "Matt Carpenter";
            teamPlayers[8] = "Austin Nola";
        }

        if (teamChosed.equals("Atlanta Braves")) {

            teamPlayers[0] = "Ronald Acuña Jr";
            teamPlayers[1] = "Ozzie Albies";
            teamPlayers[2] = "Matt Olson";
            teamPlayers[3] = "Austin Riley";
            teamPlayers[4] = "Eddie Rosario";
            teamPlayers[5] = "Marcelo Ozuna";
            teamPlayers[6] = "Michael Harris II";
            teamPlayers[7] = "Sean Murphy";
            teamPlayers[8] = "Orlando Arcia";
        }

        if (teamChosed.equals("Los Angeles Dodgers")) {

            teamPlayers[0] = "Mookie Betts";
            teamPlayers[1] = "Freddie Freeman";
            teamPlayers[2] = "J.D. Martinez";
            teamPlayers[3] = "Max Muncy";
            teamPlayers[4] = "David Peralta";
            teamPlayers[5] = "James Outman";
            teamPlayers[6] = "Will Smith";
            teamPlayers[7] = "Gavin Lux";
            teamPlayers[8] = "Miguel Rojas";
        }

        if (teamChosed.equals("Cleveland Guardians")) {

            teamPlayers[0] = "Steven Kwan";
            teamPlayers[1] = "Andres Gimenez";
            teamPlayers[2] = "Jose Ramirez";
            teamPlayers[3] = "Josh Bell";
            teamPlayers[4] = "Oscar Gonzalez";
            teamPlayers[5] = "Josh Naylor";
            teamPlayers[6] = "Amed Rosario";
            teamPlayers[7] = "Mike Zunino";
            teamPlayers[8] = "Myles Straw";
        }

        if (teamChosed.equals("Seattle Mariners")) {

            teamPlayers[0] = "Julio Rodriguez";
            teamPlayers[1] = "Ty France";
            teamPlayers[2] = "Eugenio Suarez";
            teamPlayers[3] = "Teoscar Hernandez";
            teamPlayers[4] = "Jarred Kalenic";
            teamPlayers[5] = "A.J. Pollock";
            teamPlayers[6] = "Kolten Wong";
            teamPlayers[7] = "J.P. Crawford";
            teamPlayers[8] = "Cal Raleigh";
        }

        if (teamChosed.equals("Tampa Bay Rays")) {

            teamPlayers[0] = "Yandy Diaz";
            teamPlayers[1] = "Wander Franco";
            teamPlayers[2] = "Randy Arozarena";
            teamPlayers[3] = "Brandon Lowe";
            teamPlayers[4] = "Harold Ramirez";
            teamPlayers[5] = "Josh Lowe";
            teamPlayers[6] = "Manuel Margot";
            teamPlayers[7] = "Isaac Paredes";
            teamPlayers[8] = "Francisco Mejia";
        }

        if (teamChosed.equals("Toronto Blue Jays")) {

            teamPlayers[0] = "George Springer";
            teamPlayers[1] = "Bo Bichette";
            teamPlayers[2] = "Vladimir Guerrero Jr";
            teamPlayers[3] = "Matt Chapman";
            teamPlayers[4] = "Daulton Varsho";
            teamPlayers[5] = "Santiago Espinal";
            teamPlayers[6] = "Alexander Kirk";
            teamPlayers[7] = "With Merrifield";
            teamPlayers[8] = "Cavin Biggio";
        }

        if (teamChosed.equals("San Luis Cardenas")) {

            teamPlayers[0] = "Laars Nootbaar";
            teamPlayers[1] = "Tyler O'Neil";
            teamPlayers[2] = "Paul Goldschmidt";
            teamPlayers[3] = "Nolan Arenado";
            teamPlayers[4] = "Wilson Contreras";
            teamPlayers[5] = "Nolan Carlson";
            teamPlayers[6] = "Tommy Edman";
            teamPlayers[7] = "Juan Yepez";
            teamPlayers[8] = "Dylan Carlson";
        }

        return teamPlayers;

    }

    public static String chooseTeam() {
        Scanner input = new Scanner(System.in);
        String teamChosed = "";
        System.out.print("Choose a Team ");
        System.out.println(getTeams().entrySet());
        int teamImput = input.nextInt();
        if (getTeams().containsKey(teamImput)) {
            teamChosed = getTeams().get(teamImput);
        } else {
            System.out.println("Choose a valid option");
        }
        return teamChosed;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Baseball Game!");
        // Get the name of the teams
        String homeTeam = chooseTeam();
        String visitingTeam = chooseTeam();
        String[] homeTeamPlayers = getTeamPlayers(homeTeam);
        String[] visitingTeamPlayers = getTeamPlayers(visitingTeam);

        // Variables for the scores
        int homeScore = 0;
        int awayScore = 0;
        int currentBatterHomeTeam = 0;
        int currentBatterVisitorTeam = 0;
        Random randActions = new Random();
        int[] bases = new int[3];
        // Simulate 9 innings
        for (int inning = 1; inning <= 15; inning++) {
            System.out.println("Inning " + inning + " starts.");
            System.out.println(" ");
            // Simulate each team's at-bat
            for (int i = 1; i <= 2; i++) {
                int score = 0;
                int outs = 0;
                bases = new int[3];
                while (outs < 3) {
                    int outcome = randActions.nextInt(100);
                    if (i == 2) {

                        if (currentBatterHomeTeam > 8) {
                            currentBatterHomeTeam = 0;
                        }
                        System.out.println("Player " + homeTeamPlayers[currentBatterHomeTeam]);
                        currentBatterHomeTeam++;

                    } else {

                        if (currentBatterVisitorTeam > 8) {
                            currentBatterVisitorTeam = 0;
                        }

                        System.out.println(visitingTeamPlayers[currentBatterVisitorTeam]);
                        currentBatterVisitorTeam++;
                    }

                    if (outcome <= 20) {
                        System.out.println("Strikeout! there are " + (outs + 1) + " outs");
                        outs++;

                    } else if (outcome > 30 && outcome <= 45) {

                        score = singleFunction(bases, score, i);

                    } else if (outcome > 45 && outcome <= 55) {

                        score = doubleFunction(bases, score, i);

                    } else if (outcome > 60 && outcome <= 66) {

                        score = homeRunFunction(bases, score, i);
                    } else if (outcome > 66 && outcome <= 88) {

                        if (bases[0] != 0 && outs < 2) {
                            bases[0] = 0;
                            if (bases[2] != 0 && bases[1] != 0 && outs == 0) {
                                score++;
                                bases[2] = 0;
                                System.out.println("Runner of third score");
                            }
                            if (bases[1] != 0) {
                                bases[2] = bases[1];
                                bases[1] = 0;
                            }
                            outs += 2;
                            System.out.println("Double Play! there are " + outs + " outs");
                        } else {
                            outs++;
                            System.out.println("Groundball, there are " + outs + " outs");
                        }

                    } else if (outcome > 20 && outcome <= 30) {
                        System.out.println("Flyball, there are " + (outs + 1) + " outs");
                        // Check if there a runner in third
                        if (bases[2] != 0 && outs < 2) {
                            score++;
                            bases[2] = 0;
                            System.out.println("(Scores in a Hit and Run play!)");
                        }
                        outs++;
                    } else if (outcome > 88 && outcome <= 93) {
                        System.out.println("Lineout, there are " + (outs + 1) + " outs");
                        outs++;
                    } else if (outcome > 93 && outcome <= 97) {
                        System.out.println("Popout, there are " + (outs + 1) + " outs");
                        outs++;
                    } else if (outcome > 97) {
                        score = tripleFunction(bases, score, i);
                    } else if (outcome > 55 && outcome <= 60) {

                        score = baseOnBall(bases, score, i);
                    }
                    try {
                        Thread.sleep(400); // Add a 1-second delay
                    } catch (InterruptedException e) {
                        // Handle the exception here
                    }
                }
                if (i == 1) {
                    awayScore += score;
                } else {
                    homeScore += score;
                }
                System.out.println(
                        "Score: " + homeScore + " (" + homeTeam + ") - " + awayScore + " (" + visitingTeam + ")");
                System.out.println(" ");
                // In case the home team its winning, the game needs to end after visitor team
                // bat
                if (inning >= 9 && homeScore > awayScore) {
                    break;
                }
            }
            if (inning >= 9 && homeScore == awayScore) {
                System.out.println("Tie game after " + inning + " innings. Extra inning!");
            }
            // In case after 9 innings a team has advantage the game ends
            if (inning >= 9 && homeScore != awayScore) {
                break;
            }
        }
        // Print final score
        System.out.println(
                "Final score: " + homeScore + " (" + homeTeam + ") - " + awayScore + " (" + visitingTeam + ")");

        if (homeScore > awayScore) {
            System.out.println(homeTeam + " wins!");
        } else if (awayScore > homeScore) {
            System.out.println(visitingTeam + " wins!");
        }
    }
}
