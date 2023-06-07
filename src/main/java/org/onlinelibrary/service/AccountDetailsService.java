package org.onlinelibrary.service;

import lombok.extern.slf4j.Slf4j;
import org.onlinelibrary.model.Account;
import org.onlinelibrary.model.AccountDetails;
import org.onlinelibrary.model.AuthGroup;
import org.onlinelibrary.repository.AccountRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Slf4j
public class AccountDetailsService implements UserDetailsService {

  private final AccountRepository accountRepository;

  public AccountDetailsService(AccountRepository accountRepository) {
    this.accountRepository = accountRepository;
  }


  @Override
  public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
    Account account = accountRepository.getByEmail(email);

    if (account == null) {
      throw new UsernameNotFoundException("No account found for " + email);
    }

    List<AuthGroup> authGroups = account.getAuthGroups();
    return new AccountDetails(account, authGroups);
  }

}
