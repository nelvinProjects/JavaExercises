package Library;

public interface LibraryAction {
    public boolean checkout(int id, int customerID);
    public boolean checkIn(int id, int customerID);
}
