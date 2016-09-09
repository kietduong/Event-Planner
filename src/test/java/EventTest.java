import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {
  @Test
  public void runEvent_createsInstance() {
    Event testEvent = new Event(2);
    assertEquals(true, testEvent instanceof Event);
  }
}
