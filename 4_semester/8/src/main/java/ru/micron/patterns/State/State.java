package ru.micron.patterns.State;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class State {

  Player player;

  public abstract String onLock();

  public abstract String onPlay();

  public abstract String onNext();

  public abstract String onPrevious();
}
