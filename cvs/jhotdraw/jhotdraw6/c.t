package CH.ifa.draw.standard;

<<<
package org.jhotdraw.standard;

>>>
<<<
abstract public class AbstractCommand implements Command, FigureSelectionListener {

    public AbstractCommand (String newName, DrawingView newView) {
    }

    <<<
    <<<
    <<<

    abstract public void execute (); <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
abstract public class AbstractCommand implements Command, FigureSelectionListener, ViewChangeListener {

    protected AbstractCommand.EventDispatcher getEventDispatcher ();
    protected boolean isExecutableWithView ();
    protected void checkExecutable ();
    public AbstractCommand (String newName, DrawingEditor newDrawingEditor) {
    }

    public AbstractCommand (String newName, DrawingEditor newDrawingEditor, boolean newIsViewRequired) {
    }

    public AbstractCommand.EventDispatcher createEventDispatcher ();
    public DrawingEditor getDrawingEditor (); >>>
    >>>
    >>>
    >>>
    public static class EventDispatcher {

        public EventDispatcher (Command newObservedCommand) {
        }

        public void addCommandListener (CommandListener newCommandListener);
        public void fireCommandExecutableEvent ();
        public void fireCommandExecutedEvent ();
        public void fireCommandNotExecutableEvent ();
        public void removeCommandListener (CommandListener oldCommandListener);
    }

    public void addCommandListener (CommandListener newCommandListener); >>>

    public void execute (); >>>

    public void removeCommandListener (CommandListener oldCommandListener); >>>
    >>>

    public void viewCreated (DrawingView view);
    public void viewDestroying (DrawingView view);
    public void viewSelectionChanged (DrawingView oldView, DrawingView newView);
}

<<<
abstract public class AbstractCommand implements Command, FigureSelectionListener, ViewChangeListener {
    <<<
    <<<

    protected void checkExecutable (); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
abstract public class AbstractCommand implements Command, FigureSelectionListener, ViewChangeListener {
    >>>
    >>>

