import java.util.Arrays;
class Jiexi{
	public static void main(String[] args){
	    
	String str = "卡巴斯基#杀毒软件#免费版#俄罗斯";
	String[] ss = str.split("#");
	System.out.println(Arrays.toString(ss));
	}
}