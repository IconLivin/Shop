public class Vegetable extends Product {
    double kilo;
    public Vegetable(String name, double price, double kilo) {
        this.class_name = name;
        this.price = price;
        this.kilo = kilo;
    }

    @Override
    public void Add_Product(double in_w) {
        kilo+=in_w;
    }

    @Override
    public int Sail_Product(double sail_w, User dd) {
        if(this.kilo-sail_w<0)return 0;
        else {
            if(dd.UserMoney()-sail_w*price<0)return 1;
            else kilo-=sail_w; return 3;
        }
    }

    @Override
    public double GetSize() {
        return kilo;
    }
}
