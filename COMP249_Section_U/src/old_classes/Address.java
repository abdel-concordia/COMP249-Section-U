package old_classes;

public class Address {

    private int streetNumber;
    private String streetName;
    private String cityName;

    // Constructors
    public Address(int streetNumber, String streetName, String cityName) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.cityName = cityName;
    }

    // Copy constructor
    public Address(Address otherAddress) {
        this(otherAddress.streetNumber, otherAddress.streetName, otherAddress.cityName);
    }

    // Getters
    public int getStreetNumber() {
        return this.streetNumber;
    }

    public String getStreetName() {
        return this.streetName;
    }

    public String getCityName() {
        return this.cityName;
    }

    // Setters
    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    // toString
    public String toString() {
        return this.streetNumber + " " + this.streetName + ", " + this.cityName;
    }

    // equals
    public boolean equals(Address otherAddress) { // Will be improved later
        if (otherAddress == null) {
            return false;
        }
        return this.streetNumber == otherAddress.streetNumber
                && this.streetName.equals(otherAddress.streetName)
                && this.cityName.equals(otherAddress.cityName);
    }
}
