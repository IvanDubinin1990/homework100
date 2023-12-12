public class Main {

    public static void main(String[] args) {

        Main q1 = new Main();

        String[] roles = {"Городничий", "Аммос Федорович", "Артемий Филиппович", "Лука Лукич"};

        String[] textLines = {"Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор. ",
                "Аммос Федорович: Как ревизор? ",
                "Артемий Филиппович: Как ревизор? ",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем. ",
                "Аммос Федорович: Вот те на! ",
                "Артемий Филиппович: Вот не было заботы, так подай! ",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};

        System.out.println(q1.printTextPerRole(roles, textLines));

    }

    private String printTextPerRole(String[] roles, String[] textLines) {

        int count = 0;
        StringBuilder x = new StringBuilder();

        for (String s : roles) {
            x.append(s + ":\n");
            for (int i = 0, k = 1; i < textLines.length; i++, k++) {
                if (textLines[i].startsWith(s) && s.equals(textLines[i].substring(textLines[i].indexOf(s), textLines[i].indexOf(":")))) {
                    x.append(k + ") " + textLines[i].replaceFirst(s + ": ", "") + "\n");
                }
            }
            x.append("\n");
        }
        return x.toString();
    }

}
