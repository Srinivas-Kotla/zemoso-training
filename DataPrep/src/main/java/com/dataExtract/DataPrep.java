package main.java.com.dataExtract;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 */
public class DataPrep {
    /**
     * Field Document to access the html page
     */
    Document doc;

    /**
     * Field File to get path of the csv file
     */
    File file = new File("dataPrep.csv");

    /**
     * Default constructor of the class
     */
    public DataPrep (){
        try {
            this.doc = Jsoup.connect("http://dme.ap.nic.in/ma/nims.html").get();
        }catch (Exception e){}
    }

    /**
     *Method to Extract data from the html page
     */
    public void dataExtract (){
        String department = "";
        /**
         * FileWriter instance to write to the csv file
         */
        FileWriter fileWriter = null;
        String[] array;
        try {
            /**
             * Initially writing the headings of each column
             */
            fileWriter = new FileWriter(this.file);
            fileWriter.append("Department");
            fileWriter.append(";");
            fileWriter.append("Code");
            fileWriter.append(";");
            fileWriter.append("Description");
            fileWriter.append(";");
            fileWriter.append("rate");
            fileWriter.append("\n");
            Elements elements = doc.getElementsByClass("MsoPlainText");
            for (Element element : elements) {
                    String para = element.text();
                    para = para.replace("\u00a0", "");
                    para = para.trim();
                    if(para.startsWith("DEPARTMENT")){              //storing each department names
                        department = para;
                    }else if(para.startsWith("CODE")){              // extracting occurences of code,description and spaces

                    }else if(para.startsWith("=")){                 // extracting occurences of "========="

                    }else if(para.startsWith("-")){                 // extracting occurences of"----------"

                    }else if(para.startsWith("ACCOMMODATION")){     //breaking the for loop at accommodation charges
                        break;
                    }else if(para.isEmpty()){                       //extracting occurences of line breaks

                    }else if (para.startsWith("NIMS")){

                    }
                    else{
                        array = para.split("\\s+");
                        writeToFile(fileWriter,department,array);
                    }

            }
        }catch (Exception e){
            System.out.println("File not present.\nPlease check the input file name.");
        }finally {
            try{
                fileWriter.close();
            }catch(IOException ex){
                ex.printStackTrace();
            }
        }
    }

    /**
     *Method to write each line of the page to the csv file
     * @param fileWriter to write to the given file path
     * @param department department field of each row
     * @param array containing all words separated by spaces in the html page
     */
    public void writeToFile(FileWriter fileWriter,String department,String[] array){
        try {
            fileWriter.append(department);
            fileWriter.append(";");
            fileWriter.append(array[0]);
            fileWriter.append(";");
            for(int i=1;i<(array.length-1);i++){
                fileWriter.append(array[i]);
                fileWriter.append(" ");
            }
            fileWriter.append(";");
            fileWriter.append(array[array.length-1]);
            fileWriter.append("\n");
        }catch (Exception e){

        }
    }
}
