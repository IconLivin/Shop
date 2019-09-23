public class User {
    String login;
    String adress;
    private double money;
    public User(String name,String adress,double money){
        this.login=name;
        this.adress=adress;
        this.money=money;
    }
    public User(String name){
        login=name;
    }
    public double UserMoney(){return money;}

    public void Buy(Product pr){
        money-=pr.price;
    }
}
