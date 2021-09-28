package ru.micron.patterns.Builder_and_Prototype;

import java.time.Clock;
import java.time.LocalDateTime;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.With;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@Builder(toBuilder = true)
@EqualsAndHashCode(callSuper = false)
public class TestEntity {

  public TestEntity(TestEntity testEntity) {
    this.firstname = testEntity.getFirstname();
    this.lastname = testEntity.getLastname();
    this.nickname = testEntity.getNickname();
    this.age = testEntity.getAge();
    this.sex = testEntity.getSex();
    this.active = testEntity.getActive();
    this.banned = testEntity.getBanned();
  }

  public TestEntity clone() {
    return new TestEntity(this);
  }

  private String firstname;
  private String lastname;
  private String nickname;
  private Integer age;
  private Sex sex;
  private Boolean active;
  private Boolean banned;

  @Builder.Default
  private LocalDateTime lastLogin = LocalDateTime.now(Clock.systemUTC());

}
