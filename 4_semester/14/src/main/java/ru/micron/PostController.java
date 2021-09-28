package ru.micron;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PostController {

  private static final String POST = "/post";

  private final Post post;

  @GetMapping(POST)
  public Post getPost() {
    return post;
  }

  @PostMapping(POST)
  public Post setPost(@RequestBody Post post) {
    this.post.setText(post.getText());
    this.post.setCreationDate(post.getCreationDate());
    return post;
  }

  @DeleteMapping(POST)
  public boolean deletePost(@RequestBody Post post) {
    if (this.post.equals(post)) {
      this.post.setCreationDate("");
      this.post.setText("");
      return true;
    }
    return false;
  }
}
