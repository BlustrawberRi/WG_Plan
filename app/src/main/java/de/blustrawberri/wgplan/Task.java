package de.blustrawberri.wgplan;

import android.graphics.Color;

/**
 * Created by Ri on 27.01.2015.
 */
public class Task {



    private String _name;
    private Color _color;
    private int _value;

    public Task(String name, Color color, int value) {
        _name = name;
        _color = color;
        _value = value;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public Color get_color() {
        return _color;
    }

    public void set_color(Color _color) {
        this._color = _color;
    }

    public int get_value() {
        return _value;
    }

    public void set_value(int _value) {
        this._value = _value;
    }
}
