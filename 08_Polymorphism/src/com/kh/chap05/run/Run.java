package com.kh.chap05.run;

import com.kh.chap05.model.vo.*;

public class Run {
	
	public static void main(String[] args) {
	
		MusicI hiphop =  new Hiphop();
		hiphop.play();
		hiphop.stop();
		
		MusicI jazz = new Jazz();
		jazz.play();
		jazz.stop();
		
	}
}
