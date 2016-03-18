import java.io.*;

public class Main {

  public static void main(String[] args) {
    DataObject dataObject = new DataObject();
    File f = new File("store.bin");
    dataObject.setMyDada("hello people!");
   // dataObject.setS("stringjkvdkl;fgvj;elkkkkkkjr;oigj;oerijgv;oerijgv;oijgvvjn,mcxnvcx,vjfdmfjdlfkj;lsd;lfjvkfdjnlfjdvhifugjkncvm,bnkljghoritglznvklhg;dfi");
    try {
      //BufferedWriter w = new BufferedWriter(new ObjectOutputStream());
      FileOutputStream fo = new FileOutputStream(f);
      ObjectOutputStream so = new ObjectOutputStream(fo);
      so.writeObject(dataObject);
      so.flush();
      so.close();
      readObj();
    }
    catch (Exception e) {

    }
    finally {

    }
  }

  public static void readObj() throws IOException, ClassNotFoundException{

    File ff = new File("store.bin");

    FileInputStream fi = new FileInputStream(ff);
    ObjectInputStream si = new ObjectInputStream(fi);
    Object o = si.readObject();
    si.close();
    System.out.print(((DataObject) o).getMyDada());
  }
}
