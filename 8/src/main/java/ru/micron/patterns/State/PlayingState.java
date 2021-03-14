package ru.micron.patterns.State;

public class PlayingState extends State {

  PlayingState(Player player) {
    super(player);
  }

  @Override
  public String onLock() {
    player.setState(new LockedState(player));
    player.setCurrentTrackAfterStop();
    return "Stop playing";
  }

  @Override
  public String onPlay() {
    player.setState(new ReadyState(player));
    return "Paused...";
  }

  @Override
  public String onNext() {
    return player.nextTrack();
  }

  @Override
  public String onPrevious() {
    return player.previousTrack();
  }
}
