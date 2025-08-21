package com.kh.chap07.remote.controller;

import com.kh.chap07.remote.model.vo.Television;

// 데이터(VO)와 화면 (View)의 중간다리역할
public class RemoteController {

	private Television tv = new Television();
	private int channelNo;

	public int powerOn() {
		if (!tv.isOn()) {
			tv.setOn(true);
			return 1;
		}
		return 0;
	}

	public String channelUp() {
		if (!tv.isOn()) {
			String[] channel = tv.getChannel();

			if (channelNo < channel.length - 1) {
				return channel[++channelNo];
			}
			channelNo = 0;
			return channel[0];
		} return null;
	}

	public int getChannelNo() {
		return channelNo;
	}

}