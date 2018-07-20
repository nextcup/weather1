package com;

import java.io.IOException;

import org.springframework.ui.Model;




public class test {

	public static void main(String[] args) throws IOException {
		controller controller = new controller();
		Model model = null;
		controller.search("º¼ÖÝ",model);
		//controller.search("",mo);
	}

}
