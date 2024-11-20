package champollion;

<<<<<<< HEAD
import java.util.HashSet;
import java.util.Set;

public class UE {
    private final String myIntitule;

    private int heureCM;
    private int heureTD;
    private int heureTP;
    private Set<Intervention> interventions = new HashSet<>();

    public UE(String myIntitule) {
        this.myIntitule = myIntitule;
=======
public class UE {
    private final String myIntitule;

    public UE(String intitule) {
        myIntitule = intitule;
>>>>>>> 1ba6895755d7385f2df81218854cf81599022562
    }

    public String getIntitule() {
        return myIntitule;
    }

<<<<<<< HEAD
}
=======
    
}
>>>>>>> 1ba6895755d7385f2df81218854cf81599022562
