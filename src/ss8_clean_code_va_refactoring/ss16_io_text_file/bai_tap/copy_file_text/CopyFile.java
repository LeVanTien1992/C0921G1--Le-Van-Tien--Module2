package ss8_clean_code_va_refactoring.ss16_io_text_file.bai_tap.copy_file_text;

import java.io.*;

public class CopyFile {
    public static final String SOURCE_FILE = "E:\\CODEGYM\\C0921G1--Le-Van-Tien--Module2\\src\\ss8_clean_code_va_refactoring.ss16_io_text_file\\bai_tap\\copy_file_text\\source.csv";
    public static final String TARGET_FILE = "E:\\CODEGYM\\C0921G1--Le-Van-Tien--Module2\\src\\ss8_clean_code_va_refactoring.ss16_io_text_file\\bai_tap\\copy_file_text\\target.csv";
    //Bước 1: đọc được nội dung của source file
    public static String readFile(FileReader fileReader) {
        int i = 0;
        String result = "";

        try {
            while ((i = fileReader.read()) != -1) {
                System.out.println(i);
                result += (char) i;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    //bước 2: ghi nội dung đã đọc vào target file
    public static void writeFile(FileWriter fileWriter, String result) {
        try {
            fileWriter.write(result);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    public static void main(String[] args) {
        String result = "";
        File fileSource = new File(SOURCE_FILE);
        File fileTarget = new File(TARGET_FILE);
        try {
            FileReader fileReader = new FileReader(fileSource);
            FileWriter fileWriter = new FileWriter(fileTarget);
            result = readFile(fileReader);
            writeFile(fileWriter, result);
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}