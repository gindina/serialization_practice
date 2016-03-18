import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Created by giniyatullina on 15.03.2016.
 */
public class DataObject extends NonSerializible implements Serializable {
  private static final long serialVersionUID = 3341464114464753581L;

  int i = 5;
  String s = "string";
  transient String[] def = {"a", "b", "c"};
  CustomObject customObject;

  public String getS() {
    return s;
  }

  public void setS(String s) {
    this.s = s;
  }

  //важен порядок записи и чтения - он должен совпадать!

  private void writeObject(ObjectOutputStream out) throws IOException {
    out.defaultWriteObject(); //стандартная сериализация - родителю поля и метадату запишет, а нашего текущего класса нет, если у текущего класса есть writeObject
    String str = this.getMyDada();
    out.writeObject(str);
  }

  private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
    in.defaultReadObject();
    setMyDada((String) in.readObject());
  }
}
