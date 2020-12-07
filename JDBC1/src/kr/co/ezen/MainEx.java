package kr.co.ezen;

import java.sql.Date;
import java.util.Calendar;
import com.naver.MemberDAO;
import com.naver.MemberDTO;
import com.naver.Test;

public class MainEx {

	public static void main(String[] args) {
	//	Test dao = new Test();
//		 dao.me1();
//		
		MemberDAO dao2 = new MemberDAO();
//		
//		MemberDTO dto = new MemberDTO("m007", "jin", "a", new Date(Calendar.getInstance().getTimeInMillis()));
//		
//		dao2.insert(dto);
//		dao2.delete(new MemberDTO("m007", null, null, null));
		
		MemberDTO odto = dao2.selectByMid("m005");
		
		MemberDTO dto = new MemberDTO("m005", "lee", odto.getJob() , odto.getBirth());
		
		dao2.update(dto);

	}

}
