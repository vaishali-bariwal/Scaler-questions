import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.io.IOException;
class TestClass {
    public static void main(String args[] ) throws Exception {
        		BufferedReader br = null;
 
		try {
 
			br = new BufferedReader(new InputStreamReader(System.in));
			int t = Integer.valueOf(br.readLine().trim());
			for (int tc = 0; tc < t; tc++) {
				int n = Integer.valueOf(br.readLine().trim());
				int count = 0;
				String[] ele = br.readLine().split(" ");
				long[] longele = new long[n];
				for (int i = 0; i < n; i++) {
					longele[i] = Long.valueOf(ele[i]);
 
				}
 
				for (int index = 0; index < n - 1; index++) {
 
					if ((longele[index] & 1) > 0) {
 
						if ((longele[index + 1] & 1) > 0) {
							count++;
 
							long a = longele[index];
							long b = longele[index + 1];
 
							longele[index] = a + b;
							longele[index + 1] = a - b;
							index++;
						} else {
							count = count + 2;
							for (int i = 0; i < 2; i++) {
 
								long a = longele[index];
								long b = longele[index + 1];
								longele[index] = a + b;
								longele[index + 1] = a - b;
							}
							index++;
 
						}
					}
 
				}
 
 
				if ((longele[n - 1] & 1) > 0) {
 
					if ((longele[n - 2] & 1) > 0) {
 
						count++;
 
						long a = longele[n - 2];
						long b = longele[n - 1];
						longele[n - 2] = a + b;
						longele[n - 1] = a - b;
					} else {
						count = count + 2;
						for (int i = 0; i < 2; i++) {
 
							long a = longele[n - 2];
							long b = longele[n - 1];
							longele[n - 2] = a + b;
							longele[n - 1] = a - b;
 
						}
 
					}
 
				}
 
				System.out.println(count);
 
			}
 
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if (null != br) {
				try {
					br.close();
				} catch (IOException e) {
					// TODO: handle exception
					e.printStackTrace();
				}
 
			}
		}
 
	
   
 
	}
}
