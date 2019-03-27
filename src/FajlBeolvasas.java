import java.io.*;
import java.util.ArrayList;
//import java.util.Scanner;

public class FajlBeolvasas {

    public static void main(String[] args){

        RandomAccessFile raf;
        String sor;
        ArrayList<String> szamlaszamok = new ArrayList<String>();

        /*Scanner sc;
        sc = new Scanner(System.in);*/
        int trDb = 2;
        /*trDb = sc.nextInt();
        sc.close();*/

        try{
            raf = new RandomAccessFile("/mnt/D/JAVA gyak/kiegFajlok/RCC_input.RC1", "r");

            /*sor = raf.readLine();
            if (sor.toUpperCase().startsWith("FEJ")) {
                SzamlaszamInputbol szI = new SzamlaszamInputbol(sor.split("\\|"));
            }*/

            for (sor = raf.readLine(); sor != null; sor = raf.readLine()){
                if (sor.toUpperCase().startsWith("FEJ")) {
                    String[] sorReszek = sor.split("\\|");
                    if (Metodusok.szlaSzamEll(sorReszek[1])) {
                        szamlaszamok.add(sorReszek[1]);
                    }
                }
            }
            raf.close();

            raf = new RandomAccessFile("/mnt/D/JAVA gyak/kiegFajlok/RCC_paramFejleccel.txt", "r");

            for (sor = raf.readLine(); sor != null; sor = raf.readLine()){
                String[] paramReszek = sor.split(";");
                System.out.println("Param: " + paramReszek[0] + " | " + paramReszek[14]);
            }
            raf.close();
        }
        catch (IOException e){
            System.out.println("Hiba!");
        }
        for (int i = 0; i < szamlaszamok.size(); i++){
            System.out.println(szamlaszamok.get(i));
        }
    }
}
