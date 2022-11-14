package codingdojo;

import java.util.List;

public class BuffCollection {

  static float getSoakModifier(List<Buff> buffs) {
    return ((float) buffs
      .stream()
      .mapToDouble(Buff::soakModifier)
      .sum()) +
      1f;
  }

}
