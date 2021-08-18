## 1. 복습

### 1) ArrayList 연습 문제

```java
//친구 목록 들어갈 리스트
		ArrayList<String> list = new ArrayList<>();
		list.add("홍길동");
		list.add("김길동");
		Scanner	sc = new Scanner(System.in); 
		while (true) {
			System.out.println("--------------------");
			System.out.println("1. 친구 리스트 출력");
			System.out.println("2. 친구 추가");
			System.out.println("3. 친구 삭제");
			System.out.println("4. 이름 변경");
			System.out.println("9. 종료");
			System.out.println("메뉴를 선택하시오>>");
			int choice = sc.nextInt();
			if (choice==9) {
				System.out.println("스텝 종료합니다.");
				break;
			}else if (choice==1) {//1. 친구 리스트 출력
				System.out.println("친구 목록은 "+list);
			}else if (choice==2) {//2. 친구 추가
				System.out.print("추가할 친구 이름 입력>>");
				String addName = sc.next();
				int size1 = list.size(); //넣기 전에 크기
				list.add(addName);
				int size2 = list.size();//넣은 후 크기
				if (size2>size1) {
					System.out.println("친구가 추가되었습니다.");
				}
			}else if (choice==3) {//3. 친구 삭제
				System.out.println("삭제할 친구를 고르시오.");
				for (int i = 0; i < list.size(); i++) {
					System.out.println(i+"번: "+list.get(i));
				}
				System.out.println("삭제할 번호를 고르시오.>>");
				int no = sc.nextInt();
				String name = list.get(no);
				list.remove(no);
				
				if (!list.contains(name)) {
					System.out.println("삭제가 완료되었습니다.");
				}
				
			}else if (choice==4) {//4. 이름 변경
				System.out.println("수정 할 친구를 고르시오.");
				for (int i = 0; i < list.size(); i++) {
					System.out.println(i+"번: "+list.get(i));
				}
				System.out.println("수정 할 번호를 고르시오.>>");
				int no = sc.nextInt();
				System.out.println("새 이름 입력>>");
				String getName = sc.next();
				list.set(no, getName);
				System.out.println("수정이 완료되었습니다.");
			}else {//1~4, 9도 아닌 경우
				JOptionPane.showMessageDialog(null, "해당 숫자가 없습니다.");
			}
		}
```

### 2) ArrayList→HashSet

```java
		//친구 목록 들어갈 리스트
		HashMap<String, String> list = new HashMap<>();
		list.put("홍길동", "011-1111-2222");
		list.put("김길동", "010-2222-3333");
		Scanner	sc = new Scanner(System.in); 
		String name = "";
		String tel = "";
		
		while (true) {
			System.out.println("--------------------");
			System.out.println("1. 친구 리스트 출력");
			System.out.println("2. 친구 추가");
			System.out.println("3. 친구 삭제");
			System.out.println("4. 번호 변경");
			System.out.println("9. 종료");
			System.out.println("메뉴를 선택하시오>>");
			int choice = sc.nextInt();
			if (choice==9) {
				System.out.println("스텝 종료합니다.");
				break;
			}else if (choice==1) {//1. 친구 리스트 출력
				System.out.println("친구 목록은 "+list);
			}else if (choice==2) {//2. 친구 추가
				System.out.print("추가할 친구 이름 입력>>");
				name = sc.next();
				System.out.print("추가할 친구 전화번호 입력>>");
				tel = sc.next();
				int size1 = list.size(); //넣기 전에 크기
				list.put(name, tel);
				int size2 = list.size();//넣은 후 크기
				if (size2>size1) {
					System.out.println("친구가 추가되었습니다.");
				}
			}else if (choice==3) {//3. 친구 삭제
				for(String key : list.keySet()) {
		            System.out.println(key);
		        }
				System.out.println("삭제할 친구를 고르시오.>>");
				name = sc.next();
				list.remove(name);
				
				if (!list.containsKey(name)) {
					System.out.println("삭제가 완료되었습니다.");
				}
				
			}else if (choice==4) {//4. 이름 변경
				for(String key : list.keySet()) {
		            System.out.println(key);
		        }
				System.out.println("번호 수정 할 친구를 고르시오.>>");
				name = sc.next();
				System.out.println("새 번호 입력>>");
				tel = sc.next();
				list.replace(name, tel);
				System.out.println("수정이 완료되었습니다.");
			}else {//1~4, 9도 아닌 경우
				JOptionPane.showMessageDialog(null, "해당 숫자가 없습니다.");
			}
		}
```

