package SimulatorOneSim;

import java.util.Random;

public class Elite8 {
	private double min = -600.0000;
    private double max = 600.0000;
    private String topTeamName;
    private String bottomTeamName;
    private double topTeam;
    private double bottomTeam;
    private double topogScore;
    private double bottomogScore;
   
   
    
    public Elite8(String topTeamName, double topTeamScore, String bottomTeamName, double bottomTeamScore){
        Random random = new Random();
        this.topTeamName = topTeamName;
        this.bottomTeamName = bottomTeamName;
        topTeam = (min + random.nextDouble() * (max - min)) + topTeamScore;
        bottomTeam = (min + random.nextDouble() * (max - min)) + bottomTeamScore;
        topogScore = topTeamScore;
        bottomogScore = bottomTeamScore;
    }
        

    public double winnerRating(){
        if(topTeam >= bottomTeam){
            return topogScore;
        }
            return bottomogScore;
    }
    public String winnerName(){
        if(topTeam >= bottomTeam){
            return topTeamName;
        }
            return bottomTeamName;
    }

}
