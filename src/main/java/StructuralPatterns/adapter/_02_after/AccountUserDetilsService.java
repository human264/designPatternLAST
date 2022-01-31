package StructuralPatterns.adapter._02_after;

import StructuralPatterns.adapter._02_after.security.UserDetails;
import StructuralPatterns.adapter._02_after.security.UserDetailsService;

public class AccountUserDetilsService implements UserDetailsService {

    AccountService accountService;

    public AccountUserDetilsService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        Account account = accountService.findAccountByUsername(username);
        return new AccountUserDetails(account);
    }
}
