package Week11;

public class ProteinTranslator {
    public static String translate(String rnaSequence) {
        String protein = "";
        for (int i = 0; i < rnaSequence.length(); i += 3) {
            String codon = rnaSequence.substring(i, i + 3);
            if (codon.equals("AUG")) {
                protein += "Methionine ";
            } else if (codon.equals("UUU") || codon.equals("UUC")) {
                protein += "Phenylalanine ";
            } else if (codon.equals("UUA") || codon.equals("UUG")) {
                protein += "Leucine ";
            } else if (codon.equals("UCU") || codon.equals("UCC") || codon.equals("UCA") || codon.equals("UCG")) {
                protein += "Serine ";
            } else if (codon.equals("UAU") || codon.equals("UAC")) {
                protein += "Tyrosine ";
            } else if (codon.equals("UGU") || codon.equals("UGC")) {
                protein += "Cysteine ";
            } else if (codon.equals("UGG")) {
                protein += "Tryptophan ";
            } else if (codon.equals("UAA") || codon.equals("UAG") || codon.equals("UGA")) {
                break;
            }
        }
        return protein;
    }
}
