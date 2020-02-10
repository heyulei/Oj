class Solution {
	public String toLowerCase(String str) {
		
		    StringBulider　ｓ＝new StringBulider();
		    for (int i = 0; i<str.length(); i++) { 
			    char c = str.charAt(i);
			    if (c>='A'&& c <= 'Z'){
				    c += 32;
			    }
	s.append(c);          
		    }
return s.toString();
	}
}
