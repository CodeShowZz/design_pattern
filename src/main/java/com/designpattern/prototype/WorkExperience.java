package com.designpattern.prototype;

/**
 * @author lin
 * @date 2024/1/16 2:32
 **/
public class WorkExperience implements Cloneable{

    private String company;

    private int year;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "WorkExperience{" +
                "company='" + company + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
