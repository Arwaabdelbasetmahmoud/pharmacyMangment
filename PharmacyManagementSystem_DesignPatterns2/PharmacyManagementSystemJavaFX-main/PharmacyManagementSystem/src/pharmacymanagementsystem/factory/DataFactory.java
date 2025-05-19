package pharmacymanagementsystem.factory;

import pharmacymanagementsystem.customerData;
import pharmacymanagementsystem.medicineData;

/**
 * ===== Factory Pattern =====
 * This factory class centralizes the creation of domain data objects like Customer and Medicine.
 */
public class DataFactory {

    public enum DataType {
        CUSTOMER,
        MEDICINE
    }

    public static Object createData(DataType type) {
        switch (type) {
            case CUSTOMER:
                return new customerData.Builder().build();
            case MEDICINE:
                return new medicineData.Builder().build();
            default:
                throw new IllegalArgumentException("Unknown data type: " + type);
        }
    }
}
