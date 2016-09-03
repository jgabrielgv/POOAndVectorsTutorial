/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author juancho
 */
public class Address {

    private String state;
    private String city;
    private String district;
    private String address;
    private String country;

    public Address() {

    }
    
    public Address(String country) {
        this.country = country;
    }
    
    public Address(String state, String city, String district, String address) {
        this(state, city, district, address, "CR");
    }

    public Address(String state, String city, String district, String address, String country) {
        this.state = state;
        this.city = city;
        this.district = district;
        this.address = address;
        this.country = country;
    }

    /**
     * @return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the district
     */
    public String getDistrict() {
        return district;
    }

    /**
     * @param district the district to set
     */
    public void setDistrict(String district) {
        this.district = district;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Ciudad: " + this.city + ", Direccion: " + address;
        //return String.format("Direccion: %s", this.address);
    }

}