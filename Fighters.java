public class Fighters { 
    public static void main(String[] args) {

        // set the scale of the coordinate system
        StdDraw.setXscale(-1.0, 1.0);
        StdDraw.setYscale(-1.0, 1.0);
        StdDraw.enableDoubleBuffering();

        // initial values
        double rx = 0.480, ry = 0.860;     // position
        double vx = 0.015, vy = 0.023;     // velocity
        double radius = 0.06;              // radius
        
        double rx2 = 0.210, ry2 = 0.210;     // position
        double vx2 = -0.015, vy2 = -0.023;     // velocity
        double radius2 = 0.06;              // radius

        // main animation loop
        while (true)  { 

            // bounce off wall according to law of elastic collision
            if (Math.abs(rx + vx) > 1.0 - radius) vx = -vx;
            if (Math.abs(ry + vy) > 1.0 - radius) vy = -vy;
            if (Math.abs(rx2 + vx2) > 1.0 - radius2) vx2 = -vx2;
            if (Math.abs(ry2 + vy2) > 1.0 - radius2) vy2 = -vy2;
            //if (Math.abs(rx + vx) > 1.0) vx = -vx;
            //if (Math.abs(ry + vy) > 1.0) vy = -vy;
            // update position
            rx = rx + vx; 
            ry = ry + vy;
            rx2 = rx2 + vx2; 
            ry2 = ry2 + vy2;

            // clear the background
            //StdDraw.clear(StdDraw.LIGHT_GRAY);
            StdDraw.clear();

            // draw ball on the screen
            //StdDraw.setPenColor(StdDraw.BLACK);
            //StdDraw.setPenColor(StdDraw.RED);
            //StdDraw.filledCircle(rx, ry, radius);
            //picture(double x, double y, String filename, double scaledWidth, double scaledHeight)
            StdDraw.picture(rx,ry,"xwing.jpg", 0.5, 0.5);
            StdDraw.picture(rx2,ry2,"tie.jpg", 0.5, 0.5);
            // copy offscreen buffer to onscreen
            StdDraw.show();

            // pause for 20 ms
            StdDraw.pause(25);

        } 
    } 
} 