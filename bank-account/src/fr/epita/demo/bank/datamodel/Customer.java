package fr.epita.demo.bank.datamodel;

public class Customer {
    private String name;
    private String address;
    private int id;

    /**
     * this are the properties of the customers
     */
    public Customer(){
        /**
         * this is the constructor of the customers
         */
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
