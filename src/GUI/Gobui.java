package GUI;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Gobui extends Application{

    String [] stringy = {"--file=newData/data.txt"};

    @Override
    public void init() {

    }

    @Override
    public void start(Stage mainStage){
        GridPane pane = new GridPane();
        mainStage.setResizable(false);
        Button jobs = new Button("Jobs");
        jobs.setOnAction(e -> {
            javafx.application.Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    GUIForYou.main(stringy);
                }
            });
        });
        pane.add(jobs, 0, 0);

        mainStage.setScene(new Scene(pane));
        mainStage.show();
        mainStage.setAlwaysOnTop(true);
    }
        /*
        Button accounting = new Button("Accounting");
        Button admin = new Button("Administration");
        Button arch = new Button("Architecture");
        Button arts = new Button("Artist");
        Button aviation = new Button("Aviation");
        Button care = new Button("Care"); // has childcare too
        Button construction = new Button("Construction");
        Button customer = new Button("Customer");
        Button driver = new Button("Driver");
        Button education = new Button("Education");
        Button eng = new Button("Engineering"); //chem, civil, electric, id, mech
        Button facilitator = new Button("Facilitator");
        Button finance = new Button("Finance");
        Button food = new Button("Food");
        Button hospitality = new Button("Hospitality");
        Button hr = new Button("HR");
        Button install = new Button("Install");
        Button insurance = new Button("Insurance");
        Button legal = new Button("Legal");
        Button management = new Button("Management");
        Button manufacturing = new Button("Manufacturing");
        Button marketing = new Button("Marketing");
        Button math = new Button("Math");
        Button med = new Button("Medical");//dental, info, nurse, tech
        Button nursing = new Button("Nursing Supervisor");
        Button personal = new Button("Personal");
        Button pharmacy = new Button("Pharmacy");
        Button productSpecialist = new Button("Product Specialist");
        Button project = new Button("Project");
        Button protective = new Button("Protective");
        Button realEstate = new Button("Real Estate");
        Button retail = new Button("Retail");
        Button sales = new Button("Sales");//sales rep and just sales
        Button sanitation = new Button("Sanitation");
        Button science = new Button("Science");
        Button service = new Button("Service");
        Button socialScience = new Button("Social Science");
        Button speechLangPath = new Button("Speech Language Pathologist");
        Button sports = new Button("Sports");
        Button steward = new Button("Steward");
        Button tech = new Button("Tech"); //tech, help, info, software
        Button therapy = new Button("Therapy");
        Button transport = new Button("Transport");
        Button vet = new Button("Vet");
        Button warehouse = new Button("Warehouse");

        this.getChildren().addAll(accounting, admin, arch, arts, aviation, care, construction, customer, driver,
                education, eng, facilitator, finance, food, hospitality, hr, install, insurance, legal,
                management, manufacturing, marketing, med, math, nursing, personal, pharmacy, productSpecialist,
                project, protective, realEstate, retail, sales, sanitation, science, service, socialScience,
                speechLangPath, sports, steward, tech, therapy, transport, vet, warehouse);


    }
    */

}
