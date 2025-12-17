public class PristupApp {

    /**
     * Metoda
     * Prihvata nivo (1, 2 ili 4) i vraca poruku sa pristupom ili gresku
     */
    public static String proveriPristup(int nivo) {
        boolean standard = false;
        boolean admin = false;
        boolean superadmin = false;

        if (nivo == 1) {
            standard = true;
        } else if (nivo == 2) {
            standard = true;
            admin = true;
        } else if (nivo == 4) {
            standard = true;
            admin = true;
            superadmin = true;
        } else {
            return "GRESKA: Nivo mora biti 1, 2 ili 4";
        }
        // Regular IMA ili NEMA
        return "Pristupi: \nStandard: "+ (standard ? "IMA" : "NEMA") + "\n"+
                "Admin: "+ (admin ? "IMA" : "NEMA") + "\n"+
                "superadmin: "+ (superadmin ? "IMA" : "NEMA");

    }
    /**
     * Automatski test za proveru vise ulaza
     */
    public static void pokreniTestove(){
         int [] testNivoi = {1, 2, 4, 0, 3, -1};
        System.out.println("---------------");
        for (int nivo:testNivoi){
                System.out.println("Nivo: "+nivo);
                System.out.println(proveriPristup(nivo));
                System.out.println("---------------");
         }
    }
}
