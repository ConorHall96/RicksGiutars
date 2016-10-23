/**
 * Created by Conor on 23/10/2016.
 */
public enum Type {

    ACOUSTIC, ELECTRIC;

    public String toString(){
        switch(this){
            case ACOUSTIC: return "acoustic";
            case ELECTRIC: return "electric";
            default: return "unspecified";
        }
    }
}
