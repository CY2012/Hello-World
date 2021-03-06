package com.wyhello.util;

import java.awt.Point;
import java.awt.Toolkit;
import java.awt.Dimension;
/**
*
*	@author Machael.Chang
*	@since 1.5    时间 2015-04-03
*	
*/



public class FrameToolkit{

	/**
	*
	*	@param width 创建窗体的宽度
	*	@param height 创建窗体的高度
	*	@return Point 该窗体在屏幕的中央的绘制坐标的Point对象
	*
	*/




	public static Point getFrameInScreenCenterPoint(int width,int height){
		Toolkit tool = Toolkit.getDefaultToolkit();
		Dimension winDimension = tool.getScreenSize();
		int x = (int)Math.round((winDimension.getWidth() - width) / 2);
		int y = (int)Math.round((winDimension.getHeight() - height) / 2);
		Point p = new Point(x , y);
		return p;
	}
}