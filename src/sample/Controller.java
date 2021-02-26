package sample;
import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class Controller {
public TextArea text;

public void pressButton(ActionEvent event) throws IOException {
  {

      String s=text.getText();
      JSONArray obj3=new JSONArray();
      obj3.add(s);
      JSONObject obj=new JSONObject();
      {
          obj.put("Entered Text",obj3);
      }
      File f=new File("Bhuvan.txt");
      FileWriter fw=new FileWriter(f);
      obj.writeJSONString(fw);
      fw.close();

  }
}
}




