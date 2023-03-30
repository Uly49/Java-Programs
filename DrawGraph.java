/*
 * another demo using StdDraw to draw something on the screen
 * this program creates a simple graph of a math function
 * the graph is drawn using linear approximations
 */

import java.util.Scanner;

class DrawGraph {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("How many points should be generated to draw the graph of f(x)?");
    int numPoints = in.nextInt();
    while (numPoints <=1) {
      System.out.println("need at least two points to draw the graph");
      System.out.println("How many points should be generated to draw the graph of f(x)?");
      numPoints = in.nextInt();
    }
    double xMin = -10;
    double xMax = 10;
    double yMin = -10;
    double yMax = 10;
    //set the "window" for the graph
    StdDraw.setXscale(xMin, xMax);

    
    double deltaX = (xMax-xMin) / numPoints; //calculate the "step size" for the points
    //generate x-values for the points
    double[] xValues = new double[numPoints];
    for (int i=0; i<xValues.length; i++) {
      xValues[i] = xMin + (deltaX * i);
    }
    double[] yValues = computeYValues(xValues); //generate corresponding y-values using method
    
    double maxY = findMax(yValues);
    if (maxY > yMax) {
      yMax = maxY; //"stretch" the window upwards if necessary
    }
    StdDraw.setYscale(yMin, yMax);
    
    //draw the coordinate axes
    StdDraw.line(xMin,0,xMax,0); //x-axis
    StdDraw.line(0,yMin,0,yMax); //y-axis
    
    //graph the points
    StdDraw.setPenRadius(0.01);
    for (int i=0; i<xValues.length; i++) {
      StdDraw.point(xValues[i], yValues[i]);
    }
    
    //to draw the graph we will use short line segments connecting consecutive points
    //this is a "linear approximation" to the actual graph
    StdDraw.setPenRadius();
    for (int i=0; i<xValues.length-1; i++) {
      StdDraw.line(xValues[i], yValues[i], xValues[i+1], yValues[i+1]);
    }
    
  }
  
  /*
   * a method to represent the math function f(x) = e^(0.5x)
   * takes in a real number (double) x
   * returns the y-value
   */
  public static double f(double x) {
    return Math.exp(0.5*x);
  }
  
  /*
   * this method takes in an array of x-values
   * it returns an array, of the same size, of corresponding y-values using the f(x) function
   */
  public static double[] computeYValues(double[] xValues) {
    double[] yValues = new double[xValues.length]; //make an array of same size to store y's
    for (int i=0; i<yValues.length; i++) {
      yValues[i] = f(xValues[i]);
    }
    return yValues;
  }
  
  /*
   * find the max of the given yValues array
   */
  public static double findMax(double[] yValues) {
    double max = yValues[0];
    for (int i=1; i<yValues.length; i++) {
      if (yValues[i] > max) {
        max = yValues[i];
      }
    }
    return max;
  }
}