package com.kh.day04.run;

import com.kh.day03.array.exercise.Exercise_Array1;
import com.kh.day03.array.exercise.Exercise_For;
import com.kh.day04.dimarray.exercise.Exercise_DimArray;
import com.kh.day04.myexception.exercise.Exercise_Exception;

public class Run {
	public static void main(String [] args)
	{
		Exercise_Array1 exArr = new Exercise_Array1();
//		exArr.exercise1();
//		exArr.exercise2();
//		exArr.arrayCopyExercise();
//		exArr.lottoExercise();
		
		Exercise_For exFor = new Exercise_For();
//		exFor.part2For2();
		
		Exercise_DimArray exDim = new Exercise_DimArray();
//		exDim.exercise5();
		
		Exercise_Exception excp = new Exercise_Exception();
		excp.practice2();
	}
}
