import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class NMeetings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while(t > 0) {
			int n = scn.nextInt();
			int[] start = new int[n];
			for (int i = 0; i < n; i++) {
				start[i] = scn.nextInt();
			}
			int[] end = new int[n];
			for (int i = 0; i < start.length; i++) {
				end[i] = scn.nextInt();
			}
			solution(start, end);
			System.out.println();
			t--;
		}
	}
	
	 class Meeting{
		int start;
		int end;
		int index;
		public Meeting(int start, int end, int index){
			this.start = start;
			this.end = end;
			this.index = index;
		}
	}
	
	public static void solution(int[] start, int[] end) {
		Meeting meet[] = new Meeting[start.length];
		
		NMeetings n = new NMeetings();
		for (int i = 0; i < start.length; i++) {
			meet[i] = n.new Meeting(start[i],end[i], i);
		}
		
		Comparator<Meeting> c = new  Comparator<NMeetings.Meeting>() {
			@Override
			public int compare(Meeting o1, Meeting o2) {
				return o1.end - o2.end;
			}
		};
		
		Arrays.sort(meet, c);
		
		Meeting min = meet[0];
		System.out.print(min.index + 1 + " ");
		for (int i = 1; i < meet.length; i++) {
			if (meet[i].start >= min.end) {
				System.out.print(meet[i].index + 1 + " ");
				min = meet[i];
			}
		}
	}
}
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class NMeetings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while(t > 0) {
			int n = scn.nextInt();
			int[] start = new int[n];
			for (int i = 0; i < n; i++) {
				start[i] = scn.nextInt();
			}
			int[] end = new int[n];
			for (int i = 0; i < start.length; i++) {
				end[i] = scn.nextInt();
			}
			solution(start, end);
			System.out.println();
			t--;
		}
	}
	
	 class Meeting{
		int start;
		int end;
		int index;
		public Meeting(int start, int end, int index){
			this.start = start;
			this.end = end;
			this.index = index;
		}
	}
	
	public static void solution(int[] start, int[] end) {
		Meeting meet[] = new Meeting[start.length];
		
		NMeetings n = new NMeetings();
		for (int i = 0; i < start.length; i++) {
			meet[i] = n.new Meeting(start[i],end[i], i);
		}
		
		Comparator<Meeting> c = new  Comparator<NMeetings.Meeting>() {
			@Override
			public int compare(Meeting o1, Meeting o2) {
				return o1.end - o2.end;
			}
		};
		
		Arrays.sort(meet, c);
		
		Meeting min = meet[0];
		System.out.print(min.index + 1 + " ");
		for (int i = 1; i < meet.length; i++) {
			if (meet[i].start >= min.end) {
				System.out.print(meet[i].index + 1 + " ");
				min = meet[i];
			}
		}
	}
}
