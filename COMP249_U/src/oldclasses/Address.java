package oldclasses;

public class Address {

    // Data attributes
    // Street number (int)
    private int streetNumber;
    //Street name (String)
    private String streetName;
    //Zip code (String)
    private String zipCode;
    //City (String)
    private String cityName;

    public Address(int streetNumber, String streetName, String zipCode, String cityName) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.zipCode = zipCode;
        this.cityName = cityName;
    }

    public Address(Address otherAddress) {
        this.streetNumber = otherAddress.streetNumber;
        this.streetName = otherAddress.streetName;
        this.zipCode = otherAddress.zipCode;
        this.cityName = otherAddress.cityName;
    }

    public Address() {
        this(0, "", "", "");
    }

    // Setters
    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public void setStreetname(String streetName) {
        this.streetName = streetName;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    // Getters
    public int getStreetNumber() {
        return this.streetNumber;
    }

    public String getStreetName() {
        return this.streetName;
    }

    public String getZipCode() {
        return this.zipCode;
    }

    public String getCityName() {
        return this.cityName;
    }

    @Override
    public String toString() {
        return cityName;
    }

    @Override
    public boolean equals(Object otherObject) {

        if (otherObject == null) {
            return false;
        }

        if (getClass() != otherObject.getClass()) {
            return false;
        }

        Address otherAddress = (Address) otherObject;
        if (this.streetNumber == otherAddress.streetNumber && this.zipCode.equals(otherAddress.zipCode)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Address clone() {
        return new Address(this);
    }
}
