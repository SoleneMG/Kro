package main.exo25.data.models;

public class Price {
    public final float value;
    public final int minAge;

    public Price(float value, int minAge) {
        this.value = value;
        this.minAge = minAge;
    }

    public int getMinAge() {
        return minAge;
    }
}
