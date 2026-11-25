package day44.PracticeSet;

import java.io.*;

public class ReadingFile {
    /*
    * READING INPUT FROM THE FILE USING BufferReader
    * */

    public static double calculateTotal(String path,String number,String amount ) {
        double total = 0;
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(path)); //invalid path, 2 objects ()decorator pattern in I/O in java

            try { //It can throw IOException (disk problem, file closed below line
                String line = br.readLine();  //The readLine() method: reads one whole line at a time. FileReader alone can’t do this.
                // line == read line by line the values passed inside file
                while (line != null) {
                    try {
                        String[] parts = line.split(",");
                        String item = parts[0];  // values read from the file passed in revise.txt
                        int qty = Integer.parseInt(parts[1]);
                        double price = Double.parseDouble(parts[2]);
                        total += qty * price;

                    } catch (ArrayIndexOutOfBoundsException arr) {
                        arr.printStackTrace();
                    } catch (NumberFormatException num) {
                        num.printStackTrace();
                    }
                    line = br.readLine();
                }
            } catch (IOException f) {
                System.out.println("Inner();.........inside file handling........");
                f.printStackTrace();

            }
        } catch (FileNotFoundException file) {
            //              file.addSuppressed();
            file.printStackTrace();
            /*
             * addSuppressed() attaches a secondary exception to a primary one, so that the secondary exception
             * isn’t lost. It’s one of the more advanced parts of exception handling
             * */
        } finally {
            try {
                /*
                * if (br != null) in finally: if not done then its the real bug. When the file isn’t found, br stays null,
                *  and br.close() threw a NullPointerException that hid your FileNotFoundException.*/
                if (br != null)
                    br.close();
            } catch (IOException io) {
                System.out.println(io.getMessage());
            }
        }

        // number and amount are now actually used, so they can fail too
        try {
            int n = Integer.parseInt(number);
            double a = Double.parseDouble(amount);
            System.out.println("number=" + n + ", amount=" + a);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number/amount argument: " + e.getMessage());
        }

        return total;
    }

    static void main(String[] args)  {
        try {
            System.out.println(calculateTotal(args[0],args[1],args[2]));
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Exception handled......");
        }
    }
}


 /*
              FileReader ---
              * Used alone, it’s slow, because each read can go to the disk.

              * BuffeReader ----
              * BufferedReader wraps the FileReader and adds two things:
               A buffer: a chunk of memory. Instead of going to the disk for every character,
               it grabs a big block (8192 characters by default) at once and serves you from memory. This is much faster.
               The readLine() method: reads one whole line at a time. FileReader alone can’t do this.
              * */

/*
  bufferReader(reads the line from the file ) filereader --  to load the file from the disk and to open nd read char by char
  this pattern of wrapping one object inside another is called the decorator pattern, and it’s common in Java I/O.
  */
// one object wrapping another object