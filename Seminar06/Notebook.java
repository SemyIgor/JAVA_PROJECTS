package Seminar06;

// import java.util.Date;

public class Notebook {
   private String manufacturer;
   private String model;
   private String releaseYear;
   private float price;
   private int dramSize;
   private int hddSize;
   private String operatingSystem;
   private String color;
   private boolean inStock;

   public Notebook(
         String manufacturer,
         String model,
         String releaseYear,
         int dramSize,
         int hddSize,
         String color) {
      this.manufacturer = manufacturer;
      this.model = model;
      this.releaseYear = releaseYear;
      this.dramSize = dramSize;
      this.hddSize = hddSize;
      this.color = color;
   }

   public String getManufacturer() {
      return manufacturer;
   }

   public void setManufacturer(String manufacturer) {
      this.manufacturer = manufacturer;
   }

   public String getModel() {
      return model;
   }

   public void setModel(String model) {
      this.model = model;
   }

   public String getReleaseYear() {
      return releaseYear;
   }

   public void setReleaseYear(String releaseYear) {
      this.releaseYear = releaseYear;
   }

   public float getPrice() {
      return price;
   }

   public void setPrice(float price) {
      this.price = price;
   }

   public int getDramSize() {
      return dramSize;
   }

   public void setDramSize(int dromSize) {
      this.dramSize = dromSize;
   }

   public int getHddSize() {
      return hddSize;
   }

   public void setHddSize(int hddSize) {
      this.hddSize = hddSize;
   }

   public String getOperatingSystem() {
      return operatingSystem;
   }

   public void setOperatingSystem(String operatingSystem) {
      this.operatingSystem = operatingSystem;
   }

   public String getColor() {
      return color;
   }

   public void setColor(String color) {
      this.color = color;
   }

   public boolean getInStock() {
      return inStock;
   }

   public void setInStock(boolean inStock) {
      this.inStock = inStock;
   }

   @Override
   public String toString() {
      return "" + model + " " + dramSize + " " + hddSize + " " + operatingSystem + " " + color + " " + price;
   }
}
