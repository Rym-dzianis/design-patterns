package com.dzianis.patterns.GoF.visitor.visitor;

import com.dzianis.patterns.GoF.visitor.shapes.Circle;
import com.dzianis.patterns.GoF.visitor.shapes.CompoundShape;
import com.dzianis.patterns.GoF.visitor.shapes.Dot;
import com.dzianis.patterns.GoF.visitor.shapes.Rectangle;

public interface Visitor {
    public String visitDot(Dot dot);

    public String visitCircle(Circle circle);

    public String visitRectangle(Rectangle rectangle);

    public String visitCompoundGraphic(CompoundShape cg);
}