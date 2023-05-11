package transport;
public class Car {
    
    // FIELD -----------------------------------------------------------------------------------
    private String company;
    private String model;
    private String color;
    private int maxSpeed;


    // DEFAULT CONSTRUCTOR ---------------------------------------------------------------------
    public Car()
    {
        System.out.println("***** DEFAULT CONSTRUCTOR *****");
        company = "";
        model = "";
        color = "";
        maxSpeed = 0;
    }


    // OVERLOADED CONSTRUCTOR ------------------------------------------------------------------
    public Car(String company, String model, String color, int maxSpeed)
    {
        System.out.println("***** OVERLOADED CONSTRUCTOR *****");
        this.company = company;
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }


    // 필드값을 private로 선언했기 때문에 getter/setter 필요
    // SETTER -----------------------------------------------------------------------------------
    public void setCompany(String company) { this.company = company; };
    public void setModel(String model)     { this.model = model; };
    public void setColor(String color)     { this.color = color; };
    public void setMaxSpeed(int maxSpeed)  { this.maxSpeed = maxSpeed; };


    // GETTER -----------------------------------------------------------------------------------
    public String getCompany()  { return this.company; };
    public String getModel()    { return this.model; };
    public String getColor()    { return this.color; };
    public int getMaxSpeed()    { return this.maxSpeed; };
}
