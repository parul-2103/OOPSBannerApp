public class OOPSBannerApp {

    public static void main(String[] args) {

        // UC5: Array declaration + initialization using String.join()
        String[] banner = {
                String.join("", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*"),
                String.join("", "*", " ", "O", "O", "P", "S", " ", "B", "A", "N", "N", "E", "R", " ", "*"),
                String.join("", "*", " ", "U", "C", "5", " ", "-", " ", "A", "R", "R", "A", "Y", " ", "*"),
                String.join("", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*", "*")
        };

        // Display banner using enhanced for loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}