/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.explore();
    swan.edgeDetection(10);
    swan.explore();
  }
  public static void testKeepOnlyBlue()
  {
      Picture beach = new Picture("beach.jpg");
      beach.explore();
      beach.keepOnlyBlue();
      beach.explore();
  }

  public static void testNegate()
  {
    Picture beach = new Picture("beach.jpg");
      beach.explore();
      beach.negate();
      beach.explore();
  }

  public static void testGrayscale()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.grayscale();
    beach.explore();
  }

  public static void testFixUnderwater()
  {
    Picture underWater = new Picture("water.jpg");
    underWater.explore();
    underWater.fixUnderWater();
    underWater.explore();
  }

  public static void testMirrorVerticalRightToLeft()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
  }

  public static void testMirrorHorizonal()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizonal();
    caterpillar.explore();
  }
  
  public static void testMirrorHorizonalBotToTop()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizonalBotToTop();
    caterpillar.explore();
  }

  public static void testMirrorDiagnol()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.mirrorDiagnol();
    beach.explore();
  }
  public static void testMirrorDiagnolTryCatchLoop()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.mirrorDiagnolTryCatchLoopVer();
    beach.explore();
  }

  public static void testMirrorArms()
  {
    Picture snowman = new Picture("snowman.jpg");
    snowman.explore();
    snowman.mirrorArms();;
    snowman.explore();
  }

  public static void testMirrorGull()
  {
    Picture seagull = new Picture("seagull.jpg");
    seagull.explore();
    seagull.mirrorGull();
    seagull.explore();
  }

  public static void testCopy()
  {
    Picture canvas = new Picture("640x480.jpg");
    Picture seagull = new Picture("seagull.jpg");
    canvas.explore();
    canvas.copy(seagull, 100, 100, 200, 300, 200, 300);
    canvas.explore();
  }

  public static void testMyCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    Picture seagull = new Picture("seagull.jpg");
    Picture beach = new Picture("beach.jpg");
    canvas.explore();
    canvas.createMyCollage(seagull, beach, 200, 400, 200, 400, 200, 400, 200, 400);
    canvas.explore();

  }
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorVerticalRightToLeft();
    //testMirrorHorizonal();
    //testMirrorHorizonalBotToTop();
    //testMirrorDiagnol();
    //testMirrorDiagnolTryCatchLoop();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testCollage();
    //testCopy();
    //testMyCollage();
    testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}