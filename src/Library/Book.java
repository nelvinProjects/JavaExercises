package Library;

public class Book extends LibraryItem {
    private String publisher;

    public Book(int id, String name, String publisher){
        super(id, name);
        this.publisher = publisher;
    }

    public String getPublisher(){
        return this.publisher;
    }

    public boolean setPublisher(String name){
        this.publisher = name;
        if (this.publisher.equals(name)){
            return true;
        }else return false;
    }
}
