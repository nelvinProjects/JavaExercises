package Library;

import java.time.LocalDate;
import java.util.ArrayList;

public class LibraryProcess implements LibraryAction {
    private ArrayList<Person> customers = new ArrayList<>();
    private ArrayList<Withdraw> itemOut = new ArrayList<>();


    @Override
    public boolean checkout(int itemID, int customerID) {
        itemOut.add(new Withdraw(customerID, itemID, LocalDate.now(), LocalDate.now().plusDays(7)));
        return false;
    }

    @Override
    public boolean checkIn(int itemID, int customerID) {
        return false;
    }
}
