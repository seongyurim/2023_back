package transport;
public class Car {
    
    // FIELD
    public String company;
    public String model;
    public String color;
    public int maxSpeed;

    // DEFAULT CONSTRUCTOR
    public Car()
    {
        System.out.println("*** DEFAULT CONSTRUCTOR ***");
        company = "";
        model = "";
        color = "";
        maxSpeed = 0;
    }

    // OVERLOADED CONSTRUCTOR
    public Car(String company, String model, String color, int maxSpeed)
    {
        System.out.println("*** OVERLOADED CONSTRUCTOR ***");
        this.company = company;
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    // SETTER
    public void setCompany(String company) { this.company = company; };
    public void setModel(String model)     { this.model = model; };
    public void setColor(String color)     { this.color = color; };
    public void setMaxSpeed(int maxSpeed)  { this.maxSpeed = maxSpeed; };

    // GETTER
    public String getCompany()  { return company; };
    public String getModel()    { return model; };
    public String getColor()    { return color; };
    public int getMaxSpeed()    { return maxSpeed; };
}
