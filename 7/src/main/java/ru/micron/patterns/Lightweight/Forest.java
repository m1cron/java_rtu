package ru.micron.patterns.Lightweight;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;

public class Forest extends JFrame {

  private final List<Tree> trees = new ArrayList<>();

  public void plantTree(int x, int y, String name, Color color, String otherTreeData) {
    TreeType type = TreeFactory.getTreeType(name, color, otherTreeData);
    Tree tree = new Tree(x, y, type);
    trees.add(tree);
  }

  @Override
  public void paint(Graphics graphics) {
    for (Tree tree : trees) {
      tree.draw(graphics);
    }
  }
}