    protected boolean isViewRequired (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
abstract public class AbstractCommand implements Command, FigureSelectionListener, ViewChangeListener {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
abstract public class AbstractCommand implements Command, FigureSelectionListener {
    final private ViewChangeListener myViewChangeListener = new ViewChangeListener () {
        >>>
        >>>
        >>>

    }

    ;
    >>>
    >>>
    >>>

    protected void viewCreated (DrawingView view);
    protected void viewDestroying (DrawingView view);
    protected void viewSelectionChanged (DrawingView oldView, DrawingView newView); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
abstract public class AbstractCommand implements Command, FigureSelectionListener {
    final private ViewChangeListener myViewChangeListener = new ViewChangeListener () {

        public void viewCreated (DrawingView view);
        public void viewDestroying (DrawingView view);
        public void viewSelectionChanged (DrawingView oldView, DrawingView newView);
    }

    ;
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public AbstractCommand.EventDispatcher createEventDispatcher (); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
abstract public class AbstractCommand implements Command, FigureSelectionListener {

    protected AbstractCommand.EventDispatcher createEventDispatcher (); >>>

    protected ViewChangeListener createViewChangeListener (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
abstract public class AbstractConnector implements Connector {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
abstract public class AbstractConnector implements Connector {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void connectorVisibility (boolean isVisible, ConnectionFigure courtingConnection); >>>
    >>>
    >>>

}

package CH.ifa.draw.standard;

<<<
package org.jhotdraw.standard;

>>>
<<<
abstract public class AbstractConnector implements Connector {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
abstract public class AbstractConnector implements Connector {
    protected Figure fOwner;
    >>>
    >>>
    >>>

    public Connector finalizeConnector (boolean start); >>>

    public Point connectorMovedTo (int x, int y); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.contrib.html;

<<<
package org.jhotdraw.contrib.html;

>>>
<<<
abstract public class AbstractFigure implements Figure {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public FigureChangeListener listener (); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public void addFigureChangeListener (FigureChangeListener l); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public void removeFigureChangeListener (FigureChangeListener l); <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
abstract public class AbstractFigure implements Figure {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public TextHolder getTextHolder (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public synchronized FigureChangeListener listener ();
    public synchronized FigureEnumeration getDependendFigures ();
    public synchronized void addDependendFigure (Figure newDependendFigure);
    public synchronized void addFigureChangeListener (FigureChangeListener l);
    public synchronized void removeDependendFigure (Figure oldDependendFigure);
    public synchronized void removeFigureChangeListener (FigureChangeListener l); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void visit (FigureVisitor visitor); >>>
    >>>

}

<<<
abstract public class AbstractFigure implements Figure {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
abstract public class AbstractFigure implements Figure {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public Figure getDecoratedFigure (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.standard;

<<<
package org.jhotdraw.standard;

>>>
<<<
abstract public class AbstractFigure implements Figure {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
abstract public class AbstractFigure implements Figure {
    >>>

    protected Rectangle invalidateRectangle (Rectangle r); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public Object getAttribute (FigureAttributeConstant attributeConstant); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void setAttribute (FigureAttributeConstant attributeConstant, Object value); >>>
    >>>
    >>>
    >>>

}

<<<
abstract public class AbstractFigure implements Figure {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    abstract public Vector handles (); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public void connectorVisibility (boolean isVisible); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
abstract public class AbstractFigure implements Figure {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    abstract public HandleEnumeration handles (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void connectorVisibility (boolean isVisible, ConnectionFigure connector); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
abstract public class AbstractHandle implements Handle {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
abstract public class AbstractHandle implements Handle {
    >>>
    >>>
    >>>

    public Undoable getUndoActivity (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void setUndoActivity (Undoable newUndoableActivity);
}

<<<
abstract public class AbstractHandle implements Handle {
    <<<
    <<<
    <<<
    <<<

    abstract public Point locate (); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
abstract public class AbstractHandle implements Handle {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
abstract public class AbstractHandle implements Handle {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
abstract public class AbstractHandle implements Handle {
    >>>

    public Cursor getCursor (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.standard;

<<<
package org.jhotdraw.standard;

>>>
<<<
abstract public class AbstractLineDecoration implements LineDecoration {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
abstract public class AbstractLineDecoration implements LineDecoration {
    >>>
    >>>
    >>>

    public Rectangle displayBox (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.figures;

<<<
package org.jhotdraw.figures;

>>>
package CH.ifa.draw.standard;

<<<
package org.jhotdraw.standard;

>>>
<<<
abstract public class AbstractLocator implements Cloneable, Locator, Storable {
    <<<
    <<<
    <<<
    <<<

}

>>>
abstract public class AbstractLocator implements Locator {
    >>>
    >>>
    >>>
    >>>

}

<<<
abstract public class AbstractLocator implements Locator {
    <<<
    <<<
    <<<
    <<<

}

>>>
abstract public class AbstractLocator implements Cloneable, Locator, Storable {
    >>>
    >>>
    >>>
    >>>

}

<<<
abstract public class AbstractTool implements Tool, ViewChangeListener {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
abstract public class AbstractTool implements Tool, ViewChangeListener {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    protected void setEditor (DrawingEditor newDrawingEditor);
    protected void setView (DrawingView newDrawingView); >>>
    >>>
    >>>

    public Drawing getActiveDrawing (); >>>

    public DrawingView getActiveView (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
abstract public class AbstractTool implements Tool, ViewChangeListener {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
abstract public class AbstractTool implements Tool {
    final private ViewChangeListener myViewChangeListener = new ViewChangeListener () {
        >>>
        >>>
        >>>

    }

    ;
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    protected void viewCreated (DrawingView view);
    protected void viewDestroying (DrawingView view);
    protected void viewSelectionChanged (DrawingView oldView, DrawingView newView); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
abstract public class AbstractTool implements Tool {
    final private ViewChangeListener myViewChangeListener = new ViewChangeListener () {

        public void viewCreated (DrawingView view);
        public void viewDestroying (DrawingView view);
        public void viewSelectionChanged (DrawingView oldView, DrawingView newView);
    }

    ;
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public AbstractTool.EventDispatcher createEventDispatcher (); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
abstract public class AbstractTool implements Tool {

    protected AbstractTool.EventDispatcher createEventDispatcher (); >>>

    protected ViewChangeListener createViewChangeListener (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.standard;

<<<
package org.jhotdraw.standard;

>>>
<<<
public class AbstractTool implements Tool {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
abstract public class AbstractTool implements Tool {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
abstract public class AbstractTool implements Tool {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class AbstractTool implements Tool {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class AbstractTool implements Tool {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
abstract public class AbstractTool implements Tool {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public Undoable getUndoActivity (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void setUndoActivity (Undoable newUndoActivity);
}

<<<
abstract public class AbstractTool implements Tool {
    protected DrawingView fView;
    <<<

    public AbstractTool (DrawingView itsView) {
    }

    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
abstract public class AbstractTool implements Tool, ViewChangeListener {

    protected AbstractTool.EventDispatcher getEventDispatcher (); >>>

    protected void checkUsable ();
    public AbstractTool (DrawingEditor newDrawingEditor) {
    }

    public AbstractTool.EventDispatcher createEventDispatcher (); >>>
    >>>
    >>>
    >>>

    public boolean isActive ();
    public boolean isUsable (); public static class EventDispatcher {

        public EventDispatcher (Tool newObservedTool) {
        }

        public void addToolListener (ToolListener newToolListener);
        public void fireToolActivatedEvent ();
        public void fireToolDeactivatedEvent ();
        public void fireToolUnusableEvent ();
        public void fireToolUsableEvent ();
        public void removeToolListener (ToolListener oldToolListener);
    }

    >>>

    public void addToolListener (ToolListener newToolListener); >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void removeToolListener (ToolListener oldToolListener); >>>

    public void viewCreated (DrawingView view);
    public void viewDestroying (DrawingView view);
    public void viewSelectionChanged (DrawingView oldView, DrawingView newView);
}

<<<
abstract public class AbstractTool implements Tool, ViewChangeListener {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    public static class EventDispatcher {
        <<<
        <<<
        <<<
        <<<
        <<<
        <<<
        <<<

    }

    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
abstract public class AbstractTool implements Tool, ViewChangeListener {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public boolean isEnabled (); >>>
    public static class EventDispatcher {
        >>>
        >>>
        >>>
        >>>

        public void fireToolDisabledEvent ();
        public void fireToolEnabledEvent (); >>>
        >>>
        >>>

    }

    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void setEnabled (boolean newIsEnabled); >>>

    public void setUsable (boolean newIsUsable); >>>
    >>>
    >>>

}

<<<
abstract public class AbstractTool implements Tool, ViewChangeListener {
    <<<
    protected int fAnchorX, fAnchorY;
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
abstract public class AbstractTool implements Tool, ViewChangeListener {
    >>>

    protected int getAnchorX ();
    protected int getAnchorY (); >>>

    protected void setAnchorX (int newAnchorX);
    protected void setAnchorY (int newAnchorY); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
abstract public class ActionTool extends AbstractTool {

    public ActionTool (DrawingView itsView) {
    }

    <<<
    <<<
    <<<

}

>>>
abstract public class ActionTool extends AbstractTool {

    public ActionTool (DrawingEditor newDrawingEditor) {
    }

    >>>
    >>>
    >>>

}

package CH.ifa.draw.standard;

<<<
package org.jhotdraw.standard;

>>>
<<<
public class AlignCommand extends Command {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class AlignCommand extends AbstractCommand {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class AlignCommand extends AbstractCommand {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class AlignCommand extends Command {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class AlignCommand extends Command {

    public AlignCommand (String name, DrawingView view, int op) {
    }

    <<<
    final public static int BOTTOMS = 5;
    final public static int CENTERS = 1;
    final public static int LEFTS = 0;
    final public static int MIDDLES = 4;
    final public static int RIGHTS = 2;
    final public static int TOPS = 3;
    <<<

}

>>>
public class AlignCommand extends AbstractCommand {

    protected Undoable createUndoActivity ();
    protected void setAlignment (Alignment newAlignment);
    public AlignCommand (Alignment newAlignment, DrawingView view) {
    }

    public Alignment getAlignment (); >>>
    abstract public static class Alignment {

        public String getDescription ();
        public String toString ();
        abstract public void moveBy (Figure f, Rectangle anchor); final public static Alignment BOTTOMS = new Alignment ("Bottoms") {

            public void moveBy (Figure f, Rectangle anchor);
        }

        ;
        final public static Alignment CENTERS = new Alignment ("Centers") {

            public void moveBy (Figure f, Rectangle anchor);
        }

        ;
        final public static Alignment LEFTS = new Alignment ("Lefts") {

            public void moveBy (Figure f, Rectangle anchor);
        }

        ;
        final public static Alignment MIDDLES = new Alignment ("Middles") {

            public void moveBy (Figure f, Rectangle anchor);
        }

        ;
        final public static Alignment RIGHTS = new Alignment ("Rights") {

            public void moveBy (Figure f, Rectangle anchor);
        }

        ;
        final public static Alignment TOPS = new Alignment ("Tops") {

            public void moveBy (Figure f, Rectangle anchor);
        }

        ;

    }

    public static class UndoActivity extends UndoableAdapter {

        protected void addOriginalPoint (Figure f);
        protected void setAppliedAlignment (Alignment newAlignment);
        public Alignment getAppliedAlignment ();
        public Point getOriginalPoint (Figure f);
        public UndoActivity (DrawingView newView, Alignment newAlignment) {
        }

        public boolean redo ();
        public boolean undo ();
        public void alignAffectedFigures (Alignment applyAlignment);
        public void setAffectedFigures (FigureEnumeration fe);
    }

    >>>

}

<<<
public class AlignCommand extends AbstractCommand {
    <<<
    <<<

    public AlignCommand (Alignment newAlignment, DrawingView view) {
    }

    <<<

    public boolean isExecutable (); <<<
    <<<
    <<<

}

>>>
public class AlignCommand extends AbstractCommand {
    >>>

    protected boolean isExecutableWithView (); >>>

    public AlignCommand (Alignment newAlignment, DrawingEditor newDrawingEditor) {
    }

    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.standard;

<<<
package org.jhotdraw.standard;

>>>
package CH.ifa.draw.util;

<<<
package org.jhotdraw.util;

>>>
<<<
public class AnimationDecorator extends DecoratorFigure {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class AnimationDecorator extends DecoratorFigure implements Animatable {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.samples.javadraw;

<<<
package org.jhotdraw.samples.javadraw;

>>>
package CH.ifa.draw.samples.javadraw;

<<<
package org.jhotdraw.samples.javadraw;

>>>
package CH.ifa.draw.contrib.zoom;

<<<
package org.jhotdraw.contrib.zoom;

>>>
package CH.ifa.draw.figures;

<<<
package org.jhotdraw.figures;

>>>
package CH.ifa.draw.contrib.html;

<<<
package org.jhotdraw.contrib.html;

>>>
<<<
abstract public class AttributeFigure extends AbstractFigure {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
abstract public class AttributeFigure extends AbstractFigure {
    >>>
    >>>
    >>>
    >>>
    >>>

    public Object getAttribute (FigureAttributeConstant attributeConstant); >>>

    public static Object getDefaultAttribute (FigureAttributeConstant attributeConstant); >>>

    public static Object initDefaultAttribute (String name, Object value);
    public static Object setDefaultAttribute (String name, Object value); >>>
    >>>

    public void setAttribute (FigureAttributeConstant attributeConstant, Object value); >>>
    >>>

}

package CH.ifa.draw.figures;

<<<
package org.jhotdraw.figures;

>>>
package CH.ifa.draw.contrib.html;

<<<
package org.jhotdraw.contrib.html;

>>>
package CH.ifa.draw.contrib;

<<<
package org.jhotdraw.contrib;

>>>
package CH.ifa.draw.standard;

public class AWTCursor extends Cursor implements CH.ifa.draw.framework.Cursor {
    <<<
    <<<

}

package org.jhotdraw.standard;

public class AWTCursor extends Cursor implements org.jhotdraw.framework.Cursor {
    >>>
    >>>

}

package CH.ifa.draw.figures;

<<<
package org.jhotdraw.figures;

>>>
<<<
public class BorderTool extends ActionTool {
    <<<
    <<<

}

>>>
public class BorderTool extends ActionTool {

    protected Undoable createUndoActivity (); >>>
    public static class UndoActivity extends UndoableAdapter {

        public UndoActivity (DrawingView newDrawingView) {
        }

        public boolean redo ();
        public boolean replaceAffectedFigures ();
        public boolean undo ();
    }

    >>>

}

<<<
public class BorderTool extends ActionTool {
    <<<

    public BorderTool (DrawingView view) {
    }

    <<<
    <<<

}

>>>
public class BorderTool extends ActionTool {
    >>>

    public BorderTool (DrawingEditor editor) {
    }

    >>>
    >>>

}

<<<
public class BorderTool extends ActionTool {
    <<<
    <<<
    <<<
    <<<

}

>>>
public class BorderTool extends ActionTool {
    >>>
    >>>
    >>>
    >>>

    public void mouseDown (MouseEvent e, int x, int y);
    public void reverseAction (Figure figure);
}

package CH.ifa.draw.figures;

<<<
package org.jhotdraw.figures;

>>>
<<<
public class BouncingDrawing extends StandardDrawing implements Animatable {
    <<<
    <<<

    public synchronized void replace (Figure figure, Figure replacement); <<<

}

>>>
public class BouncingDrawing extends StandardDrawing implements Animatable {
    >>>
    >>>

    public synchronized Figure replace (Figure figure, Figure replacement); >>>

}

package CH.ifa.draw.samples.javadraw;

<<<
package org.jhotdraw.samples.javadraw;

>>>
package CH.ifa.draw.util;

<<<
package org.jhotdraw.util;

>>>
<<<
<<<
class NorthEastHandle extends LocatorHandle {
    <<<

}

class EastHandle extends LocatorHandle {
    <<<

}

class NorthHandle extends LocatorHandle {
    <<<

}

class NorthWestHandle extends LocatorHandle {
    <<<

}

class SouthEastHandle extends LocatorHandle {
    <<<

}

class SouthHandle extends LocatorHandle {
    <<<

}

class SouthWestHandle extends LocatorHandle {
    <<<

}

class WestHandle extends LocatorHandle {
    <<<

}

>>>
>>>
class ResizeHandle extends LocatorHandle {

    protected Undoable createUndoActivity (); public static class UndoActivity extends UndoableAdapter {

        protected void setOldDisplayBox (Rectangle newOldDisplayBox);
        public Rectangle getOldDisplayBox ();
        public UndoActivity () {
        }

        public boolean redo ();
        public boolean undo ();
    }

    public void invokeEnd (int x, int y, int anchorX, int anchorY, DrawingView view);
    public void invokeStart (int x, int y, DrawingView view);
}

class NorthEastHandle extends ResizeHandle {
    >>>

}

class EastHandle extends ResizeHandle {
    >>>

}

class NorthHandle extends ResizeHandle {
    >>>

}

class NorthWestHandle extends ResizeHandle {
    >>>

}

class SouthEastHandle extends ResizeHandle {
    >>>

}

class SouthHandle extends ResizeHandle {
    >>>

}

class SouthWestHandle extends ResizeHandle {
    >>>

}

class WestHandle extends ResizeHandle {
    >>>

}

<<<
<<<
class ResizeHandle extends LocatorHandle {

    protected Undoable createUndoActivity (); public static class UndoActivity extends UndoableAdapter {
        <<<
        <<<

        public UndoActivity () {
        }

        <<<
        <<<

    }

    <<<
    <<<

}

<<<
<<<
<<<
<<<
<<<
<<<
<<<
<<<
>>>
>>>
class ResizeHandle extends LocatorHandle {

    protected Undoable createUndoActivity (DrawingView view); public static class UndoActivity extends UndoableAdapter {
        >>>
        >>>

        public UndoActivity (DrawingView newView) {
        }

        >>>
        >>>

    }

    >>>
    >>>

}

>>>
>>>
>>>
>>>
>>>
>>>
>>>
>>>
<<<
public class BoxHandleKit {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public static void addCornerHandles (Figure f, Vector handles);
    public static void addHandles (Figure f, Vector handles);
}

<<<
<<<
<<<
<<<
<<<
<<<
<<<
<<<
<<<
>>>
public class BoxHandleKit {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public static void addCornerHandles (Figure f, List handles);
    public static void addHandles (Figure f, List handles);
}

>>>
>>>
>>>
>>>
>>>
>>>
>>>
>>>
>>>
package CH.ifa.draw.standard;

<<<
<<<
<<<
<<<
<<<
<<<
<<<
<<<
<<<
<<<
package org.jhotdraw.standard;

>>>
>>>
>>>
>>>
>>>
>>>
>>>
>>>
>>>
>>>
package CH.ifa.draw.standard;

<<<
package org.jhotdraw.standard;

>>>
<<<
public class BringToFrontCommand extends Command {
    <<<
    <<<
    <<<

}

>>>
public class BringToFrontCommand extends AbstractCommand {
    >>>
    >>>
    >>>

}

<<<
public class BringToFrontCommand extends AbstractCommand {
    <<<
    <<<
    <<<

}

>>>
public class BringToFrontCommand extends Command {
    >>>
    >>>
    >>>

}

<<<
public class BringToFrontCommand extends Command {
    <<<
    <<<
    <<<

}

>>>
public class BringToFrontCommand extends AbstractCommand {

    protected Undoable createUndoActivity (); >>>
    >>>
    public static class UndoActivity extends SendToBackCommand.UndoActivity {

        protected void sendToCommand (Figure f);
        public UndoActivity (DrawingView newDrawingView) {
        }

    }

    >>>

}

<<<
public class BringToFrontCommand extends AbstractCommand {
    <<<

    public BringToFrontCommand (String name, DrawingView view) {
    }

    public boolean isExecutable (); <<<
    <<<

}

>>>
public class BringToFrontCommand extends AbstractCommand {
    >>>

    public BringToFrontCommand (String name, DrawingEditor newDrawingEditor) {
    }

    public boolean isExecutableWithView (); >>>
    >>>

}

package CH.ifa.draw.standard;

<<<
package org.jhotdraw.standard;

>>>
<<<
public class ChangeAttributeCommand extends AbstractCommand {
    <<<

    public ChangeAttributeCommand (String name, String attributeName, Object value, DrawingEditor newDrawingEditor) {
    }

    <<<
    public static class UndoActivity extends UndoableAdapter {
        <<<
        <<<

        protected void setAttributeName (String newUndoAttribute); <<<
        <<<

        public String getAttributeName ();
        public UndoActivity (DrawingView newDrawingView, String newUndoAttribute, Object newUndoValue) {
        }

        <<<
        <<<
        <<<
        <<<

    }

    <<<

}

>>>
public class ChangeAttributeCommand extends AbstractCommand {
    >>>

    public ChangeAttributeCommand (String name, FigureAttributeConstant attribute, Object value, DrawingEditor newDrawingEditor) {
    }

    >>>
    public static class UndoActivity extends UndoableAdapter {
        >>>
        >>>

        protected void setAttribute (FigureAttributeConstant newUndoAttribute); >>>

        public FigureAttributeConstant getAttribute (); >>>

        public UndoActivity (DrawingView newDrawingView, FigureAttributeConstant newUndoAttribute, Object newUndoValue) {
        }

        >>>
        >>>
        >>>
        >>>

    }

    >>>

}

package CH.ifa.draw.standard;

<<<
package org.jhotdraw.standard;

>>>
<<<
public class ChangeAttributeCommand extends Command {
    <<<
    <<<
    <<<

}

>>>
public class ChangeAttributeCommand extends AbstractCommand {
    >>>
    >>>
    >>>

}

<<<
public class ChangeAttributeCommand extends AbstractCommand {
    <<<
    <<<
    <<<

}

>>>
public class ChangeAttributeCommand extends Command {
    >>>
    >>>
    >>>

}

<<<
public class ChangeAttributeCommand extends Command {
    <<<
    <<<
    <<<

}

>>>
public class ChangeAttributeCommand extends AbstractCommand {

    protected Undoable createUndoActivity (); >>>
    >>>
    public static class UndoActivity extends UndoableAdapter {

        protected Object getOriginalValue (Figure lookupAffectedFigure);
        protected void addOriginalValue (Figure affectedFigure, Object newOriginalValue);
        protected void setAttributeName (String newUndoAttribute);
        protected void setBackupValue (Object newUndoValue);
        public Object getBackupValue ();
        public String getAttributeName ();
        public UndoActivity (DrawingView newDrawingView, String newUndoAttribute, Object newUndoValue) {
        }

        public boolean redo ();
        public boolean undo ();
        public void release ();
        public void setAffectedFigures (FigureEnumeration fe);
    }

    >>>

}

<<<
public class ChangeAttributeCommand extends AbstractCommand {
    <<<

    public ChangeAttributeCommand (String name, String attributeName, Object value, DrawingView view) {
    }

    public boolean isExecutable (); <<<
    <<<

}

>>>
public class ChangeAttributeCommand extends AbstractCommand {
    >>>

    public ChangeAttributeCommand (String name, String attributeName, Object value, DrawingEditor newDrawingEditor) {
    }

    public boolean isExecutableWithView (); >>>
    >>>

}

package CH.ifa.draw.standard;

<<<
package org.jhotdraw.standard;

>>>
<<<
public class ChangeConnectionEndHandle extends ChangeConnectionHandle {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class ChangeConnectionEndHandle extends ChangeConnectionHandle {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void draw (java.awt.Graphics g);
}

<<<
public class ChangeConnectionEndHandle extends ChangeConnectionHandle {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class ChangeConnectionEndHandle extends ChangeConnectionHandle {
    >>>

    protected Undoable createUndoActivity (); >>>
    >>>
    >>>
    >>>
    >>>
    public static class UndoActivity extends ChangeConnectionHandle.UndoActivity {

        protected Connector replaceConnector (ConnectionFigure connection);
        public UndoActivity () {
        }

    }

}

<<<
public class ChangeConnectionEndHandle extends ChangeConnectionHandle {
    <<<

    protected Undoable createUndoActivity (); <<<
    <<<
    <<<
    <<<
    <<<
    public static class UndoActivity extends ChangeConnectionHandle.UndoActivity {
        <<<

        public UndoActivity () {
        }

    }

}

>>>
public class ChangeConnectionEndHandle extends ChangeConnectionHandle {
    >>>

    protected Undoable createUndoActivity (DrawingView newView); >>>
    >>>
    >>>
    >>>
    >>>
    public static class UndoActivity extends ChangeConnectionHandle.UndoActivity {
        >>>

        public UndoActivity (DrawingView newView) {
        }

    }

}

<<<
public class ChangeConnectionEndHandle extends ChangeConnectionHandle {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class ChangeConnectionEndHandle extends ChangeConnectionHandle {
    >>>
    >>>

    protected boolean canConnectTo (Figure figure); >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class ChangeConnectionEndHandle extends ChangeConnectionHandle {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public ChangeConnectionEndHandle (Figure owner) {
    }

    <<<
    <<<

}

>>>
public class ChangeConnectionEndHandle extends ChangeConnectionHandle {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public ChangeConnectionEndHandle (ConnectionFigure owner) {
    }

    >>>
    >>>

}

package CH.ifa.draw.standard;

<<<
package org.jhotdraw.standard;

>>>
<<<
abstract public class ChangeConnectionHandle extends AbstractHandle {
    <<<
    protected ConnectionFigure fConnection;
    protected Connector fOriginalTarget;
    <<<
    <<<
    protected Figure fTarget;
    protected Point fStart;
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
abstract public class ChangeConnectionHandle extends AbstractHandle {
    >>>

    protected ConnectionFigure getConnection (); >>>
    >>>

    protected Figure getTarget (); >>>

    abstract protected Undoable createUndoActivity (); >>>
    >>>
    >>>

    protected void setConnection (ConnectionFigure newConnection);
    protected void setTarget (Figure newTarget); abstract public static class UndoActivity extends UndoableAdapter {

        abstract protected Connector replaceConnector (ConnectionFigure connection);
        public Connector getOldConnector ();
        public UndoActivity () {
        }

        public boolean redo ();
        public boolean undo ();
        public void setOldConnector (Connector newOldConnector);
    }

    >>>
    >>>
    >>>
    >>>

}

<<<
abstract public class ChangeConnectionHandle extends AbstractHandle {
    <<<
    <<<
    <<<
    <<<

    protected Figure getTarget (); <<<

    abstract protected Undoable createUndoActivity (); <<<
    <<<
    <<<
    <<<

    protected void setTarget (Figure newTarget); abstract public static class UndoActivity extends UndoableAdapter {
        <<<
        <<<

        public UndoActivity () {
        }

        <<<
        <<<
        <<<

    }

    <<<
    <<<
    <<<
    <<<

}

>>>
abstract public class ChangeConnectionHandle extends AbstractHandle {
    >>>
    >>>
    >>>
    >>>

    protected Figure getTargetFigure (); >>>

    abstract protected Undoable createUndoActivity (DrawingView newView); >>>
    >>>
    >>>
    >>>

    protected void setTargetFigure (Figure newTarget); abstract public static class UndoActivity extends UndoableAdapter {
        >>>
        >>>

        public UndoActivity (DrawingView newView) {
        }

        >>>
        >>>
        >>>

    }

    >>>
    >>>
    >>>
    >>>

}

<<<
abstract public class ChangeConnectionHandle extends AbstractHandle {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
abstract public class ChangeConnectionHandle extends AbstractHandle {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    abstract protected boolean canConnectTo (Figure figure); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
abstract public class ChangeConnectionHandle extends AbstractHandle {

    protected ChangeConnectionHandle (Figure owner) {
    }

    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
abstract public class ChangeConnectionHandle extends AbstractHandle {

    protected ChangeConnectionHandle (ConnectionFigure owner) {
    }

    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.standard;

<<<
package org.jhotdraw.standard;

>>>
<<<
public class ChangeConnectionStartHandle extends ChangeConnectionHandle {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class ChangeConnectionStartHandle extends ChangeConnectionHandle {
    >>>

    protected Undoable createUndoActivity (); >>>
    >>>
    >>>
    >>>
    >>>
    public static class UndoActivity extends ChangeConnectionHandle.UndoActivity {

        protected Connector replaceConnector (ConnectionFigure connection);
        public UndoActivity () {
        }

    }

}

<<<
public class ChangeConnectionStartHandle extends ChangeConnectionHandle {
    <<<

    protected Undoable createUndoActivity (); <<<
    <<<
    <<<
    <<<
    <<<
    public static class UndoActivity extends ChangeConnectionHandle.UndoActivity {
        <<<

        public UndoActivity () {
        }

    }

}

>>>
public class ChangeConnectionStartHandle extends ChangeConnectionHandle {
    >>>

    protected Undoable createUndoActivity (DrawingView newView); >>>
    >>>
    >>>
    >>>
    >>>
    public static class UndoActivity extends ChangeConnectionHandle.UndoActivity {
        >>>

        public UndoActivity (DrawingView newView) {
        }

    }

}

<<<
public class ChangeConnectionStartHandle extends ChangeConnectionHandle {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class ChangeConnectionStartHandle extends ChangeConnectionHandle {
    >>>
    >>>

    protected boolean canConnectTo (Figure figure); >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class ChangeConnectionStartHandle extends ChangeConnectionHandle {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public ChangeConnectionStartHandle (Figure owner) {
    }

    <<<
    <<<

}

>>>
public class ChangeConnectionStartHandle extends ChangeConnectionHandle {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public ChangeConnectionStartHandle (ConnectionFigure owner) {
    }

    >>>
    >>>

}

package CH.ifa.draw.standard;

<<<
package org.jhotdraw.standard;

>>>
package CH.ifa.draw.contrib;

<<<
package org.jhotdraw.contrib;

>>>
package CH.ifa.draw.figures;

<<<
package org.jhotdraw.figures;

>>>
package CH.ifa.draw.contrib;

<<<
package org.jhotdraw.contrib;

>>>
package CH.ifa.draw.util;

<<<
package org.jhotdraw.util;

>>>
package CH.ifa.draw.contrib;

<<<
package org.jhotdraw.contrib;

>>>
package CH.ifa.draw.util;

<<<
package org.jhotdraw.util;

>>>
package CH.ifa.draw.util.collections.jdk11;

<<<
package org.jhotdraw.util.collections.jdk11;

>>>
package CH.ifa.draw.util.collections.jdk12;

<<<
package org.jhotdraw.util.collections.jdk12;

>>>
<<<
public class ColorContentProducer extends FigureDataContentProducer implements Serializable {
    <<<
    <<<

    public ColorContentProducer (Color color) {
        fColor = color;
    }

    <<<
    <<<
    <<<
    <<<

}

>>>
public class ColorContentProducer extends FigureDataContentProducer implements Serializable {
    >>>
    >>>

    public ColorContentProducer (Color color) {
        setColor (color);
    }

    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.contrib.html;

<<<
package org.jhotdraw.contrib.html;

>>>
<<<
<<<
public class ColorMap extends Object {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
>>>
public class ColorMap {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.util;

<<<
<<<
package org.jhotdraw.util;

>>>
>>>
<<<
abstract public class Command {

    public Command (String name) {
    }

    <<<

    abstract public void execute (); <<<

}

>>>
public interface Command {

    public DrawingView view (); >>>
    >>>

    public void execute ();
}

<<<
public interface Command {

    public DrawingView view (); <<<
    <<<

    public void execute ();
}

>>>
abstract public class Command {

    public Command (String name) {
    }

    >>>

    abstract public void execute (); >>>

}

<<<
abstract public class Command {

    public Command (String name) {
    }

    <<<

    abstract public void execute (); <<<

}

>>>
public interface Command {

    public DrawingView view (); >>>

    public Undoable getUndoActivity (); >>>

    public void execute ();
    public void setUndoActivity (Undoable newUndoableActivity);
}

<<<
public interface Command {

    public DrawingView view (); <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public interface Command {

    public DrawingEditor getDrawingEditor (); >>>
    >>>
    >>>

    public void addCommandListener (CommandListener newCommandListener); >>>

    public void removeCommandListener (CommandListener oldCommandListener); >>>

}

package CH.ifa.draw.util;

<<<
package org.jhotdraw.util;

>>>
package CH.ifa.draw.util;

<<<
package org.jhotdraw.util;

>>>
package CH.ifa.draw.contrib;

<<<
package org.jhotdraw.contrib;

>>>
package CH.ifa.draw.util;

<<<
package org.jhotdraw.util;

>>>
package CH.ifa.draw.contrib;

<<<
package org.jhotdraw.contrib;

>>>
package CH.ifa.draw.util;

<<<
package org.jhotdraw.util;

>>>
<<<
public class CommandMenu extends JMenu implements ActionListener {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class CommandMenu extends JMenu implements ActionListener {
    >>>
    >>>
    >>>

    public synchronized void addCheckItem (Command command); >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class CommandMenu extends JMenu implements ActionListener {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class CommandMenu extends JMenu implements ActionListener, CommandListener {

    protected void addMenuItem (Command command, JMenuItem m); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void commandExecutable (EventObject commandEvent);
    public void commandExecuted (EventObject commandEvent);
    public void commandNotExecutable (EventObject commandEvent);
}

package CH.ifa.draw.util;

<<<
package org.jhotdraw.util;

>>>
<<<
public class CommandMenuItem extends JMenuItem implements CommandHolder {
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class CommandMenuItem extends JMenuItem implements ActionListener, CommandHolder {
    >>>
    >>>
    >>>
    >>>

    public void actionPerformed (ActionEvent e); >>>

}

package CH.ifa.draw.contrib;

<<<
package org.jhotdraw.contrib;

>>>
<<<
public class ComponentFigure extends AttributeFigure {

    protected DrawingEditor getEditor (); <<<
    <<<

    protected void setEditor (DrawingEditor newDrawingEditor); <<<

    public ComponentFigure (Component newComponent, DrawingEditor newDrawingEditor) {
    }

    <<<

    public Object clone (); <<<
    <<<
    <<<

}

>>>
public class ComponentFigure extends AttributeFigure {
    >>>
    >>>
    >>>

    public ComponentFigure (Component newComponent) {
    }

    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.contrib;

<<<
package org.jhotdraw.contrib;

>>>
<<<
abstract public class CompositeFigure extends AbstractFigure implements FigureChangeListener {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    final public FigureEnumeration figures (); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
abstract public class CompositeFigure extends AbstractFigure implements FigureChangeListener {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public FigureEnumeration figures (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.standard;

<<<
package org.jhotdraw.standard;

>>>
<<<
abstract public class CompositeFigure extends AbstractFigure implements FigureChangeListener {
    <<<
    <<<
    protected int _nHighestZ = 0;
    protected int _nLowestZ = 0;
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public void invalidate (); <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
abstract public class CompositeFigure extends AbstractFigure implements FigureChangeListener {
    >>>
    >>>
    protected int _nHighestZ;
    protected int _nLowestZ;
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
abstract public class CompositeFigure extends AbstractFigure implements FigureChangeListener {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public synchronized void replace (Figure figure, Figure replacement); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
abstract public class CompositeFigure extends AbstractFigure implements FigureChangeListener {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public Figure getFigureFromLayer (int layerNr); >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public int getLayer (Figure figure); >>>

    public synchronized Figure replace (Figure figure, Figure replacement); >>>
    >>>

    public void addAll (FigureEnumeration fe); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void orphanAll (FigureEnumeration fe); >>>
    >>>
    >>>
    >>>

    public void removeAll (FigureEnumeration fe); >>>

    public void sendToLayer (Figure figure, int layerNr); >>>

}

<<<
abstract public class CompositeFigure extends AbstractFigure implements FigureChangeListener {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
abstract public class CompositeFigure extends AbstractFigure implements FigureChangeListener {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public boolean containsFigure (Figure checkFigure); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
abstract public class CompositeFigure extends AbstractFigure implements FigureChangeListener {
    <<<
    protected Vector fFigures;
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public void addAll (Vector newFigures); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public void orphanAll (Vector newFigures); <<<
    <<<
    <<<
    <<<

    public void removeAll (Vector figures); <<<
    <<<

}

>>>
abstract public class CompositeFigure extends AbstractFigure implements FigureChangeListener {
    >>>
    protected List fFigures;
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void addAll (List newFigures); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void orphanAll (List newFigures); >>>
    >>>
    >>>
    >>>

    public void removeAll (List figures); >>>
    >>>

}

<<<
public class CompositeFigureCreationTool extends CreationTool {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public void mouseUp (MouseEvent e, int x, int y);
}

>>>
public class CompositeFigureCreationTool extends CreationTool {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.contrib;

<<<
package org.jhotdraw.contrib;

>>>
<<<
public class ConnectedTextTool extends TextTool {
    <<<
    <<<
    <<<

}

>>>
public class ConnectedTextTool extends TextTool {

    protected Undoable createUndoActivity (); >>>
    public static class UndoActivity extends TextTool.UndoActivity {

        public Figure getConnectedFigure ();
        public UndoActivity (DrawingView newDrawingView, String newOriginalText) {
        }

        public boolean redo ();
        public boolean undo ();
        public void setConnectedFigure (Figure newConnectedFigure);
    }

    >>>
    >>>

}

<<<
public class ConnectedTextTool extends TextTool {
    <<<

    public ConnectedTextTool (DrawingView view, Figure prototype) {
    }

    <<<
    <<<
    <<<

}

>>>
public class ConnectedTextTool extends TextTool {
    >>>

    public ConnectedTextTool (DrawingEditor editor, Figure prototype) {
    }

    >>>
    >>>
    >>>

}

<<<
public class ConnectedTextTool extends TextTool {
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class ConnectedTextTool extends TextTool {
    >>>

    protected void endEdit ();
    protected void setConnectedFigure (Figure pressedFigure); >>>

    public Figure getConnectedFigure (); >>>
    >>>
    >>>

}

<<<
public class ConnectedTextTool extends TextTool {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class ConnectedTextTool extends TextTool {

    protected Undoable createDeleteUndoActivity (); >>>
    >>>
    >>>
    >>>
    >>>
    public static class DeleteUndoActivity extends DeleteCommand.UndoActivity {

        public DeleteUndoActivity (FigureTransferCommand cmd, Figure newConnectedFigure) {
        }

        >>>

        public boolean redo ();
        public boolean undo ();
        public void setConnectedFigure (Figure newConnectedFigure);
    }

    >>>
    >>>
    >>>

}

package CH.ifa.draw.figures;

<<<
package org.jhotdraw.figures;

>>>
<<<
public interface ConnectionFigure extends Figure, FigureChangeListener {

    public Connector end ();
    public Connector start (); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public interface ConnectionFigure extends Figure, FigureChangeListener {

    public Connector getEndConnector ();
    public Connector getStartConnector ();
    public Figure endFigure ();
    public Figure startFigure (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.framework;

<<<
package org.jhotdraw.framework;

>>>
<<<
public class ConnectionHandle extends LocatorHandle {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class ConnectionHandle extends LocatorHandle {
    >>>

    protected ConnectionFigure getConnection (); >>>
    >>>

    protected void setConnection (ConnectionFigure newConnection); >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class ConnectionHandle extends LocatorHandle {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class ConnectionHandle extends LocatorHandle {
    >>>
    >>>
    >>>
    >>>

    protected Figure getTargetFigure (); >>>

    protected void setTargetFigure (Figure newTargetFigure); >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class ConnectionHandle extends LocatorHandle {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class ConnectionHandle extends LocatorHandle {
    >>>
    >>>
    >>>
    >>>
    >>>

    protected Undoable createUndoActivity (DrawingView view); >>>
    >>>
    >>>

    public Cursor getCursor (); >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.standard;

<<<
package org.jhotdraw.standard;

>>>
<<<
public class ConnectionTool extends AbstractTool {
    <<<

    protected ConnectionFigure createdFigure (); <<<
    <<<
    <<<

    protected Connector getTarget (); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class ConnectionTool extends AbstractTool {
    >>>
    >>>

    protected ConnectionFigure getConnection (); >>>
    >>>

    protected Connector getTargetConnector (); >>>
    >>>
    >>>

    protected Figure getAddedFigure ();
    protected Figure getTarget ();
    protected Undoable createUndoActivity (); >>>
    >>>
    public static class UndoActivity extends UndoableAdapter {

        protected ConnectionFigure getConnection ();
        public UndoActivity (DrawingView newDrawingView, ConnectionFigure newConnection) {
        }

        public boolean redo ();
        public boolean undo ();
    }

    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class ConnectionTool extends AbstractTool {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    protected Figure getTarget (); <<<
    <<<

    public ConnectionTool (DrawingView view, ConnectionFigure prototype) {
    }

    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class ConnectionTool extends AbstractTool {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    protected Figure getTargetFigure (); >>>
    >>>

    public ConnectionTool (DrawingEditor newDrawingEditor, ConnectionFigure newPrototype) {
    }

    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class ConnectionTool extends AbstractTool {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    public static class UndoActivity extends UndoableAdapter {
        <<<
        <<<
        <<<
        <<<

    }

    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class ConnectionTool extends AbstractTool {
    >>>
    >>>
    >>>

    protected Connector findConnector (int x, int y, Figure f); >>>
    >>>
    >>>

    protected Figure findConnectableFigure (int x, int y, Drawing drawing); >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    protected void setAddedFigure (Figure newAddedFigure);
    protected void setConnection (ConnectionFigure newConnection);
    protected void setEndConnector (Connector newEndConnector);
    protected void setStartConnector (Connector newStartConnector);
    protected void setTargetConnector (Connector newTargetConnector);
    protected void setTargetFigure (Figure newTarget); >>>
    >>>
    public static class UndoActivity extends UndoableAdapter {
        >>>

        protected void setConnection (ConnectionFigure newConnection); >>>
        >>>
        >>>

    }

    >>>
    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.standard;

<<<
package org.jhotdraw.standard;

>>>
<<<
public interface Connector extends Serializable, Storable {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public interface Connector extends Serializable, Storable {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void connectorVisibility (boolean isVisible, ConnectionFigure courtingConnection);
}

package CH.ifa.draw.framework;

<<<
package org.jhotdraw.framework;

>>>
<<<
public interface Connector extends Serializable, Storable {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public interface Connector extends Serializable, Storable {

    public Connector finalizeConnector (boolean start); >>>

    abstract public Point connectorMovedTo (int x, int y); >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.contrib.html;

<<<
package org.jhotdraw.contrib.html;

>>>
package CH.ifa.draw.contrib.html;

<<<
package org.jhotdraw.contrib.html;

>>>
<<<
public class ContentProducerRegistry implements Serializable, Storable {
    <<<
    protected Hashtable fContentProducers = new Hashtable ();
    protected static ContentProducerRegistry fDefaultRegistry = new ContentProducerRegistry (null);
    protected transient ContentProducerRegistry fParent = null;
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class ContentProducerRegistry implements Serializable, Storable {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.contrib.html;

<<<
package org.jhotdraw.contrib.html;

>>>
package CH.ifa.draw.standard;

<<<
package org.jhotdraw.standard;

>>>
<<<
public class CopyCommand extends FigureTransferCommand {

    public CopyCommand (String name, DrawingView view) {
    }

    public boolean isExecutable (); <<<

}

>>>
public class CopyCommand extends FigureTransferCommand {

    protected boolean isExecutableWithView ();
    public CopyCommand (String name, DrawingEditor newDrawingEditor) {
    }

    >>>

}

<<<
public class CreationTool extends AbstractTool {
    <<<
    <<<
    <<<
    <<<

    protected Point getAnchorPoint (); <<<
    <<<

    protected void setAnchorPoint (Point newAnchorPoint); <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class CreationTool extends AbstractTool {
    >>>
    >>>
    >>>
    >>>

    protected Figure getPrototypeFigure (); >>>
    >>>
    >>>

    protected void setPrototypeFigure (Figure newPrototypeFigure); >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class CreationTool extends AbstractTool {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class CreationTool extends AbstractTool {
    >>>
    >>>
    >>>
    >>>
    >>>

    protected List getAddedFigures (); >>>
    >>>

    protected void setAddedFigures (List newAddedFigures); >>>
    >>>
    >>>
    >>>

    public void deactivate (); >>>
    >>>
    >>>

}

package CH.ifa.draw.standard;

<<<
package org.jhotdraw.standard;

>>>
<<<
public class CreationTool extends AbstractTool {
    <<<
    <<<

    protected Figure createdFigure (); <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class CreationTool extends AbstractTool {
    >>>
    >>>

    protected Figure getAddedFigure ();
    protected Figure getCreatedFigure ();
    protected Undoable createUndoActivity (); >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class CreationTool extends AbstractTool {

    protected CreationTool (DrawingView view) {
    }

    <<<
    <<<
    <<<
    <<<

    public CreationTool (DrawingView view, Figure prototype) {
    }

    <<<
    <<<
    <<<
    <<<

}

>>>
public class CreationTool extends AbstractTool {

    protected CreationTool (DrawingEditor newDrawingEditor) {
    }

    >>>
    >>>
    >>>
    >>>

    public CreationTool (DrawingEditor newDrawingEditor, Figure prototype) {
    }

    >>>
    >>>
    >>>
    >>>

}

<<<
public class CreationTool extends AbstractTool {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class CreationTool extends AbstractTool {
    >>>
    >>>
    >>>
    >>>

    protected Point getAnchorPoint (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class CreationTool extends AbstractTool {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class CreationTool extends AbstractTool {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    protected void setAddedFigure (Figure newAddedFigure);
    protected void setAnchorPoint (Point newAnchorPoint);
    protected void setCreatedFigure (Figure newCreatedFigure); >>>
    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.contrib;

<<<
package org.jhotdraw.contrib;

>>>
<<<
public class CTXWindowMenu extends CTXCommandMenu {
    <<<

    private void buildChildMenus (); <<<
    <<<

}

>>>
public class CTXWindowMenu extends CTXCommandMenu {
    >>>
    >>>
    >>>

    void buildChildMenus ();
}

<<<
public class CTXWindowMenu extends CTXCommandMenu {
    class ChildMenuItem extends JCheckBoxMenuItem {

        public ChildMenuItem (JInternalFrame frame) {
        }

        <<<

    }

    <<<
    <<<
    <<<

}

>>>
public class CTXWindowMenu extends CTXCommandMenu {
    class ChildMenuItem extends JCheckBoxMenuItem {

        public ChildMenuItem (JInternalFrame newFrame) {
        }

        >>>

    }

    >>>
    >>>
    >>>

}

package CH.ifa.draw.contrib;

<<<
package org.jhotdraw.contrib;

>>>
<<<
public class CustomSelectionTool extends SelectionTool {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class CustomSelectionTool extends SelectionTool {
    protected FigureAttributeConstant popupMenuAttribute;
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class CustomSelectionTool extends SelectionTool {
    protected FigureAttributeConstant popupMenuAttribute;
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class CustomSelectionTool extends SelectionTool {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.contrib;

<<<
package org.jhotdraw.contrib;

>>>
<<<
public class CustomSelectionTool extends SelectionTool {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public CustomSelectionTool (DrawingView view) {
    }

    <<<
    <<<
    <<<

}

>>>
public class CustomSelectionTool extends SelectionTool {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public CustomSelectionTool (DrawingEditor editor) {
    }

    >>>
    >>>
    >>>

}

package CH.ifa.draw.contrib;

<<<
package org.jhotdraw.contrib;

>>>
<<<
public class CutCommand extends FigureTransferCommand {
    <<<
    <<<
    <<<
    public static class UndoActivity extends UndoableAdapter {
        <<<
        <<<
        <<<

    }

    <<<

}

>>>
public class CutCommand extends FigureTransferCommand {
    >>>
    >>>
    >>>
    public static class UndoActivity extends UndoableAdapter {

        protected void rememberSelectedFigures (FigureEnumeration toBeRemembered);
        public FigureEnumeration getSelectedFigures (); >>>
        >>>
        >>>

        public int getSelectedFiguresCount ();
        public void release ();
        public void setSelectedFigures (FigureEnumeration newSelectedFigures);
    }

    >>>

}

package CH.ifa.draw.standard;

<<<
package org.jhotdraw.standard;

>>>
<<<
public class CutCommand extends FigureTransferCommand {
    <<<
    <<<
    <<<

}

>>>
public class CutCommand extends FigureTransferCommand {

    protected Undoable createUndoActivity (); >>>
    >>>
    public static class UndoActivity extends UndoableAdapter {

        public UndoActivity (FigureTransferCommand newCommand) {
        }

        public boolean redo ();
        public boolean undo ();
    }

    >>>

}

<<<
public class CutCommand extends FigureTransferCommand {
    <<<

    public CutCommand (String name, DrawingView view) {
    }

    public boolean isExecutable (); <<<
    <<<

}

>>>
public class CutCommand extends FigureTransferCommand {
    >>>

    public CutCommand (String name, DrawingEditor newDrawingEditor) {
    }

    public boolean isExecutableWithView (); >>>
    >>>

}

package CH.ifa.draw.standard;

<<<
package org.jhotdraw.standard;

>>>
<<<
abstract public class DecoratorFigure extends AbstractFigure implements FigureChangeListener {
    protected Figure fComponent;
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
abstract public class DecoratorFigure extends AbstractFigure implements FigureChangeListener {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public Figure getDecoratedFigure (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
abstract public class DecoratorFigure extends AbstractFigure implements FigureChangeListener {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
abstract public class DecoratorFigure extends AbstractFigure implements FigureChangeListener {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public Object getAttribute (FigureAttributeConstant attributeConstant); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void setAttribute (FigureAttributeConstant attributeConstant, Object value); >>>
    >>>

}

<<<
abstract public class DecoratorFigure extends AbstractFigure implements FigureChangeListener {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public Vector handles (); <<<
    <<<
    <<<
    <<<

    public void connectorVisibility (boolean isVisible); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
abstract public class DecoratorFigure extends AbstractFigure implements FigureChangeListener {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public HandleEnumeration handles (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void connectorVisibility (boolean isVisible, ConnectionFigure courtingConnection); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
abstract public class DecoratorFigure extends AbstractFigure implements FigureChangeListener {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
abstract public class DecoratorFigure extends AbstractFigure implements FigureChangeListener {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public TextHolder getTextHolder (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void visit (FigureVisitor visitor); >>>

}

<<<
abstract public class DecoratorFigure extends AbstractFigure implements FigureChangeListener {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public void visit (FigureVisitor visitor); <<<

}

>>>
abstract public class DecoratorFigure extends AbstractFigure implements FigureChangeListener {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public synchronized FigureEnumeration getDependendFigures ();
    public synchronized void addDependendFigure (Figure newDependendFigure);
    public synchronized void removeDependendFigure (Figure oldDependendFigure); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void setDecoratedFigure (Figure newDecoratedFigure); >>>

}

package CH.ifa.draw.standard;

<<<
package org.jhotdraw.standard;

>>>
<<<
public class DeleteCommand extends FigureTransferCommand {
    <<<
    <<<
    <<<

}

>>>
public class DeleteCommand extends FigureTransferCommand {

    protected Undoable createUndoActivity (); >>>
    >>>
    public static class UndoActivity extends UndoableAdapter {

        public UndoActivity (FigureTransferCommand newCommand) {
        }

        public boolean redo ();
        public boolean undo ();
    }

    >>>

}

<<<
public class DeleteCommand extends FigureTransferCommand {
    <<<

    public DeleteCommand (String name, DrawingView view) {
    }

    public boolean isExecutable (); <<<
    <<<

}

>>>
public class DeleteCommand extends FigureTransferCommand {
    >>>

    protected boolean isExecutableWithView ();
    public DeleteCommand (String name, DrawingEditor newDrawingEditor) {
    }

    >>>
    >>>

}

package CH.ifa.draw.contrib;

<<<
package org.jhotdraw.contrib;

>>>
<<<
public class DesktopEvent extends EventObject {

    public DesktopEvent (Desktop source, DrawingView newDrawingView) {
    }

    public DesktopEvent (Desktop source, DrawingView newDrawingView, DrawingView newPreviousDV) {
    }

    <<<
    <<<

}

>>>
public class DesktopEvent extends EventObject {

    public DesktopEvent (Desktop newSource, DrawingView newDrawingView) {
    }

    public DesktopEvent (Desktop newSource, DrawingView newDrawingView, DrawingView newPreviousDV) {
    }

    >>>
    >>>

}

package CH.ifa.draw.contrib;

<<<
package org.jhotdraw.contrib;

>>>
<<<
public class DesktopEventService {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    protected void fireDrawingViewSelectedEvent (final DrawingView oldView, final DrawingView newView); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class DesktopEventService {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    protected void fireDrawingViewSelectedEvent (final DrawingView dv); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class DesktopEventService {
    <<<
    <<<
    <<<

    protected DesktopEvent createDesktopEvent (DrawingView dv); <<<
    <<<

    protected void fireDrawingViewSelectedEvent (final DrawingView dv); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class DesktopEventService {
    >>>
    >>>
    >>>

    protected DesktopEvent createDesktopEvent (DrawingView oldView, DrawingView newView); >>>
    >>>

    protected void fireDrawingViewSelectedEvent (final DrawingView oldView, final DrawingView newView);
    protected void setActiveDrawingView (DrawingView newActiveDrawingView); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.contrib;

<<<
package org.jhotdraw.contrib;

>>>
<<<
public interface DesktopListener extends EventListener {
    <<<
    <<<

    public void drawingViewSelected (DrawingView oldView, DesktopEvent dpe);
}

>>>
public interface DesktopListener extends EventListener {
    >>>
    >>>

    public void drawingViewSelected (DesktopEvent dpe);
}

<<<
public interface DesktopListener extends EventListener {
    <<<
    <<<
    <<<

}

>>>
public interface DesktopListener {
    >>>
    >>>
    >>>

}

package CH.ifa.draw.contrib;

<<<
package org.jhotdraw.contrib;

>>>
<<<
public class DiamondFigure extends RectangleFigure {

    protected Polygon polygon (); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class DiamondFigure extends RectangleFigure {

    protected Polygon getPolygon (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.contrib;

<<<
package org.jhotdraw.contrib;

>>>
package CH.ifa.draw.contrib.html;

<<<
package org.jhotdraw.contrib.html;

>>>
package CH.ifa.draw.contrib.html;

<<<
package org.jhotdraw.contrib.html;

>>>
package CH.ifa.draw.contrib.html;

<<<
package org.jhotdraw.contrib.html;

>>>
package CH.ifa.draw.contrib.html;

<<<
package org.jhotdraw.contrib.html;

>>>
<<<
public class DNDFigures implements java.io.Serializable {

    public DNDFigures (FigureEnumeration fe, Point origin) {
    }

    <<<
    <<<

}

>>>
public class DNDFigures implements java.io.Serializable {

    public DNDFigures (FigureEnumeration fe, Point newOrigin) {
    }

    >>>
    >>>

}

package CH.ifa.draw.contrib.dnd;

<<<
package org.jhotdraw.contrib.dnd;

>>>
package CH.ifa.draw.contrib.dnd;

<<<
package org.jhotdraw.contrib.dnd;

>>>
<<<
abstract public class DNDHelper implements DragGestureListener, DragSourceListener, DropTargetListener {

    abstract protected DrawingView view (); protected Boolean autoscrollState;
    protected DragGestureRecognizer dgr;
    protected DropTarget dt;

    protected boolean createDragGestureRecognizer ();
    protected boolean createDropTarget ();
    protected boolean supportDropTargetDragEvent (DropTargetDragEvent dtde);
    protected static Object ProcessReceivedData (DataFlavor flavor, Transferable transferable); <<<

    protected void destroyDropTarget ();
    public boolean setDragSourceActive (boolean state);
    public boolean setDropTargetActive (boolean state); <<<

    public void dragDropEnd (DragSourceDropEvent dsde);
    public void dragEnter (DragSourceDragEvent dsde);
    public void dragEnter (DropTargetDragEvent dtde);
    public void dragExit (DragSourceEvent dse);
    public void dragExit (DropTargetEvent dte);
    public void dragGestureRecognized (DragGestureEvent dge);
    public void dragOver (DragSourceDragEvent dsde);
    public void dragOver (DropTargetDragEvent dtde);
    public void drop (DropTargetDropEvent dtde);
    public void dropActionChanged (DragSourceDragEvent dsde);
    public void dropActionChanged (DropTargetDragEvent dtde);
}

>>>
abstract public class DNDHelper {

    protected DragGestureListener getDragGestureListener ();
    protected DragGestureRecognizer createDragGestureRecognizer (DragGestureListener dgl);
    protected DragGestureRecognizer getDragGestureRecognizer ();
    protected DragSourceListener createDragSourceListener ();
    protected DropTarget createDropTarget ();
    protected DropTargetListener createDropTargetListener ();
    protected DropTargetListener getDropTargetListener ();
    abstract protected CH.ifa.draw.framework.DrawingEditor editor ();
    abstract protected CH.ifa.draw.framework.DrawingView view ();
    protected int getDragSourceActions ();
    protected int getDropTargetActions ();
    protected static Object ProcessReceivedData (DataFlavor flavor, java.awt.datatransfer.Transferable transferable); >>>

    protected void setDragGestureListener (DragGestureListener dragGestureListener);
    protected void setDragGestureRecognizer (DragGestureRecognizer dragGestureRecognizer);
    protected void setDragSourceListener (DragSourceListener dragSourceListener);
    protected void setDropTarget (DropTarget dropTarget);
    protected void setDropTargetListener (DropTargetListener dropTargetListener);
    public DNDHelper (boolean isDragSource, boolean isDropTarget) {
    }

    public DragSourceListener getDragSourceListener (); >>>

    public void deinitialize ();
    public void initialize (DragGestureListener dgl);
}

<<<
abstract public class DNDHelper {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    abstract protected CH.ifa.draw.framework.DrawingEditor editor ();
    abstract protected CH.ifa.draw.framework.DrawingView view (); <<<
    <<<

    protected static Object ProcessReceivedData (DataFlavor flavor, java.awt.datatransfer.Transferable transferable); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
abstract public class DNDHelper {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    abstract protected DrawingEditor editor ();
    abstract protected DrawingView view (); >>>
    >>>

    protected static Object processReceivedData (DataFlavor flavor, Transferable transferable); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
abstract public class DNDHelper {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    protected void setDropTarget (DropTarget dropTarget); <<<

    public DNDHelper (boolean isDragSource, boolean isDropTarget) {
    }

    <<<
    <<<
    <<<
    <<<

}

>>>
abstract public class DNDHelper {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    protected void setDropTarget (DropTarget newDropTarget); >>>

    public DNDHelper (boolean newIsDragSource, boolean newIsDropTarget) {
    }

    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.contrib.dnd;

<<<
package org.jhotdraw.contrib.dnd;

>>>
<<<
public interface DNDInterface {

    public boolean setDragSourceActive (boolean state);
    public boolean setDropTargetActive (boolean state);
}

>>>
public interface DNDInterface {

    public DragSourceListener getDragSourceListener ();
    public void DNDDeinitialize ();
    public void DNDInitialize (DragGestureListener dgl);
}

package CH.ifa.draw.contrib.dnd;

<<<
package org.jhotdraw.contrib.dnd;

>>>
<<<
public class DoubleBufferImage extends java.awt.Image {

    public DoubleBufferImage (Image real, double scale) {
    }

    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class DoubleBufferImage extends java.awt.Image {

    public DoubleBufferImage (Image newReal, double newScale) {
    }

    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.contrib.zoom;

<<<
package org.jhotdraw.contrib.zoom;

>>>
<<<
public class DragNDropTool extends AbstractTool {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public void mouseDown (MouseEvent e, int x, int y);
    public void mouseDrag (MouseEvent e, int x, int y);
    public void mouseMove (MouseEvent evt, int x, int y);
    public void mouseUp (MouseEvent e, int x, int y); <<<
    <<<

}

>>>
public class DragNDropTool extends CH.ifa.draw.standard.AbstractTool {

    private DragGestureListener createDragGestureListener (); >>>
    >>>
    >>>

    protected boolean isDragOn ();
    protected void setDragOn (boolean dragOn); >>>
    >>>
    >>>
    >>>

    public void mouseDown (java.awt.event.MouseEvent e, int x, int y);
    public void mouseDrag (java.awt.event.MouseEvent e, int x, int y);
    public void mouseMove (java.awt.event.MouseEvent e, int x, int y);
    public void mouseUp (java.awt.event.MouseEvent e, int x, int y); >>>
    >>>

}

<<<
public class DragNDropTool extends CH.ifa.draw.standard.AbstractTool {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public void viewCreated (DrawingView view);
    public void viewDestroying (DrawingView view);
}

>>>
public class DragNDropTool extends CH.ifa.draw.standard.AbstractTool {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    protected void viewCreated (DrawingView view);
    protected void viewDestroying (DrawingView view); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class DragNDropTool extends CH.ifa.draw.standard.AbstractTool {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public void mouseDown (java.awt.event.MouseEvent e, int x, int y);
    public void mouseDrag (java.awt.event.MouseEvent e, int x, int y);
    public void mouseMove (java.awt.event.MouseEvent e, int x, int y);
    public void mouseUp (java.awt.event.MouseEvent e, int x, int y);
}

>>>
public class DragNDropTool extends AbstractTool {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void mouseDown (MouseEvent e, int x, int y);
    public void mouseDrag (MouseEvent e, int x, int y);
    public void mouseMove (MouseEvent evt, int x, int y);
    public void mouseUp (MouseEvent e, int x, int y);
}

<<<
public class DragNDropTool extends AbstractTool {
    <<<
    <<<
    <<<
    <<<
    <<<

    protected void setDragOn (boolean dragOn); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class DragNDropTool extends AbstractTool {
    >>>
    >>>
    >>>
    >>>
    >>>

    protected void setDragOn (boolean isNewDragOn); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.contrib.dnd;

<<<
package org.jhotdraw.contrib.dnd;

>>>
<<<
public class DragTracker extends AbstractTool {
    <<<
    <<<
    <<<

}

>>>
public class DragTracker extends AbstractTool {

    protected Undoable createUndoActivity (); >>>
    public static class UndoActivity extends UndoableAdapter {

        public Point getBackupPoint ();
        public Point getOriginalPoint ();
        public UndoActivity (DrawingView newDrawingView, Point newOriginalPoint) {
        }

        public boolean redo ();
        public boolean undo ();
        public void moveAffectedFigures (Point startPoint, Point endPoint);
        public void setBackupPoint (Point newBackupPoint);
        public void setOriginalPoint (Point newOriginalPoint);
    }

    public void activate ();
    public void deactivate (); >>>
    >>>

}

<<<
public class DragTracker extends AbstractTool {
    <<<

    public DragTracker (DrawingView view, Figure anchor) {
    }

    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class DragTracker extends AbstractTool {
    >>>

    public DragTracker (DrawingEditor newDrawingEditor, Figure anchor) {
    }

    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class DragTracker extends AbstractTool {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class DragTracker extends AbstractTool {
    >>>

    protected int getLastMouseX ();
    protected int getLastMouseY ();
    protected void setAnchorFigure (Figure newAnchorFigure);
    protected void setHasMoved (boolean newMoved);
    protected void setLastMouseX (int newLastMouseX);
    protected void setLastMouseY (int newLastMouseY); >>>

    public Figure getAnchorFigure ();
    public boolean hasMoved (); >>>
    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.standard;

<<<
package org.jhotdraw.standard;

>>>
<<<
public class DrawApplet extends JApplet implements DrawingEditor, PaletteListener, VersionRequester {
    <<<
    <<<

    protected JComboBox createColorChoice (String attribute); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

<<<
>>>
public class DrawApplet extends JApplet implements DrawingEditor, PaletteListener, VersionRequester {
    >>>
    >>>

    protected JComboBox createColorChoice (FigureAttributeConstant attribute); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

>>>
<<<
public class DrawApplet extends JApplet implements DrawingEditor, PaletteListener, VersionRequester {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

<<<
>>>
public class DrawApplet extends JApplet implements DrawingEditor, PaletteListener, VersionRequester {
    >>>
    >>>

    protected Iconkit createIconkit (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

>>>
<<<
<<<
class SleeperThread extends Thread {

    public void run ();
}

package CH.ifa.draw.applet;

<<<
package org.jhotdraw.applet;

>>>
<<<
public class DrawApplet extends JApplet implements DrawingEditor, PaletteListener {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    protected StandardDrawingView createDrawingView (); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public void selectionChanged (DrawingView view); <<<

}

<<<
>>>
public class DrawApplet extends JApplet implements DrawingEditor, PaletteListener {
    >>>

    protected DrawingView createDrawingView (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void figureSelectionChanged (DrawingView view); >>>
    >>>
    >>>
    >>>

}

>>>
<<<
public class DrawApplet extends JApplet implements DrawingEditor, PaletteListener {
    <<<

    protected DrawingView createDrawingView (); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public void figureSelectionChanged (DrawingView view); <<<
    <<<
    <<<
    <<<

}

<<<
>>>
public class DrawApplet extends JApplet implements DrawingEditor, PaletteListener {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    protected StandardDrawingView createDrawingView (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void selectionChanged (DrawingView view); >>>

}

>>>
<<<
public class DrawApplet extends JApplet implements DrawingEditor, PaletteListener {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    protected StandardDrawingView createDrawingView (); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public void selectionChanged (DrawingView view); <<<

}

<<<
>>>
public class DrawApplet extends JApplet implements DrawingEditor, PaletteListener {
    >>>

    protected DrawingView createDrawingView (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void figureSelectionChanged (DrawingView view); >>>
    >>>
    >>>
    >>>

}

>>>
<<<
public class DrawApplet extends JApplet implements DrawingEditor, PaletteListener {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

<<<
>>>
public class DrawApplet extends JApplet implements DrawingEditor, PaletteListener, VersionRequester {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    protected VersionControlStrategy getVersionControlStrategy (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    protected void setUndoManager (UndoManager newUndoManager); >>>
    >>>

    public DrawingView [] views (); >>>

    public String [] getRequiredVersions (); >>>

    public UndoManager getUndoManager (); >>>

    public void addViewChangeListener (ViewChangeListener vsl); >>>
    >>>
    >>>
    >>>

    public void removeViewChangeListener (ViewChangeListener vsl); >>>

    public void viewSelectionChanged (DrawingView oldView, DrawingView newView);
}

>>>
<<<
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener, VersionRequester {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener, VersionRequester {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    protected Tool createDefaultToo (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    protected void setDefaultTool (Tool newDefaultTool); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public Tool getDefaultTool (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener, VersionRequester {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    protected JComponent createContents (DrawingView view); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    protected String getDefaultDrawingTitle (); <<<

    protected Tool createDefaultToo (); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener, VersionRequester {

    protected Desktop createDesktop ();
    protected DesktopListener createDesktopListener ();
    protected DesktopListener getDesktopListener (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    protected Iconkit createIconkit ();
    protected Iconkit getIconkit (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    protected Tool createDefaultTool (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    protected void checkCommandMenu (CommandMenu cm); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    protected void setDesktop (Desktop newDesktop);
    protected void setDesktopListener (DesktopListener desktopPaneListener); >>>
    >>>
    >>>

    public Desktop getDesktop (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public String getDefaultDrawingTitle (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener, VersionRequester {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    final protected void setStorageFormatManager (StorageFormatManager storageFormatManager); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener, VersionRequester {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    protected JTextField getStatusLine (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    final protected void setStorageFormatManager (StorageFormatManager newStorageFormatManager); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener, VersionRequester {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    protected JMenu createColorMenu (String title, String attribute); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener, VersionRequester {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    protected JMenu createColorMenu (String title, FigureAttributeConstant attribute); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener, VersionRequester {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener, VersionRequester {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    protected void setIconkit (Iconkit newIconkit); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener, VersionRequester {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    protected DrawingView createDrawingView (); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    protected synchronized void open (DrawingView newDrawingView); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    protected void setView (DrawingView newView); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public void newWindow (Drawing initialDrawing);
    public void open (); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener, VersionRequester {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    final protected DrawingView createDrawingView (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    final public void newWindow (); >>>
    >>>
    >>>
    >>>
    >>>

    public synchronized void open (); >>>
    >>>
    >>>
    >>>

    public void newWindow (Drawing newDrawing); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener, VersionRequester {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    protected String getDrawingTitle (); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    protected static String fgUntitled = "untitled";
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    protected void setDrawingTitle (String drawingTitle); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public String getApplicationName ();
    public String getDefaultDrawingTitle (); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener, VersionRequester {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    protected String getDefaultDrawingTitle (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    protected void updateApplicationTitle (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public static String getApplicationName (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener, VersionRequester {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    protected String getDefaultDrawingTitle (); <<<
    <<<
    <<<
    <<<

    final protected DrawingView createDrawingView (); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    protected void updateApplicationTitle (); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    final public void newWindow ();
    public static String getApplicationName (); <<<
    <<<
    <<<
    <<<
    <<<

    public synchronized void open (); <<<
    <<<
    <<<
    <<<

    public void newWindow (Drawing newDrawing); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener, VersionRequester {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    protected DrawingView createDrawingView (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    protected String getDrawingTitle (); >>>
    >>>
    >>>
    >>>
    >>>
    protected static String fgUntitled = "untitled";
    >>>

    protected synchronized void open (DrawingView newDrawingView); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    protected void setDrawingTitle (String drawingTitle); >>>
    >>>

    protected void setView (DrawingView newView); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public String getApplicationName ();
    public String getDefaultDrawingTitle (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void newWindow (Drawing initialDrawing);
    public void open (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener, VersionRequester {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    protected synchronized void open (DrawingView newDrawingView); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener, VersionRequester {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    protected void open (final DrawingView newDrawingView); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener, VersionRequester {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener, VersionRequester {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    protected void checkCommandMenus (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    final public void newWindow (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener, VersionRequester {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener, VersionRequester {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    final protected void endApp (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener, VersionRequester {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    final protected void endApp (); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener, VersionRequester {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    protected boolean closeQuery (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    protected void endApp (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.application;

<<<
package org.jhotdraw.application;

>>>
<<<
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener, VersionRequester {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener, VersionRequester {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    protected void setStatusLine (JTextField newStatusLine); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener {
    <<<
    <<<
    <<<
    <<<

    protected JComponent createContents (StandardDrawingView view); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    protected StandardDrawingView createDrawingView (); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public void selectionChanged (DrawingView view); <<<
    <<<
    <<<
    <<<

}

>>>
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener {
    >>>
    >>>
    >>>
    >>>

    protected DrawingView createDrawingView ();
    protected JComponent createContents (DrawingView view); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void figureSelectionChanged (DrawingView view); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener {
    <<<
    <<<
    <<<
    <<<

    protected DrawingView createDrawingView ();
    protected JComponent createContents (DrawingView view); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public void figureSelectionChanged (DrawingView view); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener {
    >>>
    >>>
    >>>
    >>>

    protected JComponent createContents (StandardDrawingView view); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    protected StandardDrawingView createDrawingView (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void selectionChanged (DrawingView view); >>>
    >>>
    >>>
    >>>

}

<<<
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener {
    <<<
    <<<
    <<<
    <<<

    protected JComponent createContents (StandardDrawingView view); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    protected StandardDrawingView createDrawingView (); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public void selectionChanged (DrawingView view); <<<
    <<<
    <<<
    <<<

}

>>>
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener {
    >>>
    >>>
    >>>
    >>>

    protected DrawingView createDrawingView ();
    protected JComponent createContents (DrawingView view); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    protected void addMenuIfPossible (JMenuBar mb, JMenu newMenu); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void figureSelectionChanged (DrawingView view); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    protected JMenu createFileMenu () {
        JMenu menu = new JMenu ("File");
        JMenuItem mi = new JMenuItem ("New", new MenuShortcut ('n').getKey ());
        mi.addActionListener (new ActionListener () {

            public void actionPerformed (ActionEvent event);
        }

        );
        menu.add (mi);
        mi = new JMenuItem ("Open...", new MenuShortcut ('o').getKey ());
        mi.addActionListener (new ActionListener () {

            public void actionPerformed (ActionEvent event);
        }

        );
        menu.add (mi);
        mi = new JMenuItem ("Save As...", new MenuShortcut ('s').getKey ());
        mi.addActionListener (new ActionListener () {

            public void actionPerformed (ActionEvent event);
        }

        );
        menu.add (mi);
        menu.addSeparator ();
        mi = new JMenuItem ("Print...", new MenuShortcut ('p').getKey ());
        mi.addActionListener (new ActionListener () {

            public void actionPerformed (ActionEvent event);
        }

        );
        menu.add (mi);
        menu.addSeparator ();
        mi = new JMenuItem ("Exit");
        mi.addActionListener (new ActionListener () {

            public void actionPerformed (ActionEvent event);
        }

        );
        menu.add (mi);
        return menu;
    } <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    protected void initDrawing (); <<<
    <<<
    <<<
    <<<
    <<<

    public Drawing drawing (); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public void newWindow (); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public void setDrawing (Drawing drawing); <<<
    <<<

}

>>>
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener, VersionRequester {
    >>>
    >>>
    >>>
    >>>
    >>>

    protected DrawingView createDrawingView (Drawing newDrawing); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    protected JMenu createFileMenu () {
        CommandMenu menu = new CommandMenu ("File");
        Command cmd = new AbstractCommand ("New", this, false) {

            public void execute ();
        }

        ;
        menu.add (cmd, new MenuShortcut ('n'));
        cmd = new AbstractCommand ("Open...", this, false) {

            public void execute ();
        }

        ;
        menu.add (cmd, new MenuShortcut ('o'));
        cmd = new AbstractCommand ("Save As...", this, true) {

            public void execute ();
        }

        ;
        menu.add (cmd, new MenuShortcut ('s'));
        menu.addSeparator ();
        cmd = new AbstractCommand ("Print...", this, true) {

            public void execute ();
        }

        ;
        menu.add (cmd, new MenuShortcut ('p'));
        menu.addSeparator ();
        cmd = new AbstractCommand ("Exit", this, true) {

            public void execute ();
        }

        ;
        menu.add (cmd);
        return menu;
    } >>>
    >>>
    >>>
    >>>
    >>>

    protected String getDefaultDrawingTitle (); >>>
    >>>
    >>>

    protected VersionControlStrategy getVersionControlStrategy ();
    final protected void setStorageFormatManager (StorageFormatManager storageFormatManager); protected static String fgUntitled = "untitled";
    protected static int winCount = 0;
    >>>
    >>>
    >>>
    >>>
    >>>

    protected void fireViewCreatedEvent (DrawingView view);
    protected void fireViewDestroyingEvent (DrawingView view);
    protected void fireViewSelectionChangedEvent (DrawingView oldView, DrawingView newView); >>>

    protected void open (DrawingView newDrawingView); >>>
    >>>

    protected void setUndoManager (UndoManager newUndoManager);
    protected void setView (DrawingView newView); >>>
    >>>

    public DrawingView [] views (); >>>
    >>>
    >>>
    >>>

    public String [] getRequiredVersions (); >>>
    >>>

    public UndoManager getUndoManager (); >>>
    >>>
    >>>
    >>>
    >>>

    public void addViewChangeListener (ViewChangeListener vsl); >>>
    >>>
    >>>

    public void newWindow (Drawing initialDrawing); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void removeViewChangeListener (ViewChangeListener vsl); >>>
    >>>
    >>>

}

<<<
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener, VersionRequester {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener, VersionRequester {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    protected DrawingView createInitialDrawingView (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void setTool (Tool t, String name); >>>
    >>>

}

<<<
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener, VersionRequester {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    protected void open (DrawingView newDrawingView); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public void paletteUserOver (PaletteButton button, boolean inside);
    public void paletteUserSelected (PaletteButton button); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener, VersionRequester {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    protected synchronized void open (DrawingView newDrawingView); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void paletteUserOver (PaletteButton paletteButton, boolean inside);
    public void paletteUserSelected (PaletteButton paletteButton); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.framework;

<<<
package org.jhotdraw.framework;

>>>
<<<
public interface Drawing extends FigureChangeListener, Serializable, Storable {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public void orphanAll (Vector newFigures); <<<
    <<<
    <<<

    public void replace (Figure figure, Figure replacement); <<<
    <<<

}

>>>
public interface Drawing extends FigureChangeListener, Serializable, Storable {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public Figure getFigureFromLayer (int layerNr); >>>
    >>>

    public Figure replace (Figure figure, Figure replacement); >>>
    >>>
    >>>

    public boolean includes (Figure figure);
    public int getLayer (Figure figure);
    public void addAll (FigureEnumeration fe); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void orphanAll (FigureEnumeration fe);
    public void orphanAll (Vector orphanFigures); >>>

    public void removeAll (FigureEnumeration fe); >>>
    >>>
    >>>

    public void sendToLayer (Figure figure, int layerNr); >>>

}

<<<
public interface Drawing extends FigureChangeListener, Serializable, Storable {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public interface Drawing extends FigureChangeListener, Serializable, Storable {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public String getTitle (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void setTitle (String name); >>>

}

<<<
public interface Drawing extends FigureChangeListener, Serializable, Storable {

    public Enumeration drawingChangeListeners (); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public void addAll (Vector newFigures); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public void orphanAll (Vector orphanFigures); <<<
    <<<

    public void removeAll (Vector figures); <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public interface Drawing extends FigureChangeListener, Serializable, Storable {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public Iterator drawingChangeListeners (); >>>
    >>>
    >>>
    >>>

    public void addAll (List newFigures); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void orphanAll (List orphanFigures); >>>
    >>>

    public void removeAll (List figures); >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public interface Drawing extends FigureChangeListener, Serializable, Storable {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public void figureInvalidated (FigureChangeEvent e);
    public void figureRequestRemove (FigureChangeEvent e);
    public void figureRequestUpdate (FigureChangeEvent e); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public interface Drawing extends FigureChangeListener, Serializable, Storable {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public interface Drawing extends FigureChangeListener, Serializable, Storable {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public interface Drawing extends FigureChangeListener, Serializable, Storable {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public boolean containsFigure (Figure figure); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class DrawingChangeEvent extends EventObject {
    <<<

    public DrawingChangeEvent (Drawing source, Rectangle r) {
    }

    <<<

}

>>>
public class DrawingChangeEvent extends EventObject {
    >>>

    public DrawingChangeEvent (Drawing newSource, Rectangle newRect) {
    }

    >>>

}

package CH.ifa.draw.framework;

<<<
package org.jhotdraw.framework;

>>>
package CH.ifa.draw.framework;

<<<
package org.jhotdraw.framework;

>>>
<<<
public interface DrawingChangeListener extends EventListener {
    <<<
    <<<

}

>>>
public interface DrawingChangeListener extends EventListener {
    >>>
    >>>

    public void drawingTitleChanged (DrawingChangeEvent e);
}

<<<
public interface DrawingChangeListener extends EventListener {
    <<<
    <<<

    public void drawingTitleChanged (DrawingChangeEvent e);
}

>>>
public interface DrawingChangeListener extends EventListener {
    >>>
    >>>

}

<<<
public interface DrawingChangeListener extends EventListener {
    <<<
    <<<

}

>>>
public interface DrawingChangeListener extends EventListener {
    >>>
    >>>

    public void drawingTitleChanged (DrawingChangeEvent e);
}

<<<
public interface DrawingChangeListener extends EventListener {
    <<<
    <<<
    <<<

}

>>>
public interface DrawingChangeListener {
    >>>
    >>>
    >>>

}

package CH.ifa.draw.framework;

<<<
package org.jhotdraw.framework;

>>>
<<<
interface DrawingEditor {

}

>>>
public interface DrawingEditor extends FigureSelectionListener {

    public Drawing drawing ();
    public DrawingView view ();
    public Tool tool ();
    public void figureSelectionChanged (DrawingView view);
    public void showStatus (String string);
    public void toolDone ();
}

<<<
public interface DrawingEditor extends FigureSelectionListener {

    public Drawing drawing ();
    public DrawingView view ();
    public Tool tool ();
    public void figureSelectionChanged (DrawingView view);
    public void showStatus (String string);
    public void toolDone ();
}

>>>
interface DrawingEditor {

}

<<<
interface DrawingEditor {

}

>>>
public interface DrawingEditor extends FigureSelectionListener {

    public Drawing drawing ();
    public DrawingView view ();
    public Tool tool ();
    public void figureSelectionChanged (DrawingView view);
    public void showStatus (String string);
    public void toolDone ();
}

<<<
public interface DrawingEditor extends FigureSelectionListener {

    public Drawing drawing (); <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public interface DrawingEditor extends FigureSelectionListener {

    public DrawingView [] views (); >>>
    >>>

    public UndoManager getUndoManager ();
    public void addViewChangeListener (ViewChangeListener vsl); >>>

    public void removeViewChangeListener (ViewChangeListener vsl); >>>
    >>>

}

package CH.ifa.draw.framework;

<<<
package org.jhotdraw.framework;

>>>
<<<
public interface DrawingView extends DrawingChangeListener, ImageObserver {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public interface DrawingView extends DrawingChangeListener, ImageObserver {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public Painter getDisplayUpdate (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void addFigureSelectionListener (FigureSelectionListener fsl); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void removeFigureSelectionListener (FigureSelectionListener fsl); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public interface DrawingView extends DrawingChangeListener, ImageObserver {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public Painter getDisplayUpdate (); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public void addFigureSelectionListener (FigureSelectionListener fsl); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public void removeFigureSelectionListener (FigureSelectionListener fsl); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public interface DrawingView extends DrawingChangeListener, ImageObserver {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public interface DrawingView extends DrawingChangeListener, ImageObserver {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public interface DrawingView extends DrawingChangeListener, ImageObserver {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public FigureEnumeration insertFigures (FigureEnumeration inFigures, int dx, int dy, boolean bCheck); >>>
    >>>
    >>>
    >>>
    >>>

    public Painter getDisplayUpdate (); >>>
    >>>
    >>>

    public UndoManager getUndoManager ();
    public Vector getConnectionFigures (Figure inFigure); >>>
    >>>

    public boolean isFigureSelected (Figure checkFigure); >>>
    >>>

    public void addFigureSelectionListener (FigureSelectionListener fsl); >>>

    public void addToSelectionAll (FigureEnumeration fe); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void removeFigureSelectionListener (FigureSelectionListener fsl); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public interface DrawingView extends DrawingChangeListener, ImageObserver {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public UndoManager getUndoManager (); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public interface DrawingView extends DrawingChangeListener, ImageObserver {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public boolean isInteractive (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public interface DrawingView extends DrawingChangeListener, ImageObserver {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public FigureEnumeration selectionElements (); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public Vector getConnectionFigures (Figure inFigure);
    public Vector selection ();
    public Vector selectionZOrdered (); <<<
    <<<
    <<<

    public void addAll (Vector figures); <<<
    <<<
    <<<

    public void addToSelectionAll (Vector figures); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public interface DrawingView extends DrawingChangeListener, ImageObserver {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public FigureEnumeration getConnectionFigures (Figure inFigure); >>>

    public FigureEnumeration selection ();
    public FigureEnumeration selectionZOrdered (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void addAll (Collection figures); >>>
    >>>

    public void addToSelectionAll (Collection figures); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class DuplicateCommand extends FigureTransferCommand {
    <<<
    <<<
    <<<

}

>>>
public class DuplicateCommand extends FigureTransferCommand {

    protected Undoable createUndoActivity (); >>>
    >>>
    >>>

}

<<<
public class DuplicateCommand extends FigureTransferCommand {
    <<<

    public DuplicateCommand (String name, DrawingView view) {
    }

    public boolean isExecutable (); <<<

}

>>>
public class DuplicateCommand extends FigureTransferCommand {
    >>>

    protected boolean isExecutableWithView ();
    public DuplicateCommand (String name, DrawingEditor newDrawingEditor) {
    }

    >>>

}

package CH.ifa.draw.standard;

<<<
package org.jhotdraw.standard;

>>>
<<<
public class ElbowConnection extends LineConnection {
    <<<
    <<<
    <<<

    public Vector handles (); <<<
    <<<

}

<<<
>>>
public class ElbowConnection extends LineConnection {
    >>>
    >>>

    public HandleEnumeration handles (); >>>
    >>>
    >>>

}

>>>
package CH.ifa.draw.figures;

<<<
<<<
package org.jhotdraw.figures;

>>>
>>>
package CH.ifa.draw.figures;

<<<
package org.jhotdraw.figures;

>>>
<<<
public class EllipseFigure extends AttributeFigure {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public Vector handles (); <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class EllipseFigure extends AttributeFigure {
    >>>
    >>>
    >>>
    >>>

    public HandleEnumeration handles (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.figures;

<<<
package org.jhotdraw.figures;

>>>
package CH.ifa.draw.contrib.html;

<<<
package org.jhotdraw.contrib.html;

>>>
<<<
public class ETSLADisposalStrategy implements ResourceDisposabilityStrategy {
    <<<
    <<<
    <<<
    <<<

    public ETSLADisposalStrategy (DisposableResourceManager manager, long periodicity) {
        setManager (manager);
        setPeriodicity (periodicity);
        initDisposalThread ();
    }

    <<<
    <<<

    public synchronized void setManager (DisposableResourceManager manager); <<<
    <<<
    <<<

}

<<<
>>>
public class ETSLADisposalStrategy implements ResourceDisposabilityStrategy {
    >>>
    >>>
    >>>
    >>>

    public ETSLADisposalStrategy (DisposableResourceManager newManager, long newPeriodicity) {
        setManager (newManager);
        setPeriodicity (newPeriodicity);
        initDisposalThread ();
    }

    >>>
    >>>

    public synchronized void setManager (DisposableResourceManager newManager); >>>
    >>>
    >>>

}

>>>
package CH.ifa.draw.contrib.html;

<<<
<<<
package org.jhotdraw.contrib.html;

>>>
>>>
package CH.ifa.draw.standard;

<<<
package org.jhotdraw.standard;

>>>
package CH.ifa.draw.framework;

<<<
package org.jhotdraw.framework;

>>>
<<<
public interface Figure extends Cloneable, Serializable, Storable {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public interface Figure extends Cloneable, Serializable, Storable {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    public static String POPUP_MENU = "POPUP_MENU";
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public interface Figure extends Cloneable, Serializable, Storable {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public interface Figure extends Cloneable, Serializable, Storable {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public Object getAttribute (FigureAttributeConstant attributeConstant); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void setAttribute (FigureAttributeConstant attributeConstant, Object value); >>>
    >>>
    >>>

}

<<<
public interface Figure extends Cloneable, Serializable, Storable {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public Vector handles (); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public void connectorVisibility (boolean isVisible); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public interface Figure extends Cloneable, Serializable, Storable {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public HandleEnumeration handles (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void connectorVisibility (boolean isVisible, ConnectionFigure connection); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public interface Figure extends Cloneable, Serializable, Storable {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public interface Figure extends Cloneable, Serializable, Storable {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public FigureEnumeration getDependendFigures (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public TextHolder getTextHolder (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void addDependendFigure (Figure newDependendFigure); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void removeDependendFigure (Figure oldDependendFigure); >>>
    >>>
    >>>
    >>>
    >>>

    public void visit (FigureVisitor visitor); >>>

}

<<<
public interface Figure extends Cloneable, Serializable, Storable {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public interface Figure extends Cloneable, Serializable, Storable {
    >>>
    >>>
    >>>

    public Figure getDecoratedFigure (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class FigureAttributeConstant implements Cloneable, Serializable {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class FigureAttributeConstant implements Cloneable, Serializable {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    final public static FigureAttributeConstant BOTTOM_MARGIN = new FigureAttributeConstant (BOTTOM_MARGIN_STR, 14);
    >>>
    >>>
    >>>
    >>>
    >>>
    final public static FigureAttributeConstant LEFT_MARGIN = new FigureAttributeConstant (LEFT_MARGIN_STR, 15);
    final public static FigureAttributeConstant LOCATION = new FigureAttributeConstant (LOCATION_STR, 9);
    final public static FigureAttributeConstant POPUP_MENU = new FigureAttributeConstant (POPUP_MENU_STR, 16);
    final public static FigureAttributeConstant RIGHT_MARGIN = new FigureAttributeConstant (RIGHT_MARGIN_STR, 13);
    >>>
    final public static FigureAttributeConstant TOP_MARGIN = new FigureAttributeConstant (TOP_MARGIN_STR, 12);
    >>>
    final public static FigureAttributeConstant XALIGNMENT = new FigureAttributeConstant (XALIGNMENT_STR, 10);
    final public static FigureAttributeConstant YALIGNMENT = new FigureAttributeConstant (YALIGNMENT_STR, 11);
    >>>
    final public static String BOTTOM_MARGIN_STR = "BottomMargin";
    >>>
    >>>
    >>>
    >>>
    >>>
    final public static String LEFT_MARGIN_STR = "LeftMargin";
    final public static String LOCATION_STR = "Location";
    final public static String POPUP_MENU_STR = "PopupMenu";
    final public static String RIGHT_MARGIN_STR = "RightMargin";
    >>>
    final public static String TOP_MARGIN_STR = "TopMargin";
    >>>
    final public static String XALIGNMENT_STR = "XAlignment";
    final public static String YALIGNMENT_STR = "YAlignment";

}

package CH.ifa.draw.framework;

<<<
package org.jhotdraw.framework;

>>>
<<<
public class FigureAttributes extends Object implements Cloneable, Serializable {
    <<<
    <<<

    public Object get (String name);
    public boolean hasDefined (String name); <<<
    <<<
    <<<

    public void set (String name, Object value); <<<

}

>>>
public class FigureAttributes extends Object implements Cloneable, Serializable {
    >>>
    >>>

    public Object get (FigureAttributeConstant attributeConstant);
    public boolean hasDefined (FigureAttributeConstant attributeConstant); >>>
    >>>
    >>>

    public void set (FigureAttributeConstant attributeConstant, Object value); >>>

}

package CH.ifa.draw.figures;

<<<
package org.jhotdraw.figures;

>>>
package CH.ifa.draw.standard;

<<<
package org.jhotdraw.standard;

>>>
<<<
public class FigureChangeEvent extends EventObject {
    <<<
    <<<
    <<<
    <<<

}

>>>
public class FigureChangeEvent extends EventObject {
    >>>
    >>>
    >>>

    public FigureChangeEvent (Figure source, Rectangle r, FigureChangeEvent nestedEvent) {
    }

    public FigureChangeEvent getNestedEvent (); >>>

}

<<<
public class FigureChangeEvent extends EventObject {
    <<<

    public FigureChangeEvent (Figure source) {
    }

    public FigureChangeEvent (Figure source, Rectangle r) {
    }

    public FigureChangeEvent (Figure source, Rectangle r, FigureChangeEvent nestedEvent) {
    }

    <<<
    <<<

}

>>>
public class FigureChangeEvent extends EventObject {
    >>>

    public FigureChangeEvent (Figure newSource) {
    }

    public FigureChangeEvent (Figure newSource, Rectangle newRect) {
    }

    public FigureChangeEvent (Figure newSource, Rectangle newRect, FigureChangeEvent nestedEvent) {
    }

    >>>
    >>>

}

package CH.ifa.draw.framework;

<<<
package org.jhotdraw.framework;

>>>
<<<
public class FigureChangeEventMulticaster extends AWTEventMulticaster implements FigureChangeListener {
    <<<
    <<<
    <<<

    public FigureChangeEventMulticaster (EventListener a, EventListener b) {
    }

    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class FigureChangeEventMulticaster extends AWTEventMulticaster implements FigureChangeListener {
    >>>
    >>>
    >>>

    public FigureChangeEventMulticaster (EventListener newListenerA, EventListener newListenerB) {
    }

    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.standard;

<<<
package org.jhotdraw.standard;

>>>
package CH.ifa.draw.framework;

<<<
package org.jhotdraw.framework;

>>>
package CH.ifa.draw.contrib.html;

<<<
package org.jhotdraw.contrib.html;

>>>
package CH.ifa.draw.contrib.html;

<<<
package org.jhotdraw.contrib.html;

>>>
<<<
public interface FigureEnumeration extends Enumeration {
    <<<

}

>>>
public interface FigureEnumeration {
    >>>

    public boolean hasNextFigure ();
}

<<<
public interface FigureEnumeration {
    <<<
    <<<

}

>>>
public interface FigureEnumeration {
    >>>
    >>>

    public void reset ();
}

package CH.ifa.draw.framework;

<<<
package org.jhotdraw.framework;

>>>
<<<
final public class FigureEnumerator implements FigureEnumeration {
    <<<
    <<<
    <<<
    <<<

}

>>>
final public class FigureEnumerator implements FigureEnumeration {
    >>>
    >>>
    >>>
    >>>

    public static FigureEnumeration getEmptyEnumeration ();
}

<<<
final public class FigureEnumerator implements FigureEnumeration {
    <<<

    public FigureEnumerator (Vector v) {
    }

    public Object nextElement ();
    public boolean hasMoreElements (); <<<

}

>>>
final public class FigureEnumerator implements FigureEnumeration {
    >>>

    public FigureEnumerator (Collection c) {
    }

    public boolean hasNextFigure (); >>>

}

<<<
final public class FigureEnumerator implements FigureEnumeration {
    <<<
    <<<
    <<<
    <<<

}

>>>
final public class FigureEnumerator implements FigureEnumeration {
    >>>
    >>>
    >>>
    >>>

    public void reset ();
}

package CH.ifa.draw.standard;

<<<
package org.jhotdraw.standard;

>>>
<<<
public class FigureSelection extends Object {

    public FigureSelection (Vector figures) {
    }

    <<<
    <<<
    final public static String TYPE = "CH.ifa.draw.Figures";

}

>>>
public interface FigureSelection {
    >>>
    >>>

}

<<<
public interface FigureSelection {
    <<<
    <<<

}

>>>
public class FigureSelection extends Object {

    public FigureSelection (Vector figures) {
    }

    >>>
    >>>
    final public static String TYPE = "CH.ifa.draw.Figures";

}

<<<
public class FigureSelection extends Object {

    public FigureSelection (Vector figures) {
    }

    <<<
    <<<
    final public static String TYPE = "CH.ifa.draw.Figures";

}

>>>
public interface FigureSelection {
    >>>
    >>>

}

package CH.ifa.draw.framework;

<<<
package org.jhotdraw.framework;

>>>
package CH.ifa.draw.framework;

<<<
package org.jhotdraw.framework;

>>>
<<<
abstract public class FigureTransferCommand extends AbstractCommand {
    <<<
    <<<
    <<<

}

>>>
abstract public class FigureTransferCommand extends AbstractCommand {
    >>>
    >>>
    >>>

    public FigureEnumeration insertFigures (FigureEnumeration fe, int dx, int dy);
}

package CH.ifa.draw.standard;

<<<
package org.jhotdraw.standard;

>>>
<<<
abstract class FigureTransferCommand extends Command {
    protected DrawingView fView;
    <<<
    <<<
    <<<
    <<<

}

>>>
abstract public class FigureTransferCommand extends AbstractCommand {
    >>>
    >>>
    >>>
    >>>

}

<<<
abstract public class FigureTransferCommand extends AbstractCommand {
    <<<
    <<<
    <<<
    <<<

}

>>>
abstract class FigureTransferCommand extends Command {
    protected DrawingView fView;
    >>>
    >>>
    >>>
    >>>

}

<<<
abstract class FigureTransferCommand extends Command {
    protected DrawingView fView;
    <<<

    protected void copySelection ();
    protected void deleteSelection ();
    protected void insertFigures (Vector figures, int dx, int dy);
}

>>>
abstract public class FigureTransferCommand extends AbstractCommand {
    >>>

    protected void copyFigures (FigureEnumeration fe, int figureCount);
    protected void deleteFigures (FigureEnumeration fe);
}

<<<
abstract public class FigureTransferCommand extends AbstractCommand {

    protected FigureTransferCommand (String name, DrawingView view) {
    }

    <<<
    <<<

}

>>>
abstract public class FigureTransferCommand extends AbstractCommand {

    protected FigureTransferCommand (String name, DrawingEditor newDrawingEditor) {
    }

    >>>
    >>>

}

package CH.ifa.draw.util;

<<<
package org.jhotdraw.util;

>>>
package CH.ifa.draw.contrib;

<<<
package org.jhotdraw.contrib;

>>>
<<<
public class FloatingTextField extends Object {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class FloatingTextField {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class FloatingTextField {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class FloatingTextField extends Object {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class FloatingTextField extends Object {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class FloatingTextField {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.util;

<<<
package org.jhotdraw.util;

>>>
package CH.ifa.draw.samples.javadraw;

<<<
package org.jhotdraw.samples.javadraw;

>>>
<<<
public class FontSizeHandle extends LocatorHandle {
    <<<
    <<<
    <<<
    <<<

}

>>>
public class FontSizeHandle extends LocatorHandle {

    protected Undoable createUndoActivity (); >>>
    public static class UndoActivity extends UndoableAdapter {

        protected void setFont (Font newFont);
        protected void setOldFontSize (int newOldFontSize);
        protected void swapFont ();
        public Font getFont ();
        public UndoActivity (Font newFont) {
        }

        public boolean redo ();
        public boolean undo ();
        public int getOldFontSize ();
    }

    >>>

    public void invokeEnd (int x, int y, int anchorX, int anchorY, DrawingView view); >>>
    >>>

}

<<<
public class FontSizeHandle extends LocatorHandle {

    protected Undoable createUndoActivity (); <<<
    public static class UndoActivity extends UndoableAdapter {
        <<<
        <<<
        <<<
        <<<

        public UndoActivity (Font newFont) {
        }

        <<<
        <<<
        <<<

    }

    <<<
    <<<
    <<<
    <<<

}

>>>
public class FontSizeHandle extends LocatorHandle {

    protected Undoable createUndoActivity (DrawingView newView); >>>
    public static class UndoActivity extends UndoableAdapter {
        >>>
        >>>
        >>>
        >>>

        public UndoActivity (DrawingView newView, Font newFont) {
        }

        >>>
        >>>
        >>>

    }

    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.figures;

<<<
package org.jhotdraw.figures;

>>>
<<<
public class Geom {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class Geom {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public static double distanceFromLine2D (int xa, int ya, int xb, int yb, int xc, int yc); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.util;

<<<
package org.jhotdraw.util;

>>>
<<<
public class Geom {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class Geom {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public static Point angleToPoint (Rectangle r, double angle, Point p); >>>
    >>>
    >>>
    >>>
    >>>

    public static Point ovalAngleToPoint (Rectangle r, double angle, Point p); >>>

    public static Point polarToPoint (double angle, double fx, double fy, Point p); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class Geom {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class Geom {

    public static double distanceFromLine (int xa, int ya, int xb, int yb, int xc, int yc); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class Geom {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class Geom {

    public static Point bottomLeftCorner (Rectangle r);
    public static Point bottomRightCorner (Rectangle r);
    public static Point corner (Rectangle r);
    public static Point topLeftCorner (Rectangle r);
    public static Point topRightCorner (Rectangle r); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.contrib.html;

<<<
package org.jhotdraw.contrib.html;

>>>
package CH.ifa.draw.contrib;

<<<
package org.jhotdraw.contrib;

>>>
<<<
public class GraphicalCompositeFigure extends CompositeFigure implements Layoutable {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class GraphicalCompositeFigure extends CompositeFigure implements Layoutable {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public Object getAttribute (FigureAttributeConstant attributeConstant); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void setAttribute (FigureAttributeConstant attributeConstant, Object value); >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class GraphicalCompositeFigure extends CompositeFigure implements Layoutable {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public Vector handles (); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class GraphicalCompositeFigure extends CompositeFigure implements Layoutable {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public HandleEnumeration handles (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class GraphicalCompositeFigure extends CompositeFigure implements Layoutable {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class GraphicalCompositeFigure extends CompositeFigure implements Layoutable {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void visit (FigureVisitor visitor); >>>

}

<<<
public class GraphicalCompositeFigure extends CompositeFigure implements Layoutable {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public void visit (FigureVisitor visitor); <<<

}

>>>
public class GraphicalCompositeFigure extends CompositeFigure implements Layoutable {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.util;

<<<
<<<
package org.jhotdraw.util;

>>>
>>>
package CH.ifa.draw.standard;

<<<
package org.jhotdraw.standard;

>>>
<<<
public class GroupCommand extends Command {
    <<<
    <<<
    <<<

}

>>>
public class GroupCommand extends AbstractCommand {
    >>>
    >>>
    >>>

}

<<<
public class GroupCommand extends AbstractCommand {
    <<<
    <<<
    <<<

}

>>>
public class GroupCommand extends Command {
    >>>
    >>>
    >>>

}

<<<
public class GroupCommand extends Command {
    <<<
    <<<
    <<<

}

>>>
public class GroupCommand extends AbstractCommand {

    protected Undoable createUndoActivity (); >>>
    >>>
    public static class UndoActivity extends UndoableAdapter {

        public UndoActivity (DrawingView newDrawingView) {
        }

        public boolean redo ();
        public boolean undo ();
        public void groupFigures ();
    }

    >>>

}

<<<
public class GroupCommand extends AbstractCommand {
    <<<

    public GroupCommand (String name, DrawingView view) {
    }

    public boolean isExecutable (); <<<
    <<<

}

>>>
public class GroupCommand extends AbstractCommand {
    >>>

    public GroupCommand (String name, DrawingEditor newDrawingEditor) {
    }

    public boolean isExecutableWithView (); >>>
    >>>

}

package CH.ifa.draw.figures;

<<<
package org.jhotdraw.figures;

>>>
package CH.ifa.draw.figures;

<<<
package org.jhotdraw.figures;

>>>
<<<
public class GroupFigure extends CompositeFigure {
    <<<
    <<<

    public Vector handles (); <<<
    <<<
    <<<

}

>>>
public class GroupFigure extends CompositeFigure {
    >>>

    public HandleEnumeration handles (); >>>
    >>>
    >>>
    >>>

}

<<<
public class GroupFigure extends CompositeFigure {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class GroupFigure extends CompositeFigure {
    >>>
    >>>
    >>>
    >>>
    >>>

    public void setAttribute (FigureAttributeConstant fac, Object object); >>>

}

package CH.ifa.draw.figures;

<<<
package org.jhotdraw.figures;

>>>
<<<
public interface Handle {
    <<<
    <<<

    abstract public Point locate (); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public interface Handle {
    >>>

    public Point locate (); >>>

    public Undoable getUndoActivity (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void setUndoActivity (Undoable newUndoableActivity);
}

<<<
public interface Handle {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public interface Handle {

    public Cursor getCursor (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.framework;

<<<
package org.jhotdraw.framework;

>>>
package CH.ifa.draw.standard;

<<<
package org.jhotdraw.standard;

>>>
package CH.ifa.draw.framework;

<<<
package org.jhotdraw.framework;

>>>
package CH.ifa.draw.standard;

<<<
package org.jhotdraw.standard;

>>>
<<<
public class HandleTracker extends AbstractTool {
    <<<
    <<<
    <<<
    <<<

}

>>>
public class HandleTracker extends AbstractTool {
    >>>

    public void activate (); >>>
    >>>
    >>>

}

<<<
public class HandleTracker extends AbstractTool {

    public HandleTracker (DrawingView view, Handle anchorHandle) {
    }

    <<<
    <<<
    <<<
    <<<

}

>>>
public class HandleTracker extends AbstractTool {

    public HandleTracker (DrawingEditor newDrawingEditor, Handle anchorHandle) {
    }

    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.standard;

<<<
package org.jhotdraw.standard;

>>>
package CH.ifa.draw.contrib.html;

<<<
package org.jhotdraw.contrib.html;

>>>
package CH.ifa.draw.contrib.html;

<<<
package org.jhotdraw.contrib.html;

>>>
package CH.ifa.draw.contrib.html;

<<<
package org.jhotdraw.contrib.html;

>>>
package CH.ifa.draw.contrib.html;

<<<
package org.jhotdraw.contrib.html;

>>>
<<<
public class HTMLTextAreaFigure extends TextAreaFigure implements FigureChangeListener, HTMLContentProducerContext {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class HTMLTextAreaFigure extends TextAreaFigure implements FigureChangeListener, HTMLContentProducerContext {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public Figure getRepresentingFigure (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class HTMLTextAreaFigure extends TextAreaFigure implements FigureChangeListener, HTMLContentProducerContext {
    <<<
    <<<
    <<<
    protected Figure fFrameFigure = null;
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    protected boolean fIsImageDirty = true;
    protected boolean fRawHTML = false;
    protected boolean fUseDirectDraw = false;
    <<<
    <<<
    <<<
    protected static ContentProducerRegistry fDefaultContentProducers = new ContentProducerRegistry ();
    protected transient ContentProducer fIntrinsicContentProducer;
    protected transient ContentProducerRegistry fContentProducers = null;
    protected transient DisposableResourceHolder fImageHolder;
    protected transient JLabel fDisplayDelegate;
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class HTMLTextAreaFigure extends TextAreaFigure implements FigureChangeListener, HTMLContentProducerContext {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class HTMLTextAreaFigure extends TextAreaFigure implements FigureChangeListener, HTMLContentProducerContext {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public void setAttribute (String name, Object value); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class HTMLTextAreaFigure extends TextAreaFigure implements FigureChangeListener, HTMLContentProducerContext {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void setAttribute (FigureAttributeConstant name, Object value); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.contrib.html;

<<<
package org.jhotdraw.contrib.html;

>>>
package CH.ifa.draw.contrib.html;

<<<
package org.jhotdraw.contrib.html;

>>>
<<<
public class Iconkit {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class Iconkit {
    >>>
    >>>
    >>>

    public Image loadImage (String filename, boolean waitForLoad); >>>
    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.util;

<<<
package org.jhotdraw.util;

>>>
<<<
public class Iconkit {
    <<<

    public Image getImage (String filename);
    public Image loadImage (String filename);
    public Image loadImage (String filename, boolean waitForLoad);
    public Image loadImageResource (String resourcename); <<<
    <<<
    <<<
    <<<

}

>>>
public class Iconkit {
    >>>

    public Image getImage (String fileName);
    public Image getImageURL (URL url);
    public Image loadImage (String fileName);
    public Image loadImage (String fileName, boolean waitForLoad);
    public Image loadImageResource (String fileName);
    public Image loadImageResourceURL (URL url);
    public Image loadImageURL (URL url);
    public Image loadImageURL (URL url, boolean waitForLoad); >>>

    public Image registerAndLoadImageURL (Component component, URL url); >>>
    >>>
    >>>

    public void registerImageURL (URL url);
}

<<<
public class Iconkit {
    <<<
    <<<

    public Image getImageURL (URL url); <<<
    <<<
    <<<

    public Image loadImageResourceURL (URL url); <<<
    <<<
    <<<

    public Image registerAndLoadImageURL (Component component, URL url); <<<
    <<<
    <<<
    <<<

}

>>>
public class Iconkit {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public Image loadImageUncached (String fileName);
    public Image loadImageUncachedURL (URL url); >>>

    public Image waitForLoadedImage (Image image); >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.figures;

<<<
package org.jhotdraw.figures;

>>>
<<<
public class ImageFigure extends AttributeFigure implements ImageObserver {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class ImageFigure extends AttributeFigure implements ImageObserver {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void release (); >>>

}

<<<
public class ImageFigure extends AttributeFigure implements ImageObserver {
    <<<
    <<<
    <<<
    <<<

    public Vector handles (); <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class ImageFigure extends AttributeFigure implements ImageObserver {
    >>>

    public HandleEnumeration handles (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class InsertImageCommand extends Command {
    <<<
    <<<

}

>>>
public class InsertImageCommand extends AbstractCommand {
    >>>
    >>>

}

<<<
public class InsertImageCommand extends AbstractCommand {
    <<<
    <<<

}

>>>
public class InsertImageCommand extends Command {
    >>>
    >>>

}

<<<
public class InsertImageCommand extends Command {

    public InsertImageCommand (String name, String image, DrawingView view) {
    }

    <<<

}

>>>
public class InsertImageCommand extends AbstractCommand {

    protected Undoable createUndoActivity ();
    public InsertImageCommand (String name, String newImageName, DrawingView view) {
    }

    public class UndoActivity extends UndoableAdapter {

        protected ImageFigure getImageFigure ();
        protected void insertImage ();
        protected void setImageFigure (ImageFigure newImageFigure);
        public boolean redo ();
        public boolean undo ();
    }

    >>>

}

<<<
public class InsertImageCommand extends AbstractCommand {
    <<<

    public InsertImageCommand (String name, String newImageName, DrawingView view) {
    }

    <<<
    <<<

}

>>>
public class InsertImageCommand extends AbstractCommand {
    >>>

    public InsertImageCommand (String name, String newImageName, DrawingEditor newDrawingEditor) {
    }

    >>>
    >>>

}

package CH.ifa.draw.figures;

<<<
package org.jhotdraw.figures;

>>>
package CH.ifa.draw.util.collections.jdk11;

<<<
package org.jhotdraw.util.collections.jdk11;

>>>
<<<
public class JavaDrawApp extends MDI_DrawApplication {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class JavaDrawApp extends MDI_DrawApplication {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    protected JavaDrawApp (String title) {
    }

    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class JavaDrawApp extends MDI_DrawApplication {
    <<<
    <<<

    protected DrawingView createDrawingView (); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class JavaDrawApp extends MDI_DrawApplication {
    >>>
    >>>

    protected DrawingView createDrawingView (Drawing newDrawing); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class JavaDrawApp extends MDI_DrawApplication {
    <<<
    <<<

    protected DrawingView createDrawingView (Drawing newDrawing); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class JavaDrawApp extends MDI_DrawApplication {
    >>>
    >>>

    protected DrawingView createDrawingView (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class JavaDrawApp extends MDI_DrawApplication {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    protected JavaDrawApp (String title) {
    }

    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class JavaDrawApp extends MDI_DrawApplication {
    >>>
    >>>
    >>>
    >>>

    protected JMenu createDebugMenu (); >>>
    >>>
    >>>
    >>>
    >>>

    public JavaDrawApp (String title) {
    }

    >>>
    >>>
    >>>
    >>>

}

<<<
public class JavaDrawApp extends MDI_DrawApplication {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class JavaDrawApp extends MDI_DrawApplication {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    protected boolean closeQuery (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class JavaDrawApp extends MDI_DrawApplication {
    <<<
    <<<

    protected DrawingView createDrawingView (); <<<
    <<<
    <<<
    <<<
    <<<

    protected boolean closeQuery (); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class JavaDrawApp extends MDI_DrawApplication {
    >>>
    >>>

    protected DrawingView createDrawingView (Drawing newDrawing); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.samples.javadraw;

<<<
package org.jhotdraw.samples.javadraw;

>>>
<<<
public class JavaDrawApp extends MDI_DrawApplication {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public void open (); <<<

}

>>>
public class JavaDrawApp extends MDI_DrawApplication {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class JavaDrawApp extends MDI_DrawApplication {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class JavaDrawApp extends MDI_DrawApplication {
    >>>
    >>>

    protected DrawingView createDrawingView (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.samples.javadraw;

<<<
package org.jhotdraw.samples.javadraw;

>>>
<<<
public class JavaDrawViewer extends JApplet implements DrawingEditor {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class JavaDrawViewer extends JApplet implements DrawingEditor {

    protected Drawing createDrawing (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.samples.javadraw;

<<<
package org.jhotdraw.samples.javadraw;

>>>
<<<
public class JavaDrawViewer extends JApplet implements DrawingEditor {
    <<<
    <<<
    <<<
    <<<

    public void selectionChanged (DrawingView view); <<<

}

>>>
public class JavaDrawViewer extends JApplet implements DrawingEditor {
    >>>
    >>>
    >>>

    public void figureSelectionChanged (DrawingView view); >>>
    >>>

}

<<<
public class JavaDrawViewer extends JApplet implements DrawingEditor {
    <<<
    <<<
    <<<

    public void figureSelectionChanged (DrawingView view); <<<
    <<<

}

>>>
public class JavaDrawViewer extends JApplet implements DrawingEditor {
    >>>
    >>>
    >>>
    >>>

    public void selectionChanged (DrawingView view); >>>

}

<<<
public class JavaDrawViewer extends JApplet implements DrawingEditor {
    <<<
    <<<
    <<<
    <<<

    public void selectionChanged (DrawingView view); <<<

}

>>>
public class JavaDrawViewer extends JApplet implements DrawingEditor {
    >>>
    >>>
    >>>

    public void figureSelectionChanged (DrawingView view); >>>
    >>>

}

<<<
public class JavaDrawViewer extends JApplet implements DrawingEditor {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class JavaDrawViewer extends JApplet implements DrawingEditor {

    protected void setUndoManager (UndoManager newUndoManager); >>>

    public DrawingView [] views (); >>>
    >>>

    public UndoManager getUndoManager ();
    public void addViewChangeListener (ViewChangeListener vsl); >>>
    >>>

    public void removeViewChangeListener (ViewChangeListener vsl); >>>

}

<<<
public class JavaDrawViewer extends JApplet implements DrawingEditor {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class JavaDrawViewer extends JApplet implements DrawingEditor {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void setTool (Tool newTool); >>>

}

<<<
public class JDOStorageFormat extends StandardStorageFormat {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class JDOStorageFormat extends StandardStorageFormat {
    >>>
    >>>
    >>>
    >>>
    >>>

    public boolean isRestoreFormat ();
    public boolean isStoreFormat (); >>>
    >>>
    >>>

}

package CH.ifa.draw.util;

<<<
package org.jhotdraw.util;

>>>
<<<
public class JHDDragSourceListener implements java.awt.dnd.DragSourceListener {
    <<<
    <<<
    <<<
    <<<

    public JHDDragSourceListener (DrawingEditor editor, DrawingView view) {
    }

    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class JHDDragSourceListener implements java.awt.dnd.DragSourceListener {
    >>>
    >>>
    >>>
    >>>

    public JHDDragSourceListener (DrawingEditor newEditor, DrawingView newView) {
    }

    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.contrib.dnd;

public class JHDDragSourceListener implements java.awt.dnd.DragSourceListener {
    <<<
    <<<
    <<<
    <<<
    <<<
    public static class RemoveUndoActivity extends CH.ifa.draw.util.UndoableAdapter {
        <<<
        <<<
        <<<
        <<<

    }

    <<<
    <<<
    <<<
    <<<
    <<<

}

package org.jhotdraw.contrib.dnd;

public class JHDDragSourceListener implements java.awt.dnd.DragSourceListener {
    >>>
    >>>
    >>>
    >>>
    >>>
    public static class RemoveUndoActivity extends org.jhotdraw.util.UndoableAdapter {
        >>>
        >>>
        >>>
        >>>

    }

    >>>
    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.contrib.dnd;

public class JHDDropTargetListener implements java.awt.dnd.DropTargetListener {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    public static class AddUndoActivity extends CH.ifa.draw.util.UndoableAdapter {
        <<<
        <<<
        <<<
        <<<

    }

    <<<
    <<<
    <<<
    <<<
    <<<

}

package org.jhotdraw.contrib.dnd;

public class JHDDropTargetListener implements java.awt.dnd.DropTargetListener {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    public static class AddUndoActivity extends org.jhotdraw.util.UndoableAdapter {
        >>>
        >>>
        >>>
        >>>

    }

    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class JHotDrawException extends Exception {
    <<<

}

>>>
public class JHotDrawException extends Exception {

    public JHotDrawException (Exception nestedException) {
    }

    >>>

}

<<<
public class JHotDrawException extends Exception {
    <<<
    <<<

}

>>>
public class JHotDrawException extends Exception {

    protected void setNestedException (Exception newNestedException);
    public Exception getNestedException (); >>>
    >>>

}

package CH.ifa.draw.framework;

<<<
package org.jhotdraw.framework;

>>>
<<<
public class JHotDrawRuntimeException extends RuntimeException {
    <<<

}

>>>
public class JHotDrawRuntimeException extends RuntimeException {

    public JHotDrawRuntimeException (Exception nestedException) {
    }

    >>>

}

<<<
public class JHotDrawRuntimeException extends RuntimeException {
    <<<
    <<<

}

>>>
public class JHotDrawRuntimeException extends RuntimeException {

    protected void setNestedException (Exception newNestedException);
    public Exception getNestedException (); >>>
    >>>

}

package CH.ifa.draw.framework;

<<<
package org.jhotdraw.framework;

>>>
<<<
public class JPanelDesktop extends JPanel implements Desktop {
    <<<
    <<<
    <<<

    protected DrawApplication getDrawApplication (); <<<
    <<<

    public JPanelDesktop (DrawApplication newDrawApplication) {
    }

    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class JPanelDesktop extends JPanel implements Desktop {
    >>>
    >>>
    >>>
    >>>
    >>>

    public JPanelDesktop () {
    }

    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class JPanelDesktop extends JPanel implements Desktop {
    <<<
    <<<
    <<<
    <<<
    <<<

    public JPanelDesktop () {
    }

    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class JPanelDesktop extends JPanel implements Desktop {
    >>>
    >>>
    >>>

    protected DrawApplication getDrawApplication (); >>>
    >>>

    public JPanelDesktop (DrawApplication newDrawApplication) {
    }

    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.contrib;

<<<
package org.jhotdraw.contrib;

>>>
package CH.ifa.draw.contrib;

<<<
package org.jhotdraw.contrib;

>>>
package CH.ifa.draw.contrib;

<<<
package org.jhotdraw.contrib;

>>>
<<<
public interface Layouter extends Serializable, Storable {
    <<<
    <<<
    <<<
    <<<

}

>>>
public interface Layouter extends Serializable, Storable {
    >>>

    public Layouter create (Layoutable newLayoutable); >>>
    >>>
    >>>

}

package CH.ifa.draw.contrib;

<<<
package org.jhotdraw.contrib;

>>>
package CH.ifa.draw.figures;

<<<
package org.jhotdraw.figures;

>>>
<<<
public class LineConnection extends PolyLineFigure implements ConnectionFigure {
    protected Connector fEnd = null;
    protected Connector fStart = null;
    <<<
    <<<
    <<<

    public Connector end ();
    public Connector start (); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public void connectEnd (Connector end);
    public void connectStart (Connector start); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class LineConnection extends PolyLineFigure implements ConnectionFigure {
    protected Connector myEndConnector;
    protected Connector myStartConnector;
    >>>
    >>>
    >>>

    protected void setEndConnector (Connector newEndConnector);
    protected void setStartConnector (Connector newStartConnector);
    public Connector getEndConnector ();
    public Connector getStartConnector (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void connectEnd (Connector newEndConnector);
    public void connectStart (Connector newStartConnector); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class LineConnection extends PolyLineFigure implements ConnectionFigure {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public Vector handles (); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class LineConnection extends PolyLineFigure implements ConnectionFigure {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public HandleEnumeration handles (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class LineConnection extends PolyLineFigure implements ConnectionFigure {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class LineConnection extends PolyLineFigure implements ConnectionFigure {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void visit (FigureVisitor visitor); >>>

}

<<<
public class LineConnection extends PolyLineFigure implements ConnectionFigure {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class LineConnection extends PolyLineFigure implements ConnectionFigure {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void removeFromContainer (FigureChangeListener c); >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public interface LineDecoration extends Cloneable, Serializable, Storable {

    abstract public void draw (Graphics g, int x1, int y1, int x2, int y2);
}

>>>
public interface LineDecoration extends Cloneable, Serializable, Storable {

    public Rectangle displayBox ();
    public void draw (Graphics g, int x1, int y1, int x2, int y2);
}

package CH.ifa.draw.figures;

<<<
package org.jhotdraw.figures;

>>>
package CH.ifa.draw.figures;

<<<
package org.jhotdraw.figures;

>>>
package CH.ifa.draw.util.collections.jdk11;

<<<
package org.jhotdraw.util.collections.jdk11;

>>>
package CH.ifa.draw.framework;

<<<
package org.jhotdraw.framework;

>>>
<<<
public class LocatorConnector extends AbstractConnector {

    protected Point locate (ConnectionFigure connection); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class LocatorConnector extends AbstractConnector {

    protected void setLocator (Locator newLocator);
    public Locator getLocator (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.standard;

<<<
package org.jhotdraw.standard;

>>>
<<<
public class LocatorConnector extends AbstractConnector {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class LocatorConnector extends AbstractConnector {
    protected Locator myLocator;
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class LocatorHandle extends AbstractHandle {
    <<<
    <<<

}

>>>
public class LocatorHandle extends AbstractHandle {

    public Locator getLocator (); >>>
    >>>

}

<<<
public class LocatorHandle extends AbstractHandle {
    <<<
    <<<
    <<<

}

>>>
public class LocatorHandle extends AbstractHandle {

    public Cursor getCursor (); >>>
    >>>
    >>>

}

package CH.ifa.draw.standard;

<<<
package org.jhotdraw.standard;

>>>
package CH.ifa.draw.util.collections.jdk11;

<<<
package org.jhotdraw.util.collections.jdk11;

>>>
<<<
public class MDIDesktopPane extends JDesktopPane implements Desktop {
    private DrawingChangeListener dcl = new DrawingChangeListener () {

        public void drawingInvalidated (DrawingChangeEvent e);
        public void drawingRequestUpdate (DrawingChangeEvent e);
        public void drawingTitleChanged (DrawingChangeEvent e);
    }

    ;
    <<<
    protected InternalFrameListener internalFrameListener = new InternalFrameAdapter () {
        <<<
        <<<

        public void internalFrameDeactivated (InternalFrameEvent e); <<<

    }

    ;
    <<<
    <<<
    <<<

    public MDIDesktopPane () {
    }

    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

<<<
>>>
public class MDIDesktopPane extends JDesktopPane implements Desktop {
    >>>

    protected DrawApplication getDrawApplication (); protected DrawingView selectedView;
    protected InternalFrameListener internalFrameListener = new InternalFrameAdapter () {
        >>>
        >>>
        >>>

    }

    ;
    >>>
    >>>
    >>>

    public MDIDesktopPane (DrawApplication newDrawApplication) {
    }

    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

>>>
<<<
public class MDIDesktopPane extends JDesktopPane implements Desktop {
    <<<
    <<<
    protected DrawingView selectedView;
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

<<<
>>>
public class MDIDesktopPane extends JDesktopPane implements Desktop {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

>>>
<<<
public class MDIDesktopPane extends JDesktopPane implements Desktop {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

<<<
>>>
public class MDIDesktopPane extends JDesktopPane implements Desktop {
    >>>
    >>>
    >>>

    protected void fireDrawingViewAddedEvent (final DrawingView dv);
    protected void fireDrawingViewRemovedEvent (final DrawingView dv);
    protected void fireDrawingViewSelectedEvent (final DrawingView dv); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

>>>
<<<
public class MDIDesktopPane extends JDesktopPane implements Desktop {
    <<<
    <<<
    <<<
    <<<
    <<<

    protected void fireDrawingViewSelectedEvent (final DrawingView dv); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

<<<
>>>
public class MDIDesktopPane extends JDesktopPane implements Desktop {
    >>>

    protected DesktopEventService createDesktopEventService ();
    protected DesktopEventService getDesktopEventService (); >>>
    >>>
    >>>
    >>>

    protected void fireDrawingViewSelectedEvent (final DrawingView oldView, final DrawingView newView); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

>>>
package CH.ifa.draw.contrib;

<<<
<<<
package org.jhotdraw.contrib;

>>>
>>>
<<<
public class MDIDesktopPane extends JDesktopPane {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

<<<
>>>
public class MDIDesktopPane extends JDesktopPane {
    >>>
    >>>

    public void arrangeFramesHorizontally ();
    public void arrangeFramesVertically (); >>>
    >>>
    >>>
    >>>
    >>>

    public void tileFramesHorizontally ();
    public void tileFramesVertically ();
}

>>>
<<<
public class MDIDesktopPane extends JDesktopPane {

    public Component add (JInternalFrame frame);
    public MDIDesktopPane () {
    }

    <<<
    <<<
    <<<

    public void remove (Component c); <<<
    <<<
    <<<
    <<<
    <<<

}

class MDIDesktopManager extends DefaultDesktopManager {
    <<<
    <<<

    public MDIDesktopManager (MDIDesktopPane desktop) {
    }

    <<<
    <<<
    <<<

}

>>>
public class MDIDesktopPane extends JDesktopPane implements Desktop {

    protected Component createContents (DrawingView dv);
    protected DrawApplication getDrawApplication (); protected DrawingView selectedView;
    protected InternalFrameListener internalFrameListener = new InternalFrameAdapter () {

        public void internalFrameActivated (InternalFrameEvent e);
        public void internalFrameClosed (InternalFrameEvent e);
        public void internalFrameOpened (InternalFrameEvent e);
    }

    ;

    public DrawingView [] getAllFromDesktop (int location);
    public DrawingView getActiveDrawingView ();
    public MDIDesktopPane (DrawApplication newDrawApplication) {
    }

    public void addDesktopListener (DesktopListener dpl);
    public void addToDesktop (DrawingView dv, int location); >>>
    >>>
    >>>

    public void removeAllFromDesktop (int location);
    public void removeDesktopListener (DesktopListener dpl);
    public void removeFromDesktop (DrawingView dv, int location); >>>
    >>>

    public void setSelectedDrawingView (DrawingView dv); >>>
    >>>
    >>>

}

class MDIDesktopManager extends DefaultDesktopManager {
    >>>
    >>>

    public MDIDesktopManager (MDIDesktopPane newDesktop) {
    }

    >>>
    >>>
    >>>

}

<<<
public class MDIDesktopPane extends JDesktopPane implements Desktop {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public void setSelectedDrawingView (DrawingView dv); <<<
    <<<
    <<<

}

<<<
>>>
public class MDIDesktopPane extends JDesktopPane implements Desktop {
    >>>
    >>>
    >>>
    >>>

    protected void setActiveDrawingView (DrawingView newSelectedView); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void updateTitle (String newDrawingTitle);
}

>>>
<<<
public class MDIDesktopPane extends JDesktopPane implements Desktop {
    <<<
    <<<
    protected DrawingView selectedView;
    protected InternalFrameListener internalFrameListener = new InternalFrameAdapter () {
        <<<
        <<<
        <<<

    }

    ;
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

<<<
>>>
public class MDIDesktopPane extends JDesktopPane implements Desktop {
    >>>
    >>>
    protected InternalFrameListener internalFrameListener = new InternalFrameAdapter () {
        >>>
        >>>

        public void internalFrameDeactivated (InternalFrameEvent e); >>>

    }

    ;
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

>>>
<<<
public class MDIDesktopPane extends JDesktopPane implements Desktop {
    <<<

    protected DrawApplication getDrawApplication (); <<<
    <<<
    <<<
    <<<

    public MDIDesktopPane (DrawApplication newDrawApplication) {
    }

    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

<<<
>>>
public class MDIDesktopPane extends JDesktopPane implements Desktop {
    private DrawingChangeListener dcl = new DrawingChangeListener () {

        public void drawingInvalidated (DrawingChangeEvent e);
        public void drawingRequestUpdate (DrawingChangeEvent e);
        public void drawingTitleChanged (DrawingChangeEvent e);
    }

    ;
    >>>
    >>>
    >>>
    >>>
    >>>

    public MDIDesktopPane () {
    }

    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

>>>
<<<
public class MDI_DrawApplication extends DrawApplication {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class MDI_DrawApplication extends DrawApplication {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public String getDefaultDrawingTitle (); >>>
    >>>
    >>>

}

<<<
public class MDI_DrawApplication extends DrawApplication {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class MDI_DrawApplication extends DrawApplication {
    >>>
    >>>
    >>>
    >>>

    protected void setDrawingTitle (String drawingTitle); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class MDI_DrawApplication extends DrawApplication {
    <<<
    <<<
    <<<
    <<<

    protected void setDrawingTitle (String drawingTitle); <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public void promptNew ();
}

>>>
public class MDI_DrawApplication extends DrawApplication {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class MDI_DrawApplication extends DrawApplication {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class MDI_DrawApplication extends DrawApplication {
    >>>
    >>>
    >>>
    >>>

    protected void setDrawingTitle (String drawingTitle); >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void promptNew ();
}

package CH.ifa.draw.contrib;

<<<
package org.jhotdraw.contrib;

>>>
<<<
public class MDI_DrawApplication extends DrawApplication implements InternalFrameListener {
    <<<

    protected JComponent createContents (DrawingView view); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class MDI_DrawApplication extends DrawApplication implements InternalFrameListener {
    >>>

    protected JComponent createContents (StandardDrawingView view); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class MDI_DrawApplication extends DrawApplication implements InternalFrameListener {
    <<<

    protected JComponent createContents (StandardDrawingView view); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class MDI_DrawApplication extends DrawApplication implements InternalFrameListener {
    >>>

    protected JComponent createContents (DrawingView view); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class MDI_DrawApplication extends DrawApplication implements InternalFrameListener {
    <<<
    <<<

    protected MDI_InternalFrame createInternalFrame (); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public void newWindow (); <<<
    <<<

}

>>>
public class MDI_DrawApplication extends DrawApplication implements InternalFrameListener {
    >>>
    >>>

    protected MDI_InternalFrame createInternalFrame (DrawingView view); >>>

    protected void createTools (JToolBar palette); >>>
    >>>

    public DrawingView [] views (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void deactivateFrame (MDI_InternalFrame frame); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void newWindow (Drawing newDrawing); >>>
    >>>

}

<<<
public class MDI_DrawApplication extends DrawApplication implements InternalFrameListener {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class MDI_DrawApplication extends DrawApplication implements InternalFrameListener {
    >>>

    protected DrawingView createInitialDrawingView (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class MDI_DrawApplication extends DrawApplication implements InternalFrameListener {
    <<<
    <<<

    protected JComponent createContents (DrawingView view);
    protected MDI_InternalFrame createInternalFrame (DrawingView view);
    protected String getDrawingTitle (); <<<

    protected void setDesktop (JComponent newDesktop);
    protected void setDrawingTitle (String newDrawingTitle); <<<

    public JComponent getDesktop (); <<<
    <<<

    public boolean hasInternalFrames ();
    public void activateFrame (MDI_InternalFrame newFrame);
    public void addInternalFrameListener (InternalFrameListener newMDIListener);
    public void deactivateFrame (MDI_InternalFrame frame);
    public void internalFrameActivated (InternalFrameEvent e);
    public void internalFrameClosed (InternalFrameEvent e);
    public void internalFrameClosing (InternalFrameEvent e);
    public void internalFrameDeactivated (InternalFrameEvent e);
    public void internalFrameDeiconified (InternalFrameEvent e);
    public void internalFrameIconified (InternalFrameEvent e);
    public void internalFrameOpened (InternalFrameEvent e); <<<
    <<<
    <<<

    public void removeInternalFrameListener (InternalFrameListener oldMDIListener);
}

>>>
public class MDI_DrawApplication extends DrawApplication {

    protected Desktop createDesktop (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.samples.minimap;

<<<
package org.jhotdraw.samples.minimap;

>>>
package CH.ifa.draw.samples.minimap;

<<<
package org.jhotdraw.samples.minimap;

>>>
<<<
public class MiniMapView extends JComponent {
    class MappedDrawingChangeListener implements DrawingChangeListener {
        <<<
        <<<

    }

    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class MiniMapView extends JComponent {
    class MappedDrawingChangeListener implements DrawingChangeListener {
        >>>
        >>>

        public void drawingTitleChanged (DrawingChangeEvent e);
    }

    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class MiniMapView extends JComponent {
    class MappedDrawingChangeListener implements DrawingChangeListener {
        <<<
        <<<

        public void drawingTitleChanged (DrawingChangeEvent e);
    }

    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class MiniMapView extends JComponent {
    class MappedDrawingChangeListener implements DrawingChangeListener {
        >>>
        >>>

    }

    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class MiniMapView extends JComponent {
    class MappedDrawingChangeListener implements DrawingChangeListener {
        <<<
        <<<

    }

    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class MiniMapView extends JComponent {
    class MappedDrawingChangeListener implements DrawingChangeListener {
        >>>
        >>>

        public void drawingTitleChanged (DrawingChangeEvent e);
    }

    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.contrib;

<<<
package org.jhotdraw.contrib;

>>>
package CH.ifa.draw.contrib.zoom;

<<<
package org.jhotdraw.contrib.zoom;

>>>
<<<
public class MySelectionTool extends SelectionTool {
    <<<

    public MySelectionTool (DrawingView view) {
    }

    <<<

}

>>>
public class MySelectionTool extends SelectionTool {
    >>>

    public MySelectionTool (DrawingEditor newDrawingEditor) {
    }

    >>>

}

package CH.ifa.draw.samples.javadraw;

<<<
package org.jhotdraw.samples.javadraw;

>>>
package CH.ifa.draw.contrib;

<<<
package org.jhotdraw.contrib;

>>>
<<<
public class NetApp extends DrawApplication {
    <<<
    <<<

}

>>>
public class NetApp extends DrawApplication {
    >>>

    public NetApp () {
    }

    >>>

}

package CH.ifa.draw.samples.net;

<<<
package org.jhotdraw.samples.net;

>>>
<<<
public class NodeFigure extends TextFigure {
    <<<
    <<<
    <<<

    public Vector handles (); <<<

    public void connectorVisibility (boolean isVisible); <<<

}

>>>
public class NodeFigure extends TextFigure {
    >>>

    public HandleEnumeration handles (); >>>
    >>>
    >>>

    public void connectorVisibility (boolean isVisible, ConnectionFigure courtingConnection); >>>

}

<<<
public class NodeFigure extends TextFigure {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class NodeFigure extends TextFigure {
    >>>

    public Figure getRepresentingFigure (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.samples.net;

<<<
package org.jhotdraw.samples.net;

>>>
<<<
public class NothingApp extends DrawApplication {
    <<<
    <<<

}

>>>
public class NothingApp extends DrawApplication {
    >>>

    public NothingApp () {
    }

    >>>

}

package CH.ifa.draw.samples.nothing;

<<<
package org.jhotdraw.samples.nothing;

>>>
package CH.ifa.draw.samples.nothing;

<<<
package org.jhotdraw.samples.nothing;

>>>
<<<
public class NullDrawingView extends JPanel implements DrawingView {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class NullDrawingView extends JPanel implements DrawingView {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void drawingTitleChanged (DrawingChangeEvent e); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class NullDrawingView extends JPanel implements DrawingView {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public void drawingTitleChanged (DrawingChangeEvent e); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class NullDrawingView extends JPanel implements DrawingView {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class NullDrawingView extends JPanel implements DrawingView {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public NullDrawingView (DrawingEditor editor) {
    }

    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class NullDrawingView extends JPanel implements DrawingView {

    protected NullDrawingView (DrawingEditor editor) {
    }

    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void drawingTitleChanged (DrawingChangeEvent e); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class NullDrawingView extends JPanel implements DrawingView {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public void setCursor (Cursor c); <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class NullDrawingView extends JPanel implements DrawingView {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void setCursor (CH.ifa.draw.framework.Cursor c); >>>
    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.standard;

public class NullDrawingView extends JPanel implements DrawingView {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public void setCursor (CH.ifa.draw.framework.Cursor c); <<<
    <<<
    <<<
    <<<
    <<<

}

package org.jhotdraw.standard;

public class NullDrawingView extends JPanel implements DrawingView {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void setCursor (org.jhotdraw.framework.Cursor c); >>>
    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.figures;

<<<
package org.jhotdraw.figures;

>>>
package CH.ifa.draw.standard;

<<<
package org.jhotdraw.standard;

>>>
<<<
public class NullHandle extends LocatorHandle {
    <<<
    <<<
    <<<

}

>>>
public class NullHandle extends LocatorHandle {
    >>>
    >>>

    public org.jhotdraw.framework.Cursor getCursor (); >>>

}

<<<
public class NullTool extends AbstractTool {
    <<<
    <<<
    <<<

}

>>>
public class NullTool extends AbstractTool {

    protected void checkUsable (); >>>
    >>>
    >>>

}

<<<
public class NullTool extends AbstractTool {

    protected void checkUsable (); <<<
    <<<
    <<<

}

>>>
public class NullTool extends AbstractTool {
    >>>
    >>>
    >>>

}

<<<
public class NullTool extends AbstractTool {
    <<<
    <<<
    <<<

}

>>>
public class NullTool extends AbstractTool {

    protected void checkUsable (); >>>
    >>>
    >>>

}

package CH.ifa.draw.standard;

<<<
package org.jhotdraw.standard;

>>>
<<<
public class NumberTextFigure extends TextFigure {
    <<<
    <<<
    <<<

}

>>>
public class NumberTextFigure extends TextFigure {

    public Figure getRepresentingFigure (); >>>
    >>>
    >>>

}

package CH.ifa.draw.figures;

<<<
package org.jhotdraw.figures;

>>>
package CH.ifa.draw.standard;

<<<
package org.jhotdraw.standard;

>>>
<<<
public class OffsetLocator extends AbstractLocator {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class OffsetLocator extends AbstractLocator {
    protected int fOffsetX;
    protected int fOffsetY;
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.standard;

<<<
package org.jhotdraw.standard;

>>>
package CH.ifa.draw.framework;

<<<
package org.jhotdraw.framework;

>>>
<<<
abstract public class PaletteButton extends JButton implements MouseListener, MouseMotionListener {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
abstract public class PaletteButton extends JButton implements MouseListener, MouseMotionListener {
    final protected static int NORMAL = 1;
    final protected static int PRESSED = 2;
    final protected static int SELECTED = 3;
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.util;

<<<
package org.jhotdraw.util;

>>>
package CH.ifa.draw.util;

<<<
package org.jhotdraw.util;

>>>
package CH.ifa.draw.util;

<<<
package org.jhotdraw.util;

>>>
<<<
interface PaletteListener {

}

>>>
public interface PaletteListener {

    public void paletteUserOver (PaletteButton button, boolean inside);
    public void paletteUserSelected (PaletteButton button);
}

package CH.ifa.draw.util;

<<<
package org.jhotdraw.util;

>>>
package CH.ifa.draw.standard;

<<<
package org.jhotdraw.standard;

>>>
<<<
public class PasteCommand extends FigureTransferCommand {
    <<<
    <<<

}

>>>
public class PasteCommand extends FigureTransferCommand {

    protected Undoable createUndoActivity (); >>>
    public static class UndoActivity extends UndoableAdapter {

        public UndoActivity (DrawingView newDrawingView) {
        }

        public boolean redo ();
        public boolean undo ();
    }

    >>>

}

<<<
public class PasteCommand extends FigureTransferCommand {
    <<<

    public PasteCommand (String name, DrawingView view) {
    }

    <<<
    <<<

}

>>>
public class PasteCommand extends FigureTransferCommand {
    >>>

    public PasteCommand (String name, DrawingEditor newDrawingEditor) {
    }

    public boolean isExecutableWithView (); >>>
    >>>

}

package CH.ifa.draw.samples.javadraw;

<<<
package org.jhotdraw.samples.javadraw;

>>>
package CH.ifa.draw.standard;

<<<
package org.jhotdraw.standard;

>>>
package CH.ifa.draw.samples.pert;

<<<
package org.jhotdraw.samples.pert;

>>>
<<<
public class PertApplication extends DrawApplication {
    <<<
    <<<

}

>>>
public class PertApplication extends DrawApplication {
    >>>

    public PertApplication () {
    }

    >>>

}

package CH.ifa.draw.samples.pert;

<<<
package org.jhotdraw.samples.pert;

>>>
<<<
public class PertDependency extends LineConnection {
    <<<

    public Vector handles (); <<<
    <<<
    <<<

}

>>>
public class PertDependency extends LineConnection {

    public HandleEnumeration handles (); >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.samples.pert;

<<<
package org.jhotdraw.samples.pert;

>>>
<<<
public class PertFigure extends CompositeFigure {
    <<<
    <<<
    <<<
    <<<

    public Vector handles ();
    public Vector readTasks (StorableInput dr) throws IOException; <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public void writeTasks (StorableOutput dw, Vector v);
}

>>>
public class PertFigure extends CompositeFigure {
    >>>

    public HandleEnumeration handles (); >>>

    public List readTasks (StorableInput dr) throws IOException; >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void writeTasks (StorableOutput dw, List l);
}

package CH.ifa.draw.samples.pert;

<<<
package org.jhotdraw.samples.pert;

>>>
<<<
public class PertFigureCreationTool extends CreationTool {
    <<<

    public PertFigureCreationTool (DrawingView view) {
    }

}

>>>
public class PertFigureCreationTool extends CreationTool {
    >>>

    public PertFigureCreationTool (DrawingEditor newDrawingEditor) {
    }

}

package CH.ifa.draw.samples.pert;

<<<
package org.jhotdraw.samples.pert;

>>>
package CH.ifa.draw.framework;

<<<
package org.jhotdraw.framework;

>>>
<<<
public class PolygonFigure extends AttributeFigure {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public static double distanceFromLine (int xa, int ya, int xb, int yb, int xc, int yc); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class PolygonFigure extends AttributeFigure {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class PolygonFigure extends AttributeFigure {
    <<<
    <<<

    public Enumeration points (); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public Vector handles (); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class PolygonFigure extends AttributeFigure {
    >>>
    >>>

    public HandleEnumeration handles ();
    public Iterator points (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.contrib;

<<<
package org.jhotdraw.contrib;

>>>
package CH.ifa.draw.contrib.html;

<<<
package org.jhotdraw.contrib.html;

>>>
<<<
public class PolygonHandle extends AbstractHandle {

    protected Undoable createUndoActivity (int newPointIndex); <<<
    <<<
    public static class UndoActivity extends PolyLineHandle.UndoActivity {
        <<<

        public UndoActivity (int newPointIndex) {
        }

    }

    <<<
    <<<
    <<<

}

>>>
public class PolygonHandle extends AbstractHandle {

    protected Undoable createUndoActivity (DrawingView newView, int newPointIndex); >>>
    >>>
    public static class UndoActivity extends PolyLineHandle.UndoActivity {
        >>>

        public UndoActivity (DrawingView newView, int newPointIndex) {
        }

    }

    >>>
    >>>
    >>>

}

package CH.ifa.draw.contrib;

<<<
package org.jhotdraw.contrib;

>>>
<<<
class PolygonScaleHandle extends AbstractHandle {

    protected Undoable createUndoActivity (); <<<
    <<<
    public static class UndoActivity extends UndoableAdapter {
        <<<
        <<<
        <<<

        public UndoActivity () {
        }

        <<<
        <<<

    }

    <<<
    <<<
    <<<
    <<<

}

>>>
class PolygonScaleHandle extends AbstractHandle {

    protected Undoable createUndoActivity (DrawingView newView); >>>
    >>>
    public static class UndoActivity extends UndoableAdapter {
        >>>
        >>>
        >>>

        public UndoActivity (DrawingView newView) {
        }

        >>>
        >>>

    }

    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.contrib;

<<<
package org.jhotdraw.contrib;

>>>
<<<
public class PolygonTool extends AbstractTool {
    <<<
    <<<

    public PolygonTool (DrawingView view) {
    }

    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class PolygonTool extends AbstractTool {
    >>>
    >>>

    public PolygonTool (DrawingEditor newDrawingEditor) {
    }

    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.contrib;

<<<
package org.jhotdraw.contrib;

>>>
package CH.ifa.draw.figures;

<<<
package org.jhotdraw.figures;

>>>
package CH.ifa.draw.figures;

<<<
package org.jhotdraw.figures;

>>>
<<<
public class PolyLineFigure extends AbstractFigure {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class PolyLineFigure extends AbstractFigure {
    >>>
    >>>
    >>>
    >>>

    protected Rectangle invalidateRectangle (Rectangle r); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public Object getAttribute (FigureAttributeConstant attributeConstant); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void setAttribute (FigureAttributeConstant attributeConstant, Object value); >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class PolyLineFigure extends AbstractFigure {
    <<<
    <<<
    <<<
    <<<
    <<<
    protected Vector fPoints;
    <<<
    <<<
    <<<
    <<<

    public Enumeration points (); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public Vector handles (); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class PolyLineFigure extends AbstractFigure {
    >>>
    >>>
    >>>
    >>>
    protected List fPoints;
    >>>
    >>>
    >>>
    >>>
    >>>

    public HandleEnumeration handles ();
    public Iterator points (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class PolyLineHandle extends LocatorHandle {
    <<<
    <<<
    <<<

}

>>>
public class PolyLineHandle extends LocatorHandle {

    protected Undoable createUndoActivity (int newPointIndex); >>>
    public static class UndoActivity extends UndoableAdapter {

        protected boolean movePointToOldLocation ();
        public Point getOldPoint ();
        public UndoActivity (int newPointIndex) {
        }

        public boolean redo ();
        public boolean undo ();
        public int getPointIndex ();
        public void setOldPoint (Point newOldPoint);
        public void setPointIndex (int newPointIndex);
    }

    public void invokeEnd (int x, int y, int anchorX, int anchorY, DrawingView view); >>>
    >>>

}

<<<
public class PolyLineHandle extends LocatorHandle {

    protected Undoable createUndoActivity (int newPointIndex); <<<
    public static class UndoActivity extends UndoableAdapter {
        <<<
        <<<

        public UndoActivity (int newPointIndex) {
        }

        <<<
        <<<
        <<<
        <<<
        <<<

    }

    <<<
    <<<
    <<<

}

>>>
public class PolyLineHandle extends LocatorHandle {

    protected Undoable createUndoActivity (DrawingView newView, int newPointIndex); >>>
    public static class UndoActivity extends UndoableAdapter {
        >>>
        >>>

        public UndoActivity (DrawingView newView, int newPointIndex) {
        }

        >>>
        >>>
        >>>
        >>>
        >>>

    }

    >>>
    >>>
    >>>

}

package CH.ifa.draw.figures;

<<<
package org.jhotdraw.figures;

>>>
package CH.ifa.draw.figures;

<<<
package org.jhotdraw.figures;

>>>
package CH.ifa.draw.contrib;

<<<
package org.jhotdraw.contrib;

>>>
<<<
class QuadTree {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
class QuadTree implements Serializable {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
class QuadTree implements Serializable {
    <<<
    <<<
    <<<
    <<<

    public Vector getAll ();
    public Vector getAllWithin (Rectangle2D r); <<<
    <<<
    <<<

}

>>>
class QuadTree implements Serializable {

    public FigureEnumeration getAllWithin (Rectangle2D r); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.standard;

<<<
package org.jhotdraw.standard;

>>>
<<<
class RadiusHandle extends AbstractHandle {
    <<<
    <<<
    <<<

    public void invokeStart (int x, int y, DrawingView view); <<<

}

>>>
class RadiusHandle extends AbstractHandle {

    protected Undoable createUndoActivity (); >>>
    >>>
    public static class UndoActivity extends UndoableAdapter {

        protected boolean resetRadius ();
        protected void setOldRadius (Point newOldRadius);
        public Point getOldRadius ();
        public UndoActivity () {
        }

        public boolean redo ();
        public boolean undo ();
    }

    >>>

    public void invokeEnd (int x, int y, int anchorX, int anchorY, DrawingView view); >>>

}

<<<
class RadiusHandle extends AbstractHandle {

    protected Undoable createUndoActivity (); <<<
    <<<
    public static class UndoActivity extends UndoableAdapter {
        <<<
        <<<
        <<<

        public UndoActivity () {
        }

        <<<
        <<<

    }

    <<<
    <<<
    <<<

}

>>>
class RadiusHandle extends AbstractHandle {

    protected Undoable createUndoActivity (DrawingView newView); >>>
    >>>
    public static class UndoActivity extends UndoableAdapter {
        >>>
        >>>
        >>>

        public UndoActivity (DrawingView newView) {
        }

        >>>
        >>>

    }

    >>>
    >>>

    public void invokeStart (int x, int y, DrawingView view); >>>

}

package CH.ifa.draw.figures;

<<<
package org.jhotdraw.figures;

>>>
<<<
public class RectangleFigure extends AttributeFigure {
    <<<
    <<<
    <<<
    <<<

    public Vector handles (); <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class RectangleFigure extends AttributeFigure {
    >>>

    public HandleEnumeration handles (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.figures;

<<<
package org.jhotdraw.figures;

>>>
package CH.ifa.draw.util;

<<<
package org.jhotdraw.util;

>>>
<<<
public class RelativeLocator extends AbstractLocator {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class RelativeLocator extends AbstractLocator {
    >>>
    >>>
    >>>

    public boolean equals (Object o); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.standard;

<<<
package org.jhotdraw.standard;

>>>
<<<
public class ResourceContentProducer extends AbstractContentProducer implements Serializable {
    protected String fResourceName = null;
    <<<
    <<<

    public ResourceContentProducer (String resourceName) {
        fResourceName = resourceName;
    }

    <<<
    <<<

}

>>>
public class ResourceContentProducer extends AbstractContentProducer implements Serializable {

    protected void setResourceName (String newResourceName); >>>
    >>>

    public ResourceContentProducer (String resourceName) {
        setResourceName (resourceName);
    }

    public String getResourceName (); >>>
    >>>

}

package CH.ifa.draw.contrib.html;

<<<
package org.jhotdraw.contrib.html;

>>>
package CH.ifa.draw.contrib.html;

<<<
package org.jhotdraw.contrib.html;

>>>
package CH.ifa.draw.contrib.html;

<<<
package org.jhotdraw.contrib.html;

>>>
<<<
final public class ReverseFigureEnumerator implements FigureEnumeration {
    <<<

    public Object nextElement ();
    public ReverseFigureEnumerator (Vector v) {
    }

    public boolean hasMoreElements ();
}

>>>
final public class ReverseFigureEnumerator implements FigureEnumeration {
    >>>

    public ReverseFigureEnumerator (List l) {
    }

    public boolean hasNextFigure ();
}

<<<
final public class ReverseFigureEnumerator implements FigureEnumeration {
    <<<
    <<<
    <<<

}

>>>
final public class ReverseFigureEnumerator implements FigureEnumeration {
    >>>
    >>>
    >>>

    public void reset ();
}

package CH.ifa.draw.standard;

<<<
package org.jhotdraw.standard;

>>>
package CH.ifa.draw.figures;

<<<
package org.jhotdraw.figures;

>>>
<<<
public class RoundRectangleFigure extends AttributeFigure {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public Vector handles (); <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class RoundRectangleFigure extends AttributeFigure {
    >>>
    >>>

    public HandleEnumeration handles (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.contrib.html;

<<<
package org.jhotdraw.contrib.html;

>>>
<<<
public class ScalingGraphics extends java.awt.Graphics {
    private class ScalingFontMetrics extends FontMetrics {
        <<<

        public ScalingFontMetrics (Font userFont, FontMetrics real) {
        }

        <<<
        <<<
        <<<
        <<<
        <<<

    }

    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public void setScale (double scale); <<<
    <<<

}

>>>
public class ScalingGraphics extends java.awt.Graphics {
    private class ScalingFontMetrics extends FontMetrics {
        >>>

        public ScalingFontMetrics (Font newUserFont, FontMetrics newReal) {
        }

        >>>
        >>>
        >>>
        >>>
        >>>

    }

    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void setScale (double newScale); >>>
    >>>

}

package CH.ifa.draw.contrib.zoom;

<<<
package org.jhotdraw.contrib.zoom;

>>>
<<<
public class ScribbleTool extends AbstractTool {
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class ScribbleTool extends AbstractTool {

    protected Figure getAddedFigure ();
    protected Undoable createUndoActivity (); >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class ScribbleTool extends AbstractTool {
    <<<
    <<<

    public ScribbleTool (DrawingView view) {
    }

    <<<
    <<<
    <<<
    <<<

}

>>>
public class ScribbleTool extends AbstractTool {
    >>>
    >>>

    public ScribbleTool (DrawingEditor newDrawingEditor) {
    }

    >>>
    >>>
    >>>
    >>>

}

<<<
public class ScribbleTool extends AbstractTool {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class ScribbleTool extends AbstractTool {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void mouseUp (MouseEvent e, int x, int y);
}

package CH.ifa.draw.figures;

<<<
package org.jhotdraw.figures;

>>>
package CH.ifa.draw.standard;

<<<
package org.jhotdraw.standard;

>>>
package CH.ifa.draw.standard;

<<<
package org.jhotdraw.standard;

>>>
<<<
public class SelectAreaTracker extends AbstractTool {

    public SelectAreaTracker (DrawingView view) {
    }

    <<<
    <<<
    <<<

}

>>>
public class SelectAreaTracker extends AbstractTool {

    public SelectAreaTracker (DrawingEditor newDrawingEditor) {
    }

    >>>
    >>>
    >>>

}

<<<
public class SelectAreaTracker extends AbstractTool {
    <<<
    <<<
    <<<
    <<<

}

>>>
public class SelectAreaTracker extends AbstractTool {
    >>>

    public SelectAreaTracker (DrawingEditor newDrawingEditor, Color rubberBandColor) {
    }

    >>>
    >>>
    >>>

}

<<<
public class SelectionTool extends AbstractTool {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class SelectionTool extends AbstractTool {
    >>>
    >>>
    >>>
    >>>

    final protected void setDelegateTool (Tool newDelegateTool); >>>
    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.standard;

<<<
package org.jhotdraw.standard;

>>>
<<<
public class SelectionTool extends AbstractTool {

    protected Tool createAreaTracker (DrawingView view);
    protected Tool createDragTracker (DrawingView view, Figure f); <<<

    public SelectionTool (DrawingView view) {
    }

    <<<
    <<<
    <<<

}

>>>
public class SelectionTool extends AbstractTool {

    protected Tool createAreaTracker ();
    protected Tool createDragTracker (Figure f); >>>

    public SelectionTool (DrawingEditor newDrawingEditor) {
    }

    public void activate ();
    public void deactivate (); >>>
    >>>

    public void mouseMove (MouseEvent evt, int x, int y); >>>

}

<<<
public class SelectionTool extends AbstractTool {
    <<<
    <<<
    <<<
    <<<

    public void activate ();
    public void deactivate (); <<<
    <<<
    <<<
    <<<

}

>>>
public class SelectionTool extends AbstractTool {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class SelectionTool extends AbstractTool {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class SelectionTool extends AbstractTool {

    protected Figure findFigure (int x, int y);
    protected Handle findHandle (int x, int y); >>>
    >>>
    >>>

    protected Tool getChild ();
    protected void setChild (Tool tool); >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class SelectionTool extends AbstractTool {

    protected Figure findFigure (int x, int y);
    protected Handle findHandle (int x, int y); <<<
    <<<
    <<<

    protected Tool getChild ();
    protected void setChild (Tool tool); <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class SelectionTool extends AbstractTool {
    >>>
    >>>
    >>>

    protected Tool getDelegateTool (); >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class SendToBackCommand extends Command {
    <<<
    <<<
    <<<

}

>>>
public class SendToBackCommand extends AbstractCommand {
    >>>
    >>>
    >>>

}

<<<
public class SendToBackCommand extends AbstractCommand {
    <<<
    <<<
    <<<

}

>>>
public class SendToBackCommand extends Command {
    >>>
    >>>
    >>>

}

<<<
public class SendToBackCommand extends Command {
    <<<
    <<<
    <<<

}

>>>
public class SendToBackCommand extends AbstractCommand {

    protected Undoable createUndoActivity (); >>>
    >>>
    public static class UndoActivity extends UndoableAdapter {

        protected int getOriginalLayer (Figure lookupAffectedFigure);
        protected void addOriginalLayer (Figure affectedFigure, int newOriginalLayer);
        protected void sendToCommand (Figure f);
        public UndoActivity (DrawingView newDrawingView) {
        }

        public boolean redo ();
        public boolean undo ();
        public void setAffectedFigures (FigureEnumeration fe);
    }

    >>>

}

<<<
public class SendToBackCommand extends AbstractCommand {
    <<<

    public SendToBackCommand (String name, DrawingView view) {
    }

    public boolean isExecutable (); <<<
    <<<

}

>>>
public class SendToBackCommand extends AbstractCommand {
    >>>

    protected boolean isExecutableWithView ();
    public SendToBackCommand (String name, DrawingEditor newDrawingEditor) {
    }

    >>>
    >>>

}

package CH.ifa.draw.standard;

<<<
package org.jhotdraw.standard;

>>>
package CH.ifa.draw.util;

<<<
package org.jhotdraw.util;

>>>
package CH.ifa.draw.util.collections.jdk11;

<<<
package org.jhotdraw.util.collections.jdk11;

>>>
package CH.ifa.draw.contrib;

<<<
package org.jhotdraw.contrib;

>>>
package CH.ifa.draw.standard;

<<<
package org.jhotdraw.standard;

>>>
<<<
final public class SingleFigureEnumerator implements FigureEnumeration {
    <<<

    public Object nextElement (); <<<

    public boolean hasMoreElements ();
}

>>>
final public class SingleFigureEnumerator implements FigureEnumeration {
    >>>
    >>>

    public boolean hasNextFigure ();
}

<<<
final public class SingleFigureEnumerator implements FigureEnumeration {
    <<<
    <<<
    <<<

}

>>>
final public class SingleFigureEnumerator implements FigureEnumeration {
    >>>
    >>>
    >>>

    public void reset ();
}

package CH.ifa.draw.standard;

<<<
package org.jhotdraw.standard;

>>>
package CH.ifa.draw.contrib;

<<<
package org.jhotdraw.contrib;

>>>
package CH.ifa.draw.contrib;

<<<
package org.jhotdraw.contrib;

>>>
<<<
public class SplitPaneDrawApplication extends DrawApplication {

    protected JComponent createContents (DrawingView view);
    protected JSplitPane createSplitPane (DrawingView view); <<<
    <<<

    protected void createLeftComponent (DrawingView view);
    protected void createRightComponent (DrawingView view); <<<
    <<<
    <<<
    <<<

}

>>>
public class SplitPaneDrawApplication extends DrawApplication {

    protected JComponent createContents (StandardDrawingView view);
    protected JSplitPane createSplitPane (StandardDrawingView view); >>>
    >>>

    protected void createLeftComponent (StandardDrawingView view);
    protected void createRightComponent (StandardDrawingView view); >>>
    >>>
    >>>
    >>>

}

<<<
public class SplitPaneDrawApplication extends DrawApplication {

    protected JComponent createContents (StandardDrawingView view);
    protected JSplitPane createSplitPane (StandardDrawingView view); <<<
    <<<

    protected void createLeftComponent (StandardDrawingView view);
    protected void createRightComponent (StandardDrawingView view); <<<
    <<<
    <<<
    <<<

}

>>>
public class SplitPaneDrawApplication extends DrawApplication {

    protected JComponent createContents (DrawingView view);
    protected JSplitPane createSplitPane (DrawingView view); >>>
    >>>

    protected void createLeftComponent (DrawingView view);
    protected void createRightComponent (DrawingView view); >>>
    >>>
    >>>
    >>>

}

<<<
public class SplitPaneDrawApplication extends DrawApplication {

    protected JComponent createContents (DrawingView view);
    protected JSplitPane createSplitPane (DrawingView view);
    final protected void setLeftComponent (JComponent newLeftComponent);
    final protected void setRightComponent (JComponent newRightComponent);
    protected void createLeftComponent (DrawingView view);
    protected void createRightComponent (DrawingView view);
    public JComponent getLeftComponent ();
    public JComponent getRightComponent (); <<<
    <<<

}

>>>
public class SplitPaneDrawApplication extends DrawApplication {

    protected Desktop createDesktop (); >>>
    >>>

}

<<<
public class StandardDisposableResourceHolder implements DisposableResourceHolder, Serializable {
    <<<
    <<<
    <<<

    public StandardDisposableResourceHolder (Object resource) {
        this.resource = resource;
        resetDelay ();
    }

    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public void setResource (Object resource); <<<

}

>>>
public class StandardDisposableResourceHolder implements DisposableResourceHolder, Serializable {
    >>>
    >>>
    >>>

    public StandardDisposableResourceHolder (Object newResource) {
        resource = newResource;
        resetDelay ();
    }

    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void setResource (Object newResource); >>>

}

package CH.ifa.draw.contrib.html;

<<<
package org.jhotdraw.contrib.html;

>>>
<<<
public class StandardDisposableResourceManager implements DisposableResourceManager {
    protected ResourceDisposabilityStrategy strategy;
    protected WeakHashMap resources;
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class StandardDisposableResourceManager implements DisposableResourceManager {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class StandardDisposableResourceManager implements DisposableResourceManager {
    <<<
    <<<

    public StandardDisposableResourceManager (ResourceDisposabilityStrategy strategy) {
    }

    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class StandardDisposableResourceManager implements DisposableResourceManager {
    >>>
    >>>

    public StandardDisposableResourceManager (ResourceDisposabilityStrategy newStrategy) {
    }

    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.contrib.html;

<<<
package org.jhotdraw.contrib.html;

>>>
<<<
public class StandardDrawing extends CompositeFigure implements Drawing {

    public Enumeration drawingChangeListeners (); <<<
    <<<
    <<<

    public Vector handles (); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class StandardDrawing extends CompositeFigure implements Drawing {

    public HandleEnumeration handles ();
    public Iterator drawingChangeListeners (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class StandardDrawing extends CompositeFigure implements Drawing {
    <<<
    <<<
    <<<
    <<<
    <<<

    public synchronized Figure remove (Figure figure); <<<
    <<<
    <<<
    <<<
    <<<

    public void figureRequestRemove (FigureChangeEvent e); <<<
    <<<
    <<<

}

>>>
public class StandardDrawing extends CompositeFigure implements Drawing {
    >>>
    >>>
    >>>
    >>>
    >>>

    public synchronized Figure add (Figure figure);
    public synchronized Figure orphan (Figure figure); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class StandardDrawing extends CompositeFigure implements Drawing {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class StandardDrawing extends CompositeFigure implements Drawing {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void fireDrawingTitleChanged (); >>>
    >>>

}

<<<
public class StandardDrawing extends CompositeFigure implements Drawing {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public void fireDrawingTitleChanged (); <<<
    <<<

}

>>>
public class StandardDrawing extends CompositeFigure implements Drawing {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class StandardDrawing extends CompositeFigure implements Drawing {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class StandardDrawing extends CompositeFigure implements Drawing {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void fireDrawingTitleChanged (); >>>
    >>>

}

package CH.ifa.draw.standard;

<<<
package org.jhotdraw.standard;

>>>
<<<
public class StandardDrawing extends CompositeFigure implements Drawing {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class StandardDrawing extends CompositeFigure implements Drawing {
    >>>
    >>>
    >>>

    public String getTitle (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void setTitle (String newTitle);
}

<<<
public class StandardDrawingView extends JPanel implements DrawingView, KeyListener, java.awt.dnd.Autoscroll {
    MouseListener ml = new MouseListener () {

        public void mouseClicked (MouseEvent e);
        public void mouseEntered (MouseEvent e);
        public void mouseExited (MouseEvent e); <<<
        <<<

    }

    ;
    MouseMotionListener mml = new MouseMotionListener () {
        <<<
        <<<

    }

    ;
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class StandardDrawingView extends JPanel implements DrawingView, java.awt.dnd.Autoscroll {
    >>>

    protected KeyListener createKeyListener ();
    protected MouseListener createMouseListener ();
    protected MouseMotionListener createMouseMotionListener ();
    protected Painter createDisplayUpdate (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    public class DrawingViewKeyListener implements KeyListener {
        >>>
        >>>

        public void keyReleased (KeyEvent event);
        public void keyTyped (KeyEvent event);
    }

    public class DrawingViewMouseListener extends MouseAdapter {
        >>>
        >>>

    }

    public class DrawingViewMouseMotionListener implements MouseMotionListener {
        >>>
        >>>

    }

    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class StandardDrawingView extends JPanel implements DrawingView, java.awt.dnd.Autoscroll {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class StandardDrawingView extends JPanel implements DrawingView, java.awt.dnd.Autoscroll {
    >>>

    protected Dimension getDrawingSize (); >>>
    >>>
    >>>
    >>>
    >>>

    protected Rectangle getDamage ();
    protected Vector getBackgrounds ();
    protected Vector getForegrounds ();
    protected void checkMinimumSize ();
    protected void drawPainters (Graphics g, Vector v); >>>

    protected void handleMouseEventException (Throwable t); >>>

    protected void setDamage (Rectangle r);
    protected void setLastClick (Point newLastClick); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class StandardDrawingView extends JPanel implements DrawingView, java.awt.dnd.Autoscroll {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    protected Vector getBackgrounds ();
    protected Vector getForegrounds (); <<<

    protected void drawPainters (Graphics g, Vector v); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public FigureEnumeration selectionElements (); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public Vector getConnectionFigures (Figure inFigure);
    public Vector selection ();
    public Vector selectionZOrdered ();
    public boolean figureExists (Figure inf, FigureEnumeration e); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public void addAll (Vector figures); <<<
    <<<
    <<<
    <<<
    <<<

    public void addToSelectionAll (Vector figures); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class StandardDrawingView extends JPanel implements DNDInterface, DrawingView, java.awt.dnd.Autoscroll {
    >>>

    protected DNDHelper createDNDHelper ();
    protected DNDHelper getDNDHelper (); >>>
    >>>

    protected List getBackgrounds ();
    protected List getForegrounds (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    protected void drawPainters (Graphics g, List v); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public FigureEnumeration getConnectionFigures (Figure inFigure); >>>

    public FigureEnumeration selection ();
    public FigureEnumeration selectionZOrdered (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public boolean figureExists (Figure inf, FigureEnumeration fe); >>>
    >>>
    >>>

    public boolean setDragSourceActive (boolean state);
    public boolean setDropTargetActive (boolean state); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void addAll (Collection figures); >>>
    >>>
    >>>
    >>>

    public void addToSelectionAll (Collection figures); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class StandardDrawingView extends JPanel implements DNDInterface, DrawingView, java.awt.dnd.Autoscroll {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    public class DrawingViewKeyListener implements KeyListener {
        <<<
        <<<
        <<<
        <<<

    }

    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class StandardDrawingView extends JPanel implements DNDInterface, DrawingView, java.awt.dnd.Autoscroll {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    public class DrawingViewKeyListener implements KeyListener {

        protected Command createDeleteCommand (); >>>

        public DrawingViewKeyListener () {
        }

        >>>
        >>>
        >>>

    }

    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class StandardDrawingView extends JPanel implements DNDInterface, DrawingView, java.awt.dnd.Autoscroll {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class StandardDrawingView extends JPanel implements DNDInterface, DrawingView, java.awt.dnd.Autoscroll {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public StandardDrawingView (Drawing drawing, DrawingEditor editor, int width, int height) {
    }

    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class StandardDrawingView extends JPanel implements DNDInterface, DrawingView, java.awt.dnd.Autoscroll {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class StandardDrawingView extends JPanel implements DNDInterface, DrawingView, java.awt.dnd.Autoscroll {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void drawingTitleChanged (DrawingChangeEvent e); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class StandardDrawingView extends JPanel implements DNDInterface, DrawingView, java.awt.dnd.Autoscroll {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public StandardDrawingView (Drawing drawing, DrawingEditor editor, int width, int height) {
    }

    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public void drawingTitleChanged (DrawingChangeEvent e); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class StandardDrawingView extends JPanel implements DNDInterface, DrawingView, java.awt.dnd.Autoscroll {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class StandardDrawingView extends JPanel implements DNDInterface, DrawingView, java.awt.dnd.Autoscroll {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class StandardDrawingView extends JPanel implements DNDInterface, DrawingView, java.awt.dnd.Autoscroll {
    >>>
    >>>
    >>>
    >>>

    protected HandleEnumeration selectionHandles (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void drawingTitleChanged (DrawingChangeEvent e); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class StandardDrawingView extends JPanel implements DNDInterface, DrawingView, java.awt.dnd.Autoscroll {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public Dimension getMinimumSize ();
    public Dimension getPreferredSize (); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class StandardDrawingView extends JPanel implements DNDInterface, DrawingView, java.awt.dnd.Autoscroll {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class StandardDrawingView extends JPanel implements DNDInterface, DrawingView, java.awt.dnd.Autoscroll {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public boolean setDragSourceActive (boolean state);
    public boolean setDropTargetActive (boolean state); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class StandardDrawingView extends JPanel implements DNDInterface, DrawingView, java.awt.dnd.Autoscroll {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public java.awt.dnd.DragSourceListener getDragSourceListener (); >>>
    >>>
    >>>
    >>>
    >>>

    public void DNDDeinitialize ();
    public void DNDInitialize (java.awt.dnd.DragGestureListener dgl); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class StandardDrawingView extends JPanel implements DNDInterface, DrawingView, java.awt.dnd.Autoscroll {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public java.awt.dnd.DragSourceListener getDragSourceListener (); <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public void DNDInitialize (java.awt.dnd.DragGestureListener dgl); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class StandardDrawingView extends JPanel implements DNDInterface, DrawingView, java.awt.dnd.Autoscroll {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public DragSourceListener getDragSourceListener (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void DNDInitialize (DragGestureListener dgl); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class StandardDrawingView extends JPanel implements DNDInterface, DrawingView, java.awt.dnd.Autoscroll {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class StandardDrawingView extends JPanel implements DNDInterface, DrawingView, java.awt.dnd.Autoscroll {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    protected boolean addToSelectionImpl (Figure figure); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class StandardDrawingView extends JPanel implements DNDInterface, DrawingView, java.awt.dnd.Autoscroll {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class StandardDrawingView extends JPanel implements DNDInterface, DrawingView, java.awt.dnd.Autoscroll {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void setCursor (Cursor cursor); >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class StandardDrawingView extends JPanel implements DNDInterface, DrawingView, java.awt.dnd.Autoscroll {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class StandardDrawingView extends JPanel implements DNDInterface, DrawingView, java.awt.dnd.Autoscroll {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public boolean getReadOnly (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void setReadOnly (boolean readOnly); >>>
    >>>

}

<<<
public class StandardDrawingView extends JPanel implements DNDInterface, DrawingView, java.awt.dnd.Autoscroll {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class StandardDrawingView extends JPanel implements DNDInterface, DrawingView, java.awt.dnd.Autoscroll {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public Dimension getMinimumSize (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class StandardDrawingView extends JPanel implements DNDInterface, DrawingView, java.awt.dnd.Autoscroll {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public boolean getReadOnly (); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public void setReadOnly (boolean readOnly); <<<
    <<<

}

>>>
public class StandardDrawingView extends JPanel implements DNDInterface, DrawingView, java.awt.dnd.Autoscroll {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public boolean isReadOnly (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void setReadOnly (boolean newIsReadOnly); >>>
    >>>

}

package CH.ifa.draw.standard;

<<<
package org.jhotdraw.standard;

>>>
<<<
public class StandardDrawingView extends JPanel implements DNDInterface, DrawingView, java.awt.dnd.Autoscroll {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class StandardDrawingView extends JPanel implements DNDInterface, DrawingView, java.awt.dnd.Autoscroll {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public Point getToolTipLocation (MouseEvent event); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void clearToolTip (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void setToolTipFigure (Figure f);
    public void setToolTipLocation (Point p); >>>
    >>>

}

<<<
public class StandardDrawingView extends Panel implements DrawingView, KeyListener, MouseListener, MouseMotionListener {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class StandardDrawingView extends JPanel implements DrawingView, KeyListener, MouseListener, MouseMotionListener {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class StandardDrawingView extends JPanel implements DrawingView, KeyListener, MouseListener, MouseMotionListener {
    <<<
    <<<

    protected void selectionChanged (); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public void paint (Graphics g); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public void update (Graphics g);
}

>>>
public class StandardDrawingView extends JPanel implements DrawingView, KeyListener, MouseListener, MouseMotionListener {
    >>>

    protected void fireSelectionChanged (); >>>

    protected void paintComponent (Graphics g); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public Painter getDisplayUpdate (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void addFigureSelectionListener (FigureSelectionListener fsl); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void removeFigureSelectionListener (FigureSelectionListener fsl); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class StandardDrawingView extends JPanel implements DrawingView, KeyListener, MouseListener, MouseMotionListener {
    <<<

    protected void fireSelectionChanged (); <<<

    protected void paintComponent (Graphics g); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public Painter getDisplayUpdate (); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public void addFigureSelectionListener (FigureSelectionListener fsl); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public void removeFigureSelectionListener (FigureSelectionListener fsl); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class StandardDrawingView extends JPanel implements DrawingView, KeyListener, MouseListener, MouseMotionListener {
    >>>
    >>>

    protected void selectionChanged (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void paint (Graphics g); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void update (Graphics g);
}

<<<
public class StandardDrawingView extends JPanel implements DrawingView, KeyListener, MouseListener, MouseMotionListener {
    <<<
    <<<

    protected void selectionChanged (); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public void paint (Graphics g); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public void update (Graphics g);
}

>>>
public class StandardDrawingView extends JPanel implements DrawingView, KeyListener, MouseListener, MouseMotionListener {
    >>>

    protected boolean doDragScroll ();
    protected void fireSelectionChanged (); >>>

    protected void paintComponent (Graphics g);
    protected void scrollToVisible (Rectangle r, boolean bSizeChange);
    protected void setUndoManager (UndoManager newUndoManager); >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public FigureEnumeration insertFigures (FigureEnumeration fe, int dx, int dy, boolean bCheck); >>>
    >>>
    >>>

    public Painter getDisplayUpdate (); >>>
    >>>

    public StandardDrawingView (DrawingEditor editor) {
    }

    >>>
    >>>

    public UndoManager getUndoManager ();
    public Vector getConnectionFigures (Figure inFigure); >>>
    >>>

    public boolean figureExists (Figure inf, FigureEnumeration e);
    public boolean isFigureSelected (Figure checkFigure); >>>
    >>>
    final public static int MINIMUM_HEIGHT = 300;
    final public static int MINIMUM_WIDTH = 400;
    final public static int SCROLL_INCR = 100;
    final public static int SCROLL_OFFSET = 10;
    >>>
    >>>
    >>>

    public void addFigureSelectionListener (FigureSelectionListener fsl); >>>
    >>>

    public void addToSelectionAll (FigureEnumeration fe); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void removeFigureSelectionListener (FigureSelectionListener fsl); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class StandardDrawingView extends JPanel implements DrawingView, KeyListener, MouseListener, MouseMotionListener {
    <<<

    protected boolean doDragScroll (); <<<
    <<<
    <<<

    protected void scrollToVisible (Rectangle r, boolean bSizeChange);
    protected void setUndoManager (UndoManager newUndoManager); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public UndoManager getUndoManager (); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class StandardDrawingView extends JPanel implements DrawingView, KeyListener, java.awt.dnd.Autoscroll {
    MouseListener ml = new MouseListener () {
        >>>
        >>>
        >>>
        >>>
        >>>

    }

    ;
    MouseMotionListener mml = new MouseMotionListener () {
        >>>
        >>>

    }

    ;
    class ASH extends AutoscrollHelper {

        public ASH (int margin) {
        }

        public Dimension getSize ();
        public Rectangle getVisibleRect ();
        public void scrollRectToVisible (Rectangle aRect);
    }

    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public Insets getAutoscrollInsets (); >>>
    >>>
    >>>
    >>>
    >>>

    public String toString (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public boolean isInteractive ();
    public int getDefaultDNDActions (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void autoscroll (java.awt.Point p); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class StandardFigureSelection implements FigureSelection, Serializable {
    <<<

    public StandardFigureSelection (FigureEnumeration figures, int figureCount) {
    }

    <<<
    <<<
    <<<

}

>>>
public class StandardFigureSelection implements FigureSelection, Serializable {
    >>>

    public StandardFigureSelection (FigureEnumeration fe, int figureCount) {
    }

    >>>
    >>>
    >>>

}

package CH.ifa.draw.standard;

public class StandardFigureSelection implements FigureSelection, Serializable {
    <<<
    <<<
    <<<
    final public static String TYPE = "CH.ifa.draw.Figures";
    <<<

}

package org.jhotdraw.standard;

public class StandardFigureSelection implements FigureSelection, Serializable {
    >>>
    >>>
    >>>
    final public static String TYPE = "org.jhotdraw.Figures";
    >>>

}

<<<
public class StandardLayouter implements Layouter {
    <<<
    <<<
    <<<
    <<<
    <<<

    public StandardLayouter (Layoutable newLayoutable) {
        setInsets (new Insets (0, 0, 0, 0));
        setLayoutable (newLayoutable);
    }

    <<<
    <<<
    <<<
    <<<

}

>>>
public class StandardLayouter implements Layouter {
    >>>
    >>>

    public Layouter create (Layoutable newLayoutable); >>>
    >>>
    >>>

    public StandardLayouter (Layoutable newLayoutable) {
    }

    >>>
    >>>
    >>>
    >>>

}

<<<
public class StandardLayouter implements Layouter {

    public Insets getInsets ();
    public Layoutable getLayoutable (); <<<
    <<<
    <<<
    <<<
    <<<

    public void read (StorableInput dr) throws IOException;
    public void setInsets (Insets newInsets);
    public void setLayoutable (Layoutable newLayoutable);
    public void write (StorableOutput dw);
}

>>>
public class StandardLayouter extends SimpleLayouter {
    >>>
    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.contrib;

<<<
package org.jhotdraw.contrib;

>>>
<<<
public class StandardStorageFormat implements StorageFormat {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class StandardStorageFormat implements StorageFormat {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public boolean isRestoreFormat ();
    public boolean isStoreFormat (); >>>
    >>>
    >>>

}

package CH.ifa.draw.util;

<<<
package org.jhotdraw.util;

>>>
package CH.ifa.draw.util;

<<<
package org.jhotdraw.util;

>>>
package CH.ifa.draw.util;

<<<
package org.jhotdraw.util;

>>>
package CH.ifa.draw.util;

<<<
package org.jhotdraw.util;

>>>
<<<
public class StorableInput extends Object {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class StorableInput {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class StorableInput {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class StorableInput {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public long readLong () throws IOException;
}

<<<
public class StorableOutput extends Object {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class StorableOutput extends Object {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void writeLong (long l); >>>
    >>>

}

package CH.ifa.draw.util;

<<<
package org.jhotdraw.util;

>>>
<<<
public interface StorageFormat {

    public Drawing restore (String fileName) throws IOException;
    public FileFilter getFileFilter ();
    public String store (String fileName, Drawing saveDrawing) throws IOException;
}

>>>
interface StorageFormat {

}

<<<
interface StorageFormat {

}

>>>
public interface StorageFormat {

    public Drawing restore (String fileName) throws IOException;
    public FileFilter getFileFilter ();
    public String store (String fileName, Drawing saveDrawing) throws IOException;
    public boolean isRestoreFormat ();
    public boolean isStoreFormat ();
}

package CH.ifa.draw.util;

<<<
package org.jhotdraw.util;

>>>
<<<
public class StorageFormatManager {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class StorageFormatManager {

    public StorageFormat findStorageFormat (File file); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.util;

<<<
package org.jhotdraw.util;

>>>
<<<
public class SVGStorageFormat extends StandardStorageFormat {
    <<<
    <<<
    <<<
    <<<

}

>>>
public class SVGStorageFormat extends StandardStorageFormat {
    >>>
    >>>
    >>>
    >>>

    public boolean isRestoreFormat ();
    public boolean isStoreFormat ();
}

package CH.ifa.draw.contrib;

<<<
package org.jhotdraw.contrib;

>>>
package CH.ifa.draw.contrib;

<<<
package org.jhotdraw.contrib;

>>>
<<<
public class TextAreaFigure extends AttributeFigure implements FigureChangeListener, TextHolder {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class TextAreaFigure extends AttributeFigure implements FigureChangeListener, TextHolder {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public TextHolder getTextHolder (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class TextAreaFigure extends AttributeFigure implements FigureChangeListener, TextHolder {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    protected Vector fParagraphs = new Vector ();
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public Vector handles (); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class TextAreaFigure extends AttributeFigure implements FigureChangeListener, TextHolder {
    >>>
    >>>
    >>>
    protected List fParagraphs;
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public HandleEnumeration handles (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class TextAreaFigure extends AttributeFigure implements FigureChangeListener, TextHolder {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class TextAreaFigure extends AttributeFigure implements FigureChangeListener, TextHolder {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public Figure getRepresentingFigure (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.contrib;

<<<
package org.jhotdraw.contrib;

>>>
<<<
public class TextFigure extends AttributeFigure implements FigureChangeListener, TextHolder {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class TextFigure extends AttributeFigure implements FigureChangeListener, TextHolder {
    >>>

    protected OffsetLocator getLocator (); >>>
    >>>

    protected void setLocator (OffsetLocator newLocator);
    protected void setObservedFigure (Figure newObservedFigure); >>>

    public Figure getObservedFigure ();
    public Figure getRepresentingFigure (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.figures;

<<<
package org.jhotdraw.figures;

>>>
<<<
public class TextFigure extends AttributeFigure implements FigureChangeListener, TextHolder {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public void disconnect (); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class TextFigure extends AttributeFigure implements FigureChangeListener, TextHolder {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void disconnect (Figure disconnectFigure); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class TextFigure extends AttributeFigure implements FigureChangeListener, TextHolder {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class TextFigure extends AttributeFigure implements FigureChangeListener, TextHolder {

    protected Dimension textExtent (); >>>

    protected void markDirty (); >>>
    >>>

    public Object getAttribute (FigureAttributeConstant attributeConstant); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void setAttribute (FigureAttributeConstant attributeConstant, Object value); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class TextFigure extends AttributeFigure implements FigureChangeListener, TextHolder {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public Vector handles (); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class TextFigure extends AttributeFigure implements FigureChangeListener, TextHolder {
    >>>
    >>>
    >>>
    >>>
    >>>

    public HandleEnumeration handles (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class TextFigure extends AttributeFigure implements FigureChangeListener, TextHolder {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class TextFigure extends AttributeFigure implements FigureChangeListener, TextHolder {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public TextHolder getTextHolder (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public interface TextHolder {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public interface TextHolder {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void disconnect (Figure disconnectFigure); >>>

}

<<<
public interface TextHolder {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public interface TextHolder {

    public Figure getRepresentingFigure (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.standard;

<<<
package org.jhotdraw.standard;

>>>
<<<
public class TextHolderContentProducer extends AbstractContentProducer implements Serializable {
    <<<
    <<<

    public TextHolderContentProducer (TextHolder figure) {
        fFigure = figure;
    }

    <<<
    <<<

}

>>>
public class TextHolderContentProducer extends AbstractContentProducer implements Serializable {

    protected TextHolder getTextHolder (); >>>
    >>>

    public TextHolderContentProducer (TextHolder figure) {
        setTextHolder (figure);
    }

    >>>

    public void setTextHolder (TextHolder newFigure); >>>

}

package CH.ifa.draw.contrib.html;

<<<
package org.jhotdraw.contrib.html;

>>>
package CH.ifa.draw.figures;

<<<
package org.jhotdraw.figures;

>>>
<<<
public class TextTool extends CreationTool {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class TextTool extends CreationTool {
    >>>

    protected Undoable createUndoActivity (); >>>
    >>>
    >>>
    >>>
    >>>
    public static class UndoActivity extends UndoableAdapter {

        protected boolean isValidText (String toBeChecked);
        protected void setText (String newText);
        public String getBackupText ();
        public String getOriginalText ();
        public UndoActivity (DrawingView newDrawingView, String newOriginalText) {
        }

        public boolean redo ();
        public boolean undo ();
        public void setBackupText (String newBackupText);
        public void setOriginalText (String newOriginalText);
    }

    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class TextTool extends CreationTool {
    <<<
    <<<
    <<<
    <<<
    <<<

    public TextTool (DrawingView view, Figure prototype) {
    }

    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class TextTool extends CreationTool {
    >>>
    >>>
    >>>
    >>>
    >>>

    public TextTool (DrawingEditor newDrawingEditor, Figure prototype) {
    }

    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class TextTool extends CreationTool {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public boolean isActivated (); <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class TextTool extends CreationTool {

    protected FloatingTextField getFloatingTextField (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public boolean isActive (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class TextTool extends CreationTool {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class TextTool extends CreationTool {

    protected Figure getSelectedFigure (); >>>
    >>>

    protected Undoable createDeleteUndoActivity ();
    protected Undoable createPasteUndoActivity (); >>>

    protected boolean isDeleteTextFigure (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.standard;

<<<
package org.jhotdraw.standard;

>>>
<<<
public class ToggleGridCommand extends Command {
    <<<
    <<<

}

>>>
public class ToggleGridCommand extends AbstractCommand {
    >>>
    >>>

}

<<<
public class ToggleGridCommand extends AbstractCommand {
    <<<
    <<<

}

>>>
public class ToggleGridCommand extends Command {
    >>>
    >>>

}

<<<
public class ToggleGridCommand extends Command {
    <<<
    <<<

}

>>>
public class ToggleGridCommand extends AbstractCommand {
    >>>
    >>>

}

<<<
public class ToggleGridCommand extends AbstractCommand {

    public ToggleGridCommand (String name, DrawingView view, Point grid) {
    }

    <<<

}

>>>
public class ToggleGridCommand extends AbstractCommand {

    public ToggleGridCommand (String name, DrawingEditor newDrawingEditor, Point grid) {
    }

    >>>

}

<<<
public interface Tool {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public interface Tool {

    public DrawingView view ();
    public Undoable getUndoActivity (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void setUndoActivity (Undoable newUndoableActivity);
}

<<<
public interface Tool {

    public DrawingView view (); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public interface Tool {

    public DrawingEditor editor (); >>>

    public boolean isUsable (); >>>

    public void addToolListener (ToolListener newToolListener); >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void removeToolListener (ToolListener oldToolListener); >>>

}

<<<
public interface Tool {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public interface Tool {
    >>>
    >>>

    public boolean isActive ();
    public boolean isEnabled (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void setEnabled (boolean enableUsableCheck); >>>

    public void setUsable (boolean newIsUsable);
}

package CH.ifa.draw.framework;

<<<
package org.jhotdraw.framework;

>>>
package CH.ifa.draw.standard;

<<<
package org.jhotdraw.standard;

>>>
<<<
public class ToolButton extends PaletteButton {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class ToolButton extends PaletteButton implements ToolListener {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void toolActivated (EventObject toolEvent);
    public void toolDeactivated (EventObject toolEvent);
    public void toolUnusable (EventObject toolEvent);
    public void toolUsable (EventObject toolEvent);
}

<<<
public class ToolButton extends PaletteButton implements ToolListener {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class ToolButton extends PaletteButton implements ToolListener {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void toolDisabled (EventObject toolEvent);
    public void toolEnabled (EventObject toolEvent); >>>
    >>>

}

<<<
public class ToolButton extends PaletteButton implements ToolListener {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class ToolButton extends PaletteButton implements ToolListener {

    protected PaletteIcon getPaletteIcon (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public interface ToolListener extends EventListener {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public interface ToolListener {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.framework;

<<<
package org.jhotdraw.framework;

>>>
<<<
public class TriangleFigure extends RectangleFigure {
    protected int fRotation = 0;
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class TriangleFigure extends RectangleFigure {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class TriangleFigure extends RectangleFigure {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public Vector handles (); <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class TriangleFigure extends RectangleFigure {

    public HandleEnumeration handles (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.contrib;

<<<
package org.jhotdraw.contrib;

>>>
package CH.ifa.draw.contrib.html;

<<<
package org.jhotdraw.contrib.html;

>>>
<<<
class TriangleRotationHandle extends AbstractHandle {

    protected Undoable createUndoActivity (); <<<
    <<<
    public static class UndoActivity extends UndoableAdapter {
        <<<
        <<<

        public UndoActivity () {
        }

        <<<
        <<<
        <<<

    }

    <<<
    <<<
    <<<
    <<<

}

>>>
class TriangleRotationHandle extends AbstractHandle {

    protected Undoable createUndoActivity (DrawingView newView); >>>
    >>>
    public static class UndoActivity extends UndoableAdapter {
        >>>
        >>>

        public UndoActivity (DrawingView newView) {
        }

        >>>
        >>>
        >>>

    }

    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.contrib;

<<<
package org.jhotdraw.contrib;

>>>
package CH.ifa.draw.util;

<<<
package org.jhotdraw.util;

>>>
<<<
public class UndoableAdapter implements Undoable {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class UndoableAdapter implements Undoable {
    >>>
    >>>
    >>>
    >>>
    >>>

    public FigureEnumeration getAffectedFiguresReversed (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.util;

<<<
package org.jhotdraw.util;

>>>
package CH.ifa.draw.util;

<<<
package org.jhotdraw.util;

>>>
<<<
public class UndoableHandle implements Handle {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class UndoableHandle implements Handle {
    >>>
    >>>
    >>>

    public Cursor getCursor (); >>>
    >>>
    >>>
    >>>
    >>>

    public UndoableHandle (Handle newWrappedHandle) {
    }

    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.util;

<<<
package org.jhotdraw.util;

>>>
<<<
public class UndoableTool implements Tool, ToolListener {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class UndoableTool implements Tool, ToolListener {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public boolean isActive ();
    public boolean isEnabled (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void setEnabled (boolean newIsEnabled); >>>

    public void setUsable (boolean newIsUsable); >>>
    >>>

    public void toolDisabled (EventObject toolEvent);
    public void toolEnabled (EventObject toolEvent); >>>
    >>>

}

<<<
public class UndoableTool implements Tool, ToolListener {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class UndoableTool implements Tool, ToolListener {
    >>>
    >>>
    >>>
    >>>
    >>>

    public DrawingView getActiveView (); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.util;

<<<
package org.jhotdraw.util;

>>>
package CH.ifa.draw.util;

<<<
package org.jhotdraw.util;

>>>
<<<
public class UndoManager {
    <<<
    <<<

    protected void clearStack (Vector clearStack); <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class UndoManager {
    >>>
    >>>

    protected void clearStack (List clearStack); >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class UndoManager {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class UndoManager {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void clearRedos (DrawingView checkDV); >>>

    public void clearUndos (DrawingView checkDV); >>>
    >>>

}

package CH.ifa.draw.util;

<<<
package org.jhotdraw.util;

>>>
package CH.ifa.draw.util;

<<<
package org.jhotdraw.util;

>>>
package CH.ifa.draw.figures;

<<<
package org.jhotdraw.figures;

>>>
<<<
public class UngroupCommand extends Command {
    <<<
    <<<
    <<<

}

>>>
public class UngroupCommand extends AbstractCommand {
    >>>
    >>>
    >>>

}

<<<
public class UngroupCommand extends AbstractCommand {
    <<<
    <<<
    <<<

}

>>>
public class UngroupCommand extends Command {
    >>>
    >>>
    >>>

}

<<<
public class UngroupCommand extends Command {
    <<<
    <<<
    <<<

}

>>>
public class UngroupCommand extends AbstractCommand {

    protected Undoable createUndoActivity (); >>>
    >>>
    public static class UndoActivity extends UndoableAdapter {

        protected void ungroupFigures ();
        public UndoActivity (DrawingView newDrawingView) {
        }

        public boolean redo ();
        public boolean undo ();
    }

    >>>

}

<<<
public class UngroupCommand extends AbstractCommand {
    <<<

    public UngroupCommand (String name, DrawingView view) {
    }

    public boolean isExecutable (); <<<
    <<<

}

>>>
public class UngroupCommand extends AbstractCommand {
    >>>

    public UngroupCommand (String name, DrawingEditor newDrawingEditor) {
    }

    public boolean isExecutableWithView (); >>>
    >>>

}

<<<
public class URLContentProducer extends FigureDataContentProducer implements Serializable {
    protected URL fURL = null;
    <<<
    <<<

    public URLContentProducer (URL url) {
        fURL = url;
    }

    <<<
    <<<

}

>>>
public class URLContentProducer extends FigureDataContentProducer implements Serializable {

    protected void setURL (URL newURL); >>>

    public URL getURL (); >>>

    public URLContentProducer (URL url) {
        setURL (url);
    }

    >>>
    >>>

}

package CH.ifa.draw.contrib.html;

<<<
package org.jhotdraw.contrib.html;

>>>
package CH.ifa.draw.samples.javadraw;

<<<
package org.jhotdraw.samples.javadraw;

>>>
<<<
public class URLTool extends AbstractTool {
    <<<
    <<<
    <<<

    public void endAction (ActionEvent e); <<<
    <<<

}

>>>
public class URLTool extends AbstractTool {
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class URLTool extends AbstractTool {
    <<<

    public URLTool (DrawingView view) {
    }

    <<<
    <<<
    <<<

}

>>>
public class URLTool extends AbstractTool {
    >>>

    public URLTool (DrawingEditor newDrawingEditor) {
    }

    >>>
    >>>
    >>>

}

package CH.ifa.draw.util;

<<<
package org.jhotdraw.util;

>>>
package CH.ifa.draw.util;

public class VersionManagement {
    <<<
    public static Package [] packages = {Package.getPackage ("CH.ifa.draw.applet"), Package.getPackage ("CH.ifa.draw.application"), Package.getPackage ("CH.ifa.draw.contrib"), Package.getPackage ("CH.ifa.draw.figures"), Package.getPackage ("CH.ifa.draw.framework"), Package.getPackage ("CH.ifa.draw.standard"), Package.getPackage ("CH.ifa.draw.util")};
    public static String JHOTDRAW_COMPONENT = "CH.ifa.draw/";
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

package org.jhotdraw.util;

public class VersionManagement {
    >>>
    public static Package [] packages = {Package.getPackage ("org.jhotdraw.applet"), Package.getPackage ("org.jhotdraw.application"), Package.getPackage ("org.jhotdraw.contrib"), Package.getPackage ("org.jhotdraw.figures"), Package.getPackage ("org.jhotdraw.framework"), Package.getPackage ("org.jhotdraw.standard"), Package.getPackage ("org.jhotdraw.util")};
    public static String JHOTDRAW_COMPONENT = "org.jhotdraw/";
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.util;

<<<
package org.jhotdraw.util;

>>>
<<<
public interface ViewChangeListener extends EventListener {
    <<<
    <<<
    <<<

}

>>>
public interface ViewChangeListener {
    >>>
    >>>
    >>>

}

<<<
public interface ViewChangeListener {
    <<<
    <<<
    <<<

}

>>>
public interface ViewChangeListener extends EventListener {
    >>>
    >>>
    >>>

}

package CH.ifa.draw.framework;

<<<
package org.jhotdraw.framework;

>>>
<<<
public class WindowMenu extends CommandMenu {
    <<<
    <<<

    public WindowMenu (String newText, MDIDesktopPane desktop, DrawingEditor editor) {
    }

}

>>>
public class WindowMenu extends CommandMenu {
    >>>
    >>>

    public WindowMenu (String newText, MDIDesktopPane newDesktop, DrawingEditor newEditor) {
    }

}

<<<
public class WindowMenu extends CommandMenu {
    class ChildMenuItem extends JCheckBoxMenuItem {

        public ChildMenuItem (JInternalFrame frame) {
        }

        <<<

    }

    <<<
    <<<

}

>>>
public class WindowMenu extends CommandMenu {
    class ChildMenuItem extends JCheckBoxMenuItem {

        public ChildMenuItem (JInternalFrame newFrame) {
        }

        >>>

    }

    >>>
    >>>

}

package CH.ifa.draw.contrib;

<<<
package org.jhotdraw.contrib;

>>>
package CH.ifa.draw.contrib.zoom;

<<<
package org.jhotdraw.contrib.zoom;

>>>
<<<
public class ZoomCommand extends AbstractCommand {
    <<<
    <<<

    public ZoomCommand (String name, float scale, DrawingEditor newDrawingEditor) {
    }

    <<<
    <<<
    <<<
    <<<

}

>>>
public class ZoomCommand extends AbstractCommand {
    >>>
    >>>

    public ZoomCommand (String newSame, float newScale, DrawingEditor newDrawingEditor) {
    }

    >>>
    >>>
    >>>
    >>>

}

package CH.ifa.draw.contrib.zoom;

<<<
package org.jhotdraw.contrib.zoom;

>>>
package CH.ifa.draw.contrib.zoom;

<<<
package org.jhotdraw.contrib.zoom;

>>>
<<<
public class ZoomDrawingView extends StandardDrawingView {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class ZoomDrawingView extends StandardDrawingView {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public ZoomDrawingView (Drawing drawing, DrawingEditor editor) {
    }

    public ZoomDrawingView (Drawing drawing, DrawingEditor editor, int width, int height) {
    }

    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class ZoomDrawingView extends StandardDrawingView {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public ZoomDrawingView (Drawing drawing, DrawingEditor editor) {
    }

    public ZoomDrawingView (Drawing drawing, DrawingEditor editor, int width, int height) {
    }

    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

}

>>>
public class ZoomDrawingView extends StandardDrawingView {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

}

<<<
public class ZoomDrawingView extends StandardDrawingView {
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<
    <<<

    public void zoom (float scale); <<<
    <<<
    <<<

}

>>>
public class ZoomDrawingView extends StandardDrawingView {
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>
    >>>

    public void zoom (float newScale); >>>
    >>>
    >>>

}

package CH.ifa.draw.contrib.zoom;

<<<
package org.jhotdraw.contrib.zoom;

>>>
package CH.ifa.draw.contrib.zoom;

<<<
package org.jhotdraw.contrib.zoom;

>>>
