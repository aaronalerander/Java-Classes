package comp1406a4;

public class StudentTaxes extends Taxes{

    double income;
    double tuition;

    public StudentTaxes(String name, int sin, double income, double tuition){
        super(name, sin);
        this.income = income;
        this.tuition = tuition;
    }

    public long taxesOwed(){
        if(this.income < 10000){
            return Math.round( 0.1*this.income - this.tuition );

        }else if(this.income >= 10000 && income < 30000){
            return Math.round( 0.3*this.income - this.tuition*0.5 );

        }else{
            return Math.round( 0.5*this.income - this.tuition*0.25  );

        }
    }



}

