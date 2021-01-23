
public class MagicPotion {
public static int magicPotion(String str) {
	int len=str.length();
	StringBuilder sb=new StringBuilder();
	sb.append(str.charAt(0));
	for(int i=1; i<len;i++) {
		if(2*i<=len) {
			String s=str.substring(0, i);
			if(s.equals(str.substring(i, 2*i))) {
				sb.append("*");
				i=i*2-1;
			} else {
				sb.append(str.charAt(i));
			}
		}else {
			sb.append(str.charAt(i));
		}
	}
	return sb.length();
}
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
	if (magicPotion("ABCDABCE") == 8 && magicPotion("ABCABCE") == 5 && magicPotion("AAA") == 3
			&& magicPotion("AAAA") == 3 && magicPotion("BBB") == 3 && magicPotion("AAAAAA") == 5) {
	System.out.println("Pass");
	}else {
		System.out.println("Fail");
	}
}
}
