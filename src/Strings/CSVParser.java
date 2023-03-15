package Strings;

public class CSVParser {
    private String csvline;

    public CSVParser(String csvline) {
        this.csvline = csvline;
    }

    public String getCsvline() {
        return csvline;
    }
    public int countComma(){
        int count = 0;
        for (int i = 0; i < csvline.length(); i++) {
            char c = csvline.charAt(i);
            if(c == ','){
                count++;
            }
        }
        return count;
    }
    public String[] parse(){
        String[] parser = new String[countComma()];
        int pos = 0;
        for (int i = 0; i < parser.length; i++) {
            parser[i] ="";

            for (int j = 0; j < csvline.length(); j++) {
                char c = csvline.charAt(j);
                if(c == ','){
                    pos++;
                }

            }
        }
        return parser;
    }

    @Override
    public String toString() {
        return "CSVParser{" +
                "csvline='" + csvline + '\'' +
                '}';
    }
}
