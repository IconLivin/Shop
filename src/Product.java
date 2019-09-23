abstract class Product {
    double price;
    String class_name;

    abstract public void Add_Product(double in_w);

    abstract public int Sail_Product(double sail_w,User dd);

    abstract public double GetSize();

    public double Get_Price() {
        return this.price;
    }
}

