import java.util.ArrayList;
import java.util.Map;

public class UberVan extends Car{
    Map<String, Map<String, Integer>> typeCarAccepted;
    ArrayList<String>seatsMaterial;

    public UberVan(String licence, Account driver, Map<String, Map<String, Integer>> typeCarAccepted,ArrayList<String>seatsMaterial){
        super(licence, driver);
        this.typeCarAccepted = typeCarAccepted;
        this.seatsMaterial = seatsMaterial;
    }
}
