package abstractionPrac;

public class PdfReport extends ReportGenerator{

    public PdfReport(String name)
    {
        super(name);
    }

    @Override
    protected boolean formatData(String data)
    {
        System.out.println("pdfReport generated and formatting ////" + data);
        return true;
    }
}
