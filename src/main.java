
import java.io.*;

public class main {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        User user=new User("Алеша","ул.Пушкина",1000);
        Fruit apple=new Fruit("Apple",10.0,20.3);
        Fruit cucumber=new Fruit("Cucumber",20.0,30);
        Fruit orange=new Fruit("Orange",40.0,10);
        Vegetable potato=new Vegetable("Potato",15.0,70);
        Clothes socks=new Clothes("Socks",200,5);
        Drinks beer=new Drinks("Baltika Beer",150,3);
        Product[] pr={apple,cucumber,orange,potato,socks,beer};
        System.out.println("Приветствуем вас в магазине ТошаШоп, "+user.login);
        while(true){
            System.out.println("Пользователь:"+user.login);
            System.out.println("Количество денег:"+user.UserMoney());
            for(int i=0;i<pr.length;i++){
                System.out.println(i+".Продукт "+pr[i].class_name+":");
                System.out.println("   Цена:"+pr[i].price);
                System.out.println("   Количество:"+pr[i].GetSize());
            }
            System.out.println("Введите номер продукта:");
            String mes=bufferedReader.readLine();
            int res=Integer.parseInt(mes);
            if(res>=0&&res<pr.length){
                System.out.println("Сколько вам нужно?:");
                mes=bufferedReader.readLine();
                double we=Double.parseDouble(mes);
                int result=pr[res].Sail_Product(we,user);
                if(result==0){
                    System.out.println("Вы пытаетесь купить больше чем у нас есть!");
                }
                else if(result==1)System.out.println("У вас недостатончно денег!");
                else System.out.println("Операция прошла успешно!"); user.Buy(pr[res]);
            }
        }

    }
}
