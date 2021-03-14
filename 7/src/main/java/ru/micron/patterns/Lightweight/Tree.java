package ru.micron.patterns.Lightweight;

import java.awt.Graphics;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Tree {

  private final int x;
  private final int y;
  private final TreeType type;

  public void draw(Graphics g) {
    type.draw(g, x, y);
  }

}
