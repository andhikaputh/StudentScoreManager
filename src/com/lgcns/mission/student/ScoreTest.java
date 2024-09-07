package com.lgcns.mission.student;

import java.util.Arrays;
import java.util.Iterator;

import com.lgcns.mission.util.MissionUtil;

public class ScoreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Berapa banyak siswa di kelas ini? :");
		
		MissionUtil mu = new MissionUtil();
		int banyaksiswa = mu.getUserIntegerInput();
		
		Student[] students = new Student[banyaksiswa];
		int totaljava=0,totalsql=0,totalmath=0,totalchinese=0;
		
		for (int i =0; i<banyaksiswa; i++) {
			students[i] = new Student ("STD0" + (i+1));
			
			System.out.print(students[i].getId() + " Nilai Java : ");
			int java = mu.getUserIntegerInput();
			totaljava += java;
			
			System.out.print(students[i].getId() + " Nilai SQL :");
			int sql = mu.getUserIntegerInput();
			totalsql += sql;
			
			System.out.print(students[i].getId()+" Nilai Matematika :");
			int mtk = mu.getUserIntegerInput();
			totalmath += mtk;
			
			System.out.print(students[i].getId()+" Nilai Bahasa Mandarin : ");
			int chinese = mu.getUserIntegerInput();
			totalchinese += chinese;
			
			students[i].setScores(java, sql, mtk, chinese);
			
			Arrays.sort(students, 0, i + 1, (a, b) -> Double.compare(b.calculateAverage(), a.calculateAverage()));
			
			System.out.println("---------------------");
			System.out.println("Status Nilai");
			System.out.println("Java "+java+" point, SQL " +sql+" point, Matematika "+mtk+" point, Bahasa Mandarin " +chinese+" point");
			for(int j = 0 ; j<=i;j++) {
				students[j].setRank(j+1);
			}
			for (int j = 0; j <= i ; j++) {
				System.out.println("Nilai rata rata :" +students[j].calculateAverage());
				System.out.println("Juara "+ students[j].getRank());
			}
			System.out.println("--------------");
		}
		double avgjava = totaljava/(double)banyaksiswa;
		double avgsql = totalsql/(double)banyaksiswa;
		double avgmath = totalmath/(double)banyaksiswa;
		double avgchinese = totalchinese/(double)banyaksiswa;
		

		System.out.println("Nilai rata-rata kelas java :" + avgjava);
		System.out.println("Nilai rata-rata kelas SQL :" + avgsql);
		System.out.println("Nilai rata-rata kelas Matematika :" + avgmath);
		System.out.println("Nilai rata-rata kelas Bahasa Mandarin :" + avgchinese);
	
	}

}
