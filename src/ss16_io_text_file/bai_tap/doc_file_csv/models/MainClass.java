package ss16_io_text_file.bai_tap.doc_file_csv.models;

import ss16_io_text_file.bai_tap.doc_file_csv.common.FileUtils;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static final String FILE_NAME = "E:\\CODEGYM\\C0921G1--Le-Van-Tien--Module2\\src\\ss16_io_text_file\\bai_tap\\doc_file_csv\\data\\country.csv";
    public static final String COMMA = ",";
    public static void main(String[] args) {
        List<Country> countryList = new ArrayList<>();
        Country country1 = new Country(001, "US", "United States");
        Country country2 = new Country(002, "CA", "Canada");
        Country country3= new Country(003, "UK", "England");

        countryList.add(country1);
        countryList.add(country2);
        countryList.add(country3);

        String line = null;
        for (Country country:countryList) {
            line = country.getId() + COMMA + country.getCode() + COMMA + country.getName();
            FileUtils.writeFile(FILE_NAME, line);
        }

        List<String> listLine = FileUtils.readLine(FILE_NAME);
        System.out.println(listLine);

        String[] lineSplit = listLine.get(0).split(COMMA);
        Country country = new Country(Integer.parseInt(lineSplit[0]), lineSplit[1], lineSplit[2]);
        System.out.println(country);
    }
}
