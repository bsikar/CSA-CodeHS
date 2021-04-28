public class Currency {
    private Double value;

    public Currency(Double startValue) {
        value = startValue;
    }

    public void setValue(Double newValue) {
        value = newValue;
    }

    public Integer getDollars() {
        return (int)value.doubleValue();
    }

    public Integer getCents() {
        return (int)(value*100%100);
    }

    public String toString() {
        return "$" + getDollars() + "." + getCents();
    }
}
