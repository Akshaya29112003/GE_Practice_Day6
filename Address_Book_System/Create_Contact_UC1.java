package Address_Book_System;

public class Create_Contact_UC1 {
    public String fname;
    public String lname;
    public String address;
    public String city;
    public String state;
    public String zip;
    public String phone;
    public String email;

    public Create_Contact_UC1(String fname, String lname, String address, String city, String state, String zip, String phone, String email) {
        this.fname = fname;
        this.lname = lname;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
    }

    public String getFname(){
        return fname;
    }

    public String getLname(){
        return lname;
    }
    public void updateDetails(String address, String city, String state, String zip, String phone, String email){
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.email = email;
    }
    @Override
    public String toString(){
        return "Name: " + fname + " " + lname + "\nAddress: " + address + ", " + city + ", " + state + ", " + zip + "\nPhone: " + phone + "\nEmail: " + email;
    }
}
