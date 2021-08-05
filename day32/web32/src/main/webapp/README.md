## 1. DOM(Document Object model)

### 1) DOM Tree

- DOM : HTML, XML등의 포함관계를 가지고 있는 문서를 RAM에 읽어들일 때 사용하는 방법
- 문서내의 요소를 tree의 node(마디) 객체로 여기고 tree구조로 읽어들이는 방법


> [http://tcpschool.com/javascript/js_dom_concept](http://tcpschool.com/javascript/js_dom_concept)

### 2) DOM Tree 그려보기

- 코드

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/1896c846-bfc1-45c7-8246-231161949c5f/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/1896c846-bfc1-45c7-8246-231161949c5f/Untitled.png)

- 그림

![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/9611b887-7b55-49f4-ad30-97077b946185/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/9611b887-7b55-49f4-ad30-97077b946185/Untitled.png)

### 3) CSS에서 트리

```css
body ul{/* body 아래의 자손 중에서 ul을 찾아라 */
		color : red;
	}
	
body > ul{/* body "바로" 아래의 자식 중에서 ul을 찾아라 */
		list-style : square;
	}
```

### 4) 기본 선택자(selector)

- tag, id, class

## 2. jQuery

### 1) jQuery란?

- jQuery는 HTML의 클라이언트 사이드 조작을 단순화 하도록 설계된 크로스 플랫폼의 자바스크립트 라이브러리다.
- 자바스크립트 언어를 간편하게 사용할 수 있도록 단순화시킨 오픈 소스 기반의 자바스크립트 라이브러리이다.

### 2) jQuery 연결 방법

- jquery.js 파일을 다운받아서 연결
- CDN 주소로 연결

> [https://developers.google.com/speed/libraries#jquery](https://developers.google.com/speed/libraries#jquery)


### 3) jQuery 사용해보기

- $() : body 태그 안을 먼저 램에 dom tree로 읽어들여라.(loading)
- $(function(){}) : body를 다 읽어들인 후, 입력값으로 넣은 이름없는 함수 부분을 실행해주세요.

```jsx
$(function(){ //document를 ram에 dom트리로 다 읽어 들였으면! document.ready()
		$('#b1').click(function(){
			alert('버튼1을 클릭하셨군요!!!');
		});
		$('#b2').click(function(){
			alert('버튼2을 클릭하셨군요!!!');
		});
		$('#b3').click(function(){
			alert('버튼3을 클릭하셨군요!!!');
		});
	});
```

---

- 덧글달기
- js

```jsx
$(function(){
	$('#btn').click(function(){
		var contentTag = $('#content');
		var result1Tag = $('#result1');
		var contentValue = contentTag.val();
		if (contentValue=='') {
			alert('내용을 입력해주세요.');
		}else{
			result1Tag.append('<p>'+contentValue+'</p><hr>');
		}		
		contentTag.val('');
	})
})
```

- html

```html
댓글 입력 : <input id="content">
	<button id="btn">댓글달기</button>
	<hr color="red">
	<div id="result1"></div><br>
```
