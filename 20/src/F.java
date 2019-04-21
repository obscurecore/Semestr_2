
public class F {
    private String input;
    private int lIn;
    private Stack stack;
    private boolean flag= false;

    public F(String input) {
        this.input = input;
        this.lIn = input.length();
        stack = new Stack(lIn);
    }

    public void FF() {
        for (int i = 0; i < lIn; i++) {
            char ch = input.charAt(i);

            switch (ch) {
                case '{':
                case '[':
                case '(':
                    stack.add(ch);
                    flag = true;
                    break;
                case '}':
                case ']':
                case ')':

                    if (!stack.isEmpty()) {
                        char chClosed = stack.delete();

                        if ((ch == '}' && chClosed != '{') || (ch == ']' && chClosed != '[') || (ch == ')' && chClosed != '('))
                            System.out.println("еррор");
                            return;
                    }
            }
        }

        if (!stack.isEmpty()) {
            System.out.println("еррор нет клозед");

        }
        if (stack.isEmpty() && (flag == true)) {
            System.out.println("GJ");
        }
        else{
             System.out.println("NOT GJ");
        }

    }
}


