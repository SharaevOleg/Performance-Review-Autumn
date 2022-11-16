package solid.singleResponsibilityPrinciple;

public class RentCarService {
    public Car findCar(String carNo) {
        //find car by number
        Car car = new Car();
        return car;
    }

    public Order orderCar(String carNo, Client client) {
        //client order car
        Order order = new Order();
        return order;
    }

}
