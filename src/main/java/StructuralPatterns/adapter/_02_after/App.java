package StructuralPatterns.adapter._02_after;

import StructuralPatterns.adapter._02_after.security.LoginHandler;
import StructuralPatterns.adapter._02_after.security.UserDetailsService;

public class App {

    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountUserDetilsService(accountService);

        //기존 코드 그대로 사용
        LoginHandler loginHandler = new LoginHandler(userDetailsService);

        String login = loginHandler.login("keesun", "keesun");
        System.out.println(login);
    }
}
