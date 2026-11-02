package abstractionPrac;

public class ExcelReport extends ReportGenerator {
    public ExcelReport(String name)
    {
        super(name);
    }

    @Override
    protected boolean formatData(String data)
    {
        System.out.println("ExcelReport generated.... "+ data);
        return true;
    }
}
