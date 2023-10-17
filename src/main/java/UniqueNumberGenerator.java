import java.io.IOException;
import java.time.LocalDate;
import java.util.*;

public class UniqueNumberGenerator {

    public String getFirstCharacterOfTheString(String input) {
        int n = input.length();
        char first = input.charAt(0);
        return first + "";
    }

    public String getLastTwoDigitsOfDob(String dob) {
        String dateParts[] = dob.split("-");
        String year = dateParts[0];
        int o = year.length();
        char[] charArray = new char[2];
        charArray[0] = year.charAt(o - 2);
        charArray[1] = year.charAt(o - 1);
        String LastTwoDigitOfDate = new String(charArray);
        return LastTwoDigitOfDate;
    }


    public String GenerateRandomFourDigitNumber() {
        Random random = new Random();
        int number = random.nextInt(10000);
        String result = String.format("%04d", number);
        return result;
    }

    public String GenerateCountryOfBirthCode(String COB) {

        switch (COB) {
            case "Wales":
                COB = "W";
                break;

            case "England":
                COB = "E";
                break;

            case "Scotland":
                COB = "S";
                break;

            case "Northern Ireland":
                COB = "N";
                break;

            default:
                COB = "O";
        }

        return COB;
    }

    public Map GetNINForEachCountry(List input) {
        Map<String, Integer> n = new HashMap<>();
        n.put("Wales",0);
        n.put("England",0);
        n.put("Scotland",0);
        n.put("North Ireland",0);
        n.put("Others",0);
        for (int i = 0; i < input.size(); i++)  {
            Object element = input.get(i);
            String v = ((String)element);
            int length = v.length();
            char lc = v.charAt(length-1);
            String ls = lc +"";
            Integer k = 0;
            if (ls.equals("W")) {


              if(n.get("Wales")!=0){
                  n.put("Wales",n.get("Wales")+1);
              }
              else if(n.get("Wales")==0){
                  k++;
                  n.put("Wales",k);
              }

            }
           else  if (ls.equals("E")) {


                if(n.get("England")!=0){
                    n.put("England",n.get("England")+1);
                }
                else if(n.get("England")==0){
                    k++;
                    n.put("England",k);
                }

            }
            else  if (ls.equals("S")) {


                if(n.get("Scotland")!=0){
                    n.put("Scotland",n.get("Scotland")+1);
                }
                else if(n.get("Scotland")==0){
                    k++;
                    n.put("Scotland",k);
                }

            }
            else  if (ls.equals("N")) {


                if(n.get("North Ireland")!=0){
                    n.put("North Ireland",n.get("North Ireland")+1);
                }
                else if(n.get("North Ireland")==0){
                    k++;
                    n.put("North Ireland",k);
                }

            }

            else  if (ls.equals("O")) {


                if(n.get("Others")!=0){
                    n.put("Others",n.get("Others")+1);
                }
                else if(n.get("Others")==0){
                    k++;
                    n.put("Others",k);
                }

            }
        }
        return n;
    }






}
