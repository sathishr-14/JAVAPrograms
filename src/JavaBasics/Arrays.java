package JavaBasics;

public class Arrays {

	public static void main(String[] args) {
		
//		int i [] = new int[4];
//		
//		i[0] = 10;
//		i[1] = 20;
//		i[2] = 30;
//		i[3] = 40;
//		
//		System.out.println(i.length);
//		for(int k = 0; k<i.length; k++) {
//			System.out.println(i[k]);
//		}
//		System.out.println("------");
//		
//		int len = i.length;
//		System.out.println("Highest index is "+(len-1));
//		System.out.println("Lowest index is "+ 0);
//		System.out.println("Length is "+len);
//		System.out.println("------");
//		
//		for(int e:i) {
//			System.out.println(e);
//		}
		
//		String s[] = new String[3];
//		s[0] = "ABD";
//		s[1] = "BDC";
//		s[2] = "CDE";
//		
////		for(int i=0; i<s.length; i++) {
////			System.out.println(s[i] +" "+i);
////		}
//		
//		int i = 0;
//		for(String e:s) {
//			System.out.println(i+" "+e);
//			i++;
//		}
		
		Object player_info [] = new Object[7];
		player_info[0] = "Kohli";
		player_info[1] = 30;
		player_info[2] = "India";
		player_info[3] = "14-12-1991";
		player_info[4] = "M";
		player_info[5] = 98.23;
		player_info[6] = true;
		
		for(int i=0; i<player_info.length; i++) {
			System.out.println(player_info[i]);
		}
		
	}

}
