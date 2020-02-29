package com.yearagain.o2o.enums;

public enum ShopStateEnum {
	CHECK(0, "待审核"), OFFLINE(-1, "店铺被封禁"), 
	SUCCESS(1, "正常"), PASS(2, "审核通过"),
	INNER_ERROR(-101, "系统错误"),NULL_SHOP(-103,"信息为空");

	private int state;
	private String stateInfo;

	private ShopStateEnum(int state, String stateInfo) {
		this.state = state;
		this.stateInfo = stateInfo;
	}

	/**
	 * 返回enum
	 */
	public static ShopStateEnum stateOf(int state) {
		for (ShopStateEnum stateEnum : values()) {
			if (stateEnum.getState() == state) {
				return stateEnum;
			}
		}
		return null;
	}

	public int getState() {
		return state;
	}

	public String getStateInfo() {
		return stateInfo;
	}

}
