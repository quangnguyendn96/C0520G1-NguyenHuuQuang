import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Lookup {
    static Scanner scanner = new Scanner(System.in);

    public static void searchDictionary() {
        System.out.println("----------------Lookup----------------");
        System.out.print("Enter word : ");
        String wordTemp = scanner.nextLine().toLowerCase();
        String strOut = "";

        HashMap<String, Dictionary> myTreeMap = ReadAndWrite.ReadFileDictionary();

        Set<String> keyDic = myTreeMap.keySet();
        boolean check = false;

        for (String key : keyDic) {
            if (wordTemp.equals(key)) {
                strOut += myTreeMap.get(key).toString();
                check = true;
                break;
            }
        }
        if (!check) {
            strOut = "The word not exist";
        }
        System.out.println(strOut);
    }
}
