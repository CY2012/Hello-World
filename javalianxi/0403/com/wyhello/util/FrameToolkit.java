package com.wyhello.util;

import java.awt.Point;
import java.awt.Toolkit;
import java.awt.Dimension;
/**
*
*	@author Machael.Chang
*	@since 1.5    ʱ�� 2015-04-03
*	
*/



public class FrameToolkit{

	/**
	*
	*	@param width ��������Ŀ���
	*	@param height ��������ĸ߶�
	*	@return Point �ô�������Ļ������Ļ��������Point����
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