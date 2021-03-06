package ss16_io_text_file.bai_tap.copy_file_text;

import java.io.*;

public class CopyFile {
    public static final String SOURCE_FILE = "E:\\CODEGYM\\C0921G1--Le-Van-Tien--Module2\\src\\ss16_io_text_file\\bai_tap\\copy_file_text\\source.csv";
    public static final String TARGET_FILE = "E:\\CODEGYM\\C0921G1--Le-Van-Tien--Module2\\src\\ss16_io_text_file\\bai_tap\\copy_file_text\\target.csv";
    public static String readFile(FileReader fileReader) throws Exception {
        int i = 0;
        String result = "";
        while (true){
            try {
                while ((i = fileReader.read())!= -1){
                    System.out.println(i);
                    result += (char)i;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return result;
        }
    }
    public static void writeFile(FileWriter fileWriter, String result){
        try {
            fileWriter.write(result);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        String result = "";
        File fileSorce = new File(SOURCE_FILE);
        File fileTarget = new File(TARGET_FILE);
        try {
            FileReader fileReader = new FileReader(fileSorce);
            FileWriter fileWriter = new FileWriter(fileTarget, true);
            result = readFile(fileReader);
            writeFile(fileWriter,result);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
