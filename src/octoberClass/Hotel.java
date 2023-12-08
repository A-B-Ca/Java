package octoberClass;

public enum Hotel {
    HALF(50),
    FULL(100),
    QUARTER(25),
    DOUBLE(200);
    final int price;
    Hotel(int price){
        this.price=price;
    }
}
