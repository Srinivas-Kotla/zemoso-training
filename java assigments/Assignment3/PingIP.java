import java.lang.*;
import java.io.*;
import java.util.*;
public class PingIP{
	public static List<String> ping(String command){
		List<String> list = new ArrayList<String>();
		try{
		Runtime r = Runtime.getRuntime();
		Process p = r.exec(command);
		BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
		String s;
		while((s=in.readLine())!=null){
			list.add(s);
		}
		in.close();
		}catch(IOException e){
			System.out.println(e);
		}
		return list;
	}


	public static void medianPingTime(String s,int n){
		List<String> l = new ArrayList<String>();
		l = ping(s);
		for(String d:l){
			System.out.println(d);
		}
		double[] time = new double[n];	
		for(int i=0;i<n;i++){
		String a = l.get(i+1);
		String b = a.substring(a.lastIndexOf("=")+1,a.length()-3);
		//System.out.println(b);
		time[i] = Double.parseDouble(b);
		//System.out.println(time[i]);
		}
			Arrays.sort(time);
		for(double d:time)
			System.out.println(d);

		System.out.println("Median time for ping requests:");
		if(n%2 ==0){
			System.out.println(time[n/2 - 1] + " " + time[n/2]);
		}
		else
			System.out.println(time[n/2]);
	}

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter IP address:");
		String s = scan.next();
		System.out.println("Enter number of pings:");
		int n = scan.nextInt();
		s = "ping -c " + String.valueOf(n) + " " + s;
		medianPingTime(s,n);
	}
}