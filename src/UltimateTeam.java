import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class UltimateTeam{

    private ArrayList<UltimatePlayer> players;
   private ArrayList<Coach> coaches;

   public UltimateTeam(ArrayList<UltimatePlayer> players, ArrayList<Coach> coaches){
this.players= players;
this.coaches= coaches;



   }

  public String getCutters(){

     String cutters= "";
     for(UltimatePlayer p: players){
         if(p.getPosition().equals("cutters")){
             cutters+= p.toString() +"\n"+ "\n";

         }

     }
     return cutters;



  }


  public String getHandlers(){
      String handlers= "";
      for(UltimatePlayer p: players){
          if(p.getPosition().equals("handlers")){
              handlers+= p.toString() +"\n"+ "\n";

          }

      }
      return handlers;

  }

  public String toString(){
       String allCoaches ="COACHES"+ "\n";
       for(Coach c: coaches){
           allCoaches += c.toString()+ "\n"+ "\n";

       }
       String allPlayers= "PLAYERS"+ "\n";
       for(UltimatePlayer p: players){
           allPlayers += p.toString() + "\n"+"\n";

       }
       return allCoaches+ allPlayers;
  }

}
