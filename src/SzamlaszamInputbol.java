import java.io.*;
import java.util.ArrayList;

public class Beolvasas {

    private static final String filepath;

    public static ArrayList<Object> readObjects() {

        ArrayList<Object> al = new ArrayList<Object>();
        boolean cont = true;

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filepath));
            while (cont) {
                Object obj = null;

                try {
                    obj = ois.readObject();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                if (obj != null)
                    al.add(obj);
                else
                    cont = false;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return al;
    }
    public Beolvasas(String inputParamFile){
        this.filepath = inputParamFile;
    }
}

public class Beolvas {

    public static void main(String[] args) {

        private File inputParamFile;

        RandomAccessFile raf;
        String sor;
        String daraboltSor[] = new String[2];
        ArrayList<String> paramErtekek = new ArrayList<>();

        try {
            raf = new RandomAccessFile(inputParamFile, "r");
            for (sor = raf.readLine(); sor != null; sor = raf.readLine()) {
                daraboltSor = sor.split(";");
                paramErtekek.add(daraboltSor[0], daraboltSor[1]);
            }
            raf.close();
        } catch (IOException e) {
            System.out.println("HIBA");
        }
    }
    public Beolvas(File inputParamFile){
        this.inputParamFile = inputParamFile;
    }
}
