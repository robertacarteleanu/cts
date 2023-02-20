import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here
        OnlineShop onlineShop = new OnlineShop("Emag", "logo.jpg", new ArrayList<Product>());

        Product p1 = new Product("Laptop", 3200.5, 1,1, 1123, "");
        Product p2 = new Product("Frigider", 207.95, 1,2, 1245, "");

        Product p3 = new Product(p1);

        p3.setQty(5);
        p3.setName("Paine");

        onlineShop.addProduct(p1);
        onlineShop.addProduct(p2);
        onlineShop.removeProduct(p1);

        System.out.println(p1.areProductsTheSame(p2));
    }
}

class OnlineShop {
    private String name;
    private String image;
    private ArrayList<Product> products;

    OnlineShop(String name, String img, ArrayList<Product> products)
    {
        this.products = new ArrayList<Product>();
        this.image= img;
        this.name = name;
    }

    public void addProduct(Product product){
        this.products.add(product);
    }
    public void removeProduct(Product product){
        this.products.remove(product);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image= image;
    }
}

class Product
{
    private int id;
    private String name;
    private double price;
    private int type;
    private int category;
    private int qty;
    private String expiryDate; //expiry date - only for goods
    private String details; // ex.: processor, memory, power, volume (for refrigerators etc)

    public Product(String name, double price, int type, int category, int id, String expiryDate)
    {
        this.name = name;
        this.price = price;
        this.type = type;
        this.category = category;
        this.id = id;
        this.expiryDate = expiryDate;
    }

    public Product(Product p)
    {
        this.name = p.name;
        this.price = p.price;
        this.type = p.type;
        this.category = p.category;
        this.id = p.id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public boolean areProductsTheSame(Product p)
    {
        if(p.id != this.id)
            return false;
        if(!p.name.equals(this.name))
            return false;
        if(p.price != this.price)
            return false;
        if(p.type != p.type)
            return false;
        if(p.category != this.category)
            return false;

        return true;
    }

    public void multiplyPrice(double val){
        this.price+=this.price*val;
    }
    public void devidePrice(double val){
        this.price-=this.price*val/100;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}

class User
{
    private String username;
    private String id;
    private ArrayList<Order> orders;

    public User(String username, String id)
    {
        this.username = username;
        this.id = id;
        orders=new ArrayList<Order>();
    }

    public void addOrder(Order order){
        this.orders.add(order);
    }
}

class Order
{
    private ArrayList<Product> listOfProducts;
    private String address;

    public Order()
    {
        listOfProducts= new ArrayList<Product>();
    }
    public void addProductToOrder(Product p)
    {
        if(listOfProducts.size() > 99)
            return;

        listOfProducts.add(p);
    }

    public void removeProductFromOrder(Product p)
    {
        listOfProducts.remove(p);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

class InventoryP
{
    private Product product;
    private int qty;

    public InventoryP(Product product, int qty)
    {
        this.product = new Product(product);
        this.qty = qty;
    }
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}


