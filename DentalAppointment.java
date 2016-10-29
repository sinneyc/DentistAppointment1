import java.util.Scanner;
/**
 * Created by sing_ on 10/27/2016.
 */
public class DentalAppointment {
    Person person;
    Time starttime;
    Time endtime;
    Date date;
    private int appointmentDuration;

    public DentalAppointment(String last, String first, int month, int day, int year, int hour, int minute){
        person = new Person(last,first,"X");
        starttime = new Time(hour,minute);

        endtime = new Time(hour,minute);
        date = new Date(month, day, year);

        this.appointmentDuration = 30;
        endtime.add(appointmentDuration);
    }

    public DentalAppointment(String first, String last, int month, int day, int year, int hour, int minute, int appointmentDuration){
        person = new Person(last,first,"X");
        starttime = new Time(hour,minute);

        endtime = new Time(hour,minute);
        date = new Date(month, day, year);

        this.appointmentDuration = appointmentDuration;
        endtime.add(this.appointmentDuration);
    }


    public void display(){
        person.display();
        date.display();
        System.out.print("Dental appointment scheduled: ");
        starttime.display();
        System.out.print("Dental appointment ends: ");
        endtime.display();

    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        DentalAppointment [] dental = new DentalAppointment[3];

        for (int i =0; i <3; i++ ) {
            System.out.print("First: ");
            String first = sc.nextLine();
            System.out.print("Last: ");
            String last = sc.nextLine();
            System.out.print("Month: ");
            int month = sc.nextInt();
            System.out.print("Day: ");
            int day = sc.nextInt();
            System.out.print("Year: ");
            int year = sc.nextInt();
            System.out.print("Hour: ");
            int hour = sc.nextInt();
            System.out.print("Minute: ");
            int minute = sc.nextInt();
            System.out.print("Duration (-1 for nothing): ");
            int appointmentDuration = sc.nextInt();
            String empty = sc.nextLine();


            if (appointmentDuration == -1){
                DentalAppointment app = new DentalAppointment(last,first,month,day,year,hour,minute);
                dental[i] = app;
                app.display();
            }
            else{
                DentalAppointment app = new DentalAppointment(last,first,month,day,year,hour,minute,appointmentDuration);
                dental[i] = app;
                app.display();
            }

        }
    }

}
