import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.effect.InnerShadow;
import javafx.scene.control.ChoiceBox;
import javafx.scene.text.Font;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.animation.AnimationTimer;
import javafx.geometry.Pos;
import javafx.scene.layout.*;
import javafx.scene.input.*;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.canvas.Canvas;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import java.io.*;
import java.util.*;

public class GUI extends Application{

  private int winX = 300;
  private int winY = 300;

  private ArrayList<Program> programList = new ArrayList<Program>();

  private String viewID;
  private String viewTitle;
  private String viewDesc;
  private String viewDepart;
  private String viewElect;
  private String viewRequire;


  public void start(Stage primaryStage){



    //vbox for the starting menu
    VBox menuBox = new VBox();
    menuBox.setAlignment(Pos.CENTER);
    menuBox.setSpacing(10);

    //all the components of the starting menu
    Button listProgramsButton = new Button();
    listProgramsButton.setText("List all Programs");

    Button addProgramButton = new Button();
    addProgramButton.setText("Add a New Program");

    Button editProgramButton = new Button();
    editProgramButton.setText("Edit a Program");

    Button quitButton = new Button();
    quitButton.setText("Quit");

    menuBox.getChildren().addAll(listProgramsButton, addProgramButton, editProgramButton, quitButton);

    //set the scene to the menuscene
    Scene menuScene = new Scene(menuBox, winX, winY);
    primaryStage.setTitle("Courrseseseseseses");
    primaryStage.setScene(menuScene);
    primaryStage.show();


////////////////////////////////////////////////
    VBox listProgramBox = new VBox();
    listProgramBox.setAlignment(Pos.CENTER);
    listProgramBox.setSpacing(10);

    ChoiceBox<String> programListChoiceBox = new ChoiceBox<String>();
    for (int i = 0; i < programList.size(); i++){
      Program currentProgram = programList.get(i);
      String s = currentProgram.getProgramID();
      programListChoiceBox.getItems().add(s);
    }


    Button viewProgramButton = new Button();
    viewProgramButton.setText("View Program");



    Button backButton = new Button();
    backButton.setText("Back to Menu");

    listProgramBox.getChildren().addAll(programListChoiceBox, viewProgramButton, backButton);

    Scene listProgramsScene = new Scene(listProgramBox, winX, winY);



    /////
    VBox viewProgramBox = new VBox();
    menuBox.setAlignment(Pos.CENTER);
    menuBox.setSpacing(10);

    Label viewidLbl = new Label("ID: " + viewID);

    Label viewtitleLbl = new Label("Title: " + viewTitle);

    Label viewdescLbl = new Label("Description: " + viewDesc);

    Label viewdepartLbl = new Label("Departments: " + viewDepart);

    Label viewelectLbl = new Label("Elective Courses: " + viewDepart);

    Label viewrequireLbl = new Label("Required Courses: " + viewRequire);

    Button backToListProgramBoxButton = new Button();
    backToListProgramBoxButton.setText("Back");

    viewProgramBox.getChildren().addAll(viewidLbl, viewtitleLbl, viewdescLbl, viewdepartLbl, viewelectLbl, viewrequireLbl, backToListProgramBoxButton);
    Scene viewProgramScene = new Scene(viewProgramBox, winX, winY);








    ///////////////////////////////////////

    VBox addProgramBox = new VBox();
    addProgramBox.setAlignment(Pos.CENTER);
    addProgramBox.setSpacing(10);

    Label idLbl = new Label("Enter ID of the Program");
    TextField idTxt = new TextField();

    Label titleLbl = new Label("Enter Title of the Program");
    TextField titleTxt = new TextField();

    Label descLbl = new Label("Enter Description of the Program");
    TextField descTxt = new TextField();

    Label departLbl = new Label("Enter the Departments the Program Belongs to Separated by Commas");
    TextField departTxt = new TextField();

    Label electLbl = new Label("Enter the Elective Courses the Program Offers Separated by Commas");
    TextField electTxt = new TextField();

    Label requireLbl = new Label("Enter the Required Courses of the Program Separated by Commas");
    TextField requireTxt = new TextField();

    Button enterNewProgramButton = new Button();
    enterNewProgramButton.setText("Add New Program");

    addProgramBox.getChildren().addAll(idLbl, idTxt, titleLbl, titleTxt, descLbl, descTxt, departLbl, departTxt, electLbl, electTxt, requireLbl, requireTxt, enterNewProgramButton);

    Scene addProgramScene = new Scene(addProgramBox, 500, 500);
    primaryStage.setTitle("Add New Program");







    listProgramsButton.setOnAction(new EventHandler<ActionEvent>(){
      public void handle(ActionEvent event){
        primaryStage.setScene(listProgramsScene);
      }
    });

    backButton.setOnAction(new EventHandler<ActionEvent>(){
      public void handle(ActionEvent event){


        /*Program currentProgram = programList.get(0);
        String s = currentProgram.getProgramID();
        System.out.println(s);*/

        primaryStage.setScene(menuScene);
      }
    });

    addProgramButton.setOnAction(new EventHandler<ActionEvent>(){
      public void handle(ActionEvent event){
        primaryStage.setScene(addProgramScene);
      }
    });

    enterNewProgramButton.setOnAction(new EventHandler<ActionEvent>(){
      public void handle(ActionEvent event){

        Program program = new Program();

        program.setProgramID(idTxt.getText());
        program.setProgramTitle(titleTxt.getText());
        program.setProgramDesc(descTxt.getText());

        String[] departments = departTxt.getText().split(", ");
    		for (String s: departments)
    			program.addDepartment(s);

        String[] electives = electTxt.getText().split(", ");
      	for (String s: electives)
      		program.add_Elective(s);

        String[] requiredCourses = requireTxt.getText().split(", ");
      	for (String s: requiredCourses)
      		program.addRequiredCourses(s);

        programList.add(program);

        /*for(int i = 0 ; i < programList.size() ; i++){
          programList.get(i).displayProgram(); //for debugging purposes for now
        }*/

        start(primaryStage);
      }
    });

    viewProgramButton.setOnAction(new EventHandler<ActionEvent>(){
      public void handle(ActionEvent event){

        String currentProgram = programListChoiceBox.getValue();
        for(int i = 0 ; i < programList.size() ; i++){
          if(programList.get(i).getProgramID() == currentProgram){
            programList.get(i).displayProgram();

          }
        }

        /*
        for(int i = 0 ; i < programList.size() ; i++){
          if(programList.get(i).getProgramID() == currentProgram){
            viewID = programList.get(i).getProgramID();
            viewTitle = programList.get(i).getProgramTitle();
            viewDesc = programList.get(i).getProgramDesc();


            /*for(String d: programList.get(i).getDepartments())
              System.out.print(d + " ");



            viewID = programList.get(i).getProgramID();
            viewID = programList.get(i).getProgramID();
          }
        }

        primaryStage.setScene(viewProgramScene); */





      }
    });

    backToListProgramBoxButton.setOnAction(new EventHandler<ActionEvent>(){
      public void handle(ActionEvent event){

        primaryStage.setScene(listProgramsScene);



      }
    });

    quitButton.setOnAction(new EventHandler<ActionEvent>(){
      public void handle(ActionEvent event){
        System.exit(0);
      }
    });






  /*private void updateChoiceBox(Program program){
    programListChoiceBox.getItems().add("it worked");
  }*/
}}
