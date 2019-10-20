package OOP;

public class Car {

    private String doors;
    private String wheels;
    private String model;
    private String engine;
    private String colour;

    public void myFunc(String modelm){
        String validModel = modelm.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("macan")) {
            this.model = modelm;
        }else{
            this.model = "Unknown";
        }
        }


    public String getModel(){
        return this.model;
    }

}
