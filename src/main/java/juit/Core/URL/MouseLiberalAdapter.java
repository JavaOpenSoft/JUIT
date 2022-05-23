package juit.Core.URL;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.io.IOException;
import java.net.URISyntaxException;

public abstract class MouseLiberalAdapter extends MouseAdapter {


    private boolean isComponentPressedDown = false;
    private long lastUnusedLiberalSingleClickTimeStamp = 0;
    private final int slowestDoubleClickMilliseconds = 1800;
    public void mouseLiberalClick(MouseEvent e) throws URISyntaxException, IOException {
    }

    /**
     * mouseLiberalDoubleClick, Override this function to catch liberal double click events.
     *
     * Note: The mouse event which is passed to this function will be the mouse event that was
     * received from the "mouseRelease" event at the end of the liberal double click.
     */
    public void mouseLiberalDoubleClick(MouseEvent e) {
    }

    /**
     * mouseClick, Override this function to catch standard mouse click events.
     */
    public void mouseClick(MouseEvent e) {
    }

    /**
     * mousePress, Override this function to catch standard mouse press events.
     */
    public void mousePress(MouseEvent e) {
    }

    /**
     * mouseRelease, Override this function to catch standard mouse release events.
     */
    public void mouseRelease(MouseEvent e) {
    }

    /**
     * mouseEnter, Override this function to catch standard mouse enter events.
     */
    public void mouseEnter(MouseEvent e) {
    }

    /**
     * mouseExit, Override this function to catch standard mouse exit events.
     */
    public void mouseExit(MouseEvent e) {
    }

    /**
     * mouseWheelMove, Override this function to catch standard mouse wheel move events.
     */
    public void mouseWheelMove(MouseWheelEvent e) {
    }

    /**
     * mouseDrag, Override this function to catch standard mouse drag events.
     */
    public void mouseDrag(MouseEvent e) {
    }

    /**
     * mouseMove, Override this function to catch standard mouse move events.
     */
    public void mouseMove(MouseEvent e) {
    }

    /**
     * mousePressed, Final function. Handles mouse pressed events.
     */
    @Override
    final public void mousePressed(MouseEvent e) {
        // Record that the component is "pressed down".
        isComponentPressedDown = true;
        // Call the mouse press event.
        mousePress(e);
    }

    /**
     * mouseReleased, Final function. Handles mouse released events. This function also detects
     * liberal single clicks, and liberal double clicks.
     */
    @Override
    final public void mouseReleased(MouseEvent e) {
        // Check to see if this mouse release completes a liberal single click.
        if (isComponentPressedDown) {
            // A liberal single click has occurred.
            try {
                mouseLiberalClick(e);
            } catch (URISyntaxException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            // Check to see if we had two liberal single clicks within the double click time window.
            long now = System.currentTimeMillis();
            long timeBetweenUnusedClicks = now - lastUnusedLiberalSingleClickTimeStamp;
            if (timeBetweenUnusedClicks <= slowestDoubleClickMilliseconds) {
                // A liberal double click has occurred.
                mouseLiberalDoubleClick(e);
                // Mark the single click timestamp as "used" by this double click.
                lastUnusedLiberalSingleClickTimeStamp = 0;
            } else {
                // Save the single click timestamp as part of a possible future double click.
                lastUnusedLiberalSingleClickTimeStamp = System.currentTimeMillis();
            }
        }
        // Record the mouse release.
        isComponentPressedDown = false;
        // Call the mouse release event.
        mouseRelease(e);
    }

    /**
     * mouseEntered, Final function. Handles mouse entered events.
     */
    @Override
    final public void mouseEntered(MouseEvent e) {
        // Call the mouse enter event.
        mouseEnter(e);
    }

    /**
     * mouseExited, Final function. Handles mouse exited events.
     */
    @Override
    final public void mouseExited(MouseEvent e) {
        // Since the mouse left the component, the component is no longer considered "press down".
        isComponentPressedDown = false;
        // Call the mouse exit event.
        mouseExit(e);
    }

    /**
     * mouseClicked, Final function. Handles mouse clicked events.
     */
    @Override
    final public void mouseClicked(MouseEvent e) {
        // Call the mouse click event.
        mouseClick(e);
    }

    /**
     * mouseWheelMoved, Final function. Handles mouse wheel moved events.
     */
    @Override
    final public void mouseWheelMoved(MouseWheelEvent e) {
        // Call the mouse wheel move event.
        mouseWheelMove(e);
    }

    /**
     * mouseDragged, Final function. Handles mouse dragged events.
     */
    @Override
    final public void mouseDragged(MouseEvent e) {
        // Call the mouse drag event.
        mouseDrag(e);
    }

    /**
     * mouseMoved, Final function. Handles mouse moved events.
     */
    @Override
    final public void mouseMoved(MouseEvent e) {
        // Call the mouse move event.
        mouseMove(e);
    }
}