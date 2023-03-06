public class CezarCod {
    private static String getCodingIncodMessage(String message, int key) {
        StringBuilder strBox = new StringBuilder(message.length());
        char tmp;
        for (int i = 0; i < message.length(); i++) {
            tmp = message.charAt(i);
            if (Character.isLetter(message.charAt(i))) {
                tmp += key % 26;
                if (tmp > 'z')
                    tmp = (char)(tmp % 'z' + 'a' - 1);
                else if (tmp < 'a')
                    tmp = (char)(tmp + 26);
            }
            strBox.append(tmp);
        }
        return strBox.toString();
    }

    public static void main(String[] args) {
        String message = "hello asman, sanya, suymonkul!";
        String codeMessage = getCodingIncodMessage(message, message.length());
        System.out.println(message + " -> " + codeMessage);
        String deCodeMessage = getCodingIncodMessage(codeMessage, -message.length());
        System.out.println(codeMessage + " -> " + deCodeMessage);
    }
}