var http = require('http'); 
var data = `<a href="http://www.naver.com">go to the naver</a><hr color="red">`;
var form = `<form action="">
id : <input type="text" name="id"><br>
pw : <input type="text" name="pw"><br>
<button type="submit">login send</button>
</form>`;

http.createServer(function name(req, res) {
  res.writeHead(200, {'content-Type':'text/html'}) //상태와 타입 유형 같이 보낼게!
  res.end(data + form);
}).listen(4000);

console.log("yeeeee!");