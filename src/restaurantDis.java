//abstract class

abstract class restaurantDis {
    abstract String getRestaurantDiscount();}
class GoldDis extends restaurantDis{
    String getRestaurantDiscount(){
        return "10";
    }
}

class PlatniumDis extends restaurantDis{
    String getRestaurantDiscount(){
        return "25";
    }
}