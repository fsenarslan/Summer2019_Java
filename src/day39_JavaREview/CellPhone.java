package day39_JavaREview;

public class CellPhone {
    String  brand;
    double price;
    String color;
    double screensize;
    String model;
    
    public CellPhone() {  // set up default values for attributes of the class
        brand = "iPhone";
        model = "10";
        screensize = 5.8;
        color = "White";
        price = 700;
    }
    
    public CellPhone(String brand, double price, String color, double screensize, String model) {
        this.brand = brand;
        this.price = price;
        this.color = color;
        this.screensize = screensize;
        this.model = model;
        
    }
    
    public void call(long PhoneNumber ) {
        System.out.println(brand+" "+model+" is calling "+PhoneNumber);
    }
    
    public void SendMessage( long PhoneNumber) {
        System.out.println("Sending messages to "+PhoneNumber);
    }
    
    public void getInfo() {
        System.out.println(brand+" "+model+" "+color+" "+screensize+" $"+price);
    }

}
