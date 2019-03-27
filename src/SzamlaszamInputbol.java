public class SzamlaszamInputbol {

    private String szamlaszam;

    public String getSzamlaszam() {
        return szamlaszam;
    }

    public SzamlaszamInputbol(String[] szamlaszam){
        this.szamlaszam = szamlaszam[1];
    }
}
