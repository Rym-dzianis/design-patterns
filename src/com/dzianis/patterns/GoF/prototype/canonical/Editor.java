// ============================================================================
//  File          : Editor
//  Created       : 12.09.2015   
//  Description   :
//  Modifications :
//
// ============================================================================
//  Copyright(c) 2015 Zoral, Ukraine
// ============================================================================
package com.dzianis.patterns.GoF.prototype.canonical;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Alimenkou Mikalai
 * @version 1.0
 */
public class Editor {
    private final List<Figure> figures = new ArrayList<>();

    private final Circle defaultCircle = new Circle(5);
    private final Rectangle defaultRectangle = new Rectangle(2, 4);

    public Circle addCircle() {
        Circle circle = defaultCircle.clone();
        figures.add(circle);
        return circle;
    }

    public Rectangle addRectangle() {
        Rectangle rectangle = defaultRectangle.clone();
        figures.add(rectangle);
        return rectangle;
    }
}
