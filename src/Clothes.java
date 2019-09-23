public class Clothes extends Product {
    double count;
    public Clothes(String name, double price, double kilo) {
        this.class_name = name;
        this.price = price;
        this.count = kilo;
    }

    @Override
    public void Add_Product(double in_w) {
        count+=in_w;
    }

    public int Sail_Product(double sail_w,User dd){
        if(this.count-sail_w<0)return 0;
        else {
            if(dd.UserMoney()-sail_w*price<0)return 1;
            else count-=sail_w; return 3;
        }
    }

    public double GetSize(){
        return count;
    }
}
