//Instructions:
//        # Resistor Color
//
//        Resistors have color coded bands, where each color maps to a number. The first 2 bands of a resistor have a simple
//        encoding scheme: each color maps to a single number.
//
//        These colors are encoded as follows:
//
//        - Black: 0
//        - Brown: 1
//        - Red: 2
//        - Orange: 3
//        - Yellow: 4
//        - Green: 5
//        - Blue: 6
//        - Violet: 7
//        - Grey: 8
//        - White: 9
//
//        Mnemonics map the colors to the numbers, that, when stored as an array, happen to map to their index in the
//        array: Better Be Right Or Your Great Big Values Go Wrong.
//
//        More information on the color encoding of resistors can be found in the [Electronic color code Wikipedia article]
//
//        # Running the tests
//
//        You can run all the tests for an exercise by entering
//
//        $ gradle test
//
//        in your terminal.
//

        package Week6;

public class ResistorColor {
    public int colorCode(String color) {
        String[] colors ={ "black",
                "brown",
                "red",
                "orange",
                "yellow",
                "green",
                "blue",
                "violet",
                "grey",
                "white",};
        int result = -1;
        for (int i = 0; i < colors.length; i++) {
            if(colors[i].compareTo(color)==0){
                result = i;
                break;
            }
        }
        return result;
    }

    public String[] colors() {
        return new String[]{ "Black",
                "Brown",
                "Red",
                "Orange",
                "Yellow",
                "Green",
                "Blue",
                "Violet",
                "Grey",
                "White",};
    }
}
