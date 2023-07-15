package entities;

import java.util.Date;

public class HourContract {

	private Date date;
	private double ValuePerlHour;
	private Integer hours;

	public HourContract() {

	}

	public HourContract(Date date, double valuePerlHour, Integer hours) {
		this.date = date;
		ValuePerlHour = valuePerlHour;
		this.hours = hours;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getValuePerlHour() {
		return ValuePerlHour;
	}

	public void setValuePerlHour(double valuePerlHour) {
		ValuePerlHour = valuePerlHour;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public double totalValue() {

		return ValuePerlHour * hours;

	}

}
