package ss16_i_o_file.copy_file_text;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ReadAndWriteStringInFile readAndWriteStringInFile = new ReadAndWriteStringInFile();
        List<String> strList = readAndWriteStringInFile.readFile("src/ss16_i_o_file/copy_file_txt/fileMain.txt");
        for (String item : strList) {
            readAndWriteStringInFile.writeFile("src/ss16_i_o_file/copy_file_txt/fileCopy.txt", item);

        }
    }
    }

