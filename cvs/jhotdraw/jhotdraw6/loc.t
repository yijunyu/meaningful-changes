package CH.ifa.draw.standard;
package org.jhotdraw.standard;
abstract public class AbstractCommand implements Command, FigureSelectionListener {
    public AbstractCommand (String newName, DrawingView newView) {
    }
}
abstract public class AbstractCommand implements Command, FigureSelectionListener, ViewChangeListener {
    protected AbstractCommand.EventDispatcher getEventDispatcher ();
    protected boolean isExecutableWithView ();
    protected void checkExecutable ();
    public AbstractCommand (String newName, DrawingEditor newDrawingEditor) {
    }
    public AbstractCommand (String newName, DrawingEditor newDrawingEditor, boolean newIsViewRequired) {
    }
    public AbstractCommand.EventDispatcher createEventDispatcher ();
    public static class EventDispatcher {
        public EventDispatcher (Command newObservedCommand) {
        }
        public void addCommandListener (CommandListener newCommandListener);
        public void fireCommandExecutableEvent ();
        public void fireCommandExecutedEvent ();
        public void fireCommandNotExecutableEvent ();
        public void removeCommandListener (CommandListener oldCommandListener);
    }
    public void viewCreated (DrawingView view);
    public void viewDestroying (DrawingView view);
    public void viewSelectionChanged (DrawingView oldView, DrawingView newView);
}
abstract public class AbstractCommand implements Command, FigureSelectionListener, ViewChangeListener {
}
abstract public class AbstractCommand implements Command, FigureSelectionListener, ViewChangeListener {
}
abstract public class AbstractCommand implements Command, FigureSelectionListener, ViewChangeListener {
}
abstract public class AbstractCommand implements Command, FigureSelectionListener {
    final private ViewChangeListener myViewChangeListener = new ViewChangeListener () {
    }
    ;
    protected void viewCreated (DrawingView view);
    protected void viewDestroying (DrawingView view);
}
abstract public class AbstractCommand implements Command, FigureSelectionListener {
    final private ViewChangeListener myViewChangeListener = new ViewChangeListener () {
        public void viewCreated (DrawingView view);
        public void viewDestroying (DrawingView view);
        public void viewSelectionChanged (DrawingView oldView, DrawingView newView);
    }
    ;
}
abstract public class AbstractCommand implements Command, FigureSelectionListener {
}
abstract public class AbstractConnector implements Connector {
}
abstract public class AbstractConnector implements Connector {
}
package CH.ifa.draw.standard;
package org.jhotdraw.standard;
abstract public class AbstractConnector implements Connector {
}
abstract public class AbstractConnector implements Connector {
    protected Figure fOwner;
}
package CH.ifa.draw.contrib.html;
package org.jhotdraw.contrib.html;
abstract public class AbstractFigure implements Figure {
}
abstract public class AbstractFigure implements Figure {
    public synchronized FigureChangeListener listener ();
    public synchronized FigureEnumeration getDependendFigures ();
    public synchronized void addDependendFigure (Figure newDependendFigure);
    public synchronized void addFigureChangeListener (FigureChangeListener l);
    public synchronized void removeDependendFigure (Figure oldDependendFigure);
}
abstract public class AbstractFigure implements Figure {
}
abstract public class AbstractFigure implements Figure {
}
package CH.ifa.draw.standard;
package org.jhotdraw.standard;
abstract public class AbstractFigure implements Figure {
}
abstract public class AbstractFigure implements Figure {
}
abstract public class AbstractFigure implements Figure {
}
abstract public class AbstractFigure implements Figure {
}
abstract public class AbstractHandle implements Handle {
}
abstract public class AbstractHandle implements Handle {
    public void setUndoActivity (Undoable newUndoableActivity);
}
abstract public class AbstractHandle implements Handle {
}
abstract public class AbstractHandle implements Handle {
}
abstract public class AbstractHandle implements Handle {
}
abstract public class AbstractHandle implements Handle {
}
package CH.ifa.draw.standard;
package org.jhotdraw.standard;
abstract public class AbstractLineDecoration implements LineDecoration {
}
abstract public class AbstractLineDecoration implements LineDecoration {
}
package CH.ifa.draw.figures;
package org.jhotdraw.figures;
package CH.ifa.draw.standard;
package org.jhotdraw.standard;
abstract public class AbstractLocator implements Cloneable, Locator, Storable {
}
abstract public class AbstractLocator implements Locator {
}
abstract public class AbstractLocator implements Locator {
}
abstract public class AbstractLocator implements Cloneable, Locator, Storable {
}
abstract public class AbstractTool implements Tool, ViewChangeListener {
}
abstract public class AbstractTool implements Tool, ViewChangeListener {
    protected void setEditor (DrawingEditor newDrawingEditor);
}
abstract public class AbstractTool implements Tool, ViewChangeListener {
}
abstract public class AbstractTool implements Tool {
    final private ViewChangeListener myViewChangeListener = new ViewChangeListener () {
    }
    ;
    protected void viewCreated (DrawingView view);
    protected void viewDestroying (DrawingView view);
}
abstract public class AbstractTool implements Tool {
    final private ViewChangeListener myViewChangeListener = new ViewChangeListener () {
        public void viewCreated (DrawingView view);
        public void viewDestroying (DrawingView view);
        public void viewSelectionChanged (DrawingView oldView, DrawingView newView);
    }
    ;
}
abstract public class AbstractTool implements Tool {
}
package CH.ifa.draw.standard;
package org.jhotdraw.standard;
public class AbstractTool implements Tool {
}
abstract public class AbstractTool implements Tool {
}
abstract public class AbstractTool implements Tool {
}
public class AbstractTool implements Tool {
}
public class AbstractTool implements Tool {
}
abstract public class AbstractTool implements Tool {
    public void setUndoActivity (Undoable newUndoActivity);
}
abstract public class AbstractTool implements Tool {
    protected DrawingView fView;
    public AbstractTool (DrawingView itsView) {
    }
}
abstract public class AbstractTool implements Tool, ViewChangeListener {
    protected void checkUsable ();
    public AbstractTool (DrawingEditor newDrawingEditor) {
    }
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
    public void viewCreated (DrawingView view);
    public void viewDestroying (DrawingView view);
    public void viewSelectionChanged (DrawingView oldView, DrawingView newView);
}
abstract public class AbstractTool implements Tool, ViewChangeListener {
    public static class EventDispatcher {
    }
}
abstract public class AbstractTool implements Tool, ViewChangeListener {
    public static class EventDispatcher {
        public void fireToolDisabledEvent ();
    }
}
abstract public class AbstractTool implements Tool, ViewChangeListener {
    protected int fAnchorX, fAnchorY;
}
abstract public class AbstractTool implements Tool, ViewChangeListener {
    protected int getAnchorX ();
    protected void setAnchorX (int newAnchorX);
}
abstract public class ActionTool extends AbstractTool {
    public ActionTool (DrawingView itsView) {
    }
}
abstract public class ActionTool extends AbstractTool {
    public ActionTool (DrawingEditor newDrawingEditor) {
    }
}
package CH.ifa.draw.standard;
package org.jhotdraw.standard;
public class AlignCommand extends Command {
}
public class AlignCommand extends AbstractCommand {
}
public class AlignCommand extends AbstractCommand {
}
public class AlignCommand extends Command {
}
public class AlignCommand extends Command {
    public AlignCommand (String name, DrawingView view, int op) {
    }
    final public static int BOTTOMS = 5;
    final public static int CENTERS = 1;
    final public static int LEFTS = 0;
    final public static int MIDDLES = 4;
    final public static int RIGHTS = 2;
    final public static int TOPS = 3;
}
public class AlignCommand extends AbstractCommand {
    protected Undoable createUndoActivity ();
    protected void setAlignment (Alignment newAlignment);
    public AlignCommand (Alignment newAlignment, DrawingView view) {
    }
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
}
public class AlignCommand extends AbstractCommand {
    public AlignCommand (Alignment newAlignment, DrawingView view) {
    }
}
public class AlignCommand extends AbstractCommand {
    public AlignCommand (Alignment newAlignment, DrawingEditor newDrawingEditor) {
    }
}
package CH.ifa.draw.standard;
package org.jhotdraw.standard;
package CH.ifa.draw.util;
package org.jhotdraw.util;
public class AnimationDecorator extends DecoratorFigure {
}
public class AnimationDecorator extends DecoratorFigure implements Animatable {
}
package CH.ifa.draw.samples.javadraw;
package org.jhotdraw.samples.javadraw;
package CH.ifa.draw.samples.javadraw;
package org.jhotdraw.samples.javadraw;
package CH.ifa.draw.contrib.zoom;
package org.jhotdraw.contrib.zoom;
package CH.ifa.draw.figures;
package org.jhotdraw.figures;
package CH.ifa.draw.contrib.html;
package org.jhotdraw.contrib.html;
abstract public class AttributeFigure extends AbstractFigure {
}
abstract public class AttributeFigure extends AbstractFigure {
    public static Object initDefaultAttribute (String name, Object value);
}
package CH.ifa.draw.figures;
package org.jhotdraw.figures;
package CH.ifa.draw.contrib.html;
package org.jhotdraw.contrib.html;
package CH.ifa.draw.contrib;
package org.jhotdraw.contrib;
package CH.ifa.draw.standard;
public class AWTCursor extends Cursor implements CH.ifa.draw.framework.Cursor {
}
package org.jhotdraw.standard;
public class AWTCursor extends Cursor implements org.jhotdraw.framework.Cursor {
}
package CH.ifa.draw.figures;
package org.jhotdraw.figures;
public class BorderTool extends ActionTool {
}
public class BorderTool extends ActionTool {
    public static class UndoActivity extends UndoableAdapter {
        public UndoActivity (DrawingView newDrawingView) {
        }
        public boolean redo ();
        public boolean replaceAffectedFigures ();
        public boolean undo ();
    }
}
public class BorderTool extends ActionTool {
    public BorderTool (DrawingView view) {
    }
}
public class BorderTool extends ActionTool {
    public BorderTool (DrawingEditor editor) {
    }
}
public class BorderTool extends ActionTool {
}
public class BorderTool extends ActionTool {
    public void mouseDown (MouseEvent e, int x, int y);
    public void reverseAction (Figure figure);
}
package CH.ifa.draw.figures;
package org.jhotdraw.figures;
public class BouncingDrawing extends StandardDrawing implements Animatable {
}
public class BouncingDrawing extends StandardDrawing implements Animatable {
}
package CH.ifa.draw.samples.javadraw;
package org.jhotdraw.samples.javadraw;
package CH.ifa.draw.util;
package org.jhotdraw.util;
class NorthEastHandle extends LocatorHandle {
}
class EastHandle extends LocatorHandle {
}
class NorthHandle extends LocatorHandle {
}
class NorthWestHandle extends LocatorHandle {
}
class SouthEastHandle extends LocatorHandle {
}
class SouthHandle extends LocatorHandle {
}
class SouthWestHandle extends LocatorHandle {
}
class WestHandle extends LocatorHandle {
}
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
}
class EastHandle extends ResizeHandle {
}
class NorthHandle extends ResizeHandle {
}
class NorthWestHandle extends ResizeHandle {
}
class SouthEastHandle extends ResizeHandle {
}
class SouthHandle extends ResizeHandle {
}
class SouthWestHandle extends ResizeHandle {
}
class WestHandle extends ResizeHandle {
}
class ResizeHandle extends LocatorHandle {
    protected Undoable createUndoActivity (); public static class UndoActivity extends UndoableAdapter {
        public UndoActivity () {
        }
    }
}
class ResizeHandle extends LocatorHandle {
    protected Undoable createUndoActivity (DrawingView view); public static class UndoActivity extends UndoableAdapter {
        public UndoActivity (DrawingView newView) {
        }
    }
}
public class BoxHandleKit {
    public static void addCornerHandles (Figure f, Vector handles);
    public static void addHandles (Figure f, Vector handles);
}
public class BoxHandleKit {
    public static void addCornerHandles (Figure f, List handles);
    public static void addHandles (Figure f, List handles);
}
package CH.ifa.draw.standard;
package org.jhotdraw.standard;
package CH.ifa.draw.standard;
package org.jhotdraw.standard;
public class BringToFrontCommand extends Command {
}
public class BringToFrontCommand extends AbstractCommand {
}
public class BringToFrontCommand extends AbstractCommand {
}
public class BringToFrontCommand extends Command {
}
public class BringToFrontCommand extends Command {
}
public class BringToFrontCommand extends AbstractCommand {
    public static class UndoActivity extends SendToBackCommand.UndoActivity {
        protected void sendToCommand (Figure f);
        public UndoActivity (DrawingView newDrawingView) {
        }
    }
}
public class BringToFrontCommand extends AbstractCommand {
    public BringToFrontCommand (String name, DrawingView view) {
    }
}
public class BringToFrontCommand extends AbstractCommand {
    public BringToFrontCommand (String name, DrawingEditor newDrawingEditor) {
    }
}
package CH.ifa.draw.standard;
package org.jhotdraw.standard;
public class ChangeAttributeCommand extends AbstractCommand {
    public ChangeAttributeCommand (String name, String attributeName, Object value, DrawingEditor newDrawingEditor) {
    }
    public static class UndoActivity extends UndoableAdapter {
        public String getAttributeName ();
        public UndoActivity (DrawingView newDrawingView, String newUndoAttribute, Object newUndoValue) {
        }
    }
}
public class ChangeAttributeCommand extends AbstractCommand {
    public ChangeAttributeCommand (String name, FigureAttributeConstant attribute, Object value, DrawingEditor newDrawingEditor) {
    }
    public static class UndoActivity extends UndoableAdapter {
        public UndoActivity (DrawingView newDrawingView, FigureAttributeConstant newUndoAttribute, Object newUndoValue) {
        }
    }
}
package CH.ifa.draw.standard;
package org.jhotdraw.standard;
public class ChangeAttributeCommand extends Command {
}
public class ChangeAttributeCommand extends AbstractCommand {
}
public class ChangeAttributeCommand extends AbstractCommand {
}
public class ChangeAttributeCommand extends Command {
}
public class ChangeAttributeCommand extends Command {
}
public class ChangeAttributeCommand extends AbstractCommand {
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
}
public class ChangeAttributeCommand extends AbstractCommand {
    public ChangeAttributeCommand (String name, String attributeName, Object value, DrawingView view) {
    }
}
public class ChangeAttributeCommand extends AbstractCommand {
    public ChangeAttributeCommand (String name, String attributeName, Object value, DrawingEditor newDrawingEditor) {
    }
}
package CH.ifa.draw.standard;
package org.jhotdraw.standard;
public class ChangeConnectionEndHandle extends ChangeConnectionHandle {
}
public class ChangeConnectionEndHandle extends ChangeConnectionHandle {
    public void draw (java.awt.Graphics g);
}
public class ChangeConnectionEndHandle extends ChangeConnectionHandle {
}
public class ChangeConnectionEndHandle extends ChangeConnectionHandle {
    public static class UndoActivity extends ChangeConnectionHandle.UndoActivity {
        protected Connector replaceConnector (ConnectionFigure connection);
        public UndoActivity () {
        }
    }
}
public class ChangeConnectionEndHandle extends ChangeConnectionHandle {
    public static class UndoActivity extends ChangeConnectionHandle.UndoActivity {
        public UndoActivity () {
        }
    }
}
public class ChangeConnectionEndHandle extends ChangeConnectionHandle {
    public static class UndoActivity extends ChangeConnectionHandle.UndoActivity {
        public UndoActivity (DrawingView newView) {
        }
    }
}
public class ChangeConnectionEndHandle extends ChangeConnectionHandle {
}
public class ChangeConnectionEndHandle extends ChangeConnectionHandle {
}
public class ChangeConnectionEndHandle extends ChangeConnectionHandle {
    public ChangeConnectionEndHandle (Figure owner) {
    }
}
public class ChangeConnectionEndHandle extends ChangeConnectionHandle {
    public ChangeConnectionEndHandle (ConnectionFigure owner) {
    }
}
package CH.ifa.draw.standard;
package org.jhotdraw.standard;
abstract public class ChangeConnectionHandle extends AbstractHandle {
    protected ConnectionFigure fConnection;
    protected Connector fOriginalTarget;
    protected Figure fTarget;
    protected Point fStart;
}
abstract public class ChangeConnectionHandle extends AbstractHandle {
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
}
abstract public class ChangeConnectionHandle extends AbstractHandle {
    protected void setTarget (Figure newTarget); abstract public static class UndoActivity extends UndoableAdapter {
        public UndoActivity () {
        }
    }
}
abstract public class ChangeConnectionHandle extends AbstractHandle {
    protected void setTargetFigure (Figure newTarget); abstract public static class UndoActivity extends UndoableAdapter {
        public UndoActivity (DrawingView newView) {
        }
    }
}
abstract public class ChangeConnectionHandle extends AbstractHandle {
}
abstract public class ChangeConnectionHandle extends AbstractHandle {
}
abstract public class ChangeConnectionHandle extends AbstractHandle {
    protected ChangeConnectionHandle (Figure owner) {
    }
}
abstract public class ChangeConnectionHandle extends AbstractHandle {
    protected ChangeConnectionHandle (ConnectionFigure owner) {
    }
}
package CH.ifa.draw.standard;
package org.jhotdraw.standard;
public class ChangeConnectionStartHandle extends ChangeConnectionHandle {
}
public class ChangeConnectionStartHandle extends ChangeConnectionHandle {
    public static class UndoActivity extends ChangeConnectionHandle.UndoActivity {
        protected Connector replaceConnector (ConnectionFigure connection);
        public UndoActivity () {
        }
    }
}
public class ChangeConnectionStartHandle extends ChangeConnectionHandle {
    public static class UndoActivity extends ChangeConnectionHandle.UndoActivity {
        public UndoActivity () {
        }
    }
}
public class ChangeConnectionStartHandle extends ChangeConnectionHandle {
    public static class UndoActivity extends ChangeConnectionHandle.UndoActivity {
        public UndoActivity (DrawingView newView) {
        }
    }
}
public class ChangeConnectionStartHandle extends ChangeConnectionHandle {
}
public class ChangeConnectionStartHandle extends ChangeConnectionHandle {
}
public class ChangeConnectionStartHandle extends ChangeConnectionHandle {
    public ChangeConnectionStartHandle (Figure owner) {
    }
}
public class ChangeConnectionStartHandle extends ChangeConnectionHandle {
    public ChangeConnectionStartHandle (ConnectionFigure owner) {
    }
}
package CH.ifa.draw.standard;
package org.jhotdraw.standard;
package CH.ifa.draw.contrib;
package org.jhotdraw.contrib;
package CH.ifa.draw.figures;
package org.jhotdraw.figures;
package CH.ifa.draw.contrib;
package org.jhotdraw.contrib;
package CH.ifa.draw.util;
package org.jhotdraw.util;
package CH.ifa.draw.contrib;
package org.jhotdraw.contrib;
package CH.ifa.draw.util;
package org.jhotdraw.util;
package CH.ifa.draw.util.collections.jdk11;
package org.jhotdraw.util.collections.jdk11;
package CH.ifa.draw.util.collections.jdk12;
package org.jhotdraw.util.collections.jdk12;
public class ColorContentProducer extends FigureDataContentProducer implements Serializable {
    public ColorContentProducer (Color color) {
        fColor = color;
    }
}
public class ColorContentProducer extends FigureDataContentProducer implements Serializable {
    public ColorContentProducer (Color color) {
        setColor (color);
    }
}
package CH.ifa.draw.contrib.html;
package org.jhotdraw.contrib.html;
public class ColorMap extends Object {
}
public class ColorMap {
}
package CH.ifa.draw.util;
package org.jhotdraw.util;
abstract public class Command {
    public Command (String name) {
    }
}
public interface Command {
    public void execute ();
}
public interface Command {
    public void execute ();
}
abstract public class Command {
    public Command (String name) {
    }
}
abstract public class Command {
    public Command (String name) {
    }
}
public interface Command {
    public void execute ();
    public void setUndoActivity (Undoable newUndoableActivity);
}
public interface Command {
}
public interface Command {
}
package CH.ifa.draw.util;
package org.jhotdraw.util;
package CH.ifa.draw.util;
package org.jhotdraw.util;
package CH.ifa.draw.contrib;
package org.jhotdraw.contrib;
package CH.ifa.draw.util;
package org.jhotdraw.util;
package CH.ifa.draw.contrib;
package org.jhotdraw.contrib;
package CH.ifa.draw.util;
package org.jhotdraw.util;
public class CommandMenu extends JMenu implements ActionListener {
}
public class CommandMenu extends JMenu implements ActionListener {
}
public class CommandMenu extends JMenu implements ActionListener {
}
public class CommandMenu extends JMenu implements ActionListener, CommandListener {
    public void commandExecutable (EventObject commandEvent);
    public void commandExecuted (EventObject commandEvent);
    public void commandNotExecutable (EventObject commandEvent);
}
package CH.ifa.draw.util;
package org.jhotdraw.util;
public class CommandMenuItem extends JMenuItem implements CommandHolder {
}
public class CommandMenuItem extends JMenuItem implements ActionListener, CommandHolder {
}
package CH.ifa.draw.contrib;
package org.jhotdraw.contrib;
public class ComponentFigure extends AttributeFigure {
    public ComponentFigure (Component newComponent, DrawingEditor newDrawingEditor) {
    }
}
public class ComponentFigure extends AttributeFigure {
    public ComponentFigure (Component newComponent) {
    }
}
package CH.ifa.draw.contrib;
package org.jhotdraw.contrib;
abstract public class CompositeFigure extends AbstractFigure implements FigureChangeListener {
}
abstract public class CompositeFigure extends AbstractFigure implements FigureChangeListener {
}
package CH.ifa.draw.standard;
package org.jhotdraw.standard;
abstract public class CompositeFigure extends AbstractFigure implements FigureChangeListener {
    protected int _nHighestZ = 0;
    protected int _nLowestZ = 0;
}
abstract public class CompositeFigure extends AbstractFigure implements FigureChangeListener {
    protected int _nHighestZ;
    protected int _nLowestZ;
}
abstract public class CompositeFigure extends AbstractFigure implements FigureChangeListener {
}
abstract public class CompositeFigure extends AbstractFigure implements FigureChangeListener {
}
abstract public class CompositeFigure extends AbstractFigure implements FigureChangeListener {
}
abstract public class CompositeFigure extends AbstractFigure implements FigureChangeListener {
}
abstract public class CompositeFigure extends AbstractFigure implements FigureChangeListener {
    protected Vector fFigures;
}
abstract public class CompositeFigure extends AbstractFigure implements FigureChangeListener {
    protected List fFigures;
}
public class CompositeFigureCreationTool extends CreationTool {
    public void mouseUp (MouseEvent e, int x, int y);
}
public class CompositeFigureCreationTool extends CreationTool {
}
package CH.ifa.draw.contrib;
package org.jhotdraw.contrib;
public class ConnectedTextTool extends TextTool {
}
public class ConnectedTextTool extends TextTool {
    public static class UndoActivity extends TextTool.UndoActivity {
        public Figure getConnectedFigure ();
        public UndoActivity (DrawingView newDrawingView, String newOriginalText) {
        }
        public boolean redo ();
        public boolean undo ();
        public void setConnectedFigure (Figure newConnectedFigure);
    }
}
public class ConnectedTextTool extends TextTool {
    public ConnectedTextTool (DrawingView view, Figure prototype) {
    }
}
public class ConnectedTextTool extends TextTool {
    public ConnectedTextTool (DrawingEditor editor, Figure prototype) {
    }
}
public class ConnectedTextTool extends TextTool {
}
public class ConnectedTextTool extends TextTool {
    protected void endEdit ();
}
public class ConnectedTextTool extends TextTool {
}
public class ConnectedTextTool extends TextTool {
    public static class DeleteUndoActivity extends DeleteCommand.UndoActivity {
        public DeleteUndoActivity (FigureTransferCommand cmd, Figure newConnectedFigure) {
        }
        public boolean redo ();
        public boolean undo ();
        public void setConnectedFigure (Figure newConnectedFigure);
    }
}
package CH.ifa.draw.figures;
package org.jhotdraw.figures;
public interface ConnectionFigure extends Figure, FigureChangeListener {
    public Connector end ();
}
public interface ConnectionFigure extends Figure, FigureChangeListener {
    public Connector getEndConnector ();
    public Connector getStartConnector ();
    public Figure endFigure ();
}
package CH.ifa.draw.framework;
package org.jhotdraw.framework;
public class ConnectionHandle extends LocatorHandle {
}
public class ConnectionHandle extends LocatorHandle {
}
public class ConnectionHandle extends LocatorHandle {
}
public class ConnectionHandle extends LocatorHandle {
}
public class ConnectionHandle extends LocatorHandle {
}
public class ConnectionHandle extends LocatorHandle {
}
package CH.ifa.draw.standard;
package org.jhotdraw.standard;
public class ConnectionTool extends AbstractTool {
}
public class ConnectionTool extends AbstractTool {
    protected Figure getAddedFigure ();
    protected Figure getTarget ();
    public static class UndoActivity extends UndoableAdapter {
        protected ConnectionFigure getConnection ();
        public UndoActivity (DrawingView newDrawingView, ConnectionFigure newConnection) {
        }
        public boolean redo ();
        public boolean undo ();
    }
}
public class ConnectionTool extends AbstractTool {
    public ConnectionTool (DrawingView view, ConnectionFigure prototype) {
    }
}
public class ConnectionTool extends AbstractTool {
    public ConnectionTool (DrawingEditor newDrawingEditor, ConnectionFigure newPrototype) {
    }
}
public class ConnectionTool extends AbstractTool {
    public static class UndoActivity extends UndoableAdapter {
    }
}
public class ConnectionTool extends AbstractTool {
    protected void setAddedFigure (Figure newAddedFigure);
    protected void setConnection (ConnectionFigure newConnection);
    protected void setEndConnector (Connector newEndConnector);
    protected void setStartConnector (Connector newStartConnector);
    protected void setTargetConnector (Connector newTargetConnector);
    public static class UndoActivity extends UndoableAdapter {
    }
}
package CH.ifa.draw.standard;
package org.jhotdraw.standard;
public interface Connector extends Serializable, Storable {
}
public interface Connector extends Serializable, Storable {
    public void connectorVisibility (boolean isVisible, ConnectionFigure courtingConnection);
}
package CH.ifa.draw.framework;
package org.jhotdraw.framework;
public interface Connector extends Serializable, Storable {
}
public interface Connector extends Serializable, Storable {
}
package CH.ifa.draw.contrib.html;
package org.jhotdraw.contrib.html;
package CH.ifa.draw.contrib.html;
package org.jhotdraw.contrib.html;
public class ContentProducerRegistry implements Serializable, Storable {
    protected Hashtable fContentProducers = new Hashtable ();
    protected static ContentProducerRegistry fDefaultRegistry = new ContentProducerRegistry (null);
    protected transient ContentProducerRegistry fParent = null;
}
public class ContentProducerRegistry implements Serializable, Storable {
}
package CH.ifa.draw.contrib.html;
package org.jhotdraw.contrib.html;
package CH.ifa.draw.standard;
package org.jhotdraw.standard;
public class CopyCommand extends FigureTransferCommand {
    public CopyCommand (String name, DrawingView view) {
    }
}
public class CopyCommand extends FigureTransferCommand {
    protected boolean isExecutableWithView ();
    public CopyCommand (String name, DrawingEditor newDrawingEditor) {
    }
}
public class CreationTool extends AbstractTool {
}
public class CreationTool extends AbstractTool {
}
public class CreationTool extends AbstractTool {
}
public class CreationTool extends AbstractTool {
}
package CH.ifa.draw.standard;
package org.jhotdraw.standard;
public class CreationTool extends AbstractTool {
}
public class CreationTool extends AbstractTool {
    protected Figure getAddedFigure ();
    protected Figure getCreatedFigure ();
}
public class CreationTool extends AbstractTool {
    protected CreationTool (DrawingView view) {
    }
    public CreationTool (DrawingView view, Figure prototype) {
    }
}
public class CreationTool extends AbstractTool {
    protected CreationTool (DrawingEditor newDrawingEditor) {
    }
    public CreationTool (DrawingEditor newDrawingEditor, Figure prototype) {
    }
}
public class CreationTool extends AbstractTool {
}
public class CreationTool extends AbstractTool {
}
public class CreationTool extends AbstractTool {
}
public class CreationTool extends AbstractTool {
    protected void setAddedFigure (Figure newAddedFigure);
    protected void setAnchorPoint (Point newAnchorPoint);
}
package CH.ifa.draw.contrib;
package org.jhotdraw.contrib;
public class CTXWindowMenu extends CTXCommandMenu {
}
public class CTXWindowMenu extends CTXCommandMenu {
    void buildChildMenus ();
}
public class CTXWindowMenu extends CTXCommandMenu {
    class ChildMenuItem extends JCheckBoxMenuItem {
        public ChildMenuItem (JInternalFrame frame) {
        }
    }
}
public class CTXWindowMenu extends CTXCommandMenu {
    class ChildMenuItem extends JCheckBoxMenuItem {
        public ChildMenuItem (JInternalFrame newFrame) {
        }
    }
}
package CH.ifa.draw.contrib;
package org.jhotdraw.contrib;
public class CustomSelectionTool extends SelectionTool {
}
public class CustomSelectionTool extends SelectionTool {
    protected FigureAttributeConstant popupMenuAttribute;
}
public class CustomSelectionTool extends SelectionTool {
    protected FigureAttributeConstant popupMenuAttribute;
}
public class CustomSelectionTool extends SelectionTool {
}
package CH.ifa.draw.contrib;
package org.jhotdraw.contrib;
public class CustomSelectionTool extends SelectionTool {
    public CustomSelectionTool (DrawingView view) {
    }
}
public class CustomSelectionTool extends SelectionTool {
    public CustomSelectionTool (DrawingEditor editor) {
    }
}
package CH.ifa.draw.contrib;
package org.jhotdraw.contrib;
public class CutCommand extends FigureTransferCommand {
    public static class UndoActivity extends UndoableAdapter {
    }
}
public class CutCommand extends FigureTransferCommand {
    public static class UndoActivity extends UndoableAdapter {
        protected void rememberSelectedFigures (FigureEnumeration toBeRemembered);
        public int getSelectedFiguresCount ();
        public void release ();
        public void setSelectedFigures (FigureEnumeration newSelectedFigures);
    }
}
package CH.ifa.draw.standard;
package org.jhotdraw.standard;
public class CutCommand extends FigureTransferCommand {
}
public class CutCommand extends FigureTransferCommand {
    public static class UndoActivity extends UndoableAdapter {
        public UndoActivity (FigureTransferCommand newCommand) {
        }
        public boolean redo ();
        public boolean undo ();
    }
}
public class CutCommand extends FigureTransferCommand {
    public CutCommand (String name, DrawingView view) {
    }
}
public class CutCommand extends FigureTransferCommand {
    public CutCommand (String name, DrawingEditor newDrawingEditor) {
    }
}
package CH.ifa.draw.standard;
package org.jhotdraw.standard;
abstract public class DecoratorFigure extends AbstractFigure implements FigureChangeListener {
    protected Figure fComponent;
}
abstract public class DecoratorFigure extends AbstractFigure implements FigureChangeListener {
}
abstract public class DecoratorFigure extends AbstractFigure implements FigureChangeListener {
}
abstract public class DecoratorFigure extends AbstractFigure implements FigureChangeListener {
}
abstract public class DecoratorFigure extends AbstractFigure implements FigureChangeListener {
}
abstract public class DecoratorFigure extends AbstractFigure implements FigureChangeListener {
}
abstract public class DecoratorFigure extends AbstractFigure implements FigureChangeListener {
}
abstract public class DecoratorFigure extends AbstractFigure implements FigureChangeListener {
}
abstract public class DecoratorFigure extends AbstractFigure implements FigureChangeListener {
}
abstract public class DecoratorFigure extends AbstractFigure implements FigureChangeListener {
    public synchronized FigureEnumeration getDependendFigures ();
    public synchronized void addDependendFigure (Figure newDependendFigure);
}
package CH.ifa.draw.standard;
package org.jhotdraw.standard;
public class DeleteCommand extends FigureTransferCommand {
}
public class DeleteCommand extends FigureTransferCommand {
    public static class UndoActivity extends UndoableAdapter {
        public UndoActivity (FigureTransferCommand newCommand) {
        }
        public boolean redo ();
        public boolean undo ();
    }
}
public class DeleteCommand extends FigureTransferCommand {
    public DeleteCommand (String name, DrawingView view) {
    }
}
public class DeleteCommand extends FigureTransferCommand {
    protected boolean isExecutableWithView ();
    public DeleteCommand (String name, DrawingEditor newDrawingEditor) {
    }
}
package CH.ifa.draw.contrib;
package org.jhotdraw.contrib;
public class DesktopEvent extends EventObject {
    public DesktopEvent (Desktop source, DrawingView newDrawingView) {
    }
    public DesktopEvent (Desktop source, DrawingView newDrawingView, DrawingView newPreviousDV) {
    }
}
public class DesktopEvent extends EventObject {
    public DesktopEvent (Desktop newSource, DrawingView newDrawingView) {
    }
    public DesktopEvent (Desktop newSource, DrawingView newDrawingView, DrawingView newPreviousDV) {
    }
}
package CH.ifa.draw.contrib;
package org.jhotdraw.contrib;
public class DesktopEventService {
}
public class DesktopEventService {
}
public class DesktopEventService {
}
public class DesktopEventService {
    protected void fireDrawingViewSelectedEvent (final DrawingView oldView, final DrawingView newView);
}
package CH.ifa.draw.contrib;
package org.jhotdraw.contrib;
public interface DesktopListener extends EventListener {
    public void drawingViewSelected (DrawingView oldView, DesktopEvent dpe);
}
public interface DesktopListener extends EventListener {
    public void drawingViewSelected (DesktopEvent dpe);
}
public interface DesktopListener extends EventListener {
}
public interface DesktopListener {
}
package CH.ifa.draw.contrib;
package org.jhotdraw.contrib;
public class DiamondFigure extends RectangleFigure {
}
public class DiamondFigure extends RectangleFigure {
}
package CH.ifa.draw.contrib;
package org.jhotdraw.contrib;
package CH.ifa.draw.contrib.html;
package org.jhotdraw.contrib.html;
package CH.ifa.draw.contrib.html;
package org.jhotdraw.contrib.html;
package CH.ifa.draw.contrib.html;
package org.jhotdraw.contrib.html;
package CH.ifa.draw.contrib.html;
package org.jhotdraw.contrib.html;
public class DNDFigures implements java.io.Serializable {
    public DNDFigures (FigureEnumeration fe, Point origin) {
    }
}
public class DNDFigures implements java.io.Serializable {
    public DNDFigures (FigureEnumeration fe, Point newOrigin) {
    }
}
package CH.ifa.draw.contrib.dnd;
package org.jhotdraw.contrib.dnd;
package CH.ifa.draw.contrib.dnd;
package org.jhotdraw.contrib.dnd;
abstract public class DNDHelper implements DragGestureListener, DragSourceListener, DropTargetListener {
    abstract protected DrawingView view (); protected Boolean autoscrollState;
    protected DragGestureRecognizer dgr;
    protected DropTarget dt;
    protected boolean createDragGestureRecognizer ();
    protected boolean createDropTarget ();
    protected boolean supportDropTargetDragEvent (DropTargetDragEvent dtde);
    protected void destroyDropTarget ();
    public boolean setDragSourceActive (boolean state);
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
    protected void setDragGestureListener (DragGestureListener dragGestureListener);
    protected void setDragGestureRecognizer (DragGestureRecognizer dragGestureRecognizer);
    protected void setDragSourceListener (DragSourceListener dragSourceListener);
    protected void setDropTarget (DropTarget dropTarget);
    protected void setDropTargetListener (DropTargetListener dropTargetListener);
    public DNDHelper (boolean isDragSource, boolean isDropTarget) {
    }
    public void deinitialize ();
    public void initialize (DragGestureListener dgl);
}
abstract public class DNDHelper {
    abstract protected CH.ifa.draw.framework.DrawingEditor editor ();
}
abstract public class DNDHelper {
    abstract protected DrawingEditor editor ();
}
abstract public class DNDHelper {
    public DNDHelper (boolean isDragSource, boolean isDropTarget) {
    }
}
abstract public class DNDHelper {
    public DNDHelper (boolean newIsDragSource, boolean newIsDropTarget) {
    }
}
package CH.ifa.draw.contrib.dnd;
package org.jhotdraw.contrib.dnd;
public interface DNDInterface {
    public boolean setDragSourceActive (boolean state);
    public boolean setDropTargetActive (boolean state);
}
public interface DNDInterface {
    public DragSourceListener getDragSourceListener ();
    public void DNDDeinitialize ();
    public void DNDInitialize (DragGestureListener dgl);
}
package CH.ifa.draw.contrib.dnd;
package org.jhotdraw.contrib.dnd;
public class DoubleBufferImage extends java.awt.Image {
    public DoubleBufferImage (Image real, double scale) {
    }
}
public class DoubleBufferImage extends java.awt.Image {
    public DoubleBufferImage (Image newReal, double newScale) {
    }
}
package CH.ifa.draw.contrib.zoom;
package org.jhotdraw.contrib.zoom;
public class DragNDropTool extends AbstractTool {
    public void mouseDown (MouseEvent e, int x, int y);
    public void mouseDrag (MouseEvent e, int x, int y);
    public void mouseMove (MouseEvent evt, int x, int y);
}
public class DragNDropTool extends CH.ifa.draw.standard.AbstractTool {
    protected boolean isDragOn ();
    public void mouseDown (java.awt.event.MouseEvent e, int x, int y);
    public void mouseDrag (java.awt.event.MouseEvent e, int x, int y);
    public void mouseMove (java.awt.event.MouseEvent e, int x, int y);
}
public class DragNDropTool extends CH.ifa.draw.standard.AbstractTool {
    public void viewCreated (DrawingView view);
    public void viewDestroying (DrawingView view);
}
public class DragNDropTool extends CH.ifa.draw.standard.AbstractTool {
    protected void viewCreated (DrawingView view);
}
public class DragNDropTool extends CH.ifa.draw.standard.AbstractTool {
    public void mouseDown (java.awt.event.MouseEvent e, int x, int y);
    public void mouseDrag (java.awt.event.MouseEvent e, int x, int y);
    public void mouseMove (java.awt.event.MouseEvent e, int x, int y);
    public void mouseUp (java.awt.event.MouseEvent e, int x, int y);
}
public class DragNDropTool extends AbstractTool {
    public void mouseDown (MouseEvent e, int x, int y);
    public void mouseDrag (MouseEvent e, int x, int y);
    public void mouseMove (MouseEvent evt, int x, int y);
    public void mouseUp (MouseEvent e, int x, int y);
}
public class DragNDropTool extends AbstractTool {
}
public class DragNDropTool extends AbstractTool {
}
package CH.ifa.draw.contrib.dnd;
package org.jhotdraw.contrib.dnd;
public class DragTracker extends AbstractTool {
}
public class DragTracker extends AbstractTool {
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
}
public class DragTracker extends AbstractTool {
    public DragTracker (DrawingView view, Figure anchor) {
    }
}
public class DragTracker extends AbstractTool {
    public DragTracker (DrawingEditor newDrawingEditor, Figure anchor) {
    }
}
public class DragTracker extends AbstractTool {
}
public class DragTracker extends AbstractTool {
    protected int getLastMouseX ();
    protected int getLastMouseY ();
    protected void setAnchorFigure (Figure newAnchorFigure);
    protected void setHasMoved (boolean newMoved);
    protected void setLastMouseX (int newLastMouseX);
    public Figure getAnchorFigure ();
}
package CH.ifa.draw.standard;
package org.jhotdraw.standard;
public class DrawApplet extends JApplet implements DrawingEditor, PaletteListener, VersionRequester {
}
public class DrawApplet extends JApplet implements DrawingEditor, PaletteListener, VersionRequester {
}
public class DrawApplet extends JApplet implements DrawingEditor, PaletteListener, VersionRequester {
}
public class DrawApplet extends JApplet implements DrawingEditor, PaletteListener, VersionRequester {
}
class SleeperThread extends Thread {
    public void run ();
}
package CH.ifa.draw.applet;
package org.jhotdraw.applet;
public class DrawApplet extends JApplet implements DrawingEditor, PaletteListener {
}
public class DrawApplet extends JApplet implements DrawingEditor, PaletteListener {
}
public class DrawApplet extends JApplet implements DrawingEditor, PaletteListener {
}
public class DrawApplet extends JApplet implements DrawingEditor, PaletteListener {
}
public class DrawApplet extends JApplet implements DrawingEditor, PaletteListener {
}
public class DrawApplet extends JApplet implements DrawingEditor, PaletteListener {
}
public class DrawApplet extends JApplet implements DrawingEditor, PaletteListener {
}
public class DrawApplet extends JApplet implements DrawingEditor, PaletteListener, VersionRequester {
    public void viewSelectionChanged (DrawingView oldView, DrawingView newView);
}
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener, VersionRequester {
}
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener, VersionRequester {
}
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener, VersionRequester {
}
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener, VersionRequester {
    protected Desktop createDesktop ();
    protected DesktopListener createDesktopListener ();
    protected Iconkit createIconkit ();
    protected void setDesktop (Desktop newDesktop);
}
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener, VersionRequester {
}
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener, VersionRequester {
}
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener, VersionRequester {
}
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener, VersionRequester {
}
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener, VersionRequester {
}
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener, VersionRequester {
}
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener, VersionRequester {
    public void newWindow (Drawing initialDrawing);
}
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener, VersionRequester {
}
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener, VersionRequester {
    protected static String fgUntitled = "untitled";
    public String getApplicationName ();
}
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener, VersionRequester {
}
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener, VersionRequester {
    final public void newWindow ();
}
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener, VersionRequester {
    protected static String fgUntitled = "untitled";
    public String getApplicationName ();
    public void newWindow (Drawing initialDrawing);
}
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener, VersionRequester {
}
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener, VersionRequester {
}
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener, VersionRequester {
}
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener, VersionRequester {
}
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener, VersionRequester {
}
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener, VersionRequester {
}
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener, VersionRequester {
}
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener, VersionRequester {
}
package CH.ifa.draw.application;
package org.jhotdraw.application;
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener, VersionRequester {
}
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener, VersionRequester {
}
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener {
}
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener {
    protected DrawingView createDrawingView ();
}
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener {
    protected DrawingView createDrawingView ();
}
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener {
}
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener {
}
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener {
    protected DrawingView createDrawingView ();
}
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener {
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
}
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener, VersionRequester {
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
    protected VersionControlStrategy getVersionControlStrategy ();
    final protected void setStorageFormatManager (StorageFormatManager storageFormatManager); protected static String fgUntitled = "untitled";
    protected static int winCount = 0;
    protected void fireViewCreatedEvent (DrawingView view);
    protected void fireViewDestroyingEvent (DrawingView view);
    protected void setUndoManager (UndoManager newUndoManager);
}
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener, VersionRequester {
}
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener, VersionRequester {
}
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener, VersionRequester {
    public void paletteUserOver (PaletteButton button, boolean inside);
}
public class DrawApplication extends JFrame implements DrawingEditor, PaletteListener, VersionRequester {
    public void paletteUserOver (PaletteButton paletteButton, boolean inside);
}
package CH.ifa.draw.framework;
package org.jhotdraw.framework;
public interface Drawing extends FigureChangeListener, Serializable, Storable {
}
public interface Drawing extends FigureChangeListener, Serializable, Storable {
    public boolean includes (Figure figure);
    public int getLayer (Figure figure);
    public void orphanAll (FigureEnumeration fe);
}
public interface Drawing extends FigureChangeListener, Serializable, Storable {
}
public interface Drawing extends FigureChangeListener, Serializable, Storable {
}
public interface Drawing extends FigureChangeListener, Serializable, Storable {
}
public interface Drawing extends FigureChangeListener, Serializable, Storable {
}
public interface Drawing extends FigureChangeListener, Serializable, Storable {
    public void figureInvalidated (FigureChangeEvent e);
    public void figureRequestRemove (FigureChangeEvent e);
}
public interface Drawing extends FigureChangeListener, Serializable, Storable {
}
public interface Drawing extends FigureChangeListener, Serializable, Storable {
}
public interface Drawing extends FigureChangeListener, Serializable, Storable {
}
public class DrawingChangeEvent extends EventObject {
    public DrawingChangeEvent (Drawing source, Rectangle r) {
    }
}
public class DrawingChangeEvent extends EventObject {
    public DrawingChangeEvent (Drawing newSource, Rectangle newRect) {
    }
}
package CH.ifa.draw.framework;
package org.jhotdraw.framework;
package CH.ifa.draw.framework;
package org.jhotdraw.framework;
public interface DrawingChangeListener extends EventListener {
}
public interface DrawingChangeListener extends EventListener {
    public void drawingTitleChanged (DrawingChangeEvent e);
}
public interface DrawingChangeListener extends EventListener {
    public void drawingTitleChanged (DrawingChangeEvent e);
}
public interface DrawingChangeListener extends EventListener {
}
public interface DrawingChangeListener extends EventListener {
}
public interface DrawingChangeListener extends EventListener {
    public void drawingTitleChanged (DrawingChangeEvent e);
}
public interface DrawingChangeListener extends EventListener {
}
public interface DrawingChangeListener {
}
package CH.ifa.draw.framework;
package org.jhotdraw.framework;
interface DrawingEditor {
}
public interface DrawingEditor extends FigureSelectionListener {
    public Drawing drawing ();
    public DrawingView view ();
    public Tool tool ();
    public void figureSelectionChanged (DrawingView view);
    public void showStatus (String string);
    public void toolDone ();
}
public interface DrawingEditor extends FigureSelectionListener {
    public Drawing drawing ();
    public DrawingView view ();
    public Tool tool ();
    public void figureSelectionChanged (DrawingView view);
    public void showStatus (String string);
    public void toolDone ();
}
interface DrawingEditor {
}
interface DrawingEditor {
}
public interface DrawingEditor extends FigureSelectionListener {
    public Drawing drawing ();
    public DrawingView view ();
    public Tool tool ();
    public void figureSelectionChanged (DrawingView view);
    public void showStatus (String string);
    public void toolDone ();
}
public interface DrawingEditor extends FigureSelectionListener {
}
public interface DrawingEditor extends FigureSelectionListener {
    public UndoManager getUndoManager ();
}
package CH.ifa.draw.framework;
package org.jhotdraw.framework;
public interface DrawingView extends DrawingChangeListener, ImageObserver {
}
public interface DrawingView extends DrawingChangeListener, ImageObserver {
}
public interface DrawingView extends DrawingChangeListener, ImageObserver {
}
public interface DrawingView extends DrawingChangeListener, ImageObserver {
}
public interface DrawingView extends DrawingChangeListener, ImageObserver {
}
public interface DrawingView extends DrawingChangeListener, ImageObserver {
    public UndoManager getUndoManager ();
}
public interface DrawingView extends DrawingChangeListener, ImageObserver {
}
public interface DrawingView extends DrawingChangeListener, ImageObserver {
}
public interface DrawingView extends DrawingChangeListener, ImageObserver {
    public Vector getConnectionFigures (Figure inFigure);
    public Vector selection ();
}
public interface DrawingView extends DrawingChangeListener, ImageObserver {
    public FigureEnumeration selection ();
}
public class DuplicateCommand extends FigureTransferCommand {
}
public class DuplicateCommand extends FigureTransferCommand {
}
public class DuplicateCommand extends FigureTransferCommand {
    public DuplicateCommand (String name, DrawingView view) {
    }
}
public class DuplicateCommand extends FigureTransferCommand {
    protected boolean isExecutableWithView ();
    public DuplicateCommand (String name, DrawingEditor newDrawingEditor) {
    }
}
package CH.ifa.draw.standard;
package org.jhotdraw.standard;
public class ElbowConnection extends LineConnection {
}
public class ElbowConnection extends LineConnection {
}
package CH.ifa.draw.figures;
package org.jhotdraw.figures;
package CH.ifa.draw.figures;
package org.jhotdraw.figures;
public class EllipseFigure extends AttributeFigure {
}
public class EllipseFigure extends AttributeFigure {
}
package CH.ifa.draw.figures;
package org.jhotdraw.figures;
package CH.ifa.draw.contrib.html;
package org.jhotdraw.contrib.html;
public class ETSLADisposalStrategy implements ResourceDisposabilityStrategy {
    public ETSLADisposalStrategy (DisposableResourceManager manager, long periodicity) {
        setManager (manager);
        setPeriodicity (periodicity);
        initDisposalThread ();
    }
}
public class ETSLADisposalStrategy implements ResourceDisposabilityStrategy {
    public ETSLADisposalStrategy (DisposableResourceManager newManager, long newPeriodicity) {
        setManager (newManager);
        setPeriodicity (newPeriodicity);
        initDisposalThread ();
    }
}
package CH.ifa.draw.contrib.html;
package org.jhotdraw.contrib.html;
package CH.ifa.draw.standard;
package org.jhotdraw.standard;
package CH.ifa.draw.framework;
package org.jhotdraw.framework;
public interface Figure extends Cloneable, Serializable, Storable {
}
public interface Figure extends Cloneable, Serializable, Storable {
    public static String POPUP_MENU = "POPUP_MENU";
}
public interface Figure extends Cloneable, Serializable, Storable {
}
public interface Figure extends Cloneable, Serializable, Storable {
}
public interface Figure extends Cloneable, Serializable, Storable {
}
public interface Figure extends Cloneable, Serializable, Storable {
}
public interface Figure extends Cloneable, Serializable, Storable {
}
public interface Figure extends Cloneable, Serializable, Storable {
}
public interface Figure extends Cloneable, Serializable, Storable {
}
public interface Figure extends Cloneable, Serializable, Storable {
}
public class FigureAttributeConstant implements Cloneable, Serializable {
}
public class FigureAttributeConstant implements Cloneable, Serializable {
    final public static FigureAttributeConstant BOTTOM_MARGIN = new FigureAttributeConstant (BOTTOM_MARGIN_STR, 14);
    final public static FigureAttributeConstant LEFT_MARGIN = new FigureAttributeConstant (LEFT_MARGIN_STR, 15);
    final public static FigureAttributeConstant LOCATION = new FigureAttributeConstant (LOCATION_STR, 9);
    final public static FigureAttributeConstant POPUP_MENU = new FigureAttributeConstant (POPUP_MENU_STR, 16);
    final public static FigureAttributeConstant RIGHT_MARGIN = new FigureAttributeConstant (RIGHT_MARGIN_STR, 13);
    final public static FigureAttributeConstant TOP_MARGIN = new FigureAttributeConstant (TOP_MARGIN_STR, 12);
    final public static FigureAttributeConstant XALIGNMENT = new FigureAttributeConstant (XALIGNMENT_STR, 10);
    final public static FigureAttributeConstant YALIGNMENT = new FigureAttributeConstant (YALIGNMENT_STR, 11);
    final public static String BOTTOM_MARGIN_STR = "BottomMargin";
    final public static String LEFT_MARGIN_STR = "LeftMargin";
    final public static String LOCATION_STR = "Location";
    final public static String POPUP_MENU_STR = "PopupMenu";
    final public static String RIGHT_MARGIN_STR = "RightMargin";
    final public static String TOP_MARGIN_STR = "TopMargin";
    final public static String XALIGNMENT_STR = "XAlignment";
    final public static String YALIGNMENT_STR = "YAlignment";
}
package CH.ifa.draw.framework;
package org.jhotdraw.framework;
public class FigureAttributes extends Object implements Cloneable, Serializable {
    public Object get (String name);
}
public class FigureAttributes extends Object implements Cloneable, Serializable {
    public Object get (FigureAttributeConstant attributeConstant);
}
package CH.ifa.draw.figures;
package org.jhotdraw.figures;
package CH.ifa.draw.standard;
package org.jhotdraw.standard;
public class FigureChangeEvent extends EventObject {
}
public class FigureChangeEvent extends EventObject {
    public FigureChangeEvent (Figure source, Rectangle r, FigureChangeEvent nestedEvent) {
    }
}
public class FigureChangeEvent extends EventObject {
    public FigureChangeEvent (Figure source) {
    }
    public FigureChangeEvent (Figure source, Rectangle r) {
    }
    public FigureChangeEvent (Figure source, Rectangle r, FigureChangeEvent nestedEvent) {
    }
}
public class FigureChangeEvent extends EventObject {
    public FigureChangeEvent (Figure newSource) {
    }
    public FigureChangeEvent (Figure newSource, Rectangle newRect) {
    }
    public FigureChangeEvent (Figure newSource, Rectangle newRect, FigureChangeEvent nestedEvent) {
    }
}
package CH.ifa.draw.framework;
package org.jhotdraw.framework;
public class FigureChangeEventMulticaster extends AWTEventMulticaster implements FigureChangeListener {
    public FigureChangeEventMulticaster (EventListener a, EventListener b) {
    }
}
public class FigureChangeEventMulticaster extends AWTEventMulticaster implements FigureChangeListener {
    public FigureChangeEventMulticaster (EventListener newListenerA, EventListener newListenerB) {
    }
}
package CH.ifa.draw.standard;
package org.jhotdraw.standard;
package CH.ifa.draw.framework;
package org.jhotdraw.framework;
package CH.ifa.draw.contrib.html;
package org.jhotdraw.contrib.html;
package CH.ifa.draw.contrib.html;
package org.jhotdraw.contrib.html;
public interface FigureEnumeration extends Enumeration {
}
public interface FigureEnumeration {
    public boolean hasNextFigure ();
}
public interface FigureEnumeration {
}
public interface FigureEnumeration {
    public void reset ();
}
package CH.ifa.draw.framework;
package org.jhotdraw.framework;
final public class FigureEnumerator implements FigureEnumeration {
}
final public class FigureEnumerator implements FigureEnumeration {
    public static FigureEnumeration getEmptyEnumeration ();
}
final public class FigureEnumerator implements FigureEnumeration {
    public FigureEnumerator (Vector v) {
    }
    public Object nextElement ();
}
final public class FigureEnumerator implements FigureEnumeration {
    public FigureEnumerator (Collection c) {
    }
}
final public class FigureEnumerator implements FigureEnumeration {
}
final public class FigureEnumerator implements FigureEnumeration {
    public void reset ();
}
package CH.ifa.draw.standard;
package org.jhotdraw.standard;
public class FigureSelection extends Object {
    public FigureSelection (Vector figures) {
    }
    final public static String TYPE = "CH.ifa.draw.Figures";
}
public interface FigureSelection {
}
public interface FigureSelection {
}
public class FigureSelection extends Object {
    public FigureSelection (Vector figures) {
    }
    final public static String TYPE = "CH.ifa.draw.Figures";
}
public class FigureSelection extends Object {
    public FigureSelection (Vector figures) {
    }
    final public static String TYPE = "CH.ifa.draw.Figures";
}
public interface FigureSelection {
}
package CH.ifa.draw.framework;
package org.jhotdraw.framework;
package CH.ifa.draw.framework;
package org.jhotdraw.framework;
abstract public class FigureTransferCommand extends AbstractCommand {
}
abstract public class FigureTransferCommand extends AbstractCommand {
    public FigureEnumeration insertFigures (FigureEnumeration fe, int dx, int dy);
}
package CH.ifa.draw.standard;
package org.jhotdraw.standard;
abstract class FigureTransferCommand extends Command {
    protected DrawingView fView;
}
abstract public class FigureTransferCommand extends AbstractCommand {
}
abstract public class FigureTransferCommand extends AbstractCommand {
}
abstract class FigureTransferCommand extends Command {
    protected DrawingView fView;
}
abstract class FigureTransferCommand extends Command {
    protected DrawingView fView;
    protected void copySelection ();
    protected void deleteSelection ();
    protected void insertFigures (Vector figures, int dx, int dy);
}
abstract public class FigureTransferCommand extends AbstractCommand {
    protected void copyFigures (FigureEnumeration fe, int figureCount);
    protected void deleteFigures (FigureEnumeration fe);
}
abstract public class FigureTransferCommand extends AbstractCommand {
    protected FigureTransferCommand (String name, DrawingView view) {
    }
}
abstract public class FigureTransferCommand extends AbstractCommand {
    protected FigureTransferCommand (String name, DrawingEditor newDrawingEditor) {
    }
}
package CH.ifa.draw.util;
package org.jhotdraw.util;
package CH.ifa.draw.contrib;
package org.jhotdraw.contrib;
public class FloatingTextField extends Object {
}
public class FloatingTextField {
}
public class FloatingTextField {
}
public class FloatingTextField extends Object {
}
public class FloatingTextField extends Object {
}
public class FloatingTextField {
}
package CH.ifa.draw.util;
package org.jhotdraw.util;
package CH.ifa.draw.samples.javadraw;
package org.jhotdraw.samples.javadraw;
public class FontSizeHandle extends LocatorHandle {
}
public class FontSizeHandle extends LocatorHandle {
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
}
public class FontSizeHandle extends LocatorHandle {
    public static class UndoActivity extends UndoableAdapter {
        public UndoActivity (Font newFont) {
        }
    }
}
public class FontSizeHandle extends LocatorHandle {
    public static class UndoActivity extends UndoableAdapter {
        public UndoActivity (DrawingView newView, Font newFont) {
        }
    }
}
package CH.ifa.draw.figures;
package org.jhotdraw.figures;
public class Geom {
}
public class Geom {
}
package CH.ifa.draw.util;
package org.jhotdraw.util;
public class Geom {
}
public class Geom {
}
public class Geom {
}
public class Geom {
}
public class Geom {
}
public class Geom {
    public static Point bottomLeftCorner (Rectangle r);
    public static Point bottomRightCorner (Rectangle r);
    public static Point corner (Rectangle r);
    public static Point topLeftCorner (Rectangle r);
}
package CH.ifa.draw.contrib.html;
package org.jhotdraw.contrib.html;
package CH.ifa.draw.contrib;
package org.jhotdraw.contrib;
public class GraphicalCompositeFigure extends CompositeFigure implements Layoutable {
}
public class GraphicalCompositeFigure extends CompositeFigure implements Layoutable {
}
public class GraphicalCompositeFigure extends CompositeFigure implements Layoutable {
}
public class GraphicalCompositeFigure extends CompositeFigure implements Layoutable {
}
public class GraphicalCompositeFigure extends CompositeFigure implements Layoutable {
}
public class GraphicalCompositeFigure extends CompositeFigure implements Layoutable {
}
public class GraphicalCompositeFigure extends CompositeFigure implements Layoutable {
}
public class GraphicalCompositeFigure extends CompositeFigure implements Layoutable {
}
package CH.ifa.draw.util;
package org.jhotdraw.util;
package CH.ifa.draw.standard;
package org.jhotdraw.standard;
public class GroupCommand extends Command {
}
public class GroupCommand extends AbstractCommand {
}
public class GroupCommand extends AbstractCommand {
}
public class GroupCommand extends Command {
}
public class GroupCommand extends Command {
}
public class GroupCommand extends AbstractCommand {
    public static class UndoActivity extends UndoableAdapter {
        public UndoActivity (DrawingView newDrawingView) {
        }
        public boolean redo ();
        public boolean undo ();
        public void groupFigures ();
    }
}
public class GroupCommand extends AbstractCommand {
    public GroupCommand (String name, DrawingView view) {
    }
}
public class GroupCommand extends AbstractCommand {
    public GroupCommand (String name, DrawingEditor newDrawingEditor) {
    }
}
package CH.ifa.draw.figures;
package org.jhotdraw.figures;
package CH.ifa.draw.figures;
package org.jhotdraw.figures;
public class GroupFigure extends CompositeFigure {
}
public class GroupFigure extends CompositeFigure {
}
public class GroupFigure extends CompositeFigure {
}
public class GroupFigure extends CompositeFigure {
}
package CH.ifa.draw.figures;
package org.jhotdraw.figures;
public interface Handle {
}
public interface Handle {
    public void setUndoActivity (Undoable newUndoableActivity);
}
public interface Handle {
}
public interface Handle {
}
package CH.ifa.draw.framework;
package org.jhotdraw.framework;
package CH.ifa.draw.standard;
package org.jhotdraw.standard;
package CH.ifa.draw.framework;
package org.jhotdraw.framework;
package CH.ifa.draw.standard;
package org.jhotdraw.standard;
public class HandleTracker extends AbstractTool {
}
public class HandleTracker extends AbstractTool {
}
public class HandleTracker extends AbstractTool {
    public HandleTracker (DrawingView view, Handle anchorHandle) {
    }
}
public class HandleTracker extends AbstractTool {
    public HandleTracker (DrawingEditor newDrawingEditor, Handle anchorHandle) {
    }
}
package CH.ifa.draw.standard;
package org.jhotdraw.standard;
package CH.ifa.draw.contrib.html;
package org.jhotdraw.contrib.html;
package CH.ifa.draw.contrib.html;
package org.jhotdraw.contrib.html;
package CH.ifa.draw.contrib.html;
package org.jhotdraw.contrib.html;
package CH.ifa.draw.contrib.html;
package org.jhotdraw.contrib.html;
public class HTMLTextAreaFigure extends TextAreaFigure implements FigureChangeListener, HTMLContentProducerContext {
}
public class HTMLTextAreaFigure extends TextAreaFigure implements FigureChangeListener, HTMLContentProducerContext {
}
public class HTMLTextAreaFigure extends TextAreaFigure implements FigureChangeListener, HTMLContentProducerContext {
    protected Figure fFrameFigure = null;
    protected boolean fIsImageDirty = true;
    protected boolean fRawHTML = false;
    protected boolean fUseDirectDraw = false;
    protected static ContentProducerRegistry fDefaultContentProducers = new ContentProducerRegistry ();
    protected transient ContentProducer fIntrinsicContentProducer;
    protected transient ContentProducerRegistry fContentProducers = null;
    protected transient DisposableResourceHolder fImageHolder;
    protected transient JLabel fDisplayDelegate;
}
public class HTMLTextAreaFigure extends TextAreaFigure implements FigureChangeListener, HTMLContentProducerContext {
}
public class HTMLTextAreaFigure extends TextAreaFigure implements FigureChangeListener, HTMLContentProducerContext {
}
public class HTMLTextAreaFigure extends TextAreaFigure implements FigureChangeListener, HTMLContentProducerContext {
}
package CH.ifa.draw.contrib.html;
package org.jhotdraw.contrib.html;
package CH.ifa.draw.contrib.html;
package org.jhotdraw.contrib.html;
public class Iconkit {
}
public class Iconkit {
}
package CH.ifa.draw.util;
package org.jhotdraw.util;
public class Iconkit {
    public Image getImage (String filename);
    public Image loadImage (String filename);
    public Image loadImage (String filename, boolean waitForLoad);
}
public class Iconkit {
    public Image getImage (String fileName);
    public Image getImageURL (URL url);
    public Image loadImage (String fileName);
    public Image loadImage (String fileName, boolean waitForLoad);
    public Image loadImageResource (String fileName);
    public Image loadImageResourceURL (URL url);
    public Image loadImageURL (URL url);
    public void registerImageURL (URL url);
}
public class Iconkit {
}
public class Iconkit {
    public Image loadImageUncached (String fileName);
}
package CH.ifa.draw.figures;
package org.jhotdraw.figures;
public class ImageFigure extends AttributeFigure implements ImageObserver {
}
public class ImageFigure extends AttributeFigure implements ImageObserver {
}
public class ImageFigure extends AttributeFigure implements ImageObserver {
}
public class ImageFigure extends AttributeFigure implements ImageObserver {
}
public class InsertImageCommand extends Command {
}
public class InsertImageCommand extends AbstractCommand {
}
public class InsertImageCommand extends AbstractCommand {
}
public class InsertImageCommand extends Command {
}
public class InsertImageCommand extends Command {
    public InsertImageCommand (String name, String image, DrawingView view) {
    }
}
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
}
public class InsertImageCommand extends AbstractCommand {
    public InsertImageCommand (String name, String newImageName, DrawingView view) {
    }
}
public class InsertImageCommand extends AbstractCommand {
    public InsertImageCommand (String name, String newImageName, DrawingEditor newDrawingEditor) {
    }
}
package CH.ifa.draw.figures;
package org.jhotdraw.figures;
package CH.ifa.draw.util.collections.jdk11;
package org.jhotdraw.util.collections.jdk11;
public class JavaDrawApp extends MDI_DrawApplication {
}
public class JavaDrawApp extends MDI_DrawApplication {
    protected JavaDrawApp (String title) {
    }
}
public class JavaDrawApp extends MDI_DrawApplication {
}
public class JavaDrawApp extends MDI_DrawApplication {
}
public class JavaDrawApp extends MDI_DrawApplication {
}
public class JavaDrawApp extends MDI_DrawApplication {
}
public class JavaDrawApp extends MDI_DrawApplication {
    protected JavaDrawApp (String title) {
    }
}
public class JavaDrawApp extends MDI_DrawApplication {
    public JavaDrawApp (String title) {
    }
}
public class JavaDrawApp extends MDI_DrawApplication {
}
public class JavaDrawApp extends MDI_DrawApplication {
}
public class JavaDrawApp extends MDI_DrawApplication {
}
public class JavaDrawApp extends MDI_DrawApplication {
}
package CH.ifa.draw.samples.javadraw;
package org.jhotdraw.samples.javadraw;
public class JavaDrawApp extends MDI_DrawApplication {
}
public class JavaDrawApp extends MDI_DrawApplication {
}
public class JavaDrawApp extends MDI_DrawApplication {
}
public class JavaDrawApp extends MDI_DrawApplication {
}
package CH.ifa.draw.samples.javadraw;
package org.jhotdraw.samples.javadraw;
public class JavaDrawViewer extends JApplet implements DrawingEditor {
}
public class JavaDrawViewer extends JApplet implements DrawingEditor {
}
package CH.ifa.draw.samples.javadraw;
package org.jhotdraw.samples.javadraw;
public class JavaDrawViewer extends JApplet implements DrawingEditor {
}
public class JavaDrawViewer extends JApplet implements DrawingEditor {
}
public class JavaDrawViewer extends JApplet implements DrawingEditor {
}
public class JavaDrawViewer extends JApplet implements DrawingEditor {
}
public class JavaDrawViewer extends JApplet implements DrawingEditor {
}
public class JavaDrawViewer extends JApplet implements DrawingEditor {
}
public class JavaDrawViewer extends JApplet implements DrawingEditor {
}
public class JavaDrawViewer extends JApplet implements DrawingEditor {
    public UndoManager getUndoManager ();
}
public class JavaDrawViewer extends JApplet implements DrawingEditor {
}
public class JavaDrawViewer extends JApplet implements DrawingEditor {
}
public class JDOStorageFormat extends StandardStorageFormat {
}
public class JDOStorageFormat extends StandardStorageFormat {
    public boolean isRestoreFormat ();
}
package CH.ifa.draw.util;
package org.jhotdraw.util;
public class JHDDragSourceListener implements java.awt.dnd.DragSourceListener {
    public JHDDragSourceListener (DrawingEditor editor, DrawingView view) {
    }
}
public class JHDDragSourceListener implements java.awt.dnd.DragSourceListener {
    public JHDDragSourceListener (DrawingEditor newEditor, DrawingView newView) {
    }
}
package CH.ifa.draw.contrib.dnd;
public class JHDDragSourceListener implements java.awt.dnd.DragSourceListener {
    public static class RemoveUndoActivity extends CH.ifa.draw.util.UndoableAdapter {
    }
}
package org.jhotdraw.contrib.dnd;
public class JHDDragSourceListener implements java.awt.dnd.DragSourceListener {
    public static class RemoveUndoActivity extends org.jhotdraw.util.UndoableAdapter {
    }
}
package CH.ifa.draw.contrib.dnd;
public class JHDDropTargetListener implements java.awt.dnd.DropTargetListener {
    public static class AddUndoActivity extends CH.ifa.draw.util.UndoableAdapter {
    }
}
package org.jhotdraw.contrib.dnd;
public class JHDDropTargetListener implements java.awt.dnd.DropTargetListener {
    public static class AddUndoActivity extends org.jhotdraw.util.UndoableAdapter {
    }
}
public class JHotDrawException extends Exception {
}
public class JHotDrawException extends Exception {
    public JHotDrawException (Exception nestedException) {
    }
}
public class JHotDrawException extends Exception {
}
public class JHotDrawException extends Exception {
    protected void setNestedException (Exception newNestedException);
}
package CH.ifa.draw.framework;
package org.jhotdraw.framework;
public class JHotDrawRuntimeException extends RuntimeException {
}
public class JHotDrawRuntimeException extends RuntimeException {
    public JHotDrawRuntimeException (Exception nestedException) {
    }
}
public class JHotDrawRuntimeException extends RuntimeException {
}
public class JHotDrawRuntimeException extends RuntimeException {
    protected void setNestedException (Exception newNestedException);
}
package CH.ifa.draw.framework;
package org.jhotdraw.framework;
public class JPanelDesktop extends JPanel implements Desktop {
    public JPanelDesktop (DrawApplication newDrawApplication) {
    }
}
public class JPanelDesktop extends JPanel implements Desktop {
    public JPanelDesktop () {
    }
}
public class JPanelDesktop extends JPanel implements Desktop {
    public JPanelDesktop () {
    }
}
public class JPanelDesktop extends JPanel implements Desktop {
    public JPanelDesktop (DrawApplication newDrawApplication) {
    }
}
package CH.ifa.draw.contrib;
package org.jhotdraw.contrib;
package CH.ifa.draw.contrib;
package org.jhotdraw.contrib;
package CH.ifa.draw.contrib;
package org.jhotdraw.contrib;
public interface Layouter extends Serializable, Storable {
}
public interface Layouter extends Serializable, Storable {
}
package CH.ifa.draw.contrib;
package org.jhotdraw.contrib;
package CH.ifa.draw.figures;
package org.jhotdraw.figures;
public class LineConnection extends PolyLineFigure implements ConnectionFigure {
    protected Connector fEnd = null;
    protected Connector fStart = null;
    public Connector end ();
    public void connectEnd (Connector end);
}
public class LineConnection extends PolyLineFigure implements ConnectionFigure {
    protected Connector myEndConnector;
    protected Connector myStartConnector;
    protected void setEndConnector (Connector newEndConnector);
    protected void setStartConnector (Connector newStartConnector);
    public Connector getEndConnector ();
    public void connectEnd (Connector newEndConnector);
}
public class LineConnection extends PolyLineFigure implements ConnectionFigure {
}
public class LineConnection extends PolyLineFigure implements ConnectionFigure {
}
public class LineConnection extends PolyLineFigure implements ConnectionFigure {
}
public class LineConnection extends PolyLineFigure implements ConnectionFigure {
}
public class LineConnection extends PolyLineFigure implements ConnectionFigure {
}
public class LineConnection extends PolyLineFigure implements ConnectionFigure {
}
public interface LineDecoration extends Cloneable, Serializable, Storable {
    abstract public void draw (Graphics g, int x1, int y1, int x2, int y2);
}
public interface LineDecoration extends Cloneable, Serializable, Storable {
    public Rectangle displayBox ();
    public void draw (Graphics g, int x1, int y1, int x2, int y2);
}
package CH.ifa.draw.figures;
package org.jhotdraw.figures;
package CH.ifa.draw.figures;
package org.jhotdraw.figures;
package CH.ifa.draw.util.collections.jdk11;
package org.jhotdraw.util.collections.jdk11;
package CH.ifa.draw.framework;
package org.jhotdraw.framework;
public class LocatorConnector extends AbstractConnector {
}
public class LocatorConnector extends AbstractConnector {
    protected void setLocator (Locator newLocator);
}
package CH.ifa.draw.standard;
package org.jhotdraw.standard;
public class LocatorConnector extends AbstractConnector {
}
public class LocatorConnector extends AbstractConnector {
    protected Locator myLocator;
}
public class LocatorHandle extends AbstractHandle {
}
public class LocatorHandle extends AbstractHandle {
}
public class LocatorHandle extends AbstractHandle {
}
public class LocatorHandle extends AbstractHandle {
}
package CH.ifa.draw.standard;
package org.jhotdraw.standard;
package CH.ifa.draw.util.collections.jdk11;
package org.jhotdraw.util.collections.jdk11;
public class MDIDesktopPane extends JDesktopPane implements Desktop {
    private DrawingChangeListener dcl = new DrawingChangeListener () {
        public void drawingInvalidated (DrawingChangeEvent e);
        public void drawingRequestUpdate (DrawingChangeEvent e);
        public void drawingTitleChanged (DrawingChangeEvent e);
    }
    ;
    protected InternalFrameListener internalFrameListener = new InternalFrameAdapter () {
    }
    ;
    public MDIDesktopPane () {
    }
}
public class MDIDesktopPane extends JDesktopPane implements Desktop {
    protected DrawApplication getDrawApplication (); protected DrawingView selectedView;
    protected InternalFrameListener internalFrameListener = new InternalFrameAdapter () {
    }
    ;
    public MDIDesktopPane (DrawApplication newDrawApplication) {
    }
}
public class MDIDesktopPane extends JDesktopPane implements Desktop {
    protected DrawingView selectedView;
}
public class MDIDesktopPane extends JDesktopPane implements Desktop {
}
public class MDIDesktopPane extends JDesktopPane implements Desktop {
}
public class MDIDesktopPane extends JDesktopPane implements Desktop {
    protected void fireDrawingViewAddedEvent (final DrawingView dv);
    protected void fireDrawingViewRemovedEvent (final DrawingView dv);
}
public class MDIDesktopPane extends JDesktopPane implements Desktop {
}
public class MDIDesktopPane extends JDesktopPane implements Desktop {
    protected DesktopEventService createDesktopEventService ();
}
package CH.ifa.draw.contrib;
package org.jhotdraw.contrib;
public class MDIDesktopPane extends JDesktopPane {
}
public class MDIDesktopPane extends JDesktopPane {
    public void arrangeFramesHorizontally ();
    public void tileFramesHorizontally ();
    public void tileFramesVertically ();
}
public class MDIDesktopPane extends JDesktopPane {
    public Component add (JInternalFrame frame);
    public MDIDesktopPane () {
    }
}
class MDIDesktopManager extends DefaultDesktopManager {
    public MDIDesktopManager (MDIDesktopPane desktop) {
    }
}
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
    public void removeAllFromDesktop (int location);
    public void removeDesktopListener (DesktopListener dpl);
}
class MDIDesktopManager extends DefaultDesktopManager {
    public MDIDesktopManager (MDIDesktopPane newDesktop) {
    }
}
public class MDIDesktopPane extends JDesktopPane implements Desktop {
}
public class MDIDesktopPane extends JDesktopPane implements Desktop {
    public void updateTitle (String newDrawingTitle);
}
public class MDIDesktopPane extends JDesktopPane implements Desktop {
    protected DrawingView selectedView;
    protected InternalFrameListener internalFrameListener = new InternalFrameAdapter () {
    }
    ;
}
public class MDIDesktopPane extends JDesktopPane implements Desktop {
    protected InternalFrameListener internalFrameListener = new InternalFrameAdapter () {
    }
    ;
}
public class MDIDesktopPane extends JDesktopPane implements Desktop {
    public MDIDesktopPane (DrawApplication newDrawApplication) {
    }
}
public class MDIDesktopPane extends JDesktopPane implements Desktop {
    private DrawingChangeListener dcl = new DrawingChangeListener () {
        public void drawingInvalidated (DrawingChangeEvent e);
        public void drawingRequestUpdate (DrawingChangeEvent e);
        public void drawingTitleChanged (DrawingChangeEvent e);
    }
    ;
    public MDIDesktopPane () {
    }
}
public class MDI_DrawApplication extends DrawApplication {
}
public class MDI_DrawApplication extends DrawApplication {
}
public class MDI_DrawApplication extends DrawApplication {
}
public class MDI_DrawApplication extends DrawApplication {
}
public class MDI_DrawApplication extends DrawApplication {
    public void promptNew ();
}
public class MDI_DrawApplication extends DrawApplication {
}
public class MDI_DrawApplication extends DrawApplication {
}
public class MDI_DrawApplication extends DrawApplication {
    public void promptNew ();
}
package CH.ifa.draw.contrib;
package org.jhotdraw.contrib;
public class MDI_DrawApplication extends DrawApplication implements InternalFrameListener {
}
public class MDI_DrawApplication extends DrawApplication implements InternalFrameListener {
}
public class MDI_DrawApplication extends DrawApplication implements InternalFrameListener {
}
public class MDI_DrawApplication extends DrawApplication implements InternalFrameListener {
}
public class MDI_DrawApplication extends DrawApplication implements InternalFrameListener {
}
public class MDI_DrawApplication extends DrawApplication implements InternalFrameListener {
}
public class MDI_DrawApplication extends DrawApplication implements InternalFrameListener {
}
public class MDI_DrawApplication extends DrawApplication implements InternalFrameListener {
}
public class MDI_DrawApplication extends DrawApplication implements InternalFrameListener {
    protected JComponent createContents (DrawingView view);
    protected MDI_InternalFrame createInternalFrame (DrawingView view);
    protected void setDesktop (JComponent newDesktop);
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
    public void removeInternalFrameListener (InternalFrameListener oldMDIListener);
}
public class MDI_DrawApplication extends DrawApplication {
}
package CH.ifa.draw.samples.minimap;
package org.jhotdraw.samples.minimap;
package CH.ifa.draw.samples.minimap;
package org.jhotdraw.samples.minimap;
public class MiniMapView extends JComponent {
    class MappedDrawingChangeListener implements DrawingChangeListener {
    }
}
public class MiniMapView extends JComponent {
    class MappedDrawingChangeListener implements DrawingChangeListener {
        public void drawingTitleChanged (DrawingChangeEvent e);
    }
}
public class MiniMapView extends JComponent {
    class MappedDrawingChangeListener implements DrawingChangeListener {
        public void drawingTitleChanged (DrawingChangeEvent e);
    }
}
public class MiniMapView extends JComponent {
    class MappedDrawingChangeListener implements DrawingChangeListener {
    }
}
public class MiniMapView extends JComponent {
    class MappedDrawingChangeListener implements DrawingChangeListener {
    }
}
public class MiniMapView extends JComponent {
    class MappedDrawingChangeListener implements DrawingChangeListener {
        public void drawingTitleChanged (DrawingChangeEvent e);
    }
}
package CH.ifa.draw.contrib;
package org.jhotdraw.contrib;
package CH.ifa.draw.contrib.zoom;
package org.jhotdraw.contrib.zoom;
public class MySelectionTool extends SelectionTool {
    public MySelectionTool (DrawingView view) {
    }
}
public class MySelectionTool extends SelectionTool {
    public MySelectionTool (DrawingEditor newDrawingEditor) {
    }
}
package CH.ifa.draw.samples.javadraw;
package org.jhotdraw.samples.javadraw;
package CH.ifa.draw.contrib;
package org.jhotdraw.contrib;
public class NetApp extends DrawApplication {
}
public class NetApp extends DrawApplication {
    public NetApp () {
    }
}
package CH.ifa.draw.samples.net;
package org.jhotdraw.samples.net;
public class NodeFigure extends TextFigure {
}
public class NodeFigure extends TextFigure {
}
public class NodeFigure extends TextFigure {
}
public class NodeFigure extends TextFigure {
}
package CH.ifa.draw.samples.net;
package org.jhotdraw.samples.net;
public class NothingApp extends DrawApplication {
}
public class NothingApp extends DrawApplication {
    public NothingApp () {
    }
}
package CH.ifa.draw.samples.nothing;
package org.jhotdraw.samples.nothing;
package CH.ifa.draw.samples.nothing;
package org.jhotdraw.samples.nothing;
public class NullDrawingView extends JPanel implements DrawingView {
}
public class NullDrawingView extends JPanel implements DrawingView {
}
public class NullDrawingView extends JPanel implements DrawingView {
}
public class NullDrawingView extends JPanel implements DrawingView {
}
public class NullDrawingView extends JPanel implements DrawingView {
    public NullDrawingView (DrawingEditor editor) {
    }
}
public class NullDrawingView extends JPanel implements DrawingView {
    protected NullDrawingView (DrawingEditor editor) {
    }
}
public class NullDrawingView extends JPanel implements DrawingView {
}
public class NullDrawingView extends JPanel implements DrawingView {
}
package CH.ifa.draw.standard;
public class NullDrawingView extends JPanel implements DrawingView {
}
package org.jhotdraw.standard;
public class NullDrawingView extends JPanel implements DrawingView {
}
package CH.ifa.draw.figures;
package org.jhotdraw.figures;
package CH.ifa.draw.standard;
package org.jhotdraw.standard;
public class NullHandle extends LocatorHandle {
}
public class NullHandle extends LocatorHandle {
}
public class NullTool extends AbstractTool {
}
public class NullTool extends AbstractTool {
}
public class NullTool extends AbstractTool {
}
public class NullTool extends AbstractTool {
}
public class NullTool extends AbstractTool {
}
public class NullTool extends AbstractTool {
}
package CH.ifa.draw.standard;
package org.jhotdraw.standard;
public class NumberTextFigure extends TextFigure {
}
public class NumberTextFigure extends TextFigure {
}
package CH.ifa.draw.figures;
package org.jhotdraw.figures;
package CH.ifa.draw.standard;
package org.jhotdraw.standard;
public class OffsetLocator extends AbstractLocator {
}
public class OffsetLocator extends AbstractLocator {
    protected int fOffsetX;
    protected int fOffsetY;
}
package CH.ifa.draw.standard;
package org.jhotdraw.standard;
package CH.ifa.draw.framework;
package org.jhotdraw.framework;
abstract public class PaletteButton extends JButton implements MouseListener, MouseMotionListener {
}
abstract public class PaletteButton extends JButton implements MouseListener, MouseMotionListener {
    final protected static int NORMAL = 1;
    final protected static int PRESSED = 2;
    final protected static int SELECTED = 3;
}
package CH.ifa.draw.util;
package org.jhotdraw.util;
package CH.ifa.draw.util;
package org.jhotdraw.util;
package CH.ifa.draw.util;
package org.jhotdraw.util;
interface PaletteListener {
}
public interface PaletteListener {
    public void paletteUserOver (PaletteButton button, boolean inside);
    public void paletteUserSelected (PaletteButton button);
}
package CH.ifa.draw.util;
package org.jhotdraw.util;
package CH.ifa.draw.standard;
package org.jhotdraw.standard;
public class PasteCommand extends FigureTransferCommand {
}
public class PasteCommand extends FigureTransferCommand {
    public static class UndoActivity extends UndoableAdapter {
        public UndoActivity (DrawingView newDrawingView) {
        }
        public boolean redo ();
        public boolean undo ();
    }
}
public class PasteCommand extends FigureTransferCommand {
    public PasteCommand (String name, DrawingView view) {
    }
}
public class PasteCommand extends FigureTransferCommand {
    public PasteCommand (String name, DrawingEditor newDrawingEditor) {
    }
}
package CH.ifa.draw.samples.javadraw;
package org.jhotdraw.samples.javadraw;
package CH.ifa.draw.standard;
package org.jhotdraw.standard;
package CH.ifa.draw.samples.pert;
package org.jhotdraw.samples.pert;
public class PertApplication extends DrawApplication {
}
public class PertApplication extends DrawApplication {
    public PertApplication () {
    }
}
package CH.ifa.draw.samples.pert;
package org.jhotdraw.samples.pert;
public class PertDependency extends LineConnection {
}
public class PertDependency extends LineConnection {
}
package CH.ifa.draw.samples.pert;
package org.jhotdraw.samples.pert;
public class PertFigure extends CompositeFigure {
    public Vector handles ();
    public void writeTasks (StorableOutput dw, Vector v);
}
public class PertFigure extends CompositeFigure {
    public void writeTasks (StorableOutput dw, List l);
}
package CH.ifa.draw.samples.pert;
package org.jhotdraw.samples.pert;
public class PertFigureCreationTool extends CreationTool {
    public PertFigureCreationTool (DrawingView view) {
    }
}
public class PertFigureCreationTool extends CreationTool {
    public PertFigureCreationTool (DrawingEditor newDrawingEditor) {
    }
}
package CH.ifa.draw.samples.pert;
package org.jhotdraw.samples.pert;
package CH.ifa.draw.framework;
package org.jhotdraw.framework;
public class PolygonFigure extends AttributeFigure {
}
public class PolygonFigure extends AttributeFigure {
}
public class PolygonFigure extends AttributeFigure {
}
public class PolygonFigure extends AttributeFigure {
    public HandleEnumeration handles ();
}
package CH.ifa.draw.contrib;
package org.jhotdraw.contrib;
package CH.ifa.draw.contrib.html;
package org.jhotdraw.contrib.html;
public class PolygonHandle extends AbstractHandle {
    public static class UndoActivity extends PolyLineHandle.UndoActivity {
        public UndoActivity (int newPointIndex) {
        }
    }
}
public class PolygonHandle extends AbstractHandle {
    public static class UndoActivity extends PolyLineHandle.UndoActivity {
        public UndoActivity (DrawingView newView, int newPointIndex) {
        }
    }
}
package CH.ifa.draw.contrib;
package org.jhotdraw.contrib;
class PolygonScaleHandle extends AbstractHandle {
    public static class UndoActivity extends UndoableAdapter {
        public UndoActivity () {
        }
    }
}
class PolygonScaleHandle extends AbstractHandle {
    public static class UndoActivity extends UndoableAdapter {
        public UndoActivity (DrawingView newView) {
        }
    }
}
package CH.ifa.draw.contrib;
package org.jhotdraw.contrib;
public class PolygonTool extends AbstractTool {
    public PolygonTool (DrawingView view) {
    }
}
public class PolygonTool extends AbstractTool {
    public PolygonTool (DrawingEditor newDrawingEditor) {
    }
}
package CH.ifa.draw.contrib;
package org.jhotdraw.contrib;
package CH.ifa.draw.figures;
package org.jhotdraw.figures;
package CH.ifa.draw.figures;
package org.jhotdraw.figures;
public class PolyLineFigure extends AbstractFigure {
}
public class PolyLineFigure extends AbstractFigure {
}
public class PolyLineFigure extends AbstractFigure {
    protected Vector fPoints;
}
public class PolyLineFigure extends AbstractFigure {
    protected List fPoints;
    public HandleEnumeration handles ();
}
public class PolyLineHandle extends LocatorHandle {
}
public class PolyLineHandle extends LocatorHandle {
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
}
public class PolyLineHandle extends LocatorHandle {
    public static class UndoActivity extends UndoableAdapter {
        public UndoActivity (int newPointIndex) {
        }
    }
}
public class PolyLineHandle extends LocatorHandle {
    public static class UndoActivity extends UndoableAdapter {
        public UndoActivity (DrawingView newView, int newPointIndex) {
        }
    }
}
package CH.ifa.draw.figures;
package org.jhotdraw.figures;
package CH.ifa.draw.figures;
package org.jhotdraw.figures;
package CH.ifa.draw.contrib;
package org.jhotdraw.contrib;
class QuadTree {
}
class QuadTree implements Serializable {
}
class QuadTree implements Serializable {
    public Vector getAll ();
}
class QuadTree implements Serializable {
}
package CH.ifa.draw.standard;
package org.jhotdraw.standard;
class RadiusHandle extends AbstractHandle {
}
class RadiusHandle extends AbstractHandle {
    public static class UndoActivity extends UndoableAdapter {
        protected boolean resetRadius ();
        protected void setOldRadius (Point newOldRadius);
        public Point getOldRadius ();
        public UndoActivity () {
        }
        public boolean redo ();
        public boolean undo ();
    }
}
class RadiusHandle extends AbstractHandle {
    public static class UndoActivity extends UndoableAdapter {
        public UndoActivity () {
        }
    }
}
class RadiusHandle extends AbstractHandle {
    public static class UndoActivity extends UndoableAdapter {
        public UndoActivity (DrawingView newView) {
        }
    }
}
package CH.ifa.draw.figures;
package org.jhotdraw.figures;
public class RectangleFigure extends AttributeFigure {
}
public class RectangleFigure extends AttributeFigure {
}
package CH.ifa.draw.figures;
package org.jhotdraw.figures;
package CH.ifa.draw.util;
package org.jhotdraw.util;
public class RelativeLocator extends AbstractLocator {
}
public class RelativeLocator extends AbstractLocator {
}
package CH.ifa.draw.standard;
package org.jhotdraw.standard;
public class ResourceContentProducer extends AbstractContentProducer implements Serializable {
    protected String fResourceName = null;
    public ResourceContentProducer (String resourceName) {
        fResourceName = resourceName;
    }
}
public class ResourceContentProducer extends AbstractContentProducer implements Serializable {
    public ResourceContentProducer (String resourceName) {
        setResourceName (resourceName);
    }
}
package CH.ifa.draw.contrib.html;
package org.jhotdraw.contrib.html;
package CH.ifa.draw.contrib.html;
package org.jhotdraw.contrib.html;
package CH.ifa.draw.contrib.html;
package org.jhotdraw.contrib.html;
final public class ReverseFigureEnumerator implements FigureEnumeration {
    public Object nextElement ();
    public ReverseFigureEnumerator (Vector v) {
    }
    public boolean hasMoreElements ();
}
final public class ReverseFigureEnumerator implements FigureEnumeration {
    public ReverseFigureEnumerator (List l) {
    }
    public boolean hasNextFigure ();
}
final public class ReverseFigureEnumerator implements FigureEnumeration {
}
final public class ReverseFigureEnumerator implements FigureEnumeration {
    public void reset ();
}
package CH.ifa.draw.standard;
package org.jhotdraw.standard;
package CH.ifa.draw.figures;
package org.jhotdraw.figures;
public class RoundRectangleFigure extends AttributeFigure {
}
public class RoundRectangleFigure extends AttributeFigure {
}
package CH.ifa.draw.contrib.html;
package org.jhotdraw.contrib.html;
public class ScalingGraphics extends java.awt.Graphics {
    private class ScalingFontMetrics extends FontMetrics {
        public ScalingFontMetrics (Font userFont, FontMetrics real) {
        }
    }
}
public class ScalingGraphics extends java.awt.Graphics {
    private class ScalingFontMetrics extends FontMetrics {
        public ScalingFontMetrics (Font newUserFont, FontMetrics newReal) {
        }
    }
}
package CH.ifa.draw.contrib.zoom;
package org.jhotdraw.contrib.zoom;
public class ScribbleTool extends AbstractTool {
}
public class ScribbleTool extends AbstractTool {
    protected Figure getAddedFigure ();
}
public class ScribbleTool extends AbstractTool {
    public ScribbleTool (DrawingView view) {
    }
}
public class ScribbleTool extends AbstractTool {
    public ScribbleTool (DrawingEditor newDrawingEditor) {
    }
}
public class ScribbleTool extends AbstractTool {
}
public class ScribbleTool extends AbstractTool {
    public void mouseUp (MouseEvent e, int x, int y);
}
package CH.ifa.draw.figures;
package org.jhotdraw.figures;
package CH.ifa.draw.standard;
package org.jhotdraw.standard;
package CH.ifa.draw.standard;
package org.jhotdraw.standard;
public class SelectAreaTracker extends AbstractTool {
    public SelectAreaTracker (DrawingView view) {
    }
}
public class SelectAreaTracker extends AbstractTool {
    public SelectAreaTracker (DrawingEditor newDrawingEditor) {
    }
}
public class SelectAreaTracker extends AbstractTool {
}
public class SelectAreaTracker extends AbstractTool {
    public SelectAreaTracker (DrawingEditor newDrawingEditor, Color rubberBandColor) {
    }
}
public class SelectionTool extends AbstractTool {
}
public class SelectionTool extends AbstractTool {
}
package CH.ifa.draw.standard;
package org.jhotdraw.standard;
public class SelectionTool extends AbstractTool {
    protected Tool createAreaTracker (DrawingView view);
    public SelectionTool (DrawingView view) {
    }
}
public class SelectionTool extends AbstractTool {
    protected Tool createAreaTracker ();
    public SelectionTool (DrawingEditor newDrawingEditor) {
    }
    public void activate ();
}
public class SelectionTool extends AbstractTool {
    public void activate ();
}
public class SelectionTool extends AbstractTool {
}
public class SelectionTool extends AbstractTool {
}
public class SelectionTool extends AbstractTool {
    protected Figure findFigure (int x, int y);
    protected Tool getChild ();
}
public class SelectionTool extends AbstractTool {
    protected Figure findFigure (int x, int y);
    protected Tool getChild ();
}
public class SelectionTool extends AbstractTool {
}
public class SendToBackCommand extends Command {
}
public class SendToBackCommand extends AbstractCommand {
}
public class SendToBackCommand extends AbstractCommand {
}
public class SendToBackCommand extends Command {
}
public class SendToBackCommand extends Command {
}
public class SendToBackCommand extends AbstractCommand {
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
}
public class SendToBackCommand extends AbstractCommand {
    public SendToBackCommand (String name, DrawingView view) {
    }
}
public class SendToBackCommand extends AbstractCommand {
    protected boolean isExecutableWithView ();
    public SendToBackCommand (String name, DrawingEditor newDrawingEditor) {
    }
}
package CH.ifa.draw.standard;
package org.jhotdraw.standard;
package CH.ifa.draw.util;
package org.jhotdraw.util;
package CH.ifa.draw.util.collections.jdk11;
package org.jhotdraw.util.collections.jdk11;
package CH.ifa.draw.contrib;
package org.jhotdraw.contrib;
package CH.ifa.draw.standard;
package org.jhotdraw.standard;
final public class SingleFigureEnumerator implements FigureEnumeration {
    public boolean hasMoreElements ();
}
final public class SingleFigureEnumerator implements FigureEnumeration {
    public boolean hasNextFigure ();
}
final public class SingleFigureEnumerator implements FigureEnumeration {
}
final public class SingleFigureEnumerator implements FigureEnumeration {
    public void reset ();
}
package CH.ifa.draw.standard;
package org.jhotdraw.standard;
package CH.ifa.draw.contrib;
package org.jhotdraw.contrib;
package CH.ifa.draw.contrib;
package org.jhotdraw.contrib;
public class SplitPaneDrawApplication extends DrawApplication {
    protected JComponent createContents (DrawingView view);
    protected void createLeftComponent (DrawingView view);
}
public class SplitPaneDrawApplication extends DrawApplication {
    protected JComponent createContents (StandardDrawingView view);
    protected void createLeftComponent (StandardDrawingView view);
}
public class SplitPaneDrawApplication extends DrawApplication {
    protected JComponent createContents (StandardDrawingView view);
    protected void createLeftComponent (StandardDrawingView view);
}
public class SplitPaneDrawApplication extends DrawApplication {
    protected JComponent createContents (DrawingView view);
    protected void createLeftComponent (DrawingView view);
}
public class SplitPaneDrawApplication extends DrawApplication {
    protected JComponent createContents (DrawingView view);
    protected JSplitPane createSplitPane (DrawingView view);
    final protected void setLeftComponent (JComponent newLeftComponent);
    final protected void setRightComponent (JComponent newRightComponent);
    protected void createLeftComponent (DrawingView view);
    protected void createRightComponent (DrawingView view);
    public JComponent getLeftComponent ();
}
public class SplitPaneDrawApplication extends DrawApplication {
}
public class StandardDisposableResourceHolder implements DisposableResourceHolder, Serializable {
    public StandardDisposableResourceHolder (Object resource) {
        this.resource = resource;
        resetDelay ();
    }
}
public class StandardDisposableResourceHolder implements DisposableResourceHolder, Serializable {
    public StandardDisposableResourceHolder (Object newResource) {
        resource = newResource;
        resetDelay ();
    }
}
package CH.ifa.draw.contrib.html;
package org.jhotdraw.contrib.html;
public class StandardDisposableResourceManager implements DisposableResourceManager {
    protected ResourceDisposabilityStrategy strategy;
    protected WeakHashMap resources;
}
public class StandardDisposableResourceManager implements DisposableResourceManager {
}
public class StandardDisposableResourceManager implements DisposableResourceManager {
    public StandardDisposableResourceManager (ResourceDisposabilityStrategy strategy) {
    }
}
public class StandardDisposableResourceManager implements DisposableResourceManager {
    public StandardDisposableResourceManager (ResourceDisposabilityStrategy newStrategy) {
    }
}
package CH.ifa.draw.contrib.html;
package org.jhotdraw.contrib.html;
public class StandardDrawing extends CompositeFigure implements Drawing {
}
public class StandardDrawing extends CompositeFigure implements Drawing {
    public HandleEnumeration handles ();
}
public class StandardDrawing extends CompositeFigure implements Drawing {
}
public class StandardDrawing extends CompositeFigure implements Drawing {
    public synchronized Figure add (Figure figure);
}
public class StandardDrawing extends CompositeFigure implements Drawing {
}
public class StandardDrawing extends CompositeFigure implements Drawing {
}
public class StandardDrawing extends CompositeFigure implements Drawing {
}
public class StandardDrawing extends CompositeFigure implements Drawing {
}
public class StandardDrawing extends CompositeFigure implements Drawing {
}
public class StandardDrawing extends CompositeFigure implements Drawing {
}
package CH.ifa.draw.standard;
package org.jhotdraw.standard;
public class StandardDrawing extends CompositeFigure implements Drawing {
}
public class StandardDrawing extends CompositeFigure implements Drawing {
    public void setTitle (String newTitle);
}
public class StandardDrawingView extends JPanel implements DrawingView, KeyListener, java.awt.dnd.Autoscroll {
    MouseListener ml = new MouseListener () {
        public void mouseClicked (MouseEvent e);
        public void mouseEntered (MouseEvent e);
    }
    ;
    MouseMotionListener mml = new MouseMotionListener () {
    }
    ;
}
public class StandardDrawingView extends JPanel implements DrawingView, java.awt.dnd.Autoscroll {
    protected KeyListener createKeyListener ();
    protected MouseListener createMouseListener ();
    protected MouseMotionListener createMouseMotionListener ();
    public class DrawingViewKeyListener implements KeyListener {
        public void keyReleased (KeyEvent event);
        public void keyTyped (KeyEvent event);
    }
    public class DrawingViewMouseListener extends MouseAdapter {
    }
    public class DrawingViewMouseMotionListener implements MouseMotionListener {
    }
}
public class StandardDrawingView extends JPanel implements DrawingView, java.awt.dnd.Autoscroll {
}
public class StandardDrawingView extends JPanel implements DrawingView, java.awt.dnd.Autoscroll {
    protected Rectangle getDamage ();
    protected Vector getBackgrounds ();
    protected Vector getForegrounds ();
    protected void checkMinimumSize ();
    protected void setDamage (Rectangle r);
}
public class StandardDrawingView extends JPanel implements DrawingView, java.awt.dnd.Autoscroll {
    protected Vector getBackgrounds ();
    public Vector getConnectionFigures (Figure inFigure);
    public Vector selection ();
    public Vector selectionZOrdered ();
}
public class StandardDrawingView extends JPanel implements DNDInterface, DrawingView, java.awt.dnd.Autoscroll {
    protected DNDHelper createDNDHelper ();
    protected List getBackgrounds ();
    public FigureEnumeration selection ();
    public boolean setDragSourceActive (boolean state);
}
public class StandardDrawingView extends JPanel implements DNDInterface, DrawingView, java.awt.dnd.Autoscroll {
    public class DrawingViewKeyListener implements KeyListener {
    }
}
public class StandardDrawingView extends JPanel implements DNDInterface, DrawingView, java.awt.dnd.Autoscroll {
    public class DrawingViewKeyListener implements KeyListener {
        public DrawingViewKeyListener () {
        }
    }
}
public class StandardDrawingView extends JPanel implements DNDInterface, DrawingView, java.awt.dnd.Autoscroll {
}
public class StandardDrawingView extends JPanel implements DNDInterface, DrawingView, java.awt.dnd.Autoscroll {
    public StandardDrawingView (Drawing drawing, DrawingEditor editor, int width, int height) {
    }
}
public class StandardDrawingView extends JPanel implements DNDInterface, DrawingView, java.awt.dnd.Autoscroll {
}
public class StandardDrawingView extends JPanel implements DNDInterface, DrawingView, java.awt.dnd.Autoscroll {
}
public class StandardDrawingView extends JPanel implements DNDInterface, DrawingView, java.awt.dnd.Autoscroll {
    public StandardDrawingView (Drawing drawing, DrawingEditor editor, int width, int height) {
    }
}
public class StandardDrawingView extends JPanel implements DNDInterface, DrawingView, java.awt.dnd.Autoscroll {
}
public class StandardDrawingView extends JPanel implements DNDInterface, DrawingView, java.awt.dnd.Autoscroll {
}
public class StandardDrawingView extends JPanel implements DNDInterface, DrawingView, java.awt.dnd.Autoscroll {
}
public class StandardDrawingView extends JPanel implements DNDInterface, DrawingView, java.awt.dnd.Autoscroll {
    public Dimension getMinimumSize ();
}
public class StandardDrawingView extends JPanel implements DNDInterface, DrawingView, java.awt.dnd.Autoscroll {
}
public class StandardDrawingView extends JPanel implements DNDInterface, DrawingView, java.awt.dnd.Autoscroll {
    public boolean setDragSourceActive (boolean state);
}
public class StandardDrawingView extends JPanel implements DNDInterface, DrawingView, java.awt.dnd.Autoscroll {
    public void DNDDeinitialize ();
}
public class StandardDrawingView extends JPanel implements DNDInterface, DrawingView, java.awt.dnd.Autoscroll {
}
public class StandardDrawingView extends JPanel implements DNDInterface, DrawingView, java.awt.dnd.Autoscroll {
}
public class StandardDrawingView extends JPanel implements DNDInterface, DrawingView, java.awt.dnd.Autoscroll {
}
public class StandardDrawingView extends JPanel implements DNDInterface, DrawingView, java.awt.dnd.Autoscroll {
}
public class StandardDrawingView extends JPanel implements DNDInterface, DrawingView, java.awt.dnd.Autoscroll {
}
public class StandardDrawingView extends JPanel implements DNDInterface, DrawingView, java.awt.dnd.Autoscroll {
}
public class StandardDrawingView extends JPanel implements DNDInterface, DrawingView, java.awt.dnd.Autoscroll {
}
public class StandardDrawingView extends JPanel implements DNDInterface, DrawingView, java.awt.dnd.Autoscroll {
}
public class StandardDrawingView extends JPanel implements DNDInterface, DrawingView, java.awt.dnd.Autoscroll {
}
public class StandardDrawingView extends JPanel implements DNDInterface, DrawingView, java.awt.dnd.Autoscroll {
}
public class StandardDrawingView extends JPanel implements DNDInterface, DrawingView, java.awt.dnd.Autoscroll {
}
public class StandardDrawingView extends JPanel implements DNDInterface, DrawingView, java.awt.dnd.Autoscroll {
}
package CH.ifa.draw.standard;
package org.jhotdraw.standard;
public class StandardDrawingView extends JPanel implements DNDInterface, DrawingView, java.awt.dnd.Autoscroll {
}
public class StandardDrawingView extends JPanel implements DNDInterface, DrawingView, java.awt.dnd.Autoscroll {
    public void setToolTipFigure (Figure f);
}
public class StandardDrawingView extends Panel implements DrawingView, KeyListener, MouseListener, MouseMotionListener {
}
public class StandardDrawingView extends JPanel implements DrawingView, KeyListener, MouseListener, MouseMotionListener {
}
public class StandardDrawingView extends JPanel implements DrawingView, KeyListener, MouseListener, MouseMotionListener {
    public void update (Graphics g);
}
public class StandardDrawingView extends JPanel implements DrawingView, KeyListener, MouseListener, MouseMotionListener {
}
public class StandardDrawingView extends JPanel implements DrawingView, KeyListener, MouseListener, MouseMotionListener {
}
public class StandardDrawingView extends JPanel implements DrawingView, KeyListener, MouseListener, MouseMotionListener {
    public void update (Graphics g);
}
public class StandardDrawingView extends JPanel implements DrawingView, KeyListener, MouseListener, MouseMotionListener {
    public void update (Graphics g);
}
public class StandardDrawingView extends JPanel implements DrawingView, KeyListener, MouseListener, MouseMotionListener {
    protected boolean doDragScroll ();
    protected void paintComponent (Graphics g);
    protected void scrollToVisible (Rectangle r, boolean bSizeChange);
    public StandardDrawingView (DrawingEditor editor) {
    }
    public UndoManager getUndoManager ();
    public boolean figureExists (Figure inf, FigureEnumeration e);
    final public static int MINIMUM_HEIGHT = 300;
    final public static int MINIMUM_WIDTH = 400;
    final public static int SCROLL_INCR = 100;
    final public static int SCROLL_OFFSET = 10;
}
public class StandardDrawingView extends JPanel implements DrawingView, KeyListener, MouseListener, MouseMotionListener {
    protected void scrollToVisible (Rectangle r, boolean bSizeChange);
}
public class StandardDrawingView extends JPanel implements DrawingView, KeyListener, java.awt.dnd.Autoscroll {
    MouseListener ml = new MouseListener () {
    }
    ;
    MouseMotionListener mml = new MouseMotionListener () {
    }
    ;
    class ASH extends AutoscrollHelper {
        public ASH (int margin) {
        }
        public Dimension getSize ();
        public Rectangle getVisibleRect ();
        public void scrollRectToVisible (Rectangle aRect);
    }
    public boolean isInteractive ();
}
public class StandardFigureSelection implements FigureSelection, Serializable {
    public StandardFigureSelection (FigureEnumeration figures, int figureCount) {
    }
}
public class StandardFigureSelection implements FigureSelection, Serializable {
    public StandardFigureSelection (FigureEnumeration fe, int figureCount) {
    }
}
package CH.ifa.draw.standard;
public class StandardFigureSelection implements FigureSelection, Serializable {
    final public static String TYPE = "CH.ifa.draw.Figures";
}
package org.jhotdraw.standard;
public class StandardFigureSelection implements FigureSelection, Serializable {
    final public static String TYPE = "org.jhotdraw.Figures";
}
public class StandardLayouter implements Layouter {
    public StandardLayouter (Layoutable newLayoutable) {
        setInsets (new Insets (0, 0, 0, 0));
        setLayoutable (newLayoutable);
    }
}
public class StandardLayouter implements Layouter {
    public StandardLayouter (Layoutable newLayoutable) {
    }
}
public class StandardLayouter implements Layouter {
    public Insets getInsets ();
    public void read (StorableInput dr) throws IOException;
    public void setInsets (Insets newInsets);
    public void setLayoutable (Layoutable newLayoutable);
    public void write (StorableOutput dw);
}
public class StandardLayouter extends SimpleLayouter {
}
package CH.ifa.draw.contrib;
package org.jhotdraw.contrib;
public class StandardStorageFormat implements StorageFormat {
}
public class StandardStorageFormat implements StorageFormat {
    public boolean isRestoreFormat ();
}
package CH.ifa.draw.util;
package org.jhotdraw.util;
package CH.ifa.draw.util;
package org.jhotdraw.util;
package CH.ifa.draw.util;
package org.jhotdraw.util;
package CH.ifa.draw.util;
package org.jhotdraw.util;
public class StorableInput extends Object {
}
public class StorableInput {
}
public class StorableInput {
}
public class StorableInput {
    public long readLong () throws IOException;
}
public class StorableOutput extends Object {
}
public class StorableOutput extends Object {
}
package CH.ifa.draw.util;
package org.jhotdraw.util;
public interface StorageFormat {
    public Drawing restore (String fileName) throws IOException;
    public FileFilter getFileFilter ();
    public String store (String fileName, Drawing saveDrawing) throws IOException;
}
interface StorageFormat {
}
interface StorageFormat {
}
public interface StorageFormat {
    public Drawing restore (String fileName) throws IOException;
    public FileFilter getFileFilter ();
    public String store (String fileName, Drawing saveDrawing) throws IOException;
    public boolean isRestoreFormat ();
    public boolean isStoreFormat ();
}
package CH.ifa.draw.util;
package org.jhotdraw.util;
public class StorageFormatManager {
}
public class StorageFormatManager {
}
package CH.ifa.draw.util;
package org.jhotdraw.util;
public class SVGStorageFormat extends StandardStorageFormat {
}
public class SVGStorageFormat extends StandardStorageFormat {
    public boolean isRestoreFormat ();
    public boolean isStoreFormat ();
}
package CH.ifa.draw.contrib;
package org.jhotdraw.contrib;
package CH.ifa.draw.contrib;
package org.jhotdraw.contrib;
public class TextAreaFigure extends AttributeFigure implements FigureChangeListener, TextHolder {
}
public class TextAreaFigure extends AttributeFigure implements FigureChangeListener, TextHolder {
}
public class TextAreaFigure extends AttributeFigure implements FigureChangeListener, TextHolder {
    protected Vector fParagraphs = new Vector ();
}
public class TextAreaFigure extends AttributeFigure implements FigureChangeListener, TextHolder {
    protected List fParagraphs;
}
public class TextAreaFigure extends AttributeFigure implements FigureChangeListener, TextHolder {
}
public class TextAreaFigure extends AttributeFigure implements FigureChangeListener, TextHolder {
}
package CH.ifa.draw.contrib;
package org.jhotdraw.contrib;
public class TextFigure extends AttributeFigure implements FigureChangeListener, TextHolder {
}
public class TextFigure extends AttributeFigure implements FigureChangeListener, TextHolder {
    protected void setLocator (OffsetLocator newLocator);
    public Figure getObservedFigure ();
}
package CH.ifa.draw.figures;
package org.jhotdraw.figures;
public class TextFigure extends AttributeFigure implements FigureChangeListener, TextHolder {
}
public class TextFigure extends AttributeFigure implements FigureChangeListener, TextHolder {
}
public class TextFigure extends AttributeFigure implements FigureChangeListener, TextHolder {
}
public class TextFigure extends AttributeFigure implements FigureChangeListener, TextHolder {
}
public class TextFigure extends AttributeFigure implements FigureChangeListener, TextHolder {
}
public class TextFigure extends AttributeFigure implements FigureChangeListener, TextHolder {
}
public class TextFigure extends AttributeFigure implements FigureChangeListener, TextHolder {
}
public class TextFigure extends AttributeFigure implements FigureChangeListener, TextHolder {
}
public interface TextHolder {
}
public interface TextHolder {
}
public interface TextHolder {
}
public interface TextHolder {
}
package CH.ifa.draw.standard;
package org.jhotdraw.standard;
public class TextHolderContentProducer extends AbstractContentProducer implements Serializable {
    public TextHolderContentProducer (TextHolder figure) {
        fFigure = figure;
    }
}
public class TextHolderContentProducer extends AbstractContentProducer implements Serializable {
    public TextHolderContentProducer (TextHolder figure) {
        setTextHolder (figure);
    }
}
package CH.ifa.draw.contrib.html;
package org.jhotdraw.contrib.html;
package CH.ifa.draw.figures;
package org.jhotdraw.figures;
public class TextTool extends CreationTool {
}
public class TextTool extends CreationTool {
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
}
public class TextTool extends CreationTool {
    public TextTool (DrawingView view, Figure prototype) {
    }
}
public class TextTool extends CreationTool {
    public TextTool (DrawingEditor newDrawingEditor, Figure prototype) {
    }
}
public class TextTool extends CreationTool {
}
public class TextTool extends CreationTool {
}
public class TextTool extends CreationTool {
}
public class TextTool extends CreationTool {
    protected Undoable createDeleteUndoActivity ();
}
package CH.ifa.draw.standard;
package org.jhotdraw.standard;
public class ToggleGridCommand extends Command {
}
public class ToggleGridCommand extends AbstractCommand {
}
public class ToggleGridCommand extends AbstractCommand {
}
public class ToggleGridCommand extends Command {
}
public class ToggleGridCommand extends Command {
}
public class ToggleGridCommand extends AbstractCommand {
}
public class ToggleGridCommand extends AbstractCommand {
    public ToggleGridCommand (String name, DrawingView view, Point grid) {
    }
}
public class ToggleGridCommand extends AbstractCommand {
    public ToggleGridCommand (String name, DrawingEditor newDrawingEditor, Point grid) {
    }
}
public interface Tool {
}
public interface Tool {
    public DrawingView view ();
    public void setUndoActivity (Undoable newUndoableActivity);
}
public interface Tool {
}
public interface Tool {
}
public interface Tool {
}
public interface Tool {
    public boolean isActive ();
    public void setUsable (boolean newIsUsable);
}
package CH.ifa.draw.framework;
package org.jhotdraw.framework;
package CH.ifa.draw.standard;
package org.jhotdraw.standard;
public class ToolButton extends PaletteButton {
}
public class ToolButton extends PaletteButton implements ToolListener {
    public void toolActivated (EventObject toolEvent);
    public void toolDeactivated (EventObject toolEvent);
    public void toolUnusable (EventObject toolEvent);
    public void toolUsable (EventObject toolEvent);
}
public class ToolButton extends PaletteButton implements ToolListener {
}
public class ToolButton extends PaletteButton implements ToolListener {
    public void toolDisabled (EventObject toolEvent);
}
public class ToolButton extends PaletteButton implements ToolListener {
}
public class ToolButton extends PaletteButton implements ToolListener {
}
public interface ToolListener extends EventListener {
}
public interface ToolListener {
}
package CH.ifa.draw.framework;
package org.jhotdraw.framework;
public class TriangleFigure extends RectangleFigure {
    protected int fRotation = 0;
}
public class TriangleFigure extends RectangleFigure {
}
public class TriangleFigure extends RectangleFigure {
}
public class TriangleFigure extends RectangleFigure {
}
package CH.ifa.draw.contrib;
package org.jhotdraw.contrib;
package CH.ifa.draw.contrib.html;
package org.jhotdraw.contrib.html;
class TriangleRotationHandle extends AbstractHandle {
    public static class UndoActivity extends UndoableAdapter {
        public UndoActivity () {
        }
    }
}
class TriangleRotationHandle extends AbstractHandle {
    public static class UndoActivity extends UndoableAdapter {
        public UndoActivity (DrawingView newView) {
        }
    }
}
package CH.ifa.draw.contrib;
package org.jhotdraw.contrib;
package CH.ifa.draw.util;
package org.jhotdraw.util;
public class UndoableAdapter implements Undoable {
}
public class UndoableAdapter implements Undoable {
}
package CH.ifa.draw.util;
package org.jhotdraw.util;
package CH.ifa.draw.util;
package org.jhotdraw.util;
public class UndoableHandle implements Handle {
}
public class UndoableHandle implements Handle {
    public UndoableHandle (Handle newWrappedHandle) {
    }
}
package CH.ifa.draw.util;
package org.jhotdraw.util;
public class UndoableTool implements Tool, ToolListener {
}
public class UndoableTool implements Tool, ToolListener {
    public boolean isActive ();
    public void toolDisabled (EventObject toolEvent);
}
public class UndoableTool implements Tool, ToolListener {
}
public class UndoableTool implements Tool, ToolListener {
}
package CH.ifa.draw.util;
package org.jhotdraw.util;
package CH.ifa.draw.util;
package org.jhotdraw.util;
public class UndoManager {
}
public class UndoManager {
}
public class UndoManager {
}
public class UndoManager {
}
package CH.ifa.draw.util;
package org.jhotdraw.util;
package CH.ifa.draw.util;
package org.jhotdraw.util;
package CH.ifa.draw.figures;
package org.jhotdraw.figures;
public class UngroupCommand extends Command {
}
public class UngroupCommand extends AbstractCommand {
}
public class UngroupCommand extends AbstractCommand {
}
public class UngroupCommand extends Command {
}
public class UngroupCommand extends Command {
}
public class UngroupCommand extends AbstractCommand {
    public static class UndoActivity extends UndoableAdapter {
        protected void ungroupFigures ();
        public UndoActivity (DrawingView newDrawingView) {
        }
        public boolean redo ();
        public boolean undo ();
    }
}
public class UngroupCommand extends AbstractCommand {
    public UngroupCommand (String name, DrawingView view) {
    }
}
public class UngroupCommand extends AbstractCommand {
    public UngroupCommand (String name, DrawingEditor newDrawingEditor) {
    }
}
public class URLContentProducer extends FigureDataContentProducer implements Serializable {
    protected URL fURL = null;
    public URLContentProducer (URL url) {
        fURL = url;
    }
}
public class URLContentProducer extends FigureDataContentProducer implements Serializable {
    public URLContentProducer (URL url) {
        setURL (url);
    }
}
package CH.ifa.draw.contrib.html;
package org.jhotdraw.contrib.html;
package CH.ifa.draw.samples.javadraw;
package org.jhotdraw.samples.javadraw;
public class URLTool extends AbstractTool {
}
public class URLTool extends AbstractTool {
}
public class URLTool extends AbstractTool {
    public URLTool (DrawingView view) {
    }
}
public class URLTool extends AbstractTool {
    public URLTool (DrawingEditor newDrawingEditor) {
    }
}
package CH.ifa.draw.util;
package org.jhotdraw.util;
package CH.ifa.draw.util;
public class VersionManagement {
    public static Package [] packages = {Package.getPackage ("CH.ifa.draw.applet"), Package.getPackage ("CH.ifa.draw.application"), Package.getPackage ("CH.ifa.draw.contrib"), Package.getPackage ("CH.ifa.draw.figures"), Package.getPackage ("CH.ifa.draw.framework"), Package.getPackage ("CH.ifa.draw.standard"), Package.getPackage ("CH.ifa.draw.util")};
    public static String JHOTDRAW_COMPONENT = "CH.ifa.draw/";
}
package org.jhotdraw.util;
public class VersionManagement {
    public static Package [] packages = {Package.getPackage ("org.jhotdraw.applet"), Package.getPackage ("org.jhotdraw.application"), Package.getPackage ("org.jhotdraw.contrib"), Package.getPackage ("org.jhotdraw.figures"), Package.getPackage ("org.jhotdraw.framework"), Package.getPackage ("org.jhotdraw.standard"), Package.getPackage ("org.jhotdraw.util")};
    public static String JHOTDRAW_COMPONENT = "org.jhotdraw/";
}
package CH.ifa.draw.util;
package org.jhotdraw.util;
public interface ViewChangeListener extends EventListener {
}
public interface ViewChangeListener {
}
public interface ViewChangeListener {
}
public interface ViewChangeListener extends EventListener {
}
package CH.ifa.draw.framework;
package org.jhotdraw.framework;
public class WindowMenu extends CommandMenu {
    public WindowMenu (String newText, MDIDesktopPane desktop, DrawingEditor editor) {
    }
}
public class WindowMenu extends CommandMenu {
    public WindowMenu (String newText, MDIDesktopPane newDesktop, DrawingEditor newEditor) {
    }
}
public class WindowMenu extends CommandMenu {
    class ChildMenuItem extends JCheckBoxMenuItem {
        public ChildMenuItem (JInternalFrame frame) {
        }
    }
}
public class WindowMenu extends CommandMenu {
    class ChildMenuItem extends JCheckBoxMenuItem {
        public ChildMenuItem (JInternalFrame newFrame) {
        }
    }
}
package CH.ifa.draw.contrib;
package org.jhotdraw.contrib;
package CH.ifa.draw.contrib.zoom;
package org.jhotdraw.contrib.zoom;
public class ZoomCommand extends AbstractCommand {
    public ZoomCommand (String name, float scale, DrawingEditor newDrawingEditor) {
    }
}
public class ZoomCommand extends AbstractCommand {
    public ZoomCommand (String newSame, float newScale, DrawingEditor newDrawingEditor) {
    }
}
package CH.ifa.draw.contrib.zoom;
package org.jhotdraw.contrib.zoom;
package CH.ifa.draw.contrib.zoom;
package org.jhotdraw.contrib.zoom;
public class ZoomDrawingView extends StandardDrawingView {
}
public class ZoomDrawingView extends StandardDrawingView {
    public ZoomDrawingView (Drawing drawing, DrawingEditor editor) {
    }
    public ZoomDrawingView (Drawing drawing, DrawingEditor editor, int width, int height) {
    }
}
public class ZoomDrawingView extends StandardDrawingView {
    public ZoomDrawingView (Drawing drawing, DrawingEditor editor) {
    }
    public ZoomDrawingView (Drawing drawing, DrawingEditor editor, int width, int height) {
    }
}
public class ZoomDrawingView extends StandardDrawingView {
}
public class ZoomDrawingView extends StandardDrawingView {
}
public class ZoomDrawingView extends StandardDrawingView {
}
package CH.ifa.draw.contrib.zoom;
package org.jhotdraw.contrib.zoom;
package CH.ifa.draw.contrib.zoom;
package org.jhotdraw.contrib.zoom;
