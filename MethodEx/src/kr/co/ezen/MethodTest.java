package kr.co.ezen;

public class MethodTest {
	
		int a;
		boolean b = true;
		
		
		
		
		
		public MethodTest() {
		}

		public void stand() {
			
			System.out.println("무반환 무파람 ");
				}
		
		
		
		public void sleep() {
			System.out.println("public : 접근제한자로 프로젝트 전체에서 sleep메서드가 호출될 수 있음을 의미함");
			System.out.println("void : 반환형이라 하고, 이는 반환된는 데이터의 자료형을 의미한다.void는 반환되는 데이터가 없다는 것을 의미한다.");
			System.out.println("sleep : 메서드의 이름이고, 나중에 메서드를 호출할 때 그 이름을 적어 줌으로써 메서드 본문안에 있는 코드를 실행하게한다.");
			System.out.println("() : 파라미터, 매개변수 선언하는 곳으로 마치 변수를 선언하듯 작성하면 됨. 파라미터가 두 개 이상일 때는 ,를 구분자로 해서 구분을 해줌.");
			System.out.println("{} : 메서드의 본문. 메서드 호출 때 실행하고 싶은 코드를 작성해줌.");
			System.out.println("메서드 호출 : 메서드를 사용하는 것을 의미. 사용법은 메서드명을 적고 소괄호를 친 후, 소괄호 안에 파라미터의 자료형에 맞는 값을 넣어줍니다.");
			}
		
		public void sayHello() {
			System.out.println("Hello~");
			
			
			
		}
		
		public void sitDown() {
			System.out.println("그 자리에 즉시 앉음");
			sayHello();
			
		}
		
		public void callName(String a) {
			System.out.println("안녕하세요"+a);
			
			
		}
		
		public void printDan(int b) {
			System.out.println("5 x 1 = " + 1*b);
			System.out.println("5 x 2 = " + 2*b);
			System.out.println("5 x 3 = " + 3*b);
			System.out.println("5 x 4 = " + 4*b);
			System.out.println("5 x 5 = " + 5*b);
			System.out.println("5 x 6 = " + 6*b);
			System.out.println("5 x 7 = " + 7*b);
			System.out.println("5 x 8 = " + 8*b);
			System.out.println("5 x 9 = " + 9*b);
			
		}
		
		public void printScore(String name,int score) {
			System.out.println(name + score+"점");
			
			
		}
		
		public void mtSkill(String skill, int dmg) {
			System.out.println(skill + dmg + "데미지");
			
			
		}


	}


