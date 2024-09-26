package SimulatorOneSim;

import java.util.Random;

public class Championship {
	 private double min = -800.0000;
	    private double max = 800.0000;
	    private String topTeamName;
	    private String bottomTeamName;
	    private double topTeam;
	    private double bottomTeam;
	    private double topogScore;
	    private double bottomogScore;
	   
	   
	    
	    public Championship(String topTeamName, double topTeamScore, String bottomTeamName, double bottomTeamScore){
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
