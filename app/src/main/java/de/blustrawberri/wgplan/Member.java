package de.blustrawberri.wgplan;

import android.graphics.Color;

/**
 * Created by Ri on 27.01.2015.
 */
public class Member {
    private int _id;
    private String _name;
    private Color _color;

    public Member(int id, String name,Color color){
        _id = id;
        _name = name;
        _color = color;
    }
}
