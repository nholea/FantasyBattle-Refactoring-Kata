package codingdojo;

import java.util.List;

public class BuffCollections {


  static float getSoakModifier(List<Buff> buffs) {
    return ((float) buffs
      .stream()
      .mapToDouble(Buff::soakModifier)
      .sum()) +
      1f;
  }

}
