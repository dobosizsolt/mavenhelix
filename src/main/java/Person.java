public class Person {

    private String name;
    private String role;
    private String city;

    public Person() {

    }

    public Person(String name, String role, String city) {
        this.name = name;
        this.role = role;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}