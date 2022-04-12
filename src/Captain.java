public class Captain extends UltimatePlayer {

    public boolean type;





    public Captain(String firstName, String lastName, String position, boolean type){
        super(firstName, lastName, position);
this.type=type;

    }
    public Captain(){
        super();
       type= false;

    }

    public String toString(){
        if(type){
        return super.toString()+ "\n   "+ "Captain: offense";

    }else{
            return super.toString()+ "\n   " + "Captain: defense";
        }

}}
