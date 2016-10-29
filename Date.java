import java.util.Scanner;

public class Date {

    private int month;
    private int day;
    private int year;

    public Date()
    {
        month = 1;
        day = 1;
        year = 2000;

    }

    public Date(int month, int day, int year)
    {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public void display()
    {
        System.out.println(this.month+"/"+this.day+"/"+this.year);
    }

    public static void main(String[] args) {

        Date date = new Date();
        Date date2 = new Date(12,11,2000);

        date.display();
        date2.display();

    }

}
