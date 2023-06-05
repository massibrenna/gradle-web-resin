package com.nttdata.servlet;

public class PageCounter {
	private static int countPage;

	public static synchronized int getCountPage()

	{

	countPage++;

	return countPage;

	}
}
