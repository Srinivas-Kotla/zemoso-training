import java.text.*;
import java.util.*;
public class KYCFormDate{
	public static String range(Calendar sign,Calendar fill,DateFormat s){
		boolean check;
		String out="";
		check = sign.before(fill);
		Calendar range1 = Calendar.getInstance();
		Calendar range2 = Calendar.getInstance();
		range1.setTime(sign.getTime());
		range2.setTime(sign.getTime());
		range1.set(Calendar.YEAR,fill.get(fill.YEAR));
		range1.add(Calendar.DAY_OF_MONTH,-30);
		range2.set(Calendar.YEAR,fill.get(fill.YEAR));
		range2.add(Calendar.DAY_OF_MONTH,30);
		if(check){
			if((range1.before(fill) && range2.before(fill)) || (!range1.before(fill) && !range2.before(fill))){
				out = s.format(range1.getTime()) + " "+s.format(range2.getTime());
			}
			else if(range1.before(fill) && !range2.before(fill))
				out = s.format(range1.getTime()) + " "+s.format(fill.getTime());

			return out;
		}
		else 
			return "No range";
	}
	public static void main(String [] args)throws ParseException{
		Scanner scan = new Scanner(System.in);
		String s1 = scan.next();
		String s2 = scan.next();
		DateFormat s = new SimpleDateFormat("dd-MM-yyyy");
		Calendar calSigned = Calendar.getInstance();
		Calendar calFill = Calendar.getInstance();
		calSigned.setTime(s.parse(s1));
		calFill.setTime(s.parse(s2));

		System.out.println(range(calSigned,calFill,s));
	}
}