package sdsd;


import java.text.FieldPosition;
import java.text.SimpleDateFormat;
import java.util.Date;

public class sdsd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		
		StringBuffer stringBuffer = new StringBuffer();
		Date now = new Date();

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ssZ");
		simpleDateFormat.format(now, stringBuffer, new FieldPosition(0));
		System.out.println(stringBuffer);
	}

}
