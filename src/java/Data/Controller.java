/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import DataSource.DBFacade;

/**
 *
 * @author Marc
 */
public class Controller {

    //Singleton
    private static Controller instance;
    private DBFacade dbf;

    private Controller() {
        dbf = DBFacade.getInstance();
    }

    public static Controller getInstance() {
        if (instance == null) {
            instance = new Controller();
        }
        return instance;
    }
}