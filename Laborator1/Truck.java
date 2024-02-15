private class Truck extends Car {
    int weight;

    Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    double getSalePrice() {
        if (weight > 2000) {
            return super.getSalePrice() * 0.9;
        } else {
            return super.getSalePrice() * 0.8; 
        }
    }
}