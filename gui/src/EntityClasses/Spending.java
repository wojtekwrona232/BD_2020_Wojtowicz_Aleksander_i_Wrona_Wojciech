package EntityClasses;

import org.jetbrains.annotations.Contract;

import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;

public class Spending {
    private int id;
    @ManyToOne(
            cascade = CascadeType.ALL
    )
    private int unit_id;
    private String unit_name;
    @ManyToOne(
            cascade = CascadeType.ALL
    )
    private int quarter_id;
    private int year;
    private float spending_sum;

    @Contract(pure = true)
    public Spending(int unit_id, int quarter_id, int year, float spending_sum) {
        this.unit_id = unit_id;
        this.quarter_id = quarter_id;
        this.year = year;
        this.spending_sum = spending_sum;
    }

    @Contract(pure = true)
    public Spending() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUnit_id() {
        return unit_id;
    }

    public void setUnit_id(int unit_id) {
        this.unit_id = unit_id;
    }

    public String getUnit_name() {
        return unit_name;
    }

    public void setUnit_name(String unit_name) {
        this.unit_name = unit_name;
    }

    public int getQuarter_id() {
        return quarter_id;
    }

    public void setQuarter_id(int quarter_id) {
        this.quarter_id = quarter_id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getSpending_sum() {
        return spending_sum;
    }

    public void setSpending_sum(float spending_sum) {
        this.spending_sum = spending_sum;
    }

    @Override
    public String toString() {
        return "Spending{" +
                "id=" + id +
                ", unit_id=" + unit_id +
                ", quarter_id=" + quarter_id +
                ", year=" + year +
                ", spending_sum=" + spending_sum +
                '}';
    }
}
