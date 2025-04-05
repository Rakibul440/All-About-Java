
class Product{
    private String productId;
    private String productName;
    private double price;
    private int quantity;

    public String getProductId() {
        return productId;
    }
    public String getProductName() {
        return productName;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void setQuantity(int qyt) {
        this.quantity = qyt;
    }

    public Product(String id,String name){
        this.productId = id;
        this.productName = name;
        this.quantity = 1;
        this.price = 1;
    }

    public Product(String id, String name , double price, int qty){
        this.productId = id;
        this.productName = name;
        this.price = price;
        this.quantity = qty;
    }

    // Methods
    public void productDetails(){
        System.out.println("Item id : "+ getProductId());
        System.out.println("Item name : "+getProductName());
        System.out.println("Item's price : " + getPrice());
        System.out.println("No of available items : " + getQuantity());
    }
}

class Customer{
    private String customerId;
    private String name;
    private String address;
    private long phone;

    public String getCustomerId() {
        return customerId;
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public long getPhone() {
        return phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void setPhone(long phone) {
        this.phone = phone;
    }

    public Customer(String id, String name){
        this.customerId = id;
        this.name = name;
        this.address = "";
        this.phone = 9_999_999_999L;
    }
    public Customer(String id, String name, String address, long ph){
        this.customerId = id;
        this.name = name;
        this.address = address;
        this.phone = ph;
    }

        // Methods
        public void customerDetails(){
            System.out.println("Customer id : "+ getCustomerId());
            System.out.println("Customer name : "+getName());
            System.out.println("Customer's address : " + getAddress());
            System.out.println("Phone no : " + getPhone());
        }
}

public class ProductInfo {

    public static void main(String[] args) {
        
        Product item1 = new Product("AB47-HF31", "T-Shirt");
        Customer person1 = new Customer("RR32-B", "Rakibul Islam");
        
        item1.setPrice(499.00);
        item1.setQuantity(10);

        person1.setAddress("CGEC , WB 736170");

        Product item2 = new Product("AB69-MR31", "Saree", 1200.00, 7);
        Customer person2 = new Customer("RS42-B", "Rakibul", "CGEC , WB 736170", 8327669000L);

        // item1.productDetails();
        // person1.customerDetails();

        item2.productDetails();
        System.out.println("");
        person2.customerDetails();
    }
    
}
