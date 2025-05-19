package pharmacymanagementsystem;

import java.sql.Date;

public class customerData {

    public final Integer customerId;
    public final String type;
    public final Integer medicineId;
    public final String brand;
    public final String productName;
    public final Integer quantity;
    public final Double price;
    public final Date date;

    private customerData(Builder builder) {
        this.customerId = builder.customerId;
        this.type = builder.type;
        this.medicineId = builder.medicineId;
        this.brand = builder.brand;
        this.productName = builder.productName;
        this.quantity = builder.quantity;
        this.price = builder.price;
        this.date = builder.date;
    }

    // ✅ Getter methods required by JavaFX TableView
    public Integer getCustomerId() {
        return customerId;
    }

    public String getType() {
        return type;
    }

    public Integer getMedicineId() {
        return medicineId;
    }

    public String getBrand() {
        return brand;
    }

    public String getProductName() {
        return productName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getPrice() {
        return price;
    }

    public Date getDate() {
        return date;
    }

    // ✅ Builder class
    public static class Builder {
        private Integer customerId;
        private String type;
        private Integer medicineId;
        private String brand;
        private String productName;
        private Integer quantity;
        private Double price;
        private Date date;

        public Builder customerId(Integer customerId) {
            this.customerId = customerId;
            return this;
        }

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder medicineId(Integer medicineId) {
            this.medicineId = medicineId;
            return this;
        }

        public Builder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder productName(String productName) {
            this.productName = productName;
            return this;
        }

        public Builder quantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder price(Double price) {
            this.price = price;
            return this;
        }

        public Builder date(Date date) {
            this.date = date;
            return this;
        }

        public customerData build() {
            return new customerData(this);
        }
    }
}