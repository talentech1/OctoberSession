package lesson.three;

public class NesterLoopTwo {

	public static void main(String[] args) {
		char[] floors = { 'A', 'B', 'C', 'D', 'E'};
		int aptCount=0;
		int floorCount = 0;
		for(int i=0; i <floors.length; i++) {
			floorCount++;
			int aptOnFloor = 6;
			if(floors[i] == 'A') {
				aptOnFloor -= 2;
			}
			for(int j=1; j<=aptOnFloor; j++ ) {
				System.out.println(floors[i]+"-"+ j);
				aptCount++;
			}
			
		}
		System.out.println(floorCount);
		System.out.println(aptCount);
		
	}

}
