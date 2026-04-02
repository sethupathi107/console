package model;
import java.time.LocalDate;

public class Weather {
    String city;
    LocalDate date;
    int temp;
    public Weather(String city, LocalDate date, int temp) {
        this.city = city;
        this.date = date;
        this.temp = temp;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public int getTemp() {
        return temp;
    }
    public void setTemp(int temp) {
        this.temp = temp;
    }
    public String toString() {
        return "Weather for city : " + city + " on date : " + date + " Temperatur is " + temp;
    }
}
