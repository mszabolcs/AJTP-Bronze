import java.util.List;

public class Portfolio {
    private String portfolio_name;
    private List<Position> positions;

    public Portfolio(String portfolio_name, List<Position> positions) {
        this.portfolio_name = portfolio_name;
        this.positions = positions;
    }

    @Override
    public String toString() {
        return "Portfolio{" +
                "portfolio_name='" + portfolio_name + '\'' +
                ", positions=" + positions +
                '}';
    }
}
