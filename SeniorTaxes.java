

public class SeniorTaxes extends Taxes{
    double income;
    double health_costs;


    public SeniorTaxes(String name, int sin, double income, double health_costs){
        super(name, sin);
        this.income = income;
        this.health_costs = health_costs;
    }

    public long taxesOwed(){
        if(this.income < 20000){
            return Math.round( 0*this.income - 1*this.health_costs);
        }else if(this.income >= 20000 && this.income <50000){
            return Math.round( 0.1*this.income - 0.75*this.health_costs );
        }else{
            return Math.round( 0.4*this.income - 0.5*this.health_costs );
        }
    }



}
