import java.io.Serializable;

/**
 * Created by giniyatullina on 15.03.2016.
 */
public class DataObject extends NonSerializible implements Serializable  {
  private static final long serialVersionUID = 3341464114464753581L;

  int i = 5;
  String s = "string";
  transient String [] def = {"a", "b", "c"};
  CustomObject customObject;

}
