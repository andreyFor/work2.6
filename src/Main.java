
public class Main {

    public static void main(String[] args) {
        String login = "hfhhf_dkdk0";
        String password = "_Fsacascasc1";
        String confirmPassword = "12dqscx_!x";
        logIN(login, password, confirmPassword);
    }

    public static boolean logIN(String login, String password, String confirmPassword) {
        boolean loginSymbol = login.matches("^[a-z0-9_]+$");
        boolean passwordSymbol = password.matches("^[a-zA-Z0-9_]+$");
        boolean passwordComparison = confirmPassword.equals(password);
        if ((!loginSymbol) || (login.length() > 20)) {
            try {
                throw new WrongLoginException();
            } catch (WrongLoginException e) {
                System.out.println("Login может содержать в себе только латинские буквы нижнего регистра,цифры,знак подчеркивания и иметь не более 20 символов");
            }
        } else if ((!passwordSymbol) || (password.length() >= 20)) {
            try {
                throw new WrongLoginException();
            } catch (WrongLoginException e) {
                System.out.println("Password может содержать в себе только латинские буквы, цифры, знак подчеркивания и иметь меньше 20 символов");
            }
        } else if (!passwordComparison) {
            try {
                throw new WrongLoginException();
            } catch (WrongLoginException e) {
                System.out.println("Password не может отличаться от confirmPassword");
            }
        }
        System.out.println("Пользователь зарегистрирован");
        return true;
    }

}