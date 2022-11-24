package ch.juventus.object;

import java.util.Objects;

public record Address(String street, int number, int zip, String city) {

    public String getStreet() {
        return street;
    }

    public int getNumber() {
        return number;
    }

    public int getZip() {
        return zip;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", number=" + number +
                ", zip=" + zip +
                ", city='" + city + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return number == address.number && zip == address.zip && street.equals(address.street) && city.equals(address.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, number, zip, city);
    }
}
