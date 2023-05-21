 public class Product {
    private String name;
    private String type;
    private String place;
    private int warrenty;

     public Product() {
     }

     public Product(String name, String type, String place, int warrenty) {
         this.name = name;
         this.type = type;
         this.place = place;
         this.warrenty = warrenty;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public String getType() {
         return type;
     }

     public void setType(String type) {
         this.type = type;
     }

     public String getPlace() {
         return place;
     }

     public void setPlace(String place) {
         this.place = place;
     }

     public int getWarrenty() {
         return warrenty;
     }

     public void setWarrenty(int warrenty) {
         this.warrenty = warrenty;
     }

     @Override
     public String toString() {
         return "Product{" +
                 "name='" + name + '\'' +
                 ", type='" + type + '\'' +
                 ", place='" + place + '\'' +
                 ", warrenty=" + warrenty +
                 '}';
     }
 }
