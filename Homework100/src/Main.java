public class Main {

    public static void main(String[] args) {

        Main q1 = new Main();

        String[] roles = {"Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука Лукич", "Лука"};

        String[] textLines = {"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор. ",
                "Аммос Федорович: Как ревизор? ",
                "Артемий Филиппович: Как ревизор? ",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем. ",
                "Аммос Федорович: Вот те на! ",
                "Артемий Филиппович: Вот не было заботы, так подай! ",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!",
                "Лука: Пойду пожру"};

        System.out.println(q1.printTextPerRole(roles, textLines));

    }

    private String printTextPerRole(String[] roles, String[] textLines) {

        int count = 0;
        String x = "";

        for (int i = 0; i < textLines.length; i++) {
            count++;
            textLines[i] = count + ") " + textLines[i];
        }

        for (String s : roles) {
            x += s + ":\n";
            for (int i = 0; i < textLines.length; i++) {
                if (textLines[i].startsWith(s, 3) && s.equals(textLines[i].substring(textLines[i].indexOf(s), textLines[i].indexOf(":")))) {
                    x += textLines[i].replaceFirst(s + ": ", "") + "\n";
                }
            }
            x += "\n";
        }
        return x;
    }

}
