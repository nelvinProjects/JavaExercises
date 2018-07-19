package Library;

public class Person {
    private int customerID;
    private String name;

    public int getCustomerID(){
        return this.customerID;
    }

    public String getCustomerName(){
        return this.name;
    }

    public boolean setCustomerID(int newID){
        this.customerID = newID;
        if (this.customerID == newID) return true;
        else return false;
    }

    public boolean setCustomerName(String newName){
        this.name = newName;
        if (this.name.equals(newName)) return true;
        else return false;
    }
}
