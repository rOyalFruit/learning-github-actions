package com.ll.learninggithubactions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BuggyClass {

	// NP_ALWAYS_NULL: Null pointer dereference
	public String nullPointerBug() {
		String str = null;
		return str.toLowerCase(); // NullPointerException 발생 가능
	}

	// DLS_DEAD_LOCAL_STORE: Dead store to local variable
	public void deadStoreBug() {
		int x = 101;
		x = 20; // x = 10은 사용되지 않음
		System.out.println(x);
	}

	// UUF_UNUSED_FIELD: Unused field
	private int unusedField = 42;

	// URF_UNREAD_FIELD: Unread field
	private String unreadField = "hello";

	// EI_EXPOSE_REP: May expose internal representation by returning reference to mutable object
	private List<String> names = new ArrayList<>();

	public List<String> getNames() {
		return names; // 내부 표현을 직접 노출
	}

	// EI_EXPOSE_REP2: May expose internal representation by incorporating reference to mutable object
	public void setNames(List<String> names) {
		this.names = names; // 외부 객체를 직접 참조
	}

	// DMI_COLLECTION_OF_URLS: Maps and sets of URLs can be performance hogs
	public void urlCollectionBug() {
		Map<java.net.URL, String> map = new HashMap<>();
		try {
			map.put(new java.net.URL("http://example.com"), "Example");
		} catch (java.net.MalformedURLException e) {
			e.printStackTrace();
		}
	}

	// ES_COMPARING_STRINGS_WITH_EQ: Comparison of String objects using == or !=
	public boolean stringComparisonBug(String a, String b) {
		return a == b; // 문자열 내용 비교가 아닌 참조 비교
	}

	// RV_RETURN_VALUE_IGNORED: Return value of method ignored
	public void ignoredReturnValueBug() {
		String s = "hello";
		s.replace('h', 'j'); // 반환값 무시 (String은 불변 객체)
	}

	// IT_NO_SUCH_ELEMENT: Iterator.next() called without checking hasNext()
	public void iteratorBug(List<String> list) {
		java.util.Iterator<String> it = list.iterator();
		String first = it.next(); // hasNext() 확인 없이 next() 호출
	}
}