### 3) HashMap 메서드

- if(!map.containsKey("key"))	//키가 들어있는지 확인. 있으면 덮어쓰지 않는다.
- putAll (Map에 다른 Map을 전부 포함)

```java
public static void main(String[] ar) {
	Map<String,Integer> map1=new HashMap();
	Map<String,Integer> map2=new HashMap();
	//map1 put
	map1.put("map1-key1", 100);
	map1.put("map1-key2", 200);
		
	//map2 put
	map2.put("map2-key3", 300);
	map2.put("map2-key4", 400);
		
	System.out.println("map1:"+map1);
	System.out.println("map2:"+map2);
		
	//map2에 map1을 합침
	map2.putAll(map1);
	System.out.println("map2 includes map1:"+map2);
		
	//map1의 키, 값 변경
	map1.put("map1-key1", 1000);
	//map2에는 영향 없음.
	System.out.println("map2 includes map1:"+map2);
}

//결과
//map1:{map1-key1=100, map1-key2=200}
//map2:{map2-key4=400, map2-key3=300}
//map2 includes map1:{map2-key4=400, map1-key1=100, map1-key2=200, map2-key3=300}
//map2 includes map1:{map2-key4=400, map1-key1=100, map1-key2=200, map2-key3=300}
```

- keySet(모든 키를 순회하는 코드)

```java
public static void main(String[] ar) {
	Map<String,Integer> map=new HashMap();
	map.put("key1",50);
	map.put("key2",100);
	map.put("key3",150);
	map.put("key4",200);
		
	System.out.println("All key-value pairs");
	for(String key:map.keySet()) {
		System.out.println("{"+key+","+map.get(key)+"}");
	}
}
```

> HashMap 특징, 사용법 예제 : [https://reakwon.tistory.com/151](https://reakwon.tistory.com/151)

- key, value 값 가져오기

```java
public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<String, String>();
        
        hm.put("안녕", "하세요");
        hm.put("식사", "하셨나요?");
        hm.put("안녕히", "계세요");
        
        //keySet을 이용한 방법
        Iterator<String> iter = hm.keySet().iterator();
        while(iter.hasNext()) {
            String key = iter.next();
            System.out.println(key);
        }
        //안녕, 안녕히, 식사
       
        //keySet을 이용한 방법2
        for(String key : hm.keySet()) {
            System.out.println(key);
        }
        ////안녕, 안녕히, 식사
        

        //Entry를 이용한 방법
        Set set = hm.entrySet();
        Iterator iter2 = set.iterator();
        while(iter2.hasNext()) {
            Entry<String, String> entry = (Entry)iter2.next();
            System.out.println((String)entry.getKey()+" "+(String)entry.getValue());
        } 
        //안녕히 계세요,  안녕 하세요, 식사 하셨나요?

        //Entry를 이용한 방법2
        for(Entry<String,String> entry : hm.entrySet()) {
            System.out.println(entry.getKey()+" "+ entry.getValue());
        }
        //안녕히 계세요,  안녕 하세요, 식사 하셨나요?
    }
```

> Map, HashMap - key, value 값 가져오기 : [https://tosuccess.tistory.com/148](https://tosuccess.tistory.com/148)

- replace(바꿀 키, 바꿀 값)

```java
hashmap.replace("key3", "value33");
```

- 중첩 HashMap(해쉬맵) 사용 및 출력방법

```java
for (String key : result.keySet()) {
        System.out.println("result: " + key + "^" + result.get(key));
            for (String k : result.get(key).keySet()) {
                System.out.println("persent : " + k + ":" + result.get(key).get(k));

```

> [https://data-traveler.tistory.com/10](https://data-traveler.tistory.com/10)
