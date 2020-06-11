package EntityClasses;

import org.jetbrains.annotations.Contract;

import javax.persistence.CascadeType;
import javax.persistence.ManyToOne;

public class Income {
    private int id;
    @ManyToOne(
            cascade = CascadeType.ALL
    )
    private int unit_id;
    private String unit_name;
    private int quarter_id;
    private int year;
    private float net_income;
    private float gross_income;
    private float tax_income;

    @Contract(pure = true)
    public Income() {
    }

    @Contract(pure = true)
    public Income(int unit_id, String unit_name, int quarter_id, int year, float net_income, float gross_income, float tax_income) {
        this.unit_id = unit_id;
        this.unit_name=unit_name;
        this.quarter_id = quarter_id;
        this.year = year;
        this.net_income = net_income;
        this.gross_income = gross_income;
        this.tax_income = tax_income;
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

    public float getNet_income() {
        return net_income;
    }

    public void setNet_income(float net_income) {
        this.net_income = net_income;
    }

    public float getGross_income() {
        return gross_income;
    }

    public void setGross_income(float gross_income) {
        this.gross_income = gross_income;
    }

    public float getTax_income() {
        return tax_income;
    }

    public void setTax_income(float tax_income) {
        this.tax_income = tax_income;
    }

    @Override
    public String toString() {
        return "Income{" +
                "id=" + id +
                ", unit_id=" + unit_id +
                ", quarter_id=" + quarter_id +
                ", year=" + year +
                ", net_income=" + net_income +
                ", gross_income=" + gross_income +
                ", tax_income=" + tax_income +
                '}';
    }
}
