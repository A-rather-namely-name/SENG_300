import java.io.*;

public class FileIO {

  /** Method that saves the programs and courses to a file
    * @param p  ArrayList of Program object p
    * @param c  ArrayList of Course object c
    */
  public void fileSave(ArrayList<Program> p, ArrayList<Course> c) {
    Scanner input = new Scanner(System.in);
    File save;
    boolean createOrLoadFile = false;

    String fileName = "saveFile";
    do {

            save = new File(fileName + ".dat");
            try {
                    save.createNewFile();
                    createOrLoadFile = true;
                    System.out.println("File created. ");
            } catch (IOException e) {
                    createOrLoadFile = false;
                    System.out.println("File could not be created.");
                    System.err.println("IOException:	"+ e.getMessage());
            }
    } while (createOrLoadFile != true);

    try {
            FileOutputStream outClear = new FileOutputStream(save);
            outClear.write(("").getBytes());
            outClear.close();

            FileOutputStream out = new FileOutputStream(save);
            ObjectOutputStream writer = new ObjectOutputStream(out);

            System.out.println("File saved");
            writer.writeObject(p);
            writer.writeObject(c);

            writer.close();

    } catch (FileNotFoundException e) {
            System.out.println("File could not be found.");
            System.err.println("FileNotFoundException: " + e.getMessage());
    } catch (IOException e) {
            System.out.println("Problem with input/output.");
            System.err.println("IOException: " + e.getMessage());
    }
  }

  /** Checks whether dataFile.dat exists or not
    * @return boolean if it exists or not
    */
  public boolean exitCheck() {
          Scanner input = new Scanner(System.in);
          File save;
          String fileName = "saveFile";
          data = new File(fileName + ".dat");

          if(save.exists()) {
                  return false;
          }
          return true;
  }

}
