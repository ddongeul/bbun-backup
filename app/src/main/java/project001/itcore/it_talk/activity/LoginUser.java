package project001.itcore.it_talk.activity;

public class LoginUser {//로그인한 사용자 정보

    private static String account;
    //singleton instance
    private static LoginUser loginUser;

    private LoginUser() {

    }

    private LoginUser(String account) {
        this.account = account;
    }

    public static LoginUser getInstance() {
        return loginUser;
    }

    public static LoginUser initInstance(String account){
        loginUser = new LoginUser(account);
        return loginUser;
    }


    public static String getAccount() {
        return account;
    }


}