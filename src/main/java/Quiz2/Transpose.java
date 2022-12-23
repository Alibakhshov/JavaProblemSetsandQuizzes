public class Transpose
{
    public String transpose (String args)
    {
        StringBuilder result= new StringBuilder();
        String[] lines = args.split("\n");
        int max = 0;
        for (String line: lines){
            if(line.length() > max) {
                max = line.length();
            }
        }
        for(int i=0; i<max;i++) {
            StringBuilder transposed = new StringBuilder();
            for(String line : lines) {
                transposed.append(i < line.length() ? line.charAt(i) : ' ');
            }
            transposed = new StringBuilder(transposed.toString().replaceAll("\n", ""));
            String transposedNew= transposed.toString().replaceAll("//s", "");
            //trying left-padding
            String transposedFinal = " ".repeat(Math.max(0, transposed.length() - transposedNew.length())) +
                    transposedNew;
            result.append(transposedFinal);

            if(i != max - 1){
                result.append("\n");
            }

        }
        return result.toString();


    }
}