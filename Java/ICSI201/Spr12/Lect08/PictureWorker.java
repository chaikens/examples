class PictureWorker
{
  public static void main(String a[])
  {
    String fileName = FileChooser.pickAFile();
    Picture myPicture = new Picture( fileName );
    System.out.println(myPicture);
    //myPicture.show();
    //myPicture.explore();
    for (int x = 526; x <=myPicture.getWidth()-1; x=x+1)
    {
     Pixel addrPix = myPicture.getPixel(x,132);
     System.out.println(addrPix);
     addrPix.setRed(255);
     addrPix = myPicture.getPixel(x,132+1);
     System.out.println(addrPix);
     addrPix.setRed(255);
    }
    myPicture.explore();
    //myPicture.write("/tmp/Lect08Result.bmp");
  }
}
