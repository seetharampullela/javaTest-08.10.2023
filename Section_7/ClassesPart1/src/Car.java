public class Car {
    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean convertible;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        if (make == null) this.make = "Unknown";
        else {
            String lowercaseMake = make.toLowerCase();
            switch (lowercaseMake) {
                case "hold":
                case "porsche":
                case "tesla":
                    this.make = make;
                    break;
                default:
                    this.make = "Unsupported";
                    break;
            }
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describeCar() {
        System.out.println(doors + " -Door, "+"color- "+color+", make- " + make + " ");
    }
}
