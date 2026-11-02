package abstractionPrac;

//program to generate report in the form of pdf , csv, excel for sales of books based on formatting files
public abstract class ReportGenerator {

    private final String reportName;             //encapsulation

     ReportGenerator(String reportName) {
        this.reportName = reportName;
    }

    //core implementation
    private boolean fetchData(String data) {      //abstraction implementation is private
         //fetchData does is it validates the input and print the message fetched.
        if (data == null || data.isEmpty())
        {
            System.out.println("No data to fetch for " + reportName);
            return false;
            /**
             * false 2nd condt. true "" returns false in the conditional check below in the condn. !false = true so that
             * goes inside cond. and returns false;
             */
        }
        System.out.println("Fetching data for...." + reportName);
        return true;
    }

    protected abstract boolean formatData(String data);  // -->> child decides which file to be formatted...

    private boolean save() {
        System.out.println("Report saved: " + reportName);
        return true;
    }

    public boolean report(String name)
    {
        /**
         * function to check whether the report generated already exists in the localStorage or not.
         */
        if(name.equals(reportName))
        {
            System.out.println("reportName is as per the dB");
            return true;
        }

        return false;
    }

    // method available to the outside world hiding the above core implementation
    public final boolean generate(String data) {
        /**
         * Q1 sales data ...........  method to call three above steps in order.
         * if the conditions fails return false
         */
        if (!fetchData(data))
            return false;
        if(!formatData(data))  // if nothing has been fetched from client side then nothing to format
            return false;

        return save();
    }

}
