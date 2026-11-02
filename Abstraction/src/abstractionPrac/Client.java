package abstractionPrac;

public class Client {

    public static void main(String[] args) {

    //    ReportGenerator rv = new ReportGenerator();  // this tells the class is abstract so it cannot be instantiated directly.

        ReportGenerator rv1 = new PdfReport("Sales");
        // calling them directly is not the right approached for polymorphism can be done but thats not the right way

        ReportGenerator rv2 = new ExcelReport("Alchemist");

        ReportGenerator rv3 = new CsvReport("The Mountain Is You...");

        ReportGenerator[] arr = {rv1, rv2 , rv3};

        rv2.report("Alchemist");

        for(ReportGenerator r : arr)
        {
            System.out.println(r.generate("Q2 sales"));  // empty string results in false;
        }

        System.out.println(rv2.generate(null));
        System.out.println(rv2.generate(""));
        System.out.println(rv1.generate("Q1 sales data of Sales of Ikigai"));   // generate will generate the sale of each book if "" empty then no sale.
    }
}
