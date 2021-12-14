package pakete;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class data {

    public static void main() throws FileNotFoundException {
        
        Scanner s = new Scanner(new File("SaveData.txt"));

        UI.name.setText(s.nextLine());
        UI.email.setText(s.nextLine());
        UI.phone.setText(s.nextLine());
        UI.street.setText(s.nextLine());
        UI.city.setText(s.nextLine());
        UI.zip.setText(s.nextLine());
        UI.country.setText(s.nextLine());
        UI.cardnr.setText(s.nextLine());
        UI.monthBar.setSelectedItem((Object) s.nextLine());
        UI.yearBar.setSelectedItem((Object) s.nextLine());
        UI.cardcode.setText(s.nextLine());
        UI.tallaBar.setSelectedItem((Object) s.nextLine());
        UI.user.setText(s.nextLine());
    
    }
}
