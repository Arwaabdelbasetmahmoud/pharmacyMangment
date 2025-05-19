package pharmacymanagementsystem;

import java.sql.Date;

/**
 * ===== Builder Pattern =====
 * Class for representing medicine data using Builder Pattern.
 */
public class medicineData {

    private final Integer id;
    private final String type;
    private final String brand;
    private final String productName;
    private final String description;
//private final Integer quantity;
    private final Double price;
    private final Date date;
    private final String status;
    private final String image; // ✅ new field

    // Private constructor
    private medicineData(Builder builder) {
        this.id = builder.id;
        this.type = builder.type;
        this.brand = builder.brand;
        this.productName = builder.productName;
        this.description = builder.description;
    //    this.quantity = builder.quantity;
        this.price = builder.price;
        this.date = builder.date;
        this.status = builder.status;
        this.image = builder.image;
    }

    // ===== Builder Inner Class =====
    public static class Builder {
        private Integer id;
        private String type;
        private String brand;
        private String productName;
        private String description;
      //  private Integer quantity;
        private Double price;
        private Date date;
        private String status;
        private String image; // ✅ new builder field

        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        public Builder type(String type) {
            this.type = type;
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

        public Builder description(String description) {
            this.description = description;
            return this;
        }

   /*     public Builder quantity(Integer quantity) {
            this.quantity = quantity;
            return this;
        }*/

        public Builder price(Double price) {
            this.price = price;
            return this;
        }

        public Builder date(Date date) {
            this.date = date;
            return this;
        }

        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public Builder image(String image) {
            this.image = image;
            return this;
        }

        public medicineData build() {
            return new medicineData(this);
        }
    }

    // ===== Getters =====
    public Integer getId() { return id; }
    public String getType() { return type; }
    public String getBrand() { return brand; }
    public String getProductName() { return productName; }
    public String getDescription() { return description; }
/*    public Integer getQuantity() { return quantity; }*/
    public Double getPrice() { return price; }
    public Date getDate() { return date; }
    public String getStatus() { return status; }
    public String getImage() { return image; }

    @Override
    public String toString() {
        return "MedicineData{id=" + id + ", product=" + productName + ", price=" + price + ", image=" + image + ", status=" + status + "}";
    }
}