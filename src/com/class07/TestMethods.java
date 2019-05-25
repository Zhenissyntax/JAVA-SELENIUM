package com.class07;

import utils.CommonMethods;

public class TestMethods extends CommonMethods {
public static void main(String[] args) {
	CommonMethods.setUpDriver("firefox", "https://google.com");
	driver.close();
}
}
