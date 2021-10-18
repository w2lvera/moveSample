/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.controller;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Rectangle2D;
import mvc.model.shape.FillBehavior;
import mvc.model.Model;
import mvc.model.shape.MyShape;
import mvc.model.action.ActionBehavior;
import mvc.model.action.PaintAction;
import mvc.view.MyFrame;
import mvc.view.MyPanel;

/**
 *
 * @author Netbeans
 */
public class Controller {

    Model model;
    MyFrame frame;
    MyPanel panel;
    MyShape shape;
    PaintAction action;
            

    public void draw(Graphics2D g2) {
        model.draw(g2);
    }

    public Controller() {
        shape = new MyShape(new Rectangle2D.Double(), FillBehavior.Fill, Color.BLUE);
        model = new Model();
        model.setShape(shape);
        panel = new MyPanel(this);
        model.addObserver(panel);
        frame = new MyFrame(panel);
        frame.setController(this);
        action = new PaintAction();
        action.setAb(ActionBehavior.Draw);
        action.setModel(model);
        
    }

    public void mousePressed(Point point) {
        action.actionPress(point);
    }

    public void mouseDragged(Point point) {
        action.actionDrag(point);
    }

    public void setAction(ActionBehavior actionBehavior) {
        action.setAb(actionBehavior);
    }

}
