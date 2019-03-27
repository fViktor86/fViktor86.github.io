public class Metodusok {
    public static Boolean szlaSzamEll(String ellenorizendoSzla){
        boolean rendben = true;
        try {
            String[] szlaReszek = ellenorizendoSzla.split("-");
            for (int i = 0; i < szlaReszek.length; i++) {
                if (szlaReszek[i].length() != 8) {
                    rendben = false;
                    break;
                }
                rendben = isNumeric(szlaReszek[i]);
            }
        }
        catch (Exception e){
            e.printStackTrace();
            rendben = false;
        }
        return rendben;
    }
    public static boolean isNumeric(String inpString){
        boolean rendben = true;
        int ii;
        try {
            for (int i = 0; i < inpString.length(); i++){
                ii = Integer.parseInt(inpString.substring(i,i+1));
            }
        }
        catch(NumberFormatException nfe){
            rendben = false;
        }
        return rendben;
    }
}
