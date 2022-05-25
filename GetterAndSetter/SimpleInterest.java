package GetterAndSetter;
/**
 * Calculate Simple Interest using Getter and Setter methods.

 */

public class SimpleInterest {
    private double principle;
    private double rate;
    private double time;
    private double result;

    public void setPrinciple(double principle){
        this.principle = principle;

    }

    public double getSimpleInterest() {
        result = (this.principle*this.rate*this.time)/100;
        return result;
    }

    public void setSimpleInterest(double simpleInterest) {
        this.result = simpleInterest;
    }

    public double getPrinciple(){
        return this.principle;
    }
    public void setRate(double rate){
        this.rate = rate;
    }

    public double getRate(){
        return this.rate;
    }
    public void setTime(double time){
        this.time = time;
    }
    public double getTime(){
        return this.time;
    }
    public static void main(String[] args) {
        SimpleInterest si = new SimpleInterest();
        si.setPrinciple(35000.0);
        si.setRate(3.5);
        si.setTime(3);

        System.out.println(si.getSimpleInterest());
    
        
    }
    
    
}
