package ss16_io_text_file.bai_tap.doc_ghi_file_csv.model;

import ss16_io_text_file.bai_tap.doc_ghi_file_csv.comom.FileUtils;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static final String FILE_NAME = "E:\\CODEGYM\\C0921G1--Le-Van-Tien--Module2\\src\\ss16_io_text_file\\bai_tap\\doc_ghi_file_csv\\data\\country.csv";
    public static final String COMMA = ",";
    public static void main(String[] args) {
        List<Country> countryList = new ArrayList<>();
        countryList.add(new Country(122,"US", "United State"));
        countryList.add(new Country(132,"VN", "Viet Nam"));
        countryList.add(new Country(122,"CA", "Canada"));

        String line = null;
        for (Country country: countryList) {
            line = country.getId() + COMMA + country.getCode()+ COMMA + country.getName();
            FileUtils.writeFile(FILE_NAME, line);
        }
        List<String> listLine = FileUtils.readFile(FILE_NAME);
        System.out.println(listLine);

        String[] lineSplit = listLine.get(0).split(COMMA);
        Country country1 = new Country(Integer.parseInt(lineSplit[0]), lineSplit[1], lineSplit[2]);
        System.out.println(country1.getId()+ "\t" + country1.getCode()+ "\t" + country1.getName());

    }
}
