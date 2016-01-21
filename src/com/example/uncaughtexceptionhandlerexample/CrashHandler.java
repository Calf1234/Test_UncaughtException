package com.example.uncaughtexceptionhandlerexample;

import java.lang.Thread.UncaughtExceptionHandler;

import android.util.Log;

public class CrashHandler implements UncaughtExceptionHandler {

	String tag = "CrashHandler";

	public CrashHandler() {
	}

	@Override
	public void uncaughtException(Thread arg0, Throwable arg1) {
		Log.e(tag, "Thread :" + arg0 + "\nThrowable :" + arg1);

		arg1 = null;
	}

	public void init() {
		Thread.setDefaultUncaughtExceptionHandler(this);
	}
}