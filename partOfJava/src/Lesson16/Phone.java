package Lesson16;

public class Phone {
    private String name;
    private Price price;

    public Phone(String name, Price price) {
        this.name = name;
        this.price=price;
    }

    public String getName() {

        return name;
    }

    public void setName(String name){
    this.name = name;
    }

    public Price getPrice(){
        return price;
    }





}
