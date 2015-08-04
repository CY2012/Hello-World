class LG implements DVD{
	
	public void play(){
		System.out.println("lg在播放");		
	}
	public void burn(){
		System.out.println("lg在刻录");
	}
	
}
class Sunsung implements DVD{
	public void play(){
		System.out.println("三星在播放");		
	}
	public void burn(){
		System.out.println("三星在刻录");
	}
}