import java.util.ArrayList;

public class Car {


    private String name;
    private ArrayList<String> models;

    public Car(){

    }

    public Car(String name, ArrayList<String> models) {
        this.name = name;
        this.models = models;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getModels() {
        return models;
    }

    public void setModels(ArrayList<String> models) {
        this.models = models;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", models=" + models +
                '}';
    }
}



