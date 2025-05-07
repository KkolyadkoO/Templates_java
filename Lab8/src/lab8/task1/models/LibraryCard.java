package lab8.task1.models;

public class LibraryCard {
    private String id;
    private boolean isActive;
    private boolean hasOverdueBooks;
    private String ownerName;

    public LibraryCard(String id, boolean isActive, boolean hasOverdueBooks, String ownerName) {
        this.id = id;
        this.isActive = isActive;
        this.hasOverdueBooks = hasOverdueBooks;
        this.ownerName = ownerName;
    }

    public String getId() { return id; }
    public boolean isActive() { return isActive; }
    public boolean hasOverdueBooks() { return hasOverdueBooks; }
    public String getOwnerName() { return ownerName; }

    @Override
    public String toString() {
        return "Card{" +
               "id='" + id + '\'' +
               ", active=" + isActive +
               ", overdue=" + hasOverdueBooks +
               ", owner='" + ownerName + '\'' +
               '}';
    }
}
