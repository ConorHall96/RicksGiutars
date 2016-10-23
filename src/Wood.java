/**
 * Created by Conor on 23/10/2016.
 */
public enum Wood {

    INIDAN_ROSEWOOD, BRAZILIAN_ROSEWOOD, COCOBOLO, CEDAR, MAHOGANY, MAPLE,ALDER, SITKA, ADIRONDACK;

    public String toString(){
        switch(this){
            case INIDAN_ROSEWOOD: return "Indian Rosewood";
            case BRAZILIAN_ROSEWOOD: return "Brazilian Rosewood";
            case COCOBOLO: return "Cocobolo";
            case CEDAR: return "Cedar";
            case MAHOGANY: return "Mahogany";
            case MAPLE: return "Maple";
            case ALDER: return "Alder";
            case SITKA: return "Sitka";
            case ADIRONDACK: return "Adirondack";
            default: return "unspecified";
        }
    }
}
