import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import lombok.SneakyThrows;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Utility extends UniqueNumberGenerator {

    List<String> m = new ArrayList<>();


    @SneakyThrows
    public void AssignNationalInsuranceNumber() {
        String CSV_file = "C:\\Users\\Adv J L Gupta\\IdeaProjects\\UniqueNumberGenerator\\2_NIGen_question_Assignment_people data set.csv";
        CSVReader csvReader = new CSVReader(new FileReader(CSV_file));
        List<String[]> allData = csvReader.readAll();
        System.out.println(allData.size());
        String UIN="";

        for (int rowIndex = 1; rowIndex< allData.size(); rowIndex++) {
            String[] row = allData.get(rowIndex);
            for (int columnIndex = 0; columnIndex < row.length; columnIndex++) {
                if (columnIndex == 0) {
                    UIN = UIN+super.getFirstCharacterOfTheString(row[columnIndex]);
                }
                else if(columnIndex == 1){
                    UIN = UIN+super.getFirstCharacterOfTheString(row[columnIndex]);

                }
                else if(columnIndex==4){
                    UIN = UIN+super.getLastTwoDigitsOfDob(row[columnIndex])
                           +super.GenerateRandomFourDigitNumber();

                }
                else if(columnIndex==5){
                    UIN = UIN+super.GenerateCountryOfBirthCode(row[columnIndex]);
                    System.out.println(UIN);
                    m.add(UIN);
                    UIN="";
                }
            }
        }


    }

        public Map getNINForEveryCountry(List in){
            return super.GetNINForEachCountry(in);
        }



     @SneakyThrows
    public static void main(String[] args)  {

        Utility U = new Utility();
        U.AssignNationalInsuranceNumber();
        System.out.println(U.getNINForEveryCountry(U.m)) ;



     }

}
