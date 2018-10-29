public class SunsetSarsaparillaLocations {
    static final int MAX_LOCATIONS = 6;
    int numberOfLocations = 0;
    StoreLocation[] storeLocations;
    public SunsetSarsaparillaLocations() {
        storeLocations = new StoreLocation[MAX_LOCATIONS];

        addLocation("3258 Lower Ridge Road", "San Diego", "California", "92130");
    }
    public void addLocation(String street, String city, String state, String zip) {
        StoreLocation storeLocation = new StoreLocation(street, city, state, zip);
        if (numberOfLocations >= MAX_LOCATIONS) {
            System.err.println("Sorry, Locations are full! Can't add more locations to list!");
        }
        else {
            storeLocations[numberOfLocations] = storeLocation;
            numberOfLocations = numberOfLocations + 1;
        }
    }

    public StoreLocation[] getStoreLocations() {
        return storeLocations;
    }

    // other location methods here
}
