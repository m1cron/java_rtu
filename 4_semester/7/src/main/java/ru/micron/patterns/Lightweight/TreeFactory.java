package ru.micron.patterns.Lightweight;

import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class TreeFactory {

  static Map<String, TreeType> treeTypes = new HashMap<>();

  public static TreeType getTreeType(String name, Color color, String otherTreeData) {
    TreeType result = treeTypes.get(name);
    if (result == null) {
      result = new TreeType(name, color, otherTreeData);
      treeTypes.put(name, result);
    }
    return result;
  }
}
