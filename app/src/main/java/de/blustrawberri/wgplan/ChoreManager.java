package de.blustrawberri.wgplan;

/**
 * Created by Ri on 27.01.2015.
 */
public class ChoreManager {

    private static ChoreManager instance;

    //Singleton
    public static ChoreManager getInstance() {
        if (ChoreManager.instance == null)
            ChoreManager.instance = new ChoreManager();
        return ChoreManager.instance;
    }

    private ChoreManager() {
        //todo: load file serializable
    }
}
