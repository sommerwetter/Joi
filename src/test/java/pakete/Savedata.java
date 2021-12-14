package pakete;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Savedata {

    public static void main() throws FileNotFoundException {
        
        
        File fold = new File("SaveData.txt");
        fold.delete();

        File fnew = new File("SaveData.txt");


        try {

            FileWriter f2 = new FileWriter(fnew, false);

            f2.write(UI.name.getText()
            + "\n" + UI.email.getText()
            + "\n" + UI.phone.getText()
            + "\n" + UI.street.getText()
            + "\n" + UI.city.getText()
            + "\n" + UI.zip.getText()
            + "\n" + UI.country.getText()
            + "\n" + UI.cardnr.getText()
            + "\n" + (String) UI.monthBar.getSelectedItem()
            + "\n" + (String) UI.yearBar.getSelectedItem()
            + "\n" + UI.cardcode.getText()
            + "\n" + (String) UI.tallaBar.getSelectedItem()
            + "\n" + UI.user.getText()
            );
            
            f2.close();

        } catch (IOException e) {

            e.printStackTrace();
        }   
    }
}
