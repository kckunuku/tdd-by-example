package guru.springframework;

public class Dollar {

    int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int multiplier){
        return new Dollar(amount*multiplier);
    }

    public int amount(){
        return this.amount;
    }

    public boolean equals(Object object){
        Dollar dollar = (Dollar) object;
        return amount == dollar.amount();
    }
}
