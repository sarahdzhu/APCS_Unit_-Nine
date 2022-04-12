public class Player {

    private String firstName;
    private String lastName;

    public Player(String firstName, String lastName){
this.firstName= firstName;
this.lastName= lastName;

    }

    public Player(){
        String firstName= "unknown";
        String lastName= "unknown";
this.firstName= firstName;
this.lastName= lastName;

    }

    public String toString(){
        return lastName+ ", "+ firstName;
    }


}
