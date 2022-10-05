public class Rectangle { 
    // only within the class have access. 
    private double width; 
    private double height; 

    //constractor public to everyone 
    public Rectangle (double w, double h){
        width = w; 
        height = h; 
    }
    //constractor without any argument 
    public Rectangle(){
        width = 1; 
        height =1; 
    }

    //getter methods 
    public double getWeight (){
        return width; 
    }
}