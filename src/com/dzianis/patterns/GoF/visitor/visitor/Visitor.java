package com.dzianis.patterns.GoF.visitor.visitor;

import com.dzianis.patterns.GoF.visitor.shapes.Circle;
import com.dzianis.patterns.GoF.visitor.shapes.CompoundShape;
import com.dzianis.patterns.GoF.visitor.shapes.Dot;
import com.dzianis.patterns.GoF.visitor.shapes.Rectangle;

public interface Visitor {
    public String visit(Dot dot);

    public String visit(Circle circle);

    public String visit(Rectangle rectangle);

    public String visit(CompoundShape cg);
}