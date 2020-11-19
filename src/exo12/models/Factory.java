package exo12.models;

public enum Factory {
    OUI("OUI"),
    SNCF("SNCF"),
    E_VOYAGEURS("e.Voyageurs");
    public final String name;

    Factory(String name) {
        this.name = name;
    }
}
