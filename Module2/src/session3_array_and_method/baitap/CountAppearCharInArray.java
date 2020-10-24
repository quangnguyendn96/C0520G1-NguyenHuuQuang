package session3_array_and_method.baitap;


public class CountAppearCharInArray {
    public static void main(String[] args) {
        String stringNull = " ";
        String inputString = "1234123412341234";
        String[] newString1 = inputString.split("");
        String[] newString = inputString.split("");

        for (int i = 0; i < newString.length; i++) {
            for (int k = i + 1; k < newString.length; k++) {
                if (newString[i].equals(newString[k])) {
                    for (int j = k; j < newString.length - 1; j++) {
                        if (newString[j].equals(newString[j + 1])) {
                            for (int h = k; h < newString.length - 1; h++) {
                                newString[h] = newString[h + 1];
                            }
                        }
                        newString[j] = newString[j + 1];
                        newString[newString.length - 1] = " ";

                    }
                }
            }
        }
        for (int i = 0; i < newString.length; i++) {
            int count = 0;
            if (newString[i].equals(stringNull)) {
                break;
            } else {
                for (int j = 0; j < newString.length; j++) {
                    if (newString[i].equals(newString1[j])) {
                        count++;
                    }
                }
                System.out.println("Ký tự " + newString[i] + " xuất hiện " + count++ + " lần");
            }
        }
    }
}
