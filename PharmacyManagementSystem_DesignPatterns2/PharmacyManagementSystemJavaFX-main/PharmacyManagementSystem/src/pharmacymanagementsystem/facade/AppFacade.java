package pharmacymanagementsystem.facade;

import pharmacymanagementsystem.customerData;
import pharmacymanagementsystem.database;
import pharmacymanagementsystem.observer.DataNotifier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * ===== Facade Pattern =====
 * Provides a unified interface to perform common backend operations for the GUI.
 */

public class AppFacade {

    private final Connection connection;
    private final DataNotifier notifier;

    public AppFacade(DataNotifier notifier) {
        this.connection = database.getInstance().getConnection();
        this.notifier = notifier;
    }

    public boolean addCustomer(customerData customer) {
        String sql = "INSERT INTO customer (customer_id, type, medicine_id, brand, product_name, quantity, price, date) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, customer.customerId);
            statement.setString(2, customer.type);
            statement.setInt(3, customer.medicineId);
            statement.setString(4, customer.brand);
            statement.setString(5, customer.productName);
            statement.setInt(6, customer.quantity);
            statement.setDouble(7, customer.price);
            statement.setDate(8, customer.date);
            int result = statement.executeUpdate();

            if (result > 0) {
                notifier.notifyObservers("New customer added: " + customer.productName);
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // More methods like login, addMedicine(), fetchReports(), etc. can be added here
}
