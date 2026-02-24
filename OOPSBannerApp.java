/**
 * OOPSBannerApp
 * UC4 - Prints "OOPS" banner using Array & Loop
 *
 * Improves UC3 by removing repetitive print statements
 * and using a String array with enhanced for-loop.
 *
 * @version 4.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] bannerLines = {
            String.join("", " *****  ", " *****  ", " *****  ", " ***** "),
            String.join("", "*     * ", "*     * ", "*     * ", "*     *"),
            String.join("", "*     * ", "*     * ", "*     * ", "*     *"),
            String.join("", "*     * ", "*     * ", "*     * ", "* *****"),
            String.join("", "*     * ", "*     * ", "*     * ", "*     *"),
            String.join("", "*     * ", "*     * ", "*     * ", "*     *"),
            String.join("", " *****  ", " *****  ", " *****  ", " ***** ")
        };

        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
