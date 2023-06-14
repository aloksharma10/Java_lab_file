class Address {
    private String city;
    private String state;

    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getAddressDetails() {
        return "City: " + city + ", State: " + state;
    }
}

class Employee {
    private String name;
    private Address address;

    public Employee(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }
}

public class Q8 {
    public static void main(String[] args) {
        Address address = new Address( "New Delhi", "Delhi");
        Employee employee = new Employee("Alok Sharma", address);
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Address: " + employee.getAddress().getAddressDetails());
    }
}
