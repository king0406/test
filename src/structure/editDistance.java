package structure;

public class editDistance {
	public static String s1 = "cafec";  
    public static String s2 = "coffae";  
  
    public static void main(String[] args) {  
  
        System.out.print(getStringSimilar(s1,s2));
    }  
	// �༭���������ƶ�
	public static double getStringSimilar(String s1, String s2) {
		double d[][];// matrix
		int n;// lengthofs
		int m;// lengthoft
		int i;// iteratesthroughs
		int j;// iteratesthrought
		char s_i;// ithcharacterofs
		char t_j;// jthcharacteroft
		double cost;// cost
		//aΪ�滻�����ɱ���bΪ���룬cΪɾ����
		double a=1,b=1,c=1;
		// Step1
		n = s1.length();
		m = s2.length();
		if (n == 0) {
			return m;
		}
		if (m == 0) {
			return n;
		}
		d = new double[n + 1][m + 1];
		// Step2
		for (i = 0; i <= n; i++) {
			d[i][0] = i;
		}
		for (j = 0; j <= m; j++) {
			d[0][j] = j;
		}
		// Step3
		for (i = 1; i <= n; i++) {
			s_i = s1.charAt(i - 1);
			// Step4
			for (j = 1; j <= m; j++) {
				t_j = s2.charAt(j - 1);
				// Step5
				if (s_i == t_j) {
					cost = 0;
				} else {
					cost = a;
				}
				// Step6
				d[i][j] = Minimum(d[i - 1][j] + b, d[i][j - 1] + c,
						d[i - 1][j - 1] + cost);
			}
		}
		// Step7
		return d[n][m];
	}

	// ����Сֵ
	private static double Minimum(double a, double b, double c) {
//		double mi;
//		mi = a;
//		if (b < mi) {
//			mi = b;
//		}
//		if (c < mi) {
//			mi = c;
//		}
//		return mi;
		return Math.min(Math.min(a, b), c);
	}
}