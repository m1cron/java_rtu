package ru.micron.patterns.Builder_and_Prototype;

public class Application {

  public static TestEntity builder() {
    TestEntity test =
        new TestEntity()
            .toBuilder()
              .firstname("Maksim")
              .lastname("Sekretoff")
              .nickname("m1cron")
              .age(1337)
              .sex(Sex.MALE)
              .active(true)
              .banned(false)
            .build();

    System.out.println(test);
    return test;
  }

  public static void main(String[] args) {
    var test = builder();
    var cloneEntity = test.clone();

    System.out.println(test.hashCode() + "\n" + cloneEntity.hashCode());
  }

}
