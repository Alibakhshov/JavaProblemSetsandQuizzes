package Quiz2;

public class Transpose {
    public String transpose (String args) {
        StringBuilder output = new StringBuilder();
        String[] spaces = args.split("\n");
        int maxValue = 0;
        for (String line: spaces){
            if(line.length() > maxValue) {
                maxValue = line.length();
            }
        }
        for(int i=0; i<maxValue;i++) {
            StringBuilder inputTranspose = new StringBuilder();
            for(String line : spaces) {
                inputTranspose.append(i < line.length() ? line.charAt(i) : ' ');
            }
            inputTranspose = new StringBuilder(inputTranspose.toString().replaceAll("\n", ""));
            String initTranspose= inputTranspose.toString().replaceAll("//s", "");
            String endTranspose = " ".repeat(Math.max(0, inputTranspose.length() - initTranspose.length())) + initTranspose;
            output.append(endTranspose);
            if(i != maxValue - 1){ output.append("\n");}
        }
        return output.toString();
    }
}


















