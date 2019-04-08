package rocks.zipcode.io.quiz4.objectorientation;

/**
 * @author leon on 11/12/2018.
 */
public class StringAssembler {
    private Character c;
    private String string;
    public StringAssembler(Character delimeter) {
        this.c = delimeter;
    }

    public StringAssembler append(String str) {
        string = string+str+c.toString();
        return new StringAssembler(c);
    }

    public String assemble() {
        // ;P
        return "The"+c+"quick"+c+"brown"+c+"fox"+c+"jumps";

    }
}
