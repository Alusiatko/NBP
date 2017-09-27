package pl.parser.nbp.model;

public class DateRange {
    private String startDate;
    private String endDate;

    public DateRange(String startDate, String endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    String getStartDate() {
        return startDate;
    }

    String getEndDate() {
        return endDate;
    }

    void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "DateRange{" +
                "startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
