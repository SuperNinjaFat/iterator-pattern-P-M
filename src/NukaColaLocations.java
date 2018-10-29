import java.util.ArrayList;

public class NukaColaLocations {
    ArrayList<StoreLocation> storeLocations;

    public NukaColaLocations() {
        storeLocations = new ArrayList<StoreLocation>();

        addLocation("111 Nuka-World Lane", "New England", "Boston", "99999");

    }
    public void addLocation(String street, String city, String state, String zip) {
        StoreLocation storeLocation = new StoreLocation(street, city, state, zip);
        storeLocations.add(storeLocation);
    }
    public ArrayList<StoreLocation> getStoreLocations() {
        return storeLocations;
    }
    // other store methods here
}
