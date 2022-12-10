package Week11;

public class RnaTranscription {
    public String transcribe(String dnaStrand) {
        String rna = "";
        for (int i = 0; i < dnaStrand.length(); i++) {
            if (dnaStrand.charAt(i) == 'G') {
                rna += "C";
            } else if (dnaStrand.charAt(i) == 'C') {
                rna += "G";
            } else if (dnaStrand.charAt(i) == 'T') {
                rna += "A";
            } else if (dnaStrand.charAt(i) == 'A') {
                rna += "U";
            }
        }
        return rna;
    }
}
