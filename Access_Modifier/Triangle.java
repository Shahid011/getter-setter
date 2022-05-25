public class Triangle {
    /**
     * Mrite a program to print the area and perimeter of a triangle having
sides of 3, 4 and 5 units by creating a class named 'Triangle
without
any parameter in its constructor.
     */
    
       double side1=3;
       double side2 = 4;
       double side3 = 5; 
    
    public static void main(String[] args) {
        Triangle mytri = new Triangle();

        double perimeter = (mytri.side1+mytri.side2+mytri.side3);

        double s = perimeter/2;
        double a = (s*(s-mytri.side1)*(s-mytri.side2)*(s-mytri.side3));
        double area = Math.sqrt(a);

        System.out.println("The area of triangle is " +area);
        
    }
    
}
