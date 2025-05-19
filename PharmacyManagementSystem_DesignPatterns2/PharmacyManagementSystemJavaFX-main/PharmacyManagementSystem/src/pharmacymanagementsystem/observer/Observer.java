package pharmacymanagementsystem.observer;

/**
 * ===== Observer Pattern =====
 * Observer interface to be implemented by any class that wants to be notified of data changes.
 */
public interface Observer {
    void update(String message);
}
