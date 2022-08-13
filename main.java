
public enum class AccountStatus {
    ACTIVE,
    DISABLED,
    DELETED
}

public enum class PaymentStatus {
    PENDING,
    PAID
}

public enum class OrderStatus {
    RECIEVED,
    ARRIVED_AT_HUB,
    SHIPPED,
    IN_TRANSIT,
    DELIVERED,
    DISPATCH
}

public class Address {
    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;
    private String country;
}

public class Person {
    private String name;
    private Address address;
    private String email;
    private String phone;
}

public abstract class Account {

    private String id;
    private String password;
    private AccountStatus accStatus;
    private Person person;

    public abstract void resetPassword();
}

public class Sender extends Account {
    private List<Order> orders;

    public void Sender() {
        super();
    }

    public void resetPassword() {
        // implementation
    }

    public getAllOrder() {
        
    }
}

public class Recipient extends Account {
    private List<Order> orders;

    public void Recipient() {
        super();
    }

    public void resetPassword() {
        // implementation
    }

    public getAllOrder() {

    }
}

public class Admin extends Account {

    public void Admin() {
        super();
    }

    public void resetPassword() {
        // implementation
    }

    public assignOrder() {

    }
}

public class DeliveryExecutive extends Account {
    private List<Order> orders;

    public void DeliveryExecutive() {

    }
    public void resetPassword() {
        // implementation
    }

    public void updateOrder(Order order, OrderStatus orderStatus) {

    }

    public void assignOrder() {

    }
}

public class Package {

}

public class Order {
    private String orderId;
    private Sender sender;
    private Recipients reciever;
    private Payment payment;
    private List<Package> packages;
    private Date createdAt;
    private OrderStatus orderStatus;
}

public class Payment {
    private Decimal amount;
    private Currency currency;
    private PaymentStatus status;
}