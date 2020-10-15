package com.java.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FilesJ8Demo {
public static void main(String[] args) throws IOException {
	
	// Files.list(Paths.get("D:\\")).forEach(System.out::println);
	 //Files.walk(Paths.get("D:\\Eclipse_Workspace")).forEach(System.out::println);
	 boolean anyMatch = Files.walk(Paths.get("D:\\Eclipse_Workspace")).anyMatch(f->f.getFileName().toString().equals("FileDemo123.java"));
	 System.out.println(anyMatch);
	
}
}
