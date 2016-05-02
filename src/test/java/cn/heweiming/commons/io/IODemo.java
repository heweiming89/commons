package cn.heweiming.commons.io;

import java.io.File;

import org.apache.commons.io.filefilter.AndFileFilter;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.apache.commons.io.filefilter.NotFileFilter;
import org.apache.commons.io.filefilter.OrFileFilter;
import org.apache.commons.io.filefilter.PrefixFileFilter;
import org.apache.commons.io.filefilter.SuffixFileFilter;
import org.junit.Test;

public class IODemo {

	@Test
	public void testCharacter() {
		// String fileEncode = Encoding
	}

	@Test
	public void testFileFilter() {

	}

	public static void main(String[] args) {
		File dir = new File(".");
		System.out.println(dir.getAbsolutePath());
		String[] files = dir.list(new AndFileFilter(new AndFileFilter(
		 new PrefixFileFilter("I"),
				new OrFileFilter(new SuffixFileFilter(".class"),
						new SuffixFileFilter(".java"))), new NotFileFilter(
				DirectoryFileFilter.DIRECTORY)));
		for (int i = 0; i < files.length; i++) {
			System.out.println(files[i]);
		}
	}

}
