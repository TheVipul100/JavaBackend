package abstractionPrac;

public class CsvReport extends ReportGenerator{

    public CsvReport(String name){
        super(name);
    }

    @Override
    protected boolean formatData(String data){
        System.out.println("CsvReport.File() generated......"+data);
        return true;
    }
}
