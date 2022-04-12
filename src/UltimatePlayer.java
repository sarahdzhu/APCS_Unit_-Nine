public class UltimatePlayer extends Player{
    public static int jerseyNumber;
    int jersey;
    String position;

    public UltimatePlayer(){
        super();

        this.jersey= 0;

        position= "handler";


    }


    public UltimatePlayer(String firstName, String lastName, String position){
        super(firstName, lastName);
        this.position= position;
        jerseyNumber++;
        this.jersey= jerseyNumber;



        }
public String getPosition(){

        return position;

}

    @Override
    public String toString() {
        return super.toString() + "\n   "+
                "Jersey #: " + jersey +"\n   " +
                "Position: " + position;
    }
}












