package GetterAndSetter;
/**
 * Write a JAVA program to input marks of five subjects Physics,
Chemistry, Biology,
Mathematics and Computer. Calculate percentage and grade
according to following using Getter and Setter method:
Percentage >= 90% : Grade A
Percentage >= 80% : Grade B
Percentage >= 70% : Grade C
Percentage >= 60% : Grade D
Percentage >= 40% : Grade E
Percentage < 40% : Grade F
 */
public class Result {
    private double physic;
    private double chemistry;
    private double biology;
    private double math;
    private double computer;
    private double percentage;



    public double getPhysic(){
        return this.physic;
    }
    public void setPhysic(double physic){
        this.physic = physic;
    }
    public double getChemistry(){
        return this.chemistry;
    }
    public void setChemistry(double chemistry){
        this.chemistry = chemistry;
    }
    public double getMath(){
        return this.math;
    }
    public void setMath(double math){
        this.math= math;
    }
    public double getComputer(){
        return this.computer;
    }
    public void setComputer(double computer){
        this.computer = computer;
    }
    public double getBiology(){
        return this.biology;
    }
    public void setBiology(double biology){
        this.biology = biology;
    }
    public double getPercentage(){
        return this.percentage;
    }
    
    public static void main(String[] args) {
        Result grade = new Result();
        grade.setBiology(72);
        grade.setChemistry(65);
        grade.setMath(77);
        grade.setComputer(60);
        grade.setPhysic(45);


        grade.percentage = (grade.biology+grade.chemistry+grade.computer+grade.math+grade.physic)/500*100;

        if(grade.percentage >= 90){
            System.out.println("Congrats!! You have scored Grade A");
        }
        else if(grade.percentage >= 80){
            System.out.println("Congrats!! You have scored Grade B");
        }
        else if(grade.percentage >= 70){
            System.out.println("Congrats!! You have scored Grade C");
        }
        else if(grade.percentage >= 60){
            System.out.println("Congrats!! You have scored Grade D");
        }
        else if(grade.percentage >= 40){
            System.out.println("Congrats!! You have scored Grade E");
        }
        else if(grade.percentage < 40){
            System.out.println("Congrats!! You have scored Grade F");
        }
        

        }
    }
    

