package framework.environment.events;

import io.sarl.lang.annotation.SarlSpecification;
import io.sarl.lang.annotation.SyntheticMember;
import io.sarl.lang.core.Address;
import io.sarl.lang.core.Event;

/**
 * @author Leon Victor
 */
@SarlSpecification("0.5")
@SuppressWarnings("all")
public class StartSimulationEvent extends Event {
  @SyntheticMember
  public StartSimulationEvent() {
    super();
  }
  
  @SyntheticMember
  public StartSimulationEvent(final Address source) {
    super(source);
  }
  
  @SyntheticMember
  private final static long serialVersionUID = 588368462L;
}
