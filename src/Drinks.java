public class Drinks extends Product {
    double liter;
    public Drinks(String name, double price, double liter) {
        this.class_name = name;
        this.price = price;
        this.liter = liter;
        this.liter=liter;
    }
    public void Add_Product(double in_w) {
        liter+=in_w;
    }
    public int Sail_Product(double sail_w, User dd) {
        if(this.liter-sail_w<0)return 0;
        else {
            if(dd.UserMoney()-sail_w*price<0)return 1;
            else liter-=sail_w;return 3;

        }
    }

    @Override
    public double GetSize() {
        return liter;
    }
}
