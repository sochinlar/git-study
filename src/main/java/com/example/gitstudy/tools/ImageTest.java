package com.example.gitstudy.tools;

import java.awt.Color;
import java.awt.Font;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;


public class ImageTest {
    public static void main(String[] args)throws Exception{
        OperateImage imageObj = new OperateImage();  
        String srcPath = "C:\\Users\\Administrator\\Desktop\\社保.jpg";
        String toPath = "C:\\Users\\Administrator\\Desktop\\社保1.jpg";
        imageObj.resizeImage(srcPath, toPath, 413, 626);//按指定的长宽重置图形大小
 /*       int x = 0;
        int y = 0; 
        int width = 180; 
        int height = 300 ; 
        String readImageFormat = "jpg"; 
        String writeImageFormat = "jpg";  
        imageObj.cropImage(srcPath, toPath, x, y, width, height,readImageFormat,writeImageFormat);//剪切图片  
        */
        
/*        
        String srcPath = "C:/Users/sunarvr/Desktop/imagetest/pic1.jpg";
        String toPath = "C:/Users/sunarvr/Desktop/imagetest/pic1_change_size.jpg";
        imageObj.resizeImage(srcPath, toPath, 400, 400);//按指定的长宽重置图形大小  
       */ 
        
/*        String srcPath = "C:/Users/sunarvr/Desktop/imagetest/pic1.jpg";
        String toPath = "C:/Users/sunarvr/Desktop/imagetest/pic1_reduce.jpg";
        imageObj.reduceImageByRatio(srcPath, toPath, 2, 2);//按指定长和宽的比例缩小图形  
*/   
        
/*        String srcPath = "C:/Users/sunarvr/Desktop/imagetest/pic1.jpg";
        String toPath = "C:/Users/sunarvr/Desktop/imagetest/pic1_enlarge.jpg";
        imageObj.enlargementImageByRatio(srcPath, toPath, 2, 2);//按指定长和宽的比例放大图形  
*/        
/*        String srcPath = "C:/Users/sunarvr/Desktop/imagetest/pic3.jpg";
        String toPath = "C:/Users/sunarvr/Desktop/imagetest/pic3_reduce.jpg";
        imageObj.reduceImageEqualProportion(srcPath, toPath, 4);//长高等比例缩小 
    */
/*        String srcPath = String srcPath = "C:/Users/sunarvr/Desktop/imagetest/pic4.jpg";
        String toPath = "C:/Users/sunarvr/Desktop/imagetest/pic4_enlarge.jpg";
        imageObj.enlargementImageEqualProportion(srcPath, toPath, 2);//长高等比例放大  
        */

/*        String negativeImagePath ="C:/Users/sunarvr/Desktop/imagetest/pic2.jpg";
        String additionImagePath ="C:/Users/sunarvr/Desktop/imagetest/pic3_reduce.jpg";
        int x = 130; 
        int y = 80; 
        String toPath ="C:/Users/sunarvr/Desktop/imagetest/pic2+pic3_reduce.jpg";
        imageObj.mergeBothImage(negativeImagePath, additionImagePath, x, y, toPath); //按指定坐标合并图片  
        
       */ 
        
    /*    String negativeImagePath ="C:/Users/sunarvr/Desktop/imagetest/pic2.jpg";
        String additionImagePath ="C:/Users/sunarvr/Desktop/imagetest/pic3_reduce.jpg";
        String toPath ="C:/Users/sunarvr/Desktop/imagetest/pic2+pic3_居中.jpg";*/
//        imageObj.mergeBothImageTopleftcorner(negativeImagePath, additionImagePath, toPath);//合并到左上角  
        //imageObj.mergeBothImageToprightcorner(negativeImagePath, additionImagePath, toPath);//合并到右上角  
        //imageObj.mergeBothImageLeftbottom(negativeImagePath, additionImagePath, toPath);//合并到左下角  
        //imageObj.mergeBothImageRightbottom(negativeImagePath, additionImagePath, toPath);//合并到右下角  
        //imageObj.mergeBothImageCenter(negativeImagePath, additionImagePath, toPath);//合并到正中央  
        //imageObj.mergeBothImageTopcenter(negativeImagePath, additionImagePath, toPath);//合并到上边中央  
        //imageObj.mergeBothImageBottomcenter(negativeImagePath, additionImagePath, toPath);//合并到下边中央  
        //imageObj.mergeBothImageLeftcenter(negativeImagePath, additionImagePath, toPath);//合并到左边中央  
        //imageObj.mergeBothImageRightcenter(negativeImagePath, additionImagePath, toPath);//合并到右边中央  
       
/*        String srcImage ="C:/Users/sunarvr/Desktop/imagetest/pic4.jpg";
        String toPath ="C:/Users/sunarvr/Desktop/imagetest/pic4_CS_sRGB.jpg";
        String imageFormat = "jpg"; 
//        imageObj.grayImage(srcImage, toPath, imageFormat);//图片灰化 
        imageObj.testConvertImage(srcImage, toPath, imageFormat);
          */
        
/*        String firstSrcImagePath = "C:/Users/sunarvr/Desktop/imagetest/pic4.jpg";
        String secondSrcImagePath = "C:/Users/sunarvr/Desktop/imagetest/pic1.jpg";
        String imageFormat = "jpg"; 
        String toPath = "C:/Users/sunarvr/Desktop/imagetest/pic41.jpg";
        imageObj.joinImagesHorizontal(firstSrcImagePath, secondSrcImagePath, imageFormat, toPath);//横向拼接图片 
         */
          
         
/*        String firstSrcImagePath = "C:/Users/sunarvr/Desktop/imagetest/pic1.jpg";
        String secondSrcImagePath = "C:/Users/sunarvr/Desktop/imagetest/pic4.jpg";
        String imageFormat = "jpg"; 
        String toPath = "C:/Users/sunarvr/Desktop/imagetest/pic14.jpg";
        imageObj.joinImagesVertical(firstSrcImagePath, secondSrcImagePath, imageFormat, toPath);//纵向拼接图片 
         
          */
        
        
  /*      String srcImagePath ="C:/Users/sunarvr/Desktop/imagetest/pic4.jpg";
        int[] xPoints = {200,400,500,400,200,100};  
        int[] yPoints = {100,100,270,440,440,270}; 
        int nPoints = 6;  
        String toPath = "C:/Users/sunarvr/Desktop/imagetest/pic4_polygon.jpg";
        imageObj.drawPolygon(srcImagePath, xPoints, yPoints, nPoints, Color.MAGENTA, "jpg", toPath); //根据坐标数组绘制多边形 
         */
        
        
/*  
        String srcImagePath = "C:/Users/sunarvr/Desktop/imagetest/pic2.jpg";
        String appendImagePath ="C:/Users/sunarvr/Desktop/imagetest/pic3.jpg";
        float alpha = 0.5F; 
        String  font = "宋体"; 
        int fontStyle = Font.PLAIN; 
        int fontSize = 32; 
        Color color = Color.RED; 
        String inputWords = "图片上设置水印文字 ---- 宋体 普通字体 32号字 红色 透明度0.5"; 
        int x = 0; 
        int y = 0; 
        String imageFormat = "jpg"; 
        String toPath = "C:/Users/sunarvr/Desktop/imagetest/pic23_font.jpg";
//        imageObj.alphaWords2Image(srcImagePath, alpha, font, fontStyle, fontSize, color, inputWords, x, y, imageFormat, toPath); //设置文字水印  

        imageObj.alphaImage2Image(srcImagePath, appendImagePath, alpha, x, y, 400, 300, imageFormat, toPath);//设置图片水印  
        */  
         
/*        String srcImagePath = "D:/test/fileSource/003.jpg"; 
        int[] xPoints = {100,150,200,240,300}; 
        int[] yPoints = {200,60,280,160,100}; 
        int nPoints = 5; 
        Color lineColor = Color.RED; 
        String toPath = "D:/test/desk/polyline-003.jpg"; 
        String imageFormat = "jpg"; 
        imageObj.drawPolyline(srcImagePath, xPoints, yPoints, nPoints, lineColor,toPath, imageFormat);//画折线 
          */    
          
        /* 
        int x1 = 50; 
        int y1 = 100; 
        int x2 = 600; 
        int y2 = 150; 
        Color lineColor = Color.BLUE; 
        imageObj.drawLine(srcImagePath, x1, y1, x2, y2, lineColor,toPath, imageFormat);//画线段 
         */       
          
         
/*        String srcImagePath = "C:/Users/sunarvr/Desktop/imagetest/pic4_circle.jpg";
        int x = 1; 
        int y = 1; 
        int width = 2; 
        int height = 2; 
        Color ovalColor = Color.CYAN; 
        String imageFormat = "jpg"; 
        String toPath = "C:/Users/sunarvr/Desktop/imagetest/pic4_circle11.jpg";
        imageObj.drawPoint(srcImagePath, x, y, width, height, ovalColor, imageFormat, toPath);//画一个圆点 
         */ 
          
/*        List<Point> pointList = new ArrayList<Point>(); 
        Point p1 = new Point(150,200); 
        pointList.add(p1); 
        Point p2 = new Point(450,700); 
        pointList.add(p2); 
        Point p3 = new Point(300,450); 
        pointList.add(p3); 
        Point p4 = new Point(150,700); 
        pointList.add(p4); 
        Point p5 = new Point(450,200); 
        pointList.add(p5); 
        String srcImagePath =  "C:/Users/sunarvr/Desktop/imagetest/pic4.jpg";
        int width = 200; 
        int height = 200; 
        Color ovalColor = Color.RED; 
        String imageFormat = "jpg";  
        String toPath ="C:/Users/sunarvr/Desktop/imagetest/pic4_point.jpg";
        imageObj.drawPoints(srcImagePath, pointList, width, height, ovalColor, imageFormat, toPath);//画出一组（多个）点 
            
     */     
        /* 
        int[] xPoints = {50,100,180,400,600}; 
        int[] yPoints = {200,100,160,300,640}; 
        int nPoints = 5; 
        Color lineColor = Color.PINK; 
        String srcImagePath = "D:/test/fileSource/003.jpg"; 
        String toPath = "D:/test/desk/showpoints-003.jpg"; 
        imageObj.drawPolylineShowPoints(srcImagePath, xPoints, yPoints, nPoints, lineColor, width, height, ovalColor, toPath, imageFormat);//画折线并突出显示点 
         */     
          
         
/*        String srcImagePath = "C:/Users/sunarvr/Desktop/imagetest/pic4.jpg";
        int[] xPoints = {200,400,500,400,200,100};  
        int[] yPoints = {100,100,270,440,440,270}; 
        int nPoints = 6; 
        Color polygonColor = Color.PINK; 
        float alpha = (float) 0.5; 
        String imageFormat ="jpg"; 
        String toPath = "C:/Users/sunarvr/Desktop/imagetest/pic4_polygon2.jpg";
        imageObj.drawAndAlphaPolygon(srcImagePath, xPoints, yPoints, nPoints, polygonColor, alpha, imageFormat, toPath); //画多边形并填充
         */ 
        /* 
        String negativeImagePath = "D:/test/fileSource/001.jpg"; 
        String additionImagePath = "D:/test/fileSource/006.png"; 
        String  toPath = "D:/test/fileSource/001.jpg"; 
        long start = System.currentTimeMillis(); 
        for(int i=0;i<1000;i++){ 
            Random rand = new Random(); 
            int x = rand.nextInt(1024); 
            int y =  rand.nextInt(768); 
            imageObj.mergeBothImage(negativeImagePath, additionImagePath, x, y, toPath);//每次附加合并一张图片(循环若干次) 
        } 
        long end = System.currentTimeMillis(); 
        System.out.println(end-start);*/  
        //100 -- 45844  
        //1000 -- 411156  
        /*改进思路：将mergeBothImage方法 修改为mergeImageList方法， 
        通过将图片的坐标点装入list容器，然后再取出一来在方法中一次性与图片合并, 
        不再每次都打开底图、保存合成图片，关闭流*/  
  
        //叠加组合图像  
        /*String negativeImagePath = "D:/test/fileSource/001.jpg"; 
        String  toPath = "D:/test/fileSource/001.jpg"; 
        String additionImagePath = "D:/test/fileSource/007.png"; 
        List additionImageList = new ArrayList(); 
        int count = 0; 
        for(int i=0;i<100;i++){//为什么总是连续生成一样的随机数？？？ 
            Random rand = new Random(); 
            int x = rand.nextInt(1020); 
            String xStr = x+""; 
            int y =  rand.nextInt(760); 
            String yStr = y +""; 
            String[] str = {xStr,yStr,additionImagePath}; 
            additionImageList.add(str); 
            count++; 
            //System.out.println(xStr+"   :     "+yStr); 
        } 
        System.out.println(count); 
        long start = System.currentTimeMillis(); 
        imageObj.mergeImageList(negativeImagePath, additionImageList,"jpg", toPath); 
        long end = System.currentTimeMillis(); 
        System.out.println(end-start);*/  
        //                                第一次        第二次      第三次  
        //100张耗时(毫秒)        --2003          1792            1869           1747         1871            1793  
        //1000张耗时(毫秒)   --15334         15200       15236         15903         16028       15545  
        //10000张耗时(毫秒)  --153010        153340      152673       154978         156506      154854                                 
        //如果list.size()<=100,则调用此方法，  
        //如果list.size()>100,则调用Jmagick的方法。  
          
        /*List iamgePathList = new ArrayList();     // D:/test/16a/ 
        iamgePathList.add("D:/test/16a/12384_2492.jpg"); 
        iamgePathList.add("D:/test/16a/12384_2493.jpg"); 
        iamgePathList.add("D:/test/16a/12384_2494.jpg"); 
        iamgePathList.add("D:/test/16a/12384_2495.jpg"); 
        iamgePathList.add("D:/test/16a/12384_2496.jpg"); 
        iamgePathList.add("D:/test/16a/12384_2497.jpg"); 
        iamgePathList.add("D:/test/16a/12384_2498.jpg"); 
        iamgePathList.add("D:/test/16a/12384_2499.jpg"); 
        iamgePathList.add("D:/test/16a/12384_2500.jpg"); 
        iamgePathList.add("D:/test/16a/12384_2501.jpg"); 
        iamgePathList.add("D:/test/16a/12384_2502.jpg");*/  
        //String imageFormat = "jpg";  
        //String toPath = "D:/test/desk/16a_v1.jpg";  
        //imageObj.joinImageListHorizontal(iamgePathList, imageFormat, toPath);  
          
        /*String imageFormat = "jpg"; 
        String[] pics1 = {"D:/test/16a/12384_2502.jpg","D:/test/16a/12384_2501.jpg", 
                "D:/test/16a/12384_2500.jpg","D:/test/16a/12384_2499.jpg","D:/test/16a/12384_2498.jpg", 
                "D:/test/16a/12384_2497.jpg","D:/test/16a/12384_2496.jpg","D:/test/16a/12384_2495.jpg", 
                "D:/test/16a/12384_2494.jpg","D:/test/16a/12384_2493.jpg","D:/test/16a/12384_2492.jpg"}; 
         
        String[] pics2 = {"D:/test/16a/12385_2502.jpg","D:/test/16a/12385_2501.jpg", 
                "D:/test/16a/12385_2500.jpg","D:/test/16a/12385_2499.jpg","D:/test/16a/12385_2498.jpg", 
                "D:/test/16a/12385_2497.jpg","D:/test/16a/12385_2496.jpg","D:/test/16a/12385_2495.jpg", 
                "D:/test/16a/12385_2494.jpg","D:/test/16a/12385_2493.jpg","D:/test/16a/12385_2492.jpg"}; 
         
        String[] pics3 = {"D:/test/16a/12386_2502.jpg","D:/test/16a/12386_2501.jpg", 
                "D:/test/16a/12386_2500.jpg","D:/test/16a/12386_2499.jpg","D:/test/16a/12386_2498.jpg", 
                "D:/test/16a/12386_2497.jpg","D:/test/16a/12386_2496.jpg","D:/test/16a/12386_2495.jpg", 
                "D:/test/16a/12386_2494.jpg","D:/test/16a/12386_2493.jpg","D:/test/16a/12386_2492.jpg"}; 
         
        String[] pics4 = {"D:/test/16a/12387_2502.jpg","D:/test/16a/12387_2501.jpg", 
                "D:/test/16a/12387_2500.jpg","D:/test/16a/12387_2499.jpg","D:/test/16a/12387_2498.jpg", 
                "D:/test/16a/12387_2497.jpg","D:/test/16a/12387_2496.jpg","D:/test/16a/12387_2495.jpg", 
                "D:/test/16a/12387_2494.jpg","D:/test/16a/12387_2493.jpg","D:/test/16a/12387_2492.jpg"}; 
         
        String[] pics5 = {"D:/test/16a/12388_2502.jpg","D:/test/16a/12388_2501.jpg", 
                "D:/test/16a/12388_2500.jpg","D:/test/16a/12388_2499.jpg","D:/test/16a/12388_2498.jpg", 
                "D:/test/16a/12388_2497.jpg","D:/test/16a/12388_2496.jpg","D:/test/16a/12388_2495.jpg", 
                "D:/test/16a/12388_2494.jpg","D:/test/16a/12388_2493.jpg","D:/test/16a/12388_2492.jpg"}; 
         
        String[] pics6 = {"D:/test/16a/12389_2502.jpg","D:/test/16a/12389_2501.jpg", 
                "D:/test/16a/12389_2500.jpg","D:/test/16a/12389_2499.jpg","D:/test/16a/12389_2498.jpg", 
                "D:/test/16a/12389_2497.jpg","D:/test/16a/12389_2496.jpg","D:/test/16a/12389_2495.jpg", 
                "D:/test/16a/12389_2494.jpg","D:/test/16a/12389_2493.jpg","D:/test/16a/12389_2492.jpg"}; 
         
        String toPath1 = "D:/test/desk/16a_v1.jpg"; 
        String toPath2 = "D:/test/desk/16a_v2.jpg"; 
        String toPath3 = "D:/test/desk/16a_v3.jpg"; 
        String toPath4 = "D:/test/desk/16a_v4.jpg"; 
        String toPath5 = "D:/test/desk/16a_v5.jpg"; 
        String toPath6 = "D:/test/desk/16a_v6.jpg"; 
         
        String[] pics7 = {toPath1,toPath2,toPath3,toPath4,toPath5,toPath6}; 
        String toPath7 = "D:/test/desk/16a_h1.jpg"; 
         
        long start = System.currentTimeMillis(); 
        imageObj.joinImageListVertical(pics1, imageFormat, toPath1); 
        imageObj.joinImageListVertical(pics2, imageFormat, toPath2); 
        imageObj.joinImageListVertical(pics3, imageFormat, toPath3); 
        imageObj.joinImageListVertical(pics4, imageFormat, toPath4); 
        imageObj.joinImageListVertical(pics5, imageFormat, toPath5); 
        imageObj.joinImageListVertical(pics6, imageFormat, toPath6); 
         
        imageObj.joinImageListHorizontal(pics7, imageFormat, toPath7); 
        long end = System.currentTimeMillis(); 
        System.out.println(end-start);*/  
          
    }  
        //数量        11          11x6  
        //纵向        375       
        //横向        391     3250  

}
