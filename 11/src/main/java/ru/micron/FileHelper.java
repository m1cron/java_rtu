package ru.micron;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import lombok.Data;
import lombok.SneakyThrows;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Data
@Component
public class FileHelper implements CommandLineRunner {

  private File file;

  public String getFileChecksum(File file)
      throws IOException, NoSuchAlgorithmException {
    this.file = file;
    FileInputStream fis = new FileInputStream(file);
    byte[] byteArray = new byte[1024];
    int bytesCount;
    MessageDigest digest = MessageDigest.getInstance("MD5");
    while ((bytesCount = fis.read(byteArray)) != -1) {
      digest.update(byteArray, 0, bytesCount);
    }
    fis.close();
    byte[] bytes = digest.digest();
    StringBuilder sb = new StringBuilder();
    for (byte aByte : bytes) {
      sb.append(Integer.toString((aByte & 0xff) + 0x100, 16).substring(1));
    }
    return sb.toString();
  }

  @SneakyThrows
  public void createFileAndPutHash(File file, String hash) {
    var writer = new BufferedWriter(new FileWriter(file));
    writer.write(hash);
    writer.close();
  }

  @PostConstruct
  public void init() {
    System.out.println("Bean is ready");
  }

  @PreDestroy
  public void destroy() {
    file.delete();
    System.out.println("Bean destroyed");
  }

  @Override
  public void run(String... args) throws Exception {
    String md5 = getFileChecksum(Paths.get(args[0]).toAbsolutePath().toFile());
    createFileAndPutHash(Paths.get(args[1]).toAbsolutePath().toFile(), md5);
    System.out.println();
  }
}
