package ru.micron;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserController {

  private static final String USER = "/user";

  private final User user;

  @GetMapping(USER)
  public User getUser() {
    return user;
  }

  @PostMapping(USER)
  public User setUser(@RequestBody User user) {
    this.user.setLastName(user.getLastName());
    this.user.setMiddleName(user.getMiddleName());
    this.user.setBirthDate(user.getBirthDate());
    this.user.setLastName(user.getLastName());
    return user;
  }

  @DeleteMapping(USER)
  public boolean deletePost(@RequestBody User user) {
    if (this.user.equals(user)) {
      this.user.setBirthDate("");
      this.user.setFirstName("");
      this.user.setLastName("");
      this.user.setMiddleName("");
      return true;
    }
    return false;
  }
}
