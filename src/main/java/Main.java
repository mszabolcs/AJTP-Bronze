import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Date start = new Date();
        Date end = new Date();

        Position position1 = new Position("sdad",start,end);
        Position position2 = new Position("s3ad",start,end);

        List<Position> positions = new ArrayList<Position>();
        positions.add(position1);
        positions.add(position2);

        Portfolio portfolio1 = new Portfolio("Portf1",positions);
        Portfolio portfolio2 = new Portfolio("Portf2",positions);
        System.out.println(portfolio1.toString());
        System.out.println(portfolio2.toString());
        //This is just a comment
        //Changed some comments
    }
}
