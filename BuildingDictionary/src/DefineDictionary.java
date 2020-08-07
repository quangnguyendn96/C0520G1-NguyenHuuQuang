import java.util.*;

public class DefineDictionary {
    static Scanner scanner = new Scanner(System.in);

    public static void defineNewWord() {
        System.out.println("----------------Define New Word----------------");
        System.out.print("Enter new word : ");
        String newWord = scanner.nextLine().toLowerCase();

        HashMap<String, Dictionary> dictionaries = new HashMap<>();
        HashMap<String, Dictionary> myTreeMap = ReadAndWrite.ReadFileDictionary();
        Set<String> keyDic = myTreeMap.keySet();
        boolean check = true;

        for (String key : keyDic) {
            if (newWord.equals(key)) {
                check = false;
                break;
            }
        }
        if (!check) {
            System.out.println("The word is exist");
        } else {
            System.out.println(newWord + " is not existed in database , created new one!");
            System.out.print("Enter pronoun : ");
            String pronoun = scanner.nextLine();

            StringBuilder methodWord = new StringBuilder();
            String type;
            do {
                System.out.print("1.\tNoun\n" +
                        "2.\tAdjective\n" +
                        "3.\tAdverb\n" +
                        "4.\tVerb\n" +
                        "5.\tNext\n" +
                        "Choice type word : ");
                type = scanner.nextLine();
                switch (type) {
                    case "1":
                    case "2":
                    case "3":
                    case "4":
                        if (type.equals("1")) {
                            methodWord.append("Danh từ {");
                        } else if (type.equals("2")) {
                            methodWord.append("Tính từ {");
                        } else if (type.equals("3")) {
                            methodWord.append("Trạng từ {");
                        } else {
                            methodWord.append("Động từ {");
                        }

                        String typeWord;
                        do {
                            System.out.print("Enter define word or Enter 'exit' to finish defined : ");
                            typeWord = scanner.nextLine();
                            if (typeWord.equals("exit")) {
                                methodWord.deleteCharAt(methodWord.length() - 1);
                                methodWord.append("}");
                                methodWord.append(" ");
                                break;
                            } else {
                                methodWord.append(typeWord);
                                methodWord.append("/");
                            }
                        }
                        while (!typeWord.equals("exit"));
                        break;
                    case "5":
                        type = "-1";
                        break;
                    default:
                        System.out.println("Error input");
                }
            }

            while (!type.equals("-1"));

            boolean checkSynonym = false;
            StringBuilder synonym = new StringBuilder();
            do {
                System.out.print("Do the word have synonym (Y/N) : ");
                String choice = scanner.nextLine();
                switch (choice) {
                    case "Y":
                        String synonymTemp;
                        do {
                            System.out.print("\"Enter synonym\" or \"Enter 'exit' to finish\" : ");
                            synonymTemp = scanner.nextLine();
                            if (synonymTemp.equals("exit")) {
                                synonym.deleteCharAt(synonym.length() - 1);
                                checkSynonym = true;
                                break;
                            } else {
                                synonym.append(synonymTemp);
                                synonym.append("/");
                            }
                        }while (!synonymTemp.equals("exit"));
                            break;
                    case "N":
                        synonym.append("The word haven't synonym");
                        checkSynonym = true;
                        break;
                    default:
                        System.out.println("Wrong choice");
                }
            }
            while (!checkSynonym);

            dictionaries.put(newWord, new Dictionary(newWord, pronoun, methodWord.toString(), synonym.toString()));
            ReadAndWrite.WriteFileDictionary(dictionaries);
        }
    }

    public static void showDictionary() {
        System.out.println("---------------Show Dictionary---------------");
        HashMap<String, Dictionary> hashMap = ReadAndWrite.ReadFileDictionary();
        Set<String> keyDic = hashMap.keySet();
        TreeMap<String, Dictionary> treeMap = new TreeMap<>();
        for (String key : keyDic) {
            treeMap.put(key, hashMap.get(key));
        }
        Set<String> keyTreeMap = treeMap.keySet();
        int i = 1;
        for (String keyTree : keyTreeMap) {
            System.out.println(i + ".\t" + keyTree);
            i++;
        }
    }
}


