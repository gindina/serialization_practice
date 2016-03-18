import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * Created by giniyatullina on 15.03.2016.
 */
public class CustomObject implements Externalizable{
  transient boolean b;

  @Override
  public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

  }

  @Override
  public void writeExternal(ObjectOutput out) throws IOException {

  }
}
