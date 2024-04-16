package mooc.logic;

import mooc.ui.TextInterface;
import mooc.ui.UserInterface;

public class ApplicationLogic {

    private UserInterface ui;

    public ApplicationLogic(UserInterface ui) {
        this.ui = ui;
    }
    
    public void execute(int times){
        //TextInterface text = new TextInterface();
    for(int i= 0;i<times;i++){
        System.out.println("Application logic is working");
        ui.update();
    }
    
    }
}
