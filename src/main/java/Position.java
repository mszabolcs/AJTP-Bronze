import java.util.Date;

public class Position {
    private String cusip;
    private Date start_date;
    private Date end_date;

    public Position(String cusip, Date start_date, Date end_date){
        this.cusip = cusip;
        this.start_date = start_date;
        this.end_date = end_date;
    }
}